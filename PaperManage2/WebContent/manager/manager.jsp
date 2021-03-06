<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../1.css"/>
    <link rel="stylesheet" type="text/css" href="../login.css"/>
    <link rel="stylesheet" type="text/css" href="../menu.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script src="../jquery.js"></script>
    <script src="../1.js"></script>
</head>
<body>
    <img src="../jpg/主页.jpg" style="height: 100%;width: 100%; z-index: -1;"/>
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
        <img src="../jpg/菜单.png" style="position :absolute; right: 5px;" onclick="toggleMenu()"/>
    </div>

    <div class="slidebar" id="menu" >

        <div>
        <h3>Menu</h3>
        <img class="close" src="../jpg/关闭.png" onclick="toggleMenu()"/>
        </div>

        <div class="menu_option">
            <img src="../jpg/收藏夹.png" />
            <p class="txt">收藏夹</p>
        </div>

        <div class="menu_option">
            <img src="../jpg/用户管理.png" />
            <p class="txt">用户管理</p>
        </div>


        <div class="menu_option">
            <img src="../jpg/导出.png" />
            <p class="txt">导出excel</p>
        </div>

        <div class="menu_option">
            <img src="../jpg/修改密码.png" />
            <p class="txt">修改密码</p>
        </div>

        <div class="menu_option">
            <img src="../jpg/论文管理.png" />
            <a class="txt" href="/PaperManage2/manager/paperinfomanage/AddPaper.jsp">添加发表论文</a>
        </div>

        <div class="menu_option">
            <img src="../jpg/论文管理.png" />
            <a class="txt" href="/PaperManage2/manager/paperinfomanage/AddReference.jsp">添加参考文献</a>
        </div>

        <div class="menu_option">
            <img src="../jpg/分类.png" />
            <a class="txt" href="/PaperManage2/manager/paper/PaperSort1.action">发表论文分类</a>
        </div>

        <div class="menu_option">
            <img src="../jpg/分类.png" />
            <a class="txt" href="/PaperManage2/manager/reference/ReferenceSort1.action">参考文献分类</a>
        </div>

        <div class="menu_option">
            <img src="../jpg/关系网络.png" />
            <a class="txt" href="/PaperManage2/manager/relationship/Relationship.jsp">论文关系网络</a>
        </div>

        <div class="menu_option">
            <img src="../jpg/登出.png" />
            <a class="txt" href="/PaperManage2/index.jsp">登出</a>
        </div>
    </div>

   
    


</body>
</html>