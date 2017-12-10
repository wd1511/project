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
<body>
    <div class="area">  
        <div class="region">
             

            <ol class="rounded-list">
            <s:iterator value="paper" id="id">
            <li><s:a href="./PaperInfo.action?paperInfo.paperName=%{#id.paperName}&paperInfo.id=%{#id.id}&paperInfo.author=%{#id.author}&paperInfo.keywords=%{#id.keywords}&paperInfo.sort1=%{#id.sort1}&paperInfo.sort2=%{#id.sort2}&paperInfo.sort3=%{#id.sort3}&paperInfo.publication=%{#id.publication}&paperInfo.workload=%{#id.workload}&paperInfo.date=%{#id.date}&paperInfo.reference=%{#id.reference}">
            <s:property value="#id.paperName"/></s:a></li>
            </s:iterator>
            </ol>
        </div>
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
</body>
</html>