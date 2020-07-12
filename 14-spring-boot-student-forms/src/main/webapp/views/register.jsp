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
<h4><font color='green'>${sucMsg}</font></h4>
<form:form action="register" modelAttribute="student" method="POST">
<table>
   <tr>
     <td>Student Name:</td>
     <td><form:input path="name"/></td>
   </tr>
   <tr>
     <td>password:</td>
     <td><form:password path="pwd"/>
   </tr>
   <tr>
     <td>Email:</td>
     <td><form:input path="email"/></td>
   </tr>
   <tr>
     <td>Phone no:</td>
     <td><form:input path="phno"/></td>
   </tr>
   <tr>
     <td>course:</td>
     <td>
     <form:select path="course">
        <form:option value="">-select-</form:option>
        <form:option value="java">java</form:option>
        <form:option value="python">python</form:option>
     </form:select>
     </td>
   </tr>
   <tr>
     <td>Gender:</td>
     <td>
       <form:radiobutton path="gender" value="M"/>Male
       <form:radiobutton path="gender" value="F"/>Fe-Male
      </td>
   </tr>
   <tr>
     <td>Preferrable Timings:</td>
     <td>
       <form:checkbox path="prefferableTimings" value="Mor"/>Morning
       <form:checkbox path="prefferableTimings" value="eve"/>evening
       
     </td>
   </tr>
   <tr>
     <td><input type="reset" value="reset"></td>
     <td><input type="submit" value="register"></td>
   </tr>

</table>
</form:form>
</body>
</html>