package papermanage;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

public class PaperFileDownload {
  String paperName;
  InputStream downloadFile;
  public InputStream getDownloadFile() {
    return ServletActionContext.getServletContext().getResourceAsStream("upload/Paper/"+paperName+".txt");
  }
  public String execute() {
    return "success";
  }
  public void setPaperName(String paperName) {
    this.paperName=paperName;
  }
  public String getPaperName() {
    return this.paperName;
  }
}
