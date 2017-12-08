<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="resources/jquery.js"></script>
  </head>
  
  <body>
    <h1>Hi1</h1>
    <h1>Hi1</h1>
    <h1>Hi1</h1>  
                <input  type="tel" name="ajaxAccount"value="" placeholder="请输入手机号|QQ号" data-display="手机号">


                <input type="password" name="ajaxPassword" placeholder="请输入密码" >
      
      
                <button type="submit" class="btn btn-large btn-block">我要登录</button>
       
    <script type="text/javascript">
    	$(function(){

    		$(".btn-block").click(function(){
    			$.post("mobile",{ajaxAccount:$("ajaxAccount").val(),ajaxPassword:$("ajaxPassword").val()},function(json) {
    	               alert(json.success);
    	            }, 'json');
    			
    		});
    		
    	});
    </script>
  </body>
</html>
