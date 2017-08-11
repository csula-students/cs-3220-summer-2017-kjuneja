<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="WEB-INF/admin-header.tld" prefix= "tag"%>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="foodlover.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order Statuses</title>
</head>
<body>
<tag:Aheader/>
<h4>Order Statuses</h4>
<table border=1 cellpadding=0 cellspacing=0 width=100%>
<thead>
<tr>
<th>Created</th>
<th>Item</th>
<th>Customer</th>
<th>Status</th>
</tr>
</thead>
<tbody>

<tr>
<c:forEach items = "${items}" var="item">
<tr>
<td><fmt:formatDate value="${date}" type="time" /></td>
<td> <img src="${item.getImageUrl()}" width="100" height="100"> <br> ${item.getName()}</td>
<td> </td>
<td><form name="status" method="get" width="100" >
       <select>
           <option>In Queue</option>
           <option>Completed</option>
           <option>In progress</option>   
           
       </select>
    </form> 
</td>
</tr>
</c:forEach>
</tbody>
</table>
<button>Update your Order</button>
<footer>
			<h5> ©2017 Kunal's Place. All rights reserved!!!</h5>
		</footer>
</body>
</html>