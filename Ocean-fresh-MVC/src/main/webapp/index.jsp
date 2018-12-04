<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <%@ include file="/common/mystyle.jsp" %>
</head>
<body>



<script type="text/javascript">
    $(function (){
        $.ajax({ url:"http://localhost:9001/sele",



            dataType:"jsonp",  //数据格式设置为jsonp
            jsonp:"callback",  //Jquery生成验证参数的名称
            jsonpCallback: "successCallback",  //指定回调函数名称
            success:function(data){
            alert(data);


        }
        })
    })
</script>

</body></html>

