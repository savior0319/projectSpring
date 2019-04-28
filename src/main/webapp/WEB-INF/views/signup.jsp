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
		<form action="/insertuser.do" method="POST">
			<div class="mx-auto" style="width: 80%;">
				<div class="form-group row">
					<label for="inputEmail3" class="col-sm-2 col-form-label">아이디</label>
					<div class="col-sm-6">
						<input type="email" class="form-control" id="userId" name="userId" placeholder="아이디입력"
							maxlength="30" required>
					</div>
					<div class="col-sm-4">
						<button type="button" class="btn btn-primary">중복확인</button>
					</div>
				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label">비밀번호</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="userPassword" name="userPassword"
							placeholder="비밀번호" maxlength="20" required>
					</div>
				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label">이름</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="userName" name="userName" placeholder="이름"
							maxlength="10" required>
					</div>
				</div>
				<fieldset class="form-group">
					<div class="row">
						<legend class="col-form-label col-sm-2 pt-0">성별</legend>
						<div class="col-sm-10">
							<div class="form-check">
								<input class="form-check-input" type="radio" name="userGender" id="male" value="M"
									checked>
								<label class="form-check-label" for="male">
									남
								</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="userGender" id="female" value="F">
								<label class="form-check-label" for="female">
									여
								</label>
							</div>
						</div>
					</div>
				</fieldset>
				<!-- <div class="form-group row">
					<div class="col-sm-2">Checkbox</div>
					<div class="col-sm-10">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" id="gridCheck1">
							<label class="form-check-label" for="gridCheck1">
								약관동의
							</label>
						</div>
					</div>
				</div> -->
				<div class="form-group row">
					<div class="col-sm-10">
						<button type="submit" class="btn btn-primary">가입하기</button>
					</div>
				</div>
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