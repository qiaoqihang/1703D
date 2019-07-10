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
	$(function(){
		$("#btn").click(function(){
			var bids="";
			$(":checkbox:checked").each(function(){
				bids+=","+this.value;
			})
			bids=bids.substring(1);
			alert(bids)
			$.post("delstores.do",{"bids":bids},function(flag){
				if(flag){
					alert("删除成功！！！");
					location="list.do";
				}else{
					alert("删除失败！！！");
					location="list.do";
				}
			},"json")
		})
	})
</script>
</head>
<body>
	<table>
		<form action="list.do" method="post">
			<tr>
				<td colspan="6">店铺名称：<input type="text" name="sname"> <input
					type="submit" value="查询"> 
					<a href="addstore.jsp"><input type="button" value="添加店铺"></a>
					 <input type="button" value="批量删除" id="btn">
				</td>
			</tr>
		</form>
		<tr>
			<td></td>
			<td>商铺编号</td>
			<td>商铺名称</td>
			<td>成立时间</td>
			<td>商品类型</td>
			<td>商品操作</td>
		</tr>
		<c:forEach items="${list}" var="s">
			<tr>
				<td><input type="checkbox" value="${s.sid }"></td>
				<td>${s.sid }</td>
				<td>${s.sname }</td>
				<td>${s.time }</td>
				<td>${s.bnames }</td>
				<td>
				<a href="addshow.jsp?sid=${s.sid }&sname=${s.sname }"><input type="button" value="添加商品"></a>
				<a href="see.do?sid=${s.sid }"><input type="button" value="查看详情"></a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="6"><a href="list.do?pageNum=${pageInfo.firstPage }"><input
					type="button" value="首页"></a> <a
				href="list.do?pageNum=${pageInfo.prePage }"><input type="button"
					value="上一页"></a> <a
				href="list.do?pageNum=${pageInfo.nextPage }"><input
					type="button" value="下一页"></a> <a
				href="list.do?pageNum=${pageInfo.lastPage }"><input
					type="button" value="尾页"></a></td>
		</tr>
	</table>
</body>
</html>