<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="admin-header.tld" prefix= "tag"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="app.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
<tag:Aheader/>
    <section>
		<h4>Existing food items</h4>
		<table border=1 cellpadding=0 cellspacing=0 width=100% >
            <thead>
			<tr>
				<th>Created</th>
				<th>Item</th>
				<th>Action</th>	
			</tr>
            </thead>
            <tbody>
<c:forEach items = "${items}" var="item">
<tr>
<td><fmt:formatDate value="${date}" type="time" /></td>
<td> <img src="${item.getImageUrl()}" width="100" height="100"> <br> ${item.getName()}</td>
<td><button name="delete">Delete</button> </td>
</tr>
</c:forEach>
</tbody>
		</table>
        <button class="AddNFood"style="width: 200px; height: 25px;" align= "right;">      Add New Food</button>  
		</section>
		<footer>
			<h5> ©2017 Kunal's Place. All rights reserved!!!</h5>
		</footer>
		 
	</body>
</html>