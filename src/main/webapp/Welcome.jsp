<%@ page import="org.webapp.DisplayData" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
DisplayData disp = (DisplayData)request.getAttribute("display");
%>
<table align="center" bgcolor="#FFFFCC" border="1" width="70%">
    <tr>
        <td colspan="2" align="center"><%="Welcome "+disp.getName()+" !!!!. Your details Processed." %></td>
    </tr>
    <tr>
        <td>Name </td>
        <td><%=disp.getName()%></td>
    </tr>
    <tr>
        <td>Rollno </td>
        <td><%=disp.getRollno() %></td>
    </tr>
    <tr>
    <td>Course</td>
    <td><%=disp.getCourse() %></td>
    </tr>
   
    <tr>
        <td>Fees </td>
        <td><%=disp.getFees() %></td>
    </tr> 
     
</table>
</body>
</html>