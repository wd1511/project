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
    
    
    <form action="AddReference">
    <label>论文名称</label> <input type="text" name="newReference.referenceName"><br/>
    <label>论文id</label> <input type="text" name="newReference.id"><br/>
    <label>作者</label> <input type="text" name="newReference.author"><br/>
    <label>关键词</label><input type="text" name="newReference.keywords"><br/>
    <label>一级分类</label> <input type="text" name="newReference.sort1"><br/>
    <label>二级分类</label> <input type="text" name="newReference.sort2"><br/>
    <label>三级分类</label><input type="text" name="newReference.sort3"><br/>
    <label>出版源</label> <input type="text" name="newReference.publication"><br/>
    <label>日期</label><input type="text" name="newReference.date"><br/>
    
    <input type="submit" value="添加"/>
    </form>
    <s:form action="UploadReferenceFile.action"  enctype="multipart/form-data">
    <s:file name="upload"/>
    <s:submit/>

</s:form>
</body>
</html>