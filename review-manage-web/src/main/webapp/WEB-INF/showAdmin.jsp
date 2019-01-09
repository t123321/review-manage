<%@ page language="java" contentType="text/html; charset=utf-8"
     pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>person list</title>
    </head>
    <body>
        <table>
            <tr>
                <th>姓名</th>
                <th>年龄</th>
            </tr>
            <c:forEach items="${admins}" var="admin">
                <tr>
                    <td>${admin.adminName }</td>
                    <td>${admin.adminAge }</td>
                    <td>${admin.adminSex }</td>
                </tr>
            </c:forEach>
        </table>
    </body>