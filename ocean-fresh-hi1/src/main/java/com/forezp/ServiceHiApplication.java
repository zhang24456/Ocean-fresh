package com.forezp;

import com.alibaba.fastjson.JSONArray;
import com.forezp.dao.TestDao;
import com.forezp.model.User;
import com.forezp.redis.RedisClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@RestController
@MapperScan(value = "com.forezp.dao")
@EnableDiscoveryClient
public class ServiceHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}

	@Value("${foo}")
	String foo;
	@RequestMapping(value = "/hi")
	public String hi(){
		return foo;
	}



	@Autowired
    private RedisClient redisClient;
    @Autowired
    TestDao testDao;
	@Autowired
	private MongoTemplate mongoTemplate;
	@RequestMapping("/sele")
	public List sele() {
		// TODO Auto-generated method stub
		List list=testDao.sele();
		try {
			redisClient.set("list", JSONArray.toJSONString(list));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
    @RequestMapping("/delete")
	@Transactional(readOnly=false)
	public void delete(@RequestParam  String id) {
		// TODO Auto-generated method stub
		testDao.delete(id);
	}
    @RequestMapping("/adds")
	@Transactional(readOnly=false)
	public void adds(@RequestParam  String name,@RequestParam  String monreg) {
		User user =new User();
		user.setId(UUID.randomUUID().toString());
		user.setName(name);
		user.setRegion(monreg);
		testDao.add(user);
	}
    @RequestMapping("/update")
	@Transactional(readOnly=false)
	public void update(@RequestParam  String id,@RequestParam  String name,@RequestParam  String monreg) {
		testDao.update(id,name,monreg);
	}

	@RequestMapping("/addmongodb")
	public void addmongodb(@RequestParam String monname) {
	    System.err.println(monname);
		User user=new User();
		user.setId(UUID.randomUUID().toString());
		user.setName(monname);
		mongoTemplate.insert(user);

	}

	@RequestMapping("/selemongodb")
	public List selemongodb() {
		// TODO Auto-generated method stub
		return mongoTemplate.find(null, User.class);
	}

	@RequestMapping("/deletemons")
	public void deletemons(@RequestParam String id) {

		mongoTemplate.remove(new Query(Criteria.where("id").is(id)), User.class);

	}

	@RequestMapping("/toupdate")
	public User toupdate(@RequestParam String id) {
		// TODO Auto-generated method stub
		return mongoTemplate.findOne(new Query(Criteria.where("id").is(id)), User.class);
	}

	@RequestMapping("/updatemon")
	public void updatemon(@RequestParam String id, @RequestParam String name) {
		Update update=new Update();
		update.set("name", name);
		mongoTemplate.updateFirst(new Query(Criteria.where("id").is(id)), update, User.class);

	}

	@RequestMapping("/toindexupdate")
	public User toindexupdate(@RequestParam String id) {
		// TODO Auto-generated method stub
		return testDao.toindexupdate(id);
	}

	@RequestMapping("/seles")
	public List seles() {
		String string="";
		try {
			string = redisClient.get("list");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<User> parseArray = JSONArray.parseArray(string,User.class);
		return parseArray;
	}

	@RequestMapping("/deletes")
	public void deletes(@RequestParam String id) {
		JedisPool jedisPool = redisClient.getJedisPool();
		Jedis jedis = jedisPool.getResource();
		Long del = jedis.del("list");

	}



}
