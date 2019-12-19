<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	</head>
	<body>
		<form action="${pageContext.request.contextPath}/student/login">
			账号:<input type="text" name="account"/><br/>
			密码:<input type="text" name="password"/><br/>
			<input type="submit" value="提交"/>
		</form>
	</body>
</html>