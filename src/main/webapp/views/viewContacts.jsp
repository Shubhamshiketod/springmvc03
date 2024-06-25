<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
     <a href="addContact">+Add New Contact</a>
	<table border="1">

		<thead>
			<tr>
				<th>S.No</th>
				<th>Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Action</th>
			</tr>
		</thead>
		
		<tbody>
		
		
		  <c:forEach items="${contacts}" var="c" varStatus="status">
		  <tr>
		        <td>${status.count}</td>
		      <td>${c.contactName}</td>		    
		     <td>${c.contactEmail}</td>
		     <td>${c.contactNumber}</td>
		     <td><a href="update?cid=${c.contactId}">Edit</a>
		     <a href="delete?cid=${c.contactId}">Delete</a>
		     
		     
		     
		     </td>
		     
		     
		  
		  
		  
		  
		  </tr>
		  
		  
		  </c:forEach>
		
		
		
		
		
		
		</tbody>
		

	</table>
</body>
</html>