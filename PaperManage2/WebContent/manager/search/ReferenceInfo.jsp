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
<div style="position:relative; top:-150px;left:300px;">
    <div>
    <a href="/PaperManage2/manager/paperinfomanage/DeleteReference.action?reference.id=<s:property value="referenceInfo.id"/>">删除</a>
    </div>
    
    <div>
    <a href="/PaperManage2/manager/paperinfomanage/ModifyReference.jsp?id=<s:property value="referenceInfo.id"/>">修改</a>
    </div>

    <div>
         <a href="/PaperManage2/papermanage/ReferenceFileDownload.action?referenceName=<s:property value="referenceInfo.referenceName"/>">下载</a>
    </div>
   <div id="login_option">
        <img src="../jpg/菜单.png" style="position :absolute; right: 5px;" onclick="toggleMenu()"/>
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
        <img src="../../jpg/菜单.png" style="position :absolute; right: 5px;" onclick="toggleMenu()"/>
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
            <img src="../../jpg/用户管理.png" />
            <p class="txt">用户管理</p>
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
            <img src="../../jpg/论文管理.png" />
            <a class="txt" href="/PaperManage2/manager/paperinfomanage/AddPaper.jsp">添加发表论文</a>
        </div>

        <div class="menu_option">
            <img src="../../jpg/论文管理.png" />
            <a class="txt" href="/PaperManage2/manager/paperinfomanage/AddReference.jsp">添加参考文献</a>
        </div>

        <div class="menu_option">
            <img src="../../jpg/分类.png" />
           <a class="txt" href="/PaperManage2/manager/paper/PaperSort1.action">发表论文分类</a>
        </div>

        <div class="menu_option">
            <img src="../../jpg/分类.png" />
            <a class="txt" href="/PaperManage2/manager/reference/ReferenceSort1.action">参考文献分类</a>
        </div>

        <div class="menu_option">
            <img src="../../jpg/关系网络.png" />
            <a class="txt" href="/PaperManage2/manager/relationship/Relationship.jsp">论文关系网络</a>
        </div>

        <div class="menu_option">
            <img src="../../jpg/登出.png" />
            <a class="txt" href="/PaperManage2/index.jsp">登出</a>
        </div>
    </div>
    
     <div style="position:absolute; top:100px;right:100px;">
    <a href="/PaperManage2/manager/paperinfomanage/DeleteReference.action?reference.id=<s:property value="referenceInfo.id"/>">删除</a>
    </div>
    
    <div>
    <a href="/PaperManage2/manager/paperinfomanage/ModifyReference.jsp?id=<s:property value="referenceInfo.id"/>">修改</a>
    </div>
    
    
    </body>
    </html>