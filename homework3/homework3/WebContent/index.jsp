<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib prefix= "tag" uri="WEB-INF/cust-header.tld" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>
<link rel="stylesheet" href="foodlover.css" type="text/css" />
</head>
<body>
<tag:Cheader/>
<h1>This is the Food Menu</h1>
<section>
<form name = "Menu" id = "Menu" method="post">  


	
		
        <table >
          <thead>
          <tr>
          <th>Item</th>
          <th>Image</th
          ><th>Description</th>
          <th>Price</th>
          </tr>
          </thead>
        
				<c:forEach items = "${items}" var="item">
				<tr>
				<td>${item.getName()}</td>
				<td>${item.getDescription()}</td>
				<td> <img src="${item.getImgURL()}" width="300"/></td>
			    <td>${item.getPrice()}</td>
			    <td> <input type='text' width='10px' name='fitem_id_" + ${item.getId()} + "' value='0' /> 
			         <input type='hidden' name='fid_"+ ${item.getId()} +"' value="${item.getId()}">
			    </td> 
				</tr>
				</c:forEach>
        </table>
	    <button>Add to Cart</button> 
	
	
	</form>
	</section>
	<footer>
			<h5> © 2017 Kunal's Place. All rights reserved!!!</h5>
		</footer>
		 
	
</body>
</html>