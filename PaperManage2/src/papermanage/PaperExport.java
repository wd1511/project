package papermanage;

public class PaperExport {
  private Paper paper;
  public void execute() {
    new seproject().exportPaper(paper);; 
  }
  public Paper getPaper() {
    return this.paper;
  }
  public void setPaper(Paper paper) {
    this.paper=paper;
  }
}
