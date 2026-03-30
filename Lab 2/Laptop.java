public class Laptop extends Gadget {
  private int ram;

  public Laptop(String brand, double price, int ram) {
    super(brand, price);
    this.ram = ram;
  }

  public Laptop() {
    super();
  }

  @Override
  public void use() {
    System.out.println("Используется ноутбук");
  }

  public void use(String app) {
    System.out.println("Используется программа: " + app);
  }
}
