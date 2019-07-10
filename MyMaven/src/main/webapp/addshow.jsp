<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/index_work.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		$.post("findband.do",function(o){
			for ( var x in o) {
				$("#sel").append("<input type='checkbox' name='bname' value='"+o[x].bid+"'>"+o[x].bname+"")
			}
		},"json")
		$("#bnd").click(function(){
			var bnd="";
			var sid=$("#sid").val()
			$("input[name='bname']:checked").each(function(){
				bnd+=","+this.value;
			})
			bnd=bnd.substring(1);
			alert(bnd)
			
			$.post("addshow.do",{"bnd":bnd,"sid":sid},function(flag){
				if(flag){
					alert("添加成功！！！");
					location="list.do";
				}else{
					alert("添加失败！！！");
					location="list.do";
				}
			},"json")
		})
		
		
	})
</script>
</head>
<body>
<form action="" method="post">
店铺编号：<input type="text" name="sid" value="${param.sid }" id="sid"><br>
店铺名称：<input type="text" name="sname" value="${param.sname }"><br>
店铺商品：<span id="sel"></span><br>
<input type="button" value="添加商品" id="bnd">
</form>
</body>
</html>