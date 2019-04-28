<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">

<head>
	<meta charset="UTF-8">
	<jsp:include page="/Layouts/metaHeader.jsp"></jsp:include>
	<jsp:include page="/Layouts/metaFooter.jsp"></jsp:include>
	<title>로그인/회원가입</title>
</head>

<body>
	<div class="container">
		<jsp:include page="/Layouts/nav.jsp"></jsp:include>
		<form action="/signin.do" method="POST">
			<div class="mx-auto" style="width: 80%;">
				<div class="form-group">
					<label for="email">이메일아이디</label>
					<input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
						placeholder="아이디입력">
					<small id="emailHelp" class="form-text text-muted">아이디는 이메일 형식입니다.</small>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">비밀번호</label>
					<input type="password" class="form-control" id="exampleInputPassword1" placeholder="비밀번호">
				</div>
				<div class="form-group form-check">
					<input type="checkbox" class="form-check-input" id="exampleCheck1">
					<label class="form-check-label" for="exampleCheck1">아이디저장</label>
				</div>
				<button type="submit" class="btn btn-primary">로그인</button>
				<button type="button" class="btn btn-primary" onclick="signupRedirect();">회원가입</button>
			</div>
		</form>
	</div>
</body>

<script>
	function signupRedirect() {
		location.href = "/signup.do";
	}
</script>

</html>