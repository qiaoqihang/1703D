<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/index_work.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<table>
		
		<tr>
			<td></td>
			<td>商铺编号</td>
			<td>商铺名称</td>
			<td>成立时间</td>
			<td>商品类型</td>
		</tr>
			<tr>
				<td></td>
				<td>${store.sid }</td>
				<td>${store.sname }</td>
				<td>${store.time }</td>
				<td>${store.bnames }</td>
			</tr>
		
	</table>
</body>
</html>