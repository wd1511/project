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


    
    <div class="area">

        <div id="content">
            <h2>论文名称</h2>
            <p><s:property value="paperInfo.paperName"/></p>

            <h2>作者</h2>
            <p><s:property value="paperInfo.author"/></p>

            <h2>关键词</h2>
            <p><s:property value="paperInfo.keywords"/></p>

            <h2>分类信息</h2>
            <p><s:property value="paperInfo.sort1"/>:<s:property value="paperInfo.sort2"/>:<s:property value="paperInfo.sort3"/></p>

            <h2>出版源</h2>
            <p><s:property value="paperInfo.publication"/></p>
            
            <h2>工作量分数</h2>
            <p><s:property value="paperInfo.workload"/></p>
            
            <h2>日期</h2>
            <p><s:property value="paperInfo.date"/></p>
            
            <h2>参考文献</h2>
            <p><s:property value="paperInfo.reference"/></p>
            
        </div>
    </div>
    
     <div style="position:absolute; top:100px;right:100px;">
    
    
    <div>
         <a href="/PaperManage2/papermanage/PaperFileDownload.action?paperName=<s:property value="paperInfo.paperName"/>">下载</a>
    </div>

    
    <div>
        <a href="/PaperManage2/papermanage/PaperExport.action?paper.paperName=<s:property value="paperInfo.paperName"/>&
                                                                paper.id=<s:property value="paperInfo.id"/>&
                                                                paper.author=<s:property value="paperInfo.author"/>&
                                                                paper.keywords=<s:property value="paperInfo.keywords"/>&
                                                                paper.sort1=<s:property value="paperInfo.sort1"/>&
                                                                paper.sort2=<s:property value="paperInfo.sort2 "/>&
                                                                paper.sort3=<s:property value="paperInfo.sort3 "/>&
                                                                paper.publication=<s:property value="paperInfo.publication "/>&
                                                                paper.workload=<s:property value="paperInfo.workload "/>&
                                                                paper.date=<s:property value="paperInfo.date "/>&
                                                                paper.reference=<s:property value="paperInfo.reference "/>">导出</a>
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