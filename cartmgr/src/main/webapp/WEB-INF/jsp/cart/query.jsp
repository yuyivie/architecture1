<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/static/css/application.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/static/js/jquery-1.11.0.js"></script>
</head>
<body>
<script type="text/javascript">
	$().ready(function(){
		$("#btn_query").click(function(){
			var json ='{"customerUuid":"'+$("#customerUuid").val()+'","goodsUuid":"'+$("#goodsUuid").val()+'","buyNum":"'+$("#buyNum").val()+'"}';
			window.location.href = "${pageContext.request.contextPath}/cart/toList?queryJsonStr="+json;
		});		
	});
</script>

<table width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine">
	<tr>
		<td colspan=4 align=center class="tableLineBg">cart查询</td>
	</tr>
		
		
		<tr>
	<td>客户编号</td>
	<td><input type="text" id="customerUuid" name="customerUuid" ></td>
	<td>商品编号</td>
	<td><input type="text" id="goodsUuid" name="goodsUuid" ></td>
	</tr>
<tr>
	<td>购买数量</td>
	<td><input type="text" id="buyNum" name="buyNum" ></td>
	
		
		<tr>
			<td><input id="btn_query" type="button" value="查询" class="button"></td>
		</tr>
	</table>
</form>
</body>
</html>