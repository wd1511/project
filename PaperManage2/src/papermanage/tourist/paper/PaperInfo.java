package papermanage.tourist.paper;

import papermanage.Paper;
import java.util.LinkedList;

public class PaperInfo {
  private Paper paperInfo;
  private String[] referenceName;
  private int[] referenceID;
  
  public void mysplit(){
    String s1=paperInfo.getReference();
    referenceName=s1.split(",");
    String s2=paperInfo.getReferenceID();
    String[] ss2=s2.split(",");
    for(int i=0;i<ss2.length;i++){
      String s=ss2[i];
      referenceID[i] = Integer.parseInt(s);
    }
  }
  
  
  
  public String execute() {
      this.mysplit();
        return "success";
  }
  public void setReferenceName(String[] referenceName) {
      this.referenceName=referenceName;
    }
  public String[] getReferenceName() {
      return this.referenceName;
    }
  public void setReferenceID(int[] referenceID) {
      this.referenceID=referenceID;
    }
  public int[] getReferenceID() {
      return this.referenceID;
    }
  public void setPaperInfo(Paper paperInfo) {
    this.paperInfo=paperInfo;
  }
  public Paper getPaperInfo() {
    return this.paperInfo;
  }
}

