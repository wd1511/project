<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../1.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script src="../jquery.js"></script>
    <script src="../1.js"></script>
</head>
<body>
    <img src="../jpg/主页.jpg" style="height: 100%;width: 100%; z-index: -1;"/>
    
    <h1><s:property value="#session.user.username"/></h1>
   <div id="homepage_search">
        <form action="/PaperManage2/user/search/Search.action">
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
       
       <form action="/PaperManage2/user/search/Search.action">
        <input type="submit" value="查询我的发表论文"/>
        <input type="hidden" name="searchSource" value="paper"/>
        <input type="hidden" name="searchWay" value="byAuthorID"/>
        <input type="hidden" name="searchContent" value="<s:property value="user.id"/>"/>
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
            <img src="../jpg/导出.png" />
            <p class="txt">导出excel</p>
        </div>

        <div class="menu_option">
            <img src="../jpg/修改密码.png" />
            <p class="txt">修改密码</p>
        </div>

        <div class="menu_option">
            <img src="../jpg/分类.png" />
            <a class="txt" href="/PaperManage2/user/paper/PaperSort1.action">发表论文分类</a>
        </div>

        <div class="menu_option">
            <img src="../jpg/分类.png" />
            <a class="txt" href="/PaperManage2/user/reference/ReferenceSort1.action">参考文献分类</a>
        </div>
        
        <div class="menu_option">
            <img src="../jpg/论文管理.png" />
            <a class="txt" href="/PaperManage2/user/paperinfomanage/Test.action?authorname=<s:property value="#session.user.authorName"/>&id=<s:property value="#session.user.id"/>">添加发表论文</a>
        </div>

        <div class="menu_option">
            <img src="../jpg/关系网络.png" />
            <a class="txt" href="/PaperManage2/user/relationship/Relationship.jsp">论文关系网络</a>
        </div>

        <div class="menu_option">
            <img src="../jpg/登出.png" />
            <a class="txt" href="/PaperManage2/index.jsp">登出</a>
        </div>
    </div>

    

</body>
</html>