public class Watch extends Gadget {
  private boolean isSmart;

  public Watch(String brand, double price, boolean isSmart) {
    super(brand, price);
    this.isSmart = isSmart;
  }

  public Watch() {
    super();
  }

  @Override
  public void use() {
    System.out.println("Используются часы");
  }
}
