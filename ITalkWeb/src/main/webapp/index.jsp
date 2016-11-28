<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>" />
	<%@ include file="/common/meta.jsp"%>
	<%@ include file="/common/amazeuiHEAD.jsp"%>
<style>
.get {
	background: #1E5B94;
	color: #fff;
	text-align: center;
	padding: 100px 0;
}

.get-title {
	font-size: 200%;
	border: 2px solid #fff;
	padding: 20px;
	display: inline-block;
}

.get-btn {
	background: #fff;
}

.detail {
	background: #fff;
}

.detail-h2 {
	text-align: center;
	font-size: 150%;
	margin: 40px 0;
}

.detail-h3 {
	color: #1f8dd6;
}

.detail-p {
	color: #7f8c8d;
}

.detail-mb {
	margin-bottom: 30px;
}

.hope {
	background: #0bb59b;
	padding: 50px 0;
}

.hope-img {
	text-align: center;
}

.hope-hr {
	border-color: #149C88;
}

.hope-title {
	font-size: 140%;
}

.about {
	background: #fff;
	padding: 40px 0;
	color: #7f8c8d;
}

.about-color {
	color: #34495e;
}

.about-title {
	font-size: 180%;
	padding: 30px 0 50px 0;
	text-align: center;
}

.footer p {
	color: #7f8c8d;
	margin: 0;
	padding: 15px 0;
	text-align: center;
	background: #2d3e50;
}
</style>
</head>
<body>
	<header class="am-topbar am-topbar-fixed-top">
		<div class="am-container">
			<h1 class="am-topbar-brand">
				<a href="#">CJServices接口平台管理系统</a>
			</h1>

			<button
				class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-secondary am-show-sm-only"
				data-am-collapse="{target: '#collapse-head'}">
				<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
			</button>

			<div class="am-collapse am-topbar-collapse" id="collapse-head">
				<ul class="am-nav am-nav-pills am-topbar-nav">
					<li class="am-active"><a href="#">首页</a></li>
					 <li><a href="#servicesList">接口服务列表</a></li>
				</ul>

				<div class="am-topbar-right">
					<a href="toLogin" style="color:white;">
						<button class="am-btn am-btn-primary am-topbar-btn am-btn-sm">
							<span class="am-icon-user"></span>登录
						</button>
					</a>
				</div>
			</div>
		</div>
	</header>

	<div class="get">
		<div class="am-g">
			<div class="am-u-lg-12">
				<h1 class="get-title">CJServices接口平台管理系统</h1>
				<p>期待你的参与，共同打造一个简单易用的接口平台管理系统</p>
			</div>
		</div>
	</div>

	<div class="detail">
		<div class="am-g am-container">
			<div class="am-u-lg-12">
				<h2 class="detail-h2">接口平台管理系统特点描述</h2>

				<div class="am-g">
					<div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">

						<h3 class="detail-h3">
							<i class="am-icon-mobile am-icon-sm"></i> 为移动而生
						</h3>

						<p class="detail-p">Amaze UI 采用业内先进的 mobile first
							理念，从小屏逐步扩展到大屏，最终实现所有屏幕适配，适应移动互联潮流，因为这样同时您可以在除PC以外的设备上进行接口管理。</p>
					</div>
					<div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">
						<h3 class="detail-h3">
							<i class="am-icon-cogs am-icon-sm"></i> 自定义快速创建
						</h3>

						<p class="detail-p">接口平台管理系统可以让您快速创建接口服务提供第三方使用，且接口文档自动生成即可下载存档</p>
					</div>
					<div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">
						<h3 class="detail-h3">
							<i class="am-icon-check-square-o am-icon-sm"></i> 本地化支持
						</h3>

						<p class="detail-p">相比国外的前端框架，Amaze UI
							专注解决中文排版优化问题，根据操作系统调整字体，实现最佳中文排版效果；针对国内主流浏览器及 App
							内置浏览器提供更好的兼容性支持，为你节省大量兼容性调试时间。</p>
					</div>
					<div class="am-u-lg-3 am-u-md-6 am-u-sm-12 detail-mb">
						<h3 class="detail-h3">
							<i class="am-icon-send-o am-icon-sm"></i> 轻量级，高性能
						</h3>

						<p class="detail-p">Amaze UI 非常注重性能，基于轻量的 Zepto.js 开发，并使用 CSS3
							来做动画交互，平滑、高效，更适合移动设备，让你的 Web 应用可以高速载入。</p>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="hope">
		<div class="am-g am-container">
			<div class="am-u-lg-4 am-u-md-6 am-u-sm-12 hope-img">
				<img src="static/AmazeUI/assets/i/examples/landing.png" alt=""
					data-am-scrollspy="{animation:'slide-left', repeat: false}">
				<hr class="am-article-divider am-show-sm-only hope-hr">
			</div>
			<div class="am-u-lg-8 am-u-md-6 am-u-sm-12">
				<h2 class="hope-title"><a href="#" name="servicesList"></a>CJServices接口平台管理系统接口服务列表</h2>
				<p>
        列表信息详细展示了接口的调用示例，接口传参形式，接口返回报文，JAVA解析代码DEMO
      </p>
			</div>
		</div>
		
		<div class="am-g" >
        <div class="am-u-sm-12">
          <form class="am-form">
            <table class="am-table am-table-striped am-table-hover table-main" style="margin:0 auto;">
              <thead>
              <tr>
                <th class="table-title">服务名</th><th class="table-type">功能描述</th><th class="table-author am-hide-sm-only">创建者</th><th class="table-author am-hide-sm-only">审核者</th><th class="table-date am-hide-sm-only">创建日期</th><th class="table-set">操作</th>
              </tr>
              </thead>
              <tbody>
              <c:forEach items="${page.list}" var="service">
              <tr>
                <td>${service.serviceName}</td>
                <td>${service.serviceDesc}</td>
                <td>${service.serviceCreater}</td>
                <td>${service.serviceApprover}</td>
                <td><fmt:formatDate value="${service.serviceCreateTime}" type="both"/></td>
                <td><fmt:formatDate value="${service.serviceApprovalTime}" type="both"/></td>
                <td>
                  <div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                    	<button
  type="button"
  class="am-btn am-btn-primary"
  data-am-modal="{target: 'http://www.baidu.com', closeViaDimmer: 0, width: 400, height: 225}">
  Modal
</button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span>查看详情</button>
                    </div>
                  </div>
                </td>
	    	</tr>
	    	</c:forEach>
              </tbody>
            </table>
            <div class="am-cf">
              共 1 条记录
              <div class="am-fr">
                <ul class="am-pagination">
                  <li class="am-disabled"><a href="#">«</a></li>
                  <li class="am-active"><a href="#">1</a></li>
                  <li><a href="#">»</a></li>
                </ul>
              </div>
            </div>
          </form>
        </div>

      </div>
	</div>

	<footer class="footer">
		<p>
			© 2016 <a href="#" target="_blank">LancCJ, Inc.</a> 
		</p>
	</footer>

	<%@ include file="/common/amazeuiFOOT.jsp"%>
</body>
</html>

