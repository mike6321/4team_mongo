<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <html>
    <head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width"/>

    <script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>

    </head>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#btnLogin").click(function(){
		$("#form1").attr("action","/member/login_check.do");
		$("#form1").submit();
	})
	
	$("#btnJoin").click(function(){
		$(location).attr("href","/member/join.do");
	})
});

// 사용할 앱의 JavaScript 키를 설정해 주세요.
Kakao.init('655e5ce98e878441839b7b9a9e6488b2');
// 카카오 로그인 버튼을 생성합니다.
Kakao.Auth.createLoginButton({
  container: '#kakao-login-btn',
  success: function(authObj) {
    alert(JSON.stringify(authObj));
  },
  fail: function(err) {
     alert(JSON.stringify(err));
  }
});
</script>
<body>

<h2>로그인하세요</h2>
<form action="form1" id="form1" method="post">
<table border="1" style="width:400px">
<tr>
	<td>
	아이디
	</td>
	<td>
	<input type="text" name="_id" id="_id">
	</td>	
</tr>
<tr>
	<td>
	비밀번호
	</td>
	<td>
	<input type="text" name="password" id="password">
		<font color="red">${map.message}</font>
	</td>	
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="button" name="btnLogin" id="btnLogin" value="로그인">
		<input type="button" name="btnJoin" id="btnJoin" value="회원가입">
	</td>
	<td>
</tr>
</table>
</form>
</body>
</html>

   

