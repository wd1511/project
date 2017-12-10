<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
           <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    
    
    
    <form action="AddPaper.action">
    <label>论文名称</label> <input type="text" name="newPaper.paperName"><br/>
    <label>作者</label> <input type="text" name="newPaper.author"><br/>
    <label>关键词</label><input type="text" name="newPaper.keywords"><br/>
    <label>论文ID</label><input type="text" name="newPaper.id"><br/>
    <label>一级分类</label> <input type="text" name="newPaper.sort1"><br/>
    <label>二级分类</label> <input type="text" name="newPaper.sort2"><br/>
    <label>三级分类</label><input type="text" name="newPaper.sort3"><br/>
    <label>出版源</label> <input type="text" name="newPaper.publication"><br/>
    <label>工作量分数</label> <input type="text" name="newPaper.workload"><br/>
    <label>日期</label><input type="text" name="newPaper.date"><br/>
    <label>参考文献</label><input type="text" name="newPaper.reference"><br/>
    
    <input type="submit" value="添加"/>
    </form>
    <s:form action="UploadPaperFile.action"  enctype="multipart/form-data">
    <s:file name="upload"/>
    <s:submit/>
    </s:form>
</body>
</html>