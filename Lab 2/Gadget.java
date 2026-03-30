public abstract class Gadget {
  // Счётчик созданных экземпляров (включая наследников)
  private static int count = 0;
  
  // Финальное поле — задаётся один раз в конструкторе
  private final String brand;
  
  private double price;

  // Основной конструктор: инициализирует бренд и цену
  public Gadget(String brand, double price) {
    this.brand = brand;
    this.price = price;
    count++;  // увеличиваем общий счётчик гаджетов
  }

  // Конструктор по умолчанию: делегирует основному с "Unknown" и ценой 0
  public Gadget() {
    this("Unknown", 0);
  }

  // Статический метод — возвращает количество созданных гаджетов
  public static int getCount() {
    return count;
  }

  // Геттер для цены
  public double getPrice() {
    return price;
  }

  // Сеттер для цены (цена может меняться после создания)
  public void setPrice(double price) {
    this.price = price;
  }

  // Абстрактный метод — требует реализации в каждом конкретном наследнике
  public abstract void use();

  // Общий метод вывода информации о гаджете
  public void displayInfo() {
    System.out.println("Бренд: " + brand + ", Цена: " + price);
  }
}