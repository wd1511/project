<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="../../1.css"/>
    <script src="../../jquery.js"></script>
    <script type="text/javascript" src="../../1.js"></script>
    <link rel="stylesheet" href="2.css"/>
</head>
<body style="background-color: #ffffff;">
    <div>
    发表论文
    <img style="display: inline-block; width: 20px;height: 20px; position: 
    relative;top:5px;" src="./images/箭头.png"/><s:property value="sort1"/>(一级分类)
    <img style="display: inline-block; width: 20px;height: 20px; position: 
    relative;top:5px;" src="./images/箭头.png"/><s:property value="sort2"/>(二级分类)
    <img style="display: inline-block; width: 20px;height: 20px; position: 
    relative;top:5px;" src="./images/箭头.png"/><s:property value="sort3"/>(三级分类)
    <img style="display: inline-block; width: 20px;height: 20px; position: 
    relative;top:5px;" src="./images/箭头.png"/>论文列表
    </div>
    <div class="area">  
        <div class="region">
             

            <ol class="rounded-list">
            <s:iterator value="paper" id="id">
            <li><s:a href="./PaperInfo.action?sort1=%{sort1}&sort2=%{sort2}&sort3=%{sort3}&paperInfo.paperName=%{#id.paperName}&paperInfo.id=%{#id.id}&paperInfo.author=%{#id.author}&paperInfo.keywords=%{#id.keywords}&paperInfo.sort1=%{#id.sort1}&paperInfo.sort2=%{#id.sort2}&paperInfo.sort3=%{#id.sort3}&paperInfo.publication=%{#id.publication}&paperInfo.workload=%{#id.workload}&paperInfo.date=%{#id.date}&paperInfo.reference=%{#id.reference}">
            <s:property value="#id.paperName"/></s:a></li>
            </s:iterator>
            </ol>
        </div>
    </div>
    
    

        <div id="login_option">
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
            <a class="txt" href="PaperSort1.action">发表论文分类</a>
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
</html>