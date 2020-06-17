<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
  </head>
  
  <body>
    	
   	
   	<form action="<s:url value="/card/add"/>" method="post">
   		请选择用户信息:
   		<select name="card.user.id">
   			<s:iterator value="users">
   				<option value="<s:property value="id"/>"><s:property value="name"/></option>
   			</s:iterator>
   		</select>
   		身份编号:<input type="text" name="card.code"/>
   		地址:<input type="text" name="card.address"/>
   		民族:<input type="text" name="card.fork"/><!-- struts2 默认接收日期格式   yyyy-MM-dd -->
		<input type="submit" value="提交"/>   	
   	</form>
    
    
    
  </body>
</html>
