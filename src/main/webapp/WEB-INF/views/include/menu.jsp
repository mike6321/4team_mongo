<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 


<a href="/">home</a>
<a href="/memo.do">메모</a>
<a href="/guestbook.do">기타</a>

<div style="text-align: right;">
<c:choose>
	<c:when test="${sesseionScope.userid == null}">
		<a href="member/login.do">로그인</a>
		<a href="member/kakao.do">카카오간편로그인</a>
		<a href="member/naver.do">네이버간편로그인</a>
		<a href="member/boxoffice.do">박스오피스</a>
	</c:when>
	<c:otherwise>
		${sesseionScope.name}님이 로그인하셨습니다.
		<a href="member/logout.do">로그아웃</a>
		
	</c:otherwise>
</c:choose>
</div>
