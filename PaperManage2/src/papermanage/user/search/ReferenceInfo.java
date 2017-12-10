package papermanage.user.search;

import papermanage.Reference;

public class ReferenceInfo {
  private Reference referenceInfo;
  public String execute() {
    return "success";
  }
  public void setReferenceInfo(Reference referenceInfo) {
    this.referenceInfo=referenceInfo;
  }
  public Reference getReferenceInfo() {
    return this.referenceInfo;
  }
}
