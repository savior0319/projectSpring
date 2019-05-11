<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<jsp:include page="/Layouts/metaHeader.jsp"></jsp:include>
<jsp:include page="/Layouts/metaFooter.jsp"></jsp:include>
<title>로그아웃실패</title>
</head>

<body>
	<div class="container">
		<jsp:include page="/Layouts/nav.jsp"></jsp:include>
		<h1>로그아웃실패</h1>
	</div>
</body>

<script>
	function signupRedirect() {
		location.href = "/signup.do";
	}
</script>

</html>