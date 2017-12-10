<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
           <%@ taglib prefix="s" uri="/struts-tags" %>
           <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#authorNameDiv p
{ 
    display: inline-block;
    margin-left: 5px;
}

#addReference
{
    display: none;
    position:absolute;
    top:100px;
    left:500px;
}

#referenceNameDiv p
{
    display:inline-block;
}
li
{
    width:50px;
}
.sort:hover 
{
    cursor:pointer;
}
</style>

<script type="text/javascript">
        function addAuthorName(){
            var para=document.createElement("p");
            var text=document.getElementById("authorName").value;
            document.getElementById("author").value=document.getElementById("author").value+","+text;
            var node=document.createTextNode(text);
            para.appendChild(node);
            var element=document.getElementById("authorNameDiv");
            element.appendChild(para);
            document.getElementById("authorName").value="";
            
        }
        function showReferenceForm(){
        	   document.getElementById("addReference").style.display="block";
        	   
        }
        function closeReferenceForm(){
        	   document.getElementById("addReference").style.display="none";
        }
        
        function addReference(){
             var para=document.createElement("p");
             var text=document.getElementById("referenceName").value;

             document.getElementById("reference").value= document.getElementById("reference").value+","+document.getElementById("referenceName").value;
            
             document.getElementById("n_referenceID").value=document.getElementById("n_referenceID").value+","+document.getElementById("referenceID").value;
             var temp2=document.getElementById("n_referenceID").value;
             var node=document.createTextNode(text);
             para.appendChild(node);
             var element=document.getElementById("referenceNameDiv");
             element.appendChild(para);
             document.getElementById("addReference").style.display="none";
             var temp=document.getElementById("reference").value;
        }
        function getSort2(){
        	   var sort1=document.getElementById("sort1").value;
        	   var select2=document.getElementById(sort1);
        	   select2.name="newPaper.sort2";
        	   select2.style.display="inline-block";
        }
        function test( sort1, sort2,sort3){
        	   document.getElementById("sort1").value=sort1;
        	   document.getElementById("sort2").value=sort2;
        	   document.getElementById("sort3").value=sort3;
           document.getElementById("flag").value=0;
        	   document.getElementById("sortDiv").style.display="none";
        	   
        	   var para=document.createElement("p");
           var text=sort1+","+sort2+","+sort3;
           var node=document.createTextNode(text);
           para.appendChild(node);
           var element=document.getElementById("sortShow");
           element.innerHTML="";
           element.appendChild(para);
           
        }
        function showSortDiv()
        {
        	 document.getElementById("sortDiv").style.display="block";
        }
        function otherSort()
        {
            var sort1=document.getElementById("otherSort1").value;
            var sort2=document.getElementById("otherSort2").value;
            var sort3=document.getElementById("otherSort3").value;
            document.getElementById("sort1").value=document.getElementById("otherSort1").value;
            document.getElementById("sort2").value=document.getElementById("otherSort2").value;
            document.getElementById("sort3").value=document.getElementById("otherSort3").value;  
            document.getElementById("flag").value=1;
            document.getElementById("sortDiv").style.display="none";
            
            var para=document.createElement("p");
            var text=sort1+","+sort2+","+sort3;
            var node=document.createTextNode(text);
            para.appendChild(node);
            var element=document.getElementById("sortShow");
            element.innerHTML="";
            element.appendChild(para);
        }
</script>

</head>
<body>
    <form action="AddPaper.action">
    <label>论文名称</label> <input type="text" name="newPaper.paperName"><br/>
    <label>作者</label> <input type="hidden" id="author" name="newPaper.author" value="<s:property value="#parameters.authorname"/>">
    <input type="text" id="authorName">
    <input type="button" value="添加" onclick="addAuthorName()"><br/>
    <div id="authorNameDiv">
    </div>
    <label>关键词</label><input type="text" name="newPaper.keywords"><br/>
    <label>论文ID</label><input type="text" name="newPaper.id"><br/>
    <input type="hidden" name="newPaper.sort1" id="sort1"/>
    <input type="hidden" name="newPaper.sort2" id="sort2"/>  
    <input type="hidden" name="newPaper.sort3" id="sort3"/>  
    <input type="hidden" name="flag" id="flag"/>
    <label>分类</label><input type="button" value="分类" onclick="showSortDiv()"/>
    <div id="sortShow">
    </div>
    <div id="sortDiv" style="display:none;">
	    <ul>
	        <s:iterator value="list1" id="id1">
	            <li><s:property value="#id1.get(0)"/></li>
	                <s:iterator value="#id1" id="id2">
	                    <s:if test="#id1.get(1)==#id2">
	                        <ul>    
	                            <li><s:property value="#id2"/></li>
	                        <ul>
	                    </s:if>
	                    <s:if test="#id1.get(0)!=#id2&&#id1.get(1)!=#id2">
	                        <li class="sort"
	                        onclick='test("<s:property value="#id1.get(0)"/>","<s:property value="#id1.get(1)"/>","<s:property value="#id2"/>")'><s:property value="#id2"/></li>
	                       
	                    </s:if>
	                </s:iterator>
	                </ul>
	                </ul>
	        </s:iterator>    
	        <li>其他</li> <input type="text" id="otherSort1"/><input type="text" id="otherSort2"/><input type="text" id="otherSort3"/> 
	        <input type="button" value="确定" onclick="otherSort()"/>
	    </ul>
	</div>
    <label>出版源</label> <input type="text" name="newPaper.publication"><br/>
    <label>工作量分数</label> <input type="text" name="newPaper.workload"><br/>
    <label>日期</label><input type="text" name="newPaper.date"><br/>
    <input type="hidden" name="newPaper.authorID" value="<s:property value="#parameters.id"/>"/>
    <input type="hidden" name="newPaper.reference" id="reference"/>
    <input type="hidden" name="newPaper.referenceID" id="n_referenceID"/>
    <input type="button" value="添加参考文献" onclick="showReferenceForm()"/>
    <input type="submit" value="添加"/>
    <div id="referenceNameDiv">
    </div>
    </form>
        
    <a href="/PaperManage2/user/user.jsp">返回首页</a>

    
    <form  action="AddReference" id="addReference" target="nm_iframe"> 
    <label>论文名称</label> <input type="text" name="newReference.referenceName" id="referenceName"><br/>
    <label>论文id</label> <input type="text" name="newReference.id" id="referenceID"><br/>
    <label>作者</label> <input type="text" name="newReference.author"><br/>
    <label>关键词</label><input type="text" name="newReference.keywords"><br/>
    <label>一级分类</label> <input type="text" name="newReference.sort1"><br/>
    <label>二级分类</label> <input type="text" name="newReference.sort2"><br/>
    <label>三级分类</label><input type="text" name="newReference.sort3"><br/>
    <label>出版源</label> <input type="text" name="newReference.publication"><br/>
    <label>日期</label><input type="text" name="newReference.date"><br/>
    <input type="submit" value="添加" onclick="addReference()"/>
     <input type="button" value="关闭" onclick="closeReferenceForm()"/><br/>
    <label>上传参考文献</label>
    <s:form action="UploadPaperFile.action"  enctype="multipart/form-data">
    <s:file name="upload"/>
    <s:submit value="上传"/>
    </s:form>
    </form>
    <iframe id="id_iframe" name="nm_iframe" style="display:none;"></iframe>
</body>
</html>