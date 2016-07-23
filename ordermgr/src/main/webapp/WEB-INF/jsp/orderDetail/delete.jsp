<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/static/css/application.css" rel="stylesheet">
</head>
<body>
<form action="${pageContext.request.contextPath }/orderDetail/delete" method="post">
	<input type="hidden" name="uuid" value="${m.uuid }" />
	<table width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine">
		<tr>
			<td colspan=4 align=center class="tableLineBg">订单明细删除</td>
		</tr>
		
		<tr>
	<td>订单编号</td>
	<td><input type="text" name="orderUuid" value="${m.orderUuid}"></td>
	<td>商品编号</td>
	<td><input type="text" name="goodsUuid"  value="${m.goodsUuid}"></td>
</tr>
<tr>
	<td>购买数量</td>
	<td><input type="text" name="orderNum" value="${m.orderNum}"></td>
	<td>购买价格</td>
	<td><input type="text" name="price"  value="${m.price}"></td>
</tr>
<tr>
	<td>总金额</td>
	<td><input type="text" name="money" value="${m.money}"></td>
	<td>节省金额</td>
	<td><input type="text" name="saveMoney"  value="${m.saveMoney}"></td>
</tr>

		
		<tr>
			<td colspan=4 align=center><input type="submit" value="删除"></td>
		</tr>
	</table>
</form>
</body>
</html>