package papermanage;

import java.io.InputStream;
import java.util.LinkedList;

import org.apache.struts2.ServletActionContext;


public class GraphDownload {
    InputStream downloadFile;  
    private String author;
    private Search search=new Search();
    public String execute() {
      LinkedList<Paper> paper=search.searchByPaperAuthor(author);    
      LinkedList<String> conAuthor=new LinkedList();
      LinkedList<String> conPaper=new LinkedList();
      StringBuilder format = new StringBuilder();
      for(Paper p:paper){
        String au[]=p.getAuthor().split(";");
        for(String a:au){
          if(!a.equals(author)){
            if(!conAuthor.contains(a)){
                conAuthor.add(a);
                conPaper.add(p.getPaperName());
              }
              else{
                int i=conAuthor.indexOf(a);
                String str=conPaper.get(i);
                str=str+","+p.getPaperName();
                conPaper.add(i,str);
              }
          }
        }
      }
      for(String a:conAuthor){
        int i=conAuthor.indexOf(a);
        String str=conPaper.get(i);
        format.append(author + "->" + a + "[label=" + str + "];");
      }
      GraphViz.createDotGraph(format.toString(), "DotGraph");
        return "success";
   }
   
    public void setAuthor(String author){
      this.author=author;
    }
    
    public String getAuthor(){
      return this.author;
    }
    public InputStream getDownloadFile() {
      return ServletActionContext.getServletContext().getResourceAsStream("graph/DotGraph.jpg");
    }
  
}
