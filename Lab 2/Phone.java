public class Phone extends Gadget {
  private int batteryCapacity;
  private String os;

  public Phone(String brand, double price, int batteryCapacity, String os) {
    super(brand, price);
    this.batteryCapacity = batteryCapacity;
    this.os = os;
  }

  public Phone() {
    super();
  }

  @Override
  public void use() {
    System.out.println("Используется телефон");
  }

  public int getBatteryCapacity() {
    return batteryCapacity;
  }

  public String getOs() {
    return os;
  }
}
