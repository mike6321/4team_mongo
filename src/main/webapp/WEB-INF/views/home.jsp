<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<%@include file="include/header.jsp" %>
</head>
<%@include file="include/menu.jsp" %>

<h2>welcome</h2>

<c:if test="${sesseionScope.userid != null}">
	<h2>
	${sesseionScope.name}
	${sesseionScope.userid}���� �湮�� ȯ���մϴ�. 
	</h2>
</c:if>

</html>

