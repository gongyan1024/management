<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title>下载文件显示页面</title>
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4758",secure:"10666"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/management/WebRoot/WEB-INF/jsp/fileList.jsp">
  
      <!-- 遍历Map集合 -->
    <c:forEach var="me" items="${fileNameMap}">
        <c:url value="downloadResearchs" var="downurl">
            <c:param name="filename" value="${me.value}"></c:param>
        </c:url>
        ${me.key}<a href="${downurl}">下载</a>
        <br/>
    </c:forEach>
  </body>
</html>