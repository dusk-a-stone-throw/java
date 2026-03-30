public class Smartphone extends Phone {
  private int cameraMP;

  public Smartphone(String brand, double price, int batteryCapacity, String os, int cameraMP) {
    super(brand, price, batteryCapacity, os);
    this.cameraMP = cameraMP;
  }

  public Smartphone() {
    super();
  }

  @Override
  public void use() {
    System.out.println("Используется смартфон");
  }

  public void use(String app) {
    System.out.println("Открыто приложение: " + app);
  }
}
