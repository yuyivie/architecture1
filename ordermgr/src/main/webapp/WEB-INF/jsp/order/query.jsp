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
			var json ='{"customerUuid":"'+$("#customerUuid").val()+'","orderTime":"'+$("#orderTime").val()+'","totalMoney":"'+$("#totalMoney").val()+'","saveMoney":"'+$("#saveMoney").val()+'","state":"'+$("#state").val()+'"}';
			window.location.href = "${pageContext.request.contextPath}/order/toList?queryJsonStr="+json;
		});		
	});
</script>

<table width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine">
	<tr>
		<td colspan=4 align=center class="tableLineBg">order查询</td>
	</tr>
		
		
		<tr>
	<td>客户编号</td>
	<td><input type="text" id="customerUuid" name="customerUuid" ></td>
	<td>下订单时间</td>
	<td><input type="text" id="orderTime" name="orderTime" ></td>
	</tr>
<tr>
	<td>总金额</td>
	<td><input type="text" id="totalMoney" name="totalMoney" ></td>
	<td>节省金额</td>
	<td><input type="text" id="saveMoney" name="saveMoney" ></td>
	</tr>
<tr>
	<td>状态</td>
	<td><input type="text" id="state" name="state" ></td>
	
		
		<tr>
			<td><input id="btn_query" type="button" value="查询" class="button"></td>
		</tr>
	</table>
</form>
</body>
</html>