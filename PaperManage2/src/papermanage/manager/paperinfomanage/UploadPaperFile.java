package papermanage.manager.paperinfomanage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class UploadPaperFile {
  private File upload;
  private String uploadContentType;
  private String uploadFileName;
  
  public String execute() throws IOException {
    String path=ServletActionContext.getServletContext().getRealPath("/upload/Paper");
    File file =new File(path);
    if(!file.exists()) {
      file.mkdirs();
    }
    FileUtils.copyFile(upload, new File(file,uploadFileName));
    return "success";
  }
  public File getUpload() {
    return upload;
  }
  public void setUpload(File upload) {
    this.upload=upload;
  }
  
  public String getUploadContentType() {
    return uploadContentType;
  }
  public void setUploadContentType(String uploadContentType) {
    this.uploadContentType=uploadContentType;
  }
  
  public String getUploadFileName() {
    return uploadFileName;
  }
  public void setUploadFileName(String uploadFileName) {
    this.uploadFileName=uploadFileName;
  }
}
