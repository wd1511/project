package papermanage;

public class ReferenceExport {
  private Reference reference;
  public void execute() {
    new seproject().exportReference(reference);; 
  }
  public Reference getReference() {
    return this.reference;
  }
  public void setReference(Reference reference) {
    this.reference=reference;
  }
}
