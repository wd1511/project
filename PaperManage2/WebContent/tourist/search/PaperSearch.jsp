<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="../../1.css"/>
        <link rel="stylesheet" href="1.css"/>
    <script src="../../jquery.js"></script>
    <script type="text/javascript" src="../../1.js"></script>
    <script type="text/javascript" src="1.js"></script>
</head>
<body>
    <div id="homepage_search" style="top:60px;">

        <form action="./tourist/search/Search.action">
        <input type="text" name="searchContent"/> 
        <input type="submit" value="搜索" />
        
        <select name="searchSource">
           <option value="reference">参考文献</option>
           <option value="paper">发表论文</option>
       </select>
       
        <div>
               <input type="radio" name="searchWay" value="byName"><label>论文名</label>
        <input type="radio" name="searchWay" value="byKeywords"><label >关键字</label>
        <input type="radio" name="searchWay" value="byAuthor"><label >作者</label>
        <input type="radio" name="searchWay" value="byDate"><label >时间</label>
        <input type="radio" name="searchWay" value="byPublication"><label >出版源</label>
        </div>
       </form>
       
       
        

    </div>
            
       <div class="paper_area">
            <s:iterator value="paper" id="id">
            <div class="paper">
                <h2><s:property value="#id.paperName"/></h2>
                <s:a href="./PaperInfo.action?paperInfo.paperName=%{#id.paperName}&paperInfo.id=%{#id.id}&paperInfo.author=%{#id.author}&paperInfo.keywords=%{#id.keywords}&paperInfo.sort1=%{#id.sort1}&paperInfo.sort2=%{#id.sort2}&paperInfo.sort3=%{#id.sort3}&paperInfo.publication=%{#id.publication}&paperInfo.workload=%{#id.workload}&paperInfo.date=%{#id.date}&paperInfo.reference=%{#id.reference}">something</s:a>
            </div>
            </s:iterator>
        
        </div>

        <div class="vertical_line">
        </div>

        <div class="recommend">
            <h2>你可能感兴趣的</h2>
            <ul>
                <li><a href="#">论文1</a></li>
                <li><a href="#">论文2</a></li>
            </ul>
        </div>
    </div>
    <div id="login_option" style="background-color:#000000;">
        <span class="txt" onclick="openLoginModal()">登录</span>
        <img src="../../jpg/登录.png" onclick="openLoginModal()"/>
        <img src="../../jpg/菜单.png" onclick="toggleMenu()"/>
    </div>

    <div class="slidebar" id="menu" >
        <div>
        <h3>Menu</h3>
        <img class="close" src="../../jpg/关闭.png" onclick="toggleMenu()"/>
        </div>

        <div class="menu_option">
            <img src="../../jpg/分类.png" />
            <a class="txt" href="/PaperManage2/tourist/paper/PaperSort1.action">发表论文分类</a>
        </div>

        <div class="menu_option">
            <img src="../../jpg/分类.png" />
            <a class="txt" href="/PaperManage2/tourist/reference/ReferenceSort1.action">参考文献分类</a>
        </div>

        <div class="menu_option">
            <img src="../../jpg/关系网络.png" />
           <a class="txt" href="/PaperManage2/tourist/relationship/Relationship.jsp">论文关系网络</a>
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
                                    <form method="post" action="/PaperManage2/tourist/Login.action" accept-charset="UTF-8">
                                     <input id="username" class="form-control" style="width:246px;height:20px;"  type="text" placeholder="用户名" name="username">
                                    <input id="password" class="form-control" style="width:246px;height:20px;" type="password" placeholder="密码" name="password">
                                    <select name="identity">
                                        <option value="user">老师/学生</option>
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