
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p><font color="green">${succmsg} </font></p>
<p><font color="red">${errmsg} </font></p>

<h2>save contact</h2>

<form:form action="saveContact" method= "POST" modelAttribute="contact">
<table>
  <tr>
      <td>Contact Name</td>
      <td>:</td>
      <td><form:input path="contactName"/> </td>
      
  </tr>
  <tr>
      <td>Email</td>
      <td>:</td>
      <td><form:input path="contactEmail"/> </td>
      
  </tr>
  <tr>
      <td>Number</td>
      <td>:</td>
      <td><form:input path="contactNumber"/> </td>
     
      
  </tr>
  
  <tr>
      
      <td><form:input path="contactId"  type="hidden"/> </td>
     
      
  </tr>
  
  <tr>
  <td><input type="reset" value="Reset"/></td>
  <td><input type="submit" value="Save"/></td>
  
  </tr>



</table>


</form:form>
<a href="viewcontact">ViewAllContact</a>

</body>
</html>