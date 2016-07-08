<%--
  Created by IntelliJ IDEA.
  User: SDUST-132
  Date: 2016/7/4
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>易买网 - 首页</title>
  <link type="text/css" rel="stylesheet" href="css/style.css" />
  <script type="text/javascript" src="scripts/function.js"></script>
</head>
<body>
<div id="header" class="wrap">
  <div id="logo"><img src="images/logo.gif" /></div>
  <div class="help">
    <a href="#" class="shopping">购物车</a>

    <c:if test="${user==null}">
      <a href="login.jsp">登录</a>
      <a href="register.html">注册</a>
    </c:if>

<c:if test="${user!=null}">
    <a href="guestbook.jsp">留言</a>
</c:if>

  </div>
  <div class="navbar">
    <ul class="clearfix">
      <li class="current"><a href="#">首页</a></li>
      <li><a href="#"></a></li>
      <li><a href="#">百货</a></li>
      <li><a href="#">品牌</a></li>
      <li><a href="#">促销</a></li>
    </ul>
  </div>
</div>
<div id="childNav">
  <div class="wrap">
    <ul class="clearfix">
      <li class="first"><a href="#">音乐</a></li>
      <li><a href="#">影视</a></li>
      <li><a href="#">少儿</a></li>
      <li><a href="#">动漫</a></li>
      <li><a href="#">小说</a></li>
      <li><a href="#">外语</a></li>
      <li><a href="#">数码相机</a></li>
      <li><a href="#">笔记本</a></li>
      <li><a href="#">羽绒服</a></li>
      <li><a href="#">秋冬靴</a></li>
      <li><a href="#">运动鞋</a></li>
      <li><a href="#">美容护肤</a></li>
      <li><a href="#">家纺用品</a></li>
      <li><a href="#">婴幼奶粉</a></li>
      <li><a href="#">饰品</a></li>
      <li class="last"><a href="#">Investor Relations</a></li>
    </ul>
  </div>
</div>
<div id="main" class="wrap">
  <div class="lefter">
    <div class="box">
      <h2>商品分类</h2>
      <dl>
        <c:forEach  var="category" items="${categoryList}">
          <c:if test="${category.epc_parent_id==0}">
            <dt>${category.epc_name} </dt>
          </c:if>
          <c:forEach var="o_category" items="${categoryList}">
            <c:if test="${o_category.epc_parent_id==category.epc_id}">
              <dd> <a href="product-list.jsp">${o_category.epc_name}</a></dd>
            </c:if>
          </c:forEach>

        </c:forEach>
      </dl>
    </div>
    <div class="spacer"></div>
    <div class="last-view">
      <h2>最近浏览</h2>
      <dl class="clearfix">
        <dt><img src="images/product/0_tiny.gif" /></dt>
        <dd><a href="product-view.jsp">法国德菲丝松露精品巧克力500g/盒</a></dd>
        <dt><img src="images/product/0_tiny.gif" /></dt>
        <dd><a href="product-view.jsp">法国德菲丝松露精品巧克力500g/盒</a></dd>
      </dl>
    </div>
  </div>
  <div class="main">
    <div class="price-off">
      <h2>今日特价</h2>
      <ul class="product clearfix">
        <c:forEach var="product" items="${productList}">
        <li>
          <dl>
              <dt><a href="product-view.jsp" target="_blank"><img src="images/product/${product.ep_id}.jpg" /></a></dt>
              <dd class="title"><a href="product-view.jsp" target="_blank">${product.ep_name}</a></dd>
              <dd class="price">${product.ep_price}</dd>
          </dl>
        </li>
        </c:forEach>
      </ul>
    </div>
    <div class="side">
      <div class="news-list">
        <h4>最新公告</h4>
        <ul>
          <c:forEach var="notice" items="${noticeList}">
            <li><a href="news-view.jsp?id=${notice.eno_id}" target="_blank">${notice.eno_title}</a></li>
          </c:forEach>
        </ul>
      </div>
      <div class="spacer"></div>
      <div class="news-list">
        <h4>新闻动态</h4>
        <ul>
          <c:forEach var="news" items="${newList}">
          <li><a href="news-view.jsp?id=${news.enId}" target="_blank">${news.enTitle}</a></li>
          </c:forEach>
        </ul>
      </div>
    </div>
    <div class="spacer clear"></div>
    <div class="hot">
      <h2>热卖推荐</h2>
      <ul class="product clearfix">
        <c:forEach var="hotproduct" items="${hotproductList}">
          <li>
            <dl>
              <dt><a href="product-view.jsp" target="_blank"><img src="images/product/${hotproduct.ep_id}.jpg" /></a></dt>
              <dd class="title"><a href="product-view.jsp" target="_blank">${hotproduct.ep_name}</a></dd>
              <dd class="price">${hotproduct.ep_price}</dd>
            </dl>
          </li>
        </c:forEach>
      </ul>
    </div>
  </div>
  <div class="clear"></div>
</div>
<div id="footer">
  Copyright &copy; 2010 北风教育 All Rights Reserved. 京ICP证1000001号
</div>
</body>
</html>