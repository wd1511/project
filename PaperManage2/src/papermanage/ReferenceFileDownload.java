package papermanage;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

public class ReferenceFileDownload {
  String referenceName;
  InputStream downloadFile;
  public InputStream getDownloadFile() {
    return ServletActionContext.getServletContext().getResourceAsStream("upload/Reference/"+referenceName+".txt");
  }
  public String execute() {
    return "success";
  }
  public void setReferenceName(String referenceName) {
    this.referenceName=referenceName;
  }
  public String getReferenceName() {
    return this.referenceName;
  }
}
