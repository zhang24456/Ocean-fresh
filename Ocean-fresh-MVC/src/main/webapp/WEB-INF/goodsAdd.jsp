<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <%@ include file="/common/mystyle.jsp" %>
    <style>

    </style>
</head>
<body>
当前位置:商品>商品发布 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
发布流程:1、选择商品分类和标签；2、填写商品基本信息；3、上传商品详细介绍图文；4、发布。
<form id="pro_from" class="form-inline">
<h2>
    一、选择商品分类和标签
</h2>

    <div class="form-group">
    <label>●商品分类:</label>
    <select class="form-control" id="goodsType">
    </select>
    </div><br>
    <div class="form-group">
    <label>●新鲜水果:</label>
    <select  class="form-control">
    </select>
    </div>
<h2>
    二、填写商品基本信息
</h2>
    <div class="form-group">
        <label>●商品名称:</label>
        <input type="text" class="form-control"  placeholder="请输入商品名称">
    </div><br>
    <div class="form-group">
        <label>●商品描述:</label>
        <input type="text" class="form-control"  placeholder="请输入商品描述">
    </div><br>
    <div class="form-group">
        <label>●商品图片:
            <font size="2">
            上传图片的最佳尺寸：720像素*720像素，其他尺寸会影响页面效果，格式png，jpeg，jpg，gif，大小不超过2M，商品图片一共可以上传5张，默认第一张为主图。
            </font>
        </label>

    </div><br>
    <div class="form-group">

        <label>●商品规格:</label>

        <table tyle="float:center">
            <caption>限制最多可添加6个商品规格。</caption>
            <thead>
            <tr>
                <th>规格</th>
                <th >售价</th>
                <th>原价</th>
                <th>库存</th>
                <th>重量(kg)</th>
                <th>商品编码</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
                <td><input type="text"></td>
            </tr>
            </tbody>
        </table>
    </div><br>

    <div class="form-group">
        <label>●商品详情:</label><br>
        产地<input type="text" class="form-control"  placeholder="精确到省市">
        存储条件<input type="text" class="form-control"  placeholder="常温"><br>
        品牌<input type="text" class="form-control"  placeholder="">
        净含量&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" class="form-control"  placeholder="最小单位为克">
    </div><br>

    <h2>
        三、上传商品详情图文
        三、上传商品详情图文
        三、上传商品详情图文
        三、上传商品详情图文
    </h2>


<center>
    <button type="button" class="btn btn-success">发布</button>
</center>
</form>
<script>
    //查询商品类型
    $(function(){
        $.ajax({
            url:"http://localhost:9001/findTypeList",
            dataType:"jsonp",  //数据格式设置为jsonp
            jsonp:"callback",  //Jquery生成验证参数的名称
            //jsonpCallback: "successCallback",  //指定回调函数名称
            success:function(data){
                alert(data)
                /*var html='<option value="">'+"请选择"+'</option>'
                for(var i=0;i<data.length;i++){
                    html+='<option value="'+data[i].typeId+'">'+data[i].typeName+'</option>'
                }
                $("#goodsType").html(html)*/
            }
        })
    })
</script>
</body>
</html>
