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
	<style>
		select{
			width:120px;
		}
		input[type="text"]{
			width:400px;
		}
	</style>
  </head>
  
  <body>
  
  
    	
    <h1>搜索:</h1>
    <form action="<s:url value="/user/findByKeywords"/>" method="post">
    	选择搜索的列:
    		<select name="cols" multiple="multiple">
    			<option value="name">用户名</option>
    			<option value="age">年龄</option>
    			<option value="bir">生日</option>
    			<option value="address">住址</option>
    			<option value="fork">民族</option>
    			<option value="code">身份证号</option>
    		</select>
    	<input type="text" name="keywords" />
    	<input type="submit" value="搜索"/>
    </form>
    <hr/>
    <h1>遍历:</h1>
    <table>
    	<tr>
    		<td>用户id</td>
    		<td>用户名</td>
    		<td>年龄</td>
    		<td>生日</td>
    		<td>住址</td>
    		<td>民族</td>
    	</tr>
    	<s:iterator value="users">
	    	<tr>
	    		<td><s:property value="id"/></td>
	    		<td><s:property value="name"/></td>
	    		<td><s:property value="age"/></td>
	    		<td><s:date name="bir" format="yyyy-MM-dd"/></td>
	    		<td><s:property value="card.address"/></td>
	    		<td><s:property value="card.fork"/></td>
	    	</tr>
    	</s:iterator>
    </table>
    <hr/>
    
    
    <a href="<s:url value="/user/addUser.jsp"/>">添加用户信息</a>
    <a href="<s:url value="/user/findAllNoCard"/>">添加用户身份信息</a>
    
    
    
    
  </body>
</html>
