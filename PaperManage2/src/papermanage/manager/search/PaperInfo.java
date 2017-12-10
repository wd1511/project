package papermanage.manager.search;

import papermanage.Paper;

public class PaperInfo {
  private Paper paperInfo;
  public String execute() {
    return "success";
  }
  public void setPaperInfo(Paper paperInfo) {
    this.paperInfo=paperInfo;
  }
  public Paper getPaperInfo() {
    return this.paperInfo;
  }
}
