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
    <link rel="stylesheet" href="3.css"/>
</head>
<body>
    <div class="area">

        <div id="content">
            <h2>论文名称</h2>
            <p><s:property value="referenceInfo.referenceName"/></p>

            <h2>作者</h2>
            <p><s:property value="referenceInfo.author"/></p>

            <h2>关键词</h2>
            <p><s:property value="referenceInfo.keywords"/></p>

            <h2>分类信息</h2>
            <p><s:property value="referenceInfo.sort1"/>:<s:property value="referenceInfo.sort2"/>:<s:property value="referenceInfo.sort3"/></p>

            <h2>出版源</h2>
            <p><s:property value="referenceInfo.publication"/></p>
           
            
            <h2>日期</h2>
            <p><s:property value="referenceInfo.date"/></p>
            
            
        </div>
    </div>
 <div style="position:absolute; top:100px;right:100px;">

    <div>
         <a href="/PaperManage2/papermanage/ReferenceFileDownload.action?referenceName=<s:property value="referenceInfo.referenceName"/>">下载</a>
    </div>
     <a href="/PaperManage2/papermanage/ReferenceExport.action?reference.referenceName=<s:property value="referenceInfo.referenceName"/>
                                                                reference.id=<s:property value="referenceInfo.id"/>&
                                                                reference.author=<s:property value="referenceInfo.author"/>&
                                                                reference.keywords=<s:property value="referenceInfo.keywords"/>&
                                                                reference.sort1=<s:property value="referenceInfo.sort1"/>&
                                                                reference.sort2=<s:property value="referenceInfo.sort2 "/>&
                                                                reference.sort3=<s:property value="referenceInfo.sort3 "/>&
                                                                reference.publication=<s:property value="referenceInfo.publication "/>&
                                                                reference.workload=<s:property value="referenceInfo.workload "/>&
                                                                reference.date=<s:property value="referenceInfo.date "/>">导出</a>
                                                                </div>
   <div id="login_option">
        <img src="../jpg/菜单.png" style="position :absolute; right: 5px;" onclick="toggleMenu()"/>
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
    </html>