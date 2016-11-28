<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>" />
	<%@ include file="/common/meta.jsp"%>
	<%@ include file="/common/amazeuiHEAD.jsp"%>
<style>
.header {
	text-align: center;
}

.header h1 {
	font-size: 200%;
	color: #333;
	margin-top: 30px;
}

.header p {
	font-size: 14px;
}
</style>
</head>
<body>
	<div class="header">
		<div class="am-g">
			<h1>CJServices接口平台管理系统</h1>
			<p>
				Integrated Development Environment<br />接口权限管理，基本接口快速创建，接口文档自动生成
			</p>
		</div>
		<hr />
	</div>
	<div class="am-g">
		<div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
			<h3>登录CJServices接口平台管理系统</h3>
			<hr>
			<form method="post" class="am-form" action="login">
				<label for="email">账户:</label> <input type="email" name=""
					id="email" value=""> <br> <label for="password">密码:</label>
				<input type="password" name="" id="password" value=""> <br>
				<label for="remember-me"> <input id="remember-me"
					type="checkbox"> 记住密码
				</label> <br />
				<div class="am-cf">
					<input type="submit" name="" value="登 录"
						class="am-btn am-btn-primary am-btn-sm am-fl"> <input
						type="submit" name="" value="忘记密码 ^_^? "
						class="am-btn am-btn-default am-btn-sm am-fr">
				</div>
			</form>
			<hr>
			<p>© 2016 LancCJ, Inc. Licensed under MIT license.</p>
		</div>
	</div>
	  <%@ include file="/common/amazeuiFOOT.jsp"%>
	
</body>
</html>

