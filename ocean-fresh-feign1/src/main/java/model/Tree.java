/** 
 * <pre>项目名称:user_quanxian 
 * 文件名称:Tree.java 
 * 包名:com.jk.model 
 * 创建日期:2018年9月10日下午7:26:55 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package model;

import java.io.Serializable;
import java.util.List;

/** 
 * <pre>项目名称：user_quanxian    
 * 类名称：Tree    
 * 类描述：    
 * 创建人：赵展彬 
 * 创建时间：2018年9月10日 下午7:26:55    
 * 修改人：赵展彬   
 * 修改时间：2018年9月10日 下午7:26:55    
 * 修改备注：       
 * @version </pre>    
 */
public class Tree  implements Serializable{
	

    private static final long serialVersionUID = -2279322001565553405L;

	private String id;

    private String text;

    private String url;

    private String pid;
    
    private List<Tree> nodes;
    
    private List<Tree> children ;
    
    
    
    public List<Tree> getChildren() {
		return children;
	}

	public void setChildren(List<Tree> children) {
		this.children = children;
	}

	private String state;//节点状态，'open' 或 'closed'，默认：'open'。如果为'closed'的时候，将不自动展开该节点。

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<Tree> getNodes() {
		return nodes;
	}

	public void setNodes(List<Tree> nodes) {
		this.nodes = nodes;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Tree [id=" + id + ", text=" + text + ", url=" + url + ", pid=" + pid + ", nodes=" + nodes + ", state="
				+ state + "]";
	}
    
    

}
