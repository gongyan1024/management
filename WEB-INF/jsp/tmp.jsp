<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>主页</title>
<meta name="keywords" content="free design template, download web templates, Fresh Creativet Website, XHTML, CSS" />
<meta name="description" content="Fresh Creative - www.mycodes.net, Free XHTML CSS Design Layout" />
<link href="${pageContext.request.contextPath}/css/templatemo_style.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/image/fullsize/fullsize.css" media="screen" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/image/fullsize/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/image/fullsize/jquery.fullsize.minified.js"></script>
<script language="javascript" type="text/javascript">
function clearText(field)
{
	if (field.defaultValue == field.value) field.value = '';
	else if (field.value == '') field.value = field.defaultValue;
}
$(function(){
				$("div.templatemo_gallery img").fullsize();
			});
</script>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4758",secure:"10666"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-9" data-genuitec-path="/management/WebRoot/WEB-INF/jsp/tmp.jsp">
<div id="templatemo_container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-9" data-genuitec-path="/management/WebRoot/WEB-INF/jsp/tmp.jsp">
  <div id="templatemo_header">
    <div id="templatemo_logo_area">
      <div id="templatemo_logo"> 主页 </div>
      <div id="templatemo_slogan"></div>
    </div>
    <div id="templatemo_social">
         你好,${sessionScope.user.name}同志
    </div>
    <div id="templatemo_menu">
      <ul>
        <li><a href="" class="current">首页</a></li>
        <li><a href="">公告</a></li>
        <li><a href="">反馈交流</a></li>
        <li><a href="">相关下载</a></li>
        <li><a href="">新闻</a></li>
        <li><a href="">科研成果</a></li>
        <li><a href="logout">注销</a></li>
      </ul>
    </div>
  <!-- end of menu -->
  
  
  <!-- 
  </div>
  <div id="templatemo_content_area">
    <div id="templatemo_left">
      <div class="templatemo_section_1">
        <div class="top">
          <h1>Testimonials</h1>
          <span class="title"> WHAT THAY SAY </span> </div>
        <div class="middle">
          <div class="bottom">
            <p>Nulla enim nibh, consectetuer sed, vestibulum elementum, sagittis nec, diam.</p>
            <p>Mauris blandit vehicula neque. Proin consectetuer. Donec venenatis. Cras urna metus, feugiat non, consectetuer quis, pretium quis, nunc. </p>
            <p>Nullam pede purus, tempor a, imperdiet in, porttitor at, nulla. Aliquam elit risus, volutpat quis, mattis ac, elementum eget, mauris. In hac habitasse platea dictumst. </p>
          </div>
        </div>
      </div>
      <div class="templaemo_h_line"></div>
      <div class="templatemo_section_2">
        <h1>News &amp; Events</h1>
        <div class="green">
          <h3>18 December 2010</h3>
          <p>Pellen tesque dolor nulla, con gue vitae, frin gilla in, varius a, orci ma uris con.</p>
        </div>
        <div class="blue">
          <h3>22 November 2010</h3>
          <p>Proin vel libero id erat venen atis accu msan. Nunc blan dit orci sit amet risus.</p>
        </div>
        <div class="yellow">
          <h3>30 October 2010</h3>
          <p>Duis pul vinar scele risque ante. Mor bit risti  que, risus quis congue pul vinar.</p>
        </div>
      </div>
      <div class="templaemo_h_line"></div>
      <div class="templatemo_section_2"> <a href="http://validator.w3.org/check?uri=referer"><img style="border:0;width:88px;height:31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a> <a href="http://jigsaw.w3.org/css-validator/check/referer"><img style="border:0;width:88px;height:31px"  src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" /></a> </div>
    </div>
    -->
    
    <!-- End of left -->
    <!-- 
    <div id="templatemo_right">
      <div class="templatemo_section_3">
        <h1>Welcome</h1>
        <span class="blue_title">To Creative <b>IDEA</b></span>
        <p>This is a <a href="http://www.mycodes.net" target="_parent">www.mycodes.net</a> from www.mycodes.net. You may download, modify and apply this CSS layout for your websites. Credit goes to <a href="http://www.mycodes.net/" target="_blank">full size</a> for jQuery Full Size Image Plugin. Nunc blandit orci sit amet risus. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ut iaculis lacinia purus.</p>
        <p>Aliquam magna. Phasellus id felis.Donec mollis aliquet ligula. Maecenas adipiscing elementum ipsum. Pellentesque vitae magna. Sed nec est. Suspendisse a nibh tristique justo rhoncus volutpat. Suspendisse vitae neque eget ante tristique vestibulum. </p>
      </div>
      <div class="templaemo_h_line"></div>
      <div class="templatemo_section_4">
        <h1>Services</h1>
        <div class="templatemo_two_col left"> <img src="images/templatemo_img_1.jpg" alt="Fruid" />
          <h2>Creative Graphic Design</h2>
          <p>Aliquam sagittis molestie sapien. Nulla tellus risus, tincidunt vitae, sagittis vel, interdum at, erat. Duis vitae velit. Ut ultricies. Fusce sollicitudin nisl.</p>
        </div>
        <div class="templatemo_two_col right"> <img src="images/templatemo_img_2.jpg" alt="www.mycodes.net" />
          <h2>Special Web Design</h2>
          <p>Phasellus tincidunt, tortor lacinia blandit commodo, nunc augue mattis eros, ut convallis est augue vel.</p>
        </div>
        <div class="cleaner"></div>
      </div>
      <div class="cleaner"></div>
      <div class="templatemo_section_5">
        <div class="templatemo_two_col left">
          <h1>Photo Gallery</h1>
          <div class="templatemo_gallery"> <img src="images/templatemo_thumb_1.jpg" class="left" longdesc="images/templatemo_big_1.jpg" title="Sun Flower" alt="Sun Flower" /> <img src="images/templatemo_thumb_2.jpg" class="mid" longdesc="images/templatemo_big_2.jpg" title="Stone" alt="Stone" /> <img src="images/templatemo_thumb_3.jpg" class="right" longdesc="images/templatemo_big_3.jpg" title="Bug" alt="Bug" /> <img src="images/templatemo_thumb_4.jpg" class="left" longdesc="images/templatemo_big_4.jpg" title="Singapore" alt="Singapore" /> <img src="images/templatemo_thumb_5.jpg" class="mid" longdesc="images/templatemo_big_5.jpg" title="Parrot" alt="Parrot" /> <img src="images/templatemo_thumb_6.jpg" class="right" longdesc="images/templatemo_big_6.jpg" title="Jetty" alt="Jetty" /> </div>
        </div>
        <div class="templaemo_v_line"></div>
        <div class="templatemo_two_col right">
          <h1>Contact Info.</h1>
          <p>Pellentesque odio. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas
          <p>
          <p>111/222 Lorem ipsum dolor sit,consectetuer adipiscing elit. Nunc quis sem nec, 10100</p>
          <p>Tel : 010-100-0100</p>
          <p>Fax : 020-200-0200</p>
          <p>Email : info@yourcompany.com</p>
        </div>
        <div class="cleaner"></div>
      </div>
    </div>
    -->
    <!-- End of right -->
  </div>
  <!-- End of content_area -->
</div>

<!-- End Of Container -->
<!-- 
<div class="cleaner"></div>
<div id="templatemo_footer"> Copyright © 2010 <a href="http://www.mycodes.net">Your Company Name</a> | Designed by <a href="http://www.mycodes.net" target="_parent">www.mycodes.net</a> </div>
 -->

</body>
</html>
