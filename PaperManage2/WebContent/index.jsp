<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
           <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="1.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script src="jquery.js"></script>
    <script src="1.js"></script>
    <link rel="stylesheet" href="login.css"/>
    <link rel="stylesheet" href="menu.css"/>
</head>
<body>

    <img src="jpg/主页.jpg" style="height: 100%;width: 100%; z-index: -1; display: inline-block;"/>
    
    <div id="homepage_search">

        <form action="./tourist/search/Search.action">
        <input type="text" name="searchContent"/> 
        <input type="submit" value="搜索" />
        
        <select name="searchSource">
           <option value="reference">参考文献</option>
           <option value="paper">发表论文</option>
       </select>
       
        <div>
        <input type="radio" name="searchWay" value="byName"><label style="color:#fff;">论文名</label>
        <input type="radio" name="searchWay" value="byKeywords"><label style="color:#fff;">关键字</label>
        <input type="radio" name="searchWay" value="byAuthor"><label style="color:#fff;">作者</label>
        <input type="radio" name="searchWay" value="byDate"><label style="color:#fff;">时间</label>
        <input type="radio" name="searchWay" value="byPublication"><label style="color:#fff;">出版源</label>
        </div>
       </form>
       
       
        

    </div>

    <div id="login_option">
        <span class="txt" onclick="openLoginModal()">登录</span>
        <img src="jpg/登录.png" onclick="openLoginModal()"/>
        <img src="jpg/菜单.png" onclick="toggleMenu()"/>
    </div>

    <div class="slidebar" id="menu" >

        <div>
        <h3>Menu</h3>
        <img class="close" src="jpg/关闭.png" onclick="toggleMenu()"/>
        </div>

        <div class="menu_option">
            <img src="jpg/分类.png" />
            <a class="txt" href="./tourist/paper/PaperSort1.action">发表论文分类</a>
        </div>

        <div class="menu_option">
            <img src="jpg/分类.png" />
            <a class="txt" href="./tourist/reference/ReferenceSort1.action">参考文献分类</a>
        </div>

        <div class="menu_option">
            <img src="jpg/关系网络.png" />
            <a class="txt" href="./tourist/relationship/Relationship.jsp">论文关系网络</a>
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
                                    <form method="post" action="tourist/Login.action" accept-charset="UTF-8">
                                    <input id="username" class="form-control" type="text" placeholder="用户名" name="username">
                                    <input id="password" class="form-control" type="password" placeholder="密码" name="password">
                                    <select name="identity">
                                        <option value="user">用户</option>
                                        <option value="manager">管理员</option>
                                    </select>
                                    <input class="btn btn-default btn-login" type="submit" value="登录" >
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