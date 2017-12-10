<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
    <link rel="stylesheet" type="text/css" href="1.css"/>
    <link rel="stylesheet" type="text/css" href="../../1.css"/>
    <script src="../../jquery.js"></script>
    <script type="text/javascript" src="../../1.js"></script>
</head>
<body>
         <div class="area">

     <s:iterator value="paperSort3" id="id">
        <figure>
                <img src="images/portfolio/3.jpg"/>
                <figcaption>
                    <h2><s:property value="#id"/></h2>
                    <div class="scription">
                        <s:a href="./PaperList.action?sort3=%{#id}"><p>a small discription for the kind</s:a> </p>
                    </div>
                </figcaption>
        </figure>
    </s:iterator>
    </div>

    <div id="login_option">
        <img src="../../jpg/菜单.png" onclick="toggleMenu()"/>
    </div>

 <div class="slidebar" id="menu" >
        <div>
        <h3>Menu</h3>
        <img class="close" src="../../jpg/关闭.png" onclick="toggleMenu()"/>
        </div>
         <div class="menu_option">
            <img src="../../jpg/收藏夹.png" />
            <p class="txt">收藏夹</p>
        </div>

        <div class="menu_option">
            <img src="../../jpg/导出.png" />
            <p class="txt">导出excel</p>
        </div>

        <div class="menu_option">
            <img src="../../jpg/修改密码.png" />
            <p class="txt">修改密码</p>
        </div>
        
        <div class="menu_option">
            <img src="../../jpg/分类.png" />
            <a class="txt" href="PaperSort1.action">发表论文分类</a>
        </div>

        <div class="menu_option">
            <img src="../../jpg/分类.png" />
            <a class="txt" href="/PaperManage2/user/reference/ReferenceSort1.action">参考文献分类</a>
        </div>
        


        <div class="menu_option">
            <img src="../../jpg/关系网络.png" />
            <p class="txt">论文关系网络</p>
        </div>

        <div class="menu_option">
            <img src="../../jpg/登出.png" />
            <p class="txt">登出</p>
        </div>
    </div>
   
    <div class="login" id="loginModal" >
              <div class="modal-dialog">
                  <div class="modal-content">

                     <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true" onclick="openLoginModal()">&times;</button>
                 </div>

                    <div class="modal-body">  
                        <div class="box">
                             <div class="content">                             
                                <div class="division">
                                    <div class="line l"></div>
                                      <span>登录</span>
                                    <div class="line r"></div>
                                </div>
                                <div class="error"></div>
                                <div class="form loginBox">
                                    <form method="post" action="/login" accept-charset="UTF-8">
                                    <input id="username" class="form-control" type="text" placeholder="用户名" name="username">
                                    <input id="password" class="form-control" type="password" placeholder="密码" name="password">
                                    <input class="btn btn-default btn-login" type="button" value="登录" onclick="loginAjax()">
                                    </form>
                                </div>
                             </div>
                        </div> 
                    </div>
                    <div class="modal-footer">
                        <div class="forgot login-footer">
                            <span>忘记密码?</span>
                        </div>
                    </div>        
                  </div>
              </div>
    </div>
</body>
</html>