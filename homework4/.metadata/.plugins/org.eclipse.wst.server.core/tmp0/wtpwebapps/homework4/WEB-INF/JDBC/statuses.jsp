<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib prefix= "tag" uri="/WEB-INF/cust-header.tld" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order Status</title>
<link rel="stylesheet" href="foodlover.css" type="text/css" />
</head>
<body>
<tag:Cheader/>
<section>
		<h1>Order Statuses</h1>
		<table>
		<thead>
			<tr>
				<th>Created</th>
				<th>Item</th>
				<th>Customer</th>
				<th>Status</th>
			</tr>
			</thead>
			<c:forEach items="${list}" var="order">
                    <tr>
                        <td>"${order.created}"</td>
                        <td><img src="${order.item_img}" width="100" height="100"></td>
                        <td><label for="name">${order.castomer_name}</label>
                        <input type="hidden" value="${order.order_id}" name="orderId" />
                        </td>
                        <td><select name="statusValue">
                                <option value="IN_QUEUE">IN_QUEUE</option>
                                <option value="IN_PROGRESS">IN_PROGRESS</option>
                                <option value="COMPLETED">COMPLETED</option>
                        </select></td>
                    </tr>
                </c:forEach>
			
		</table>
		</section>
		<footer>
			<h5> ©2017 Kunal's Place</h5>
		</footer>
</body>
</html>