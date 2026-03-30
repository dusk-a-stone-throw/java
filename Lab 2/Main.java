import java.util.Scanner;

public class Main {
   static void main(String[] args) {

    // Создаём объекты разных типов гаджетов
    Smartphone iphone = new Smartphone("Apple", 1200, 3000, "iOS", 48);
    Watch casio = new Watch("Casio", 100, false);  // false = не электронные часы? (зависит от реализации)
    Laptop hp = new Laptop("HP", 900, 16);        // 16 ГБ оперативной памяти
    
    // Вызов перегруженных методов use()
    iphone.use();                // базовый вариант использования смартфона
    iphone.use("FaceTime");      // перегруженный метод — использование конкретного приложения
    
    casio.use();                 // использование часов
    
    hp.use();                    // базовое использование ноутбука
    hp.use("FL Studio");         // использование ноутбука для конкретной программы
    
    // Статический метод — показывает общее количество созданных гаджетов
    System.out.println("Количество объектов: " + Gadget.getCount());
    
    Scanner scanner = new Scanner(System.in);
    
    // Вывод информации о смартфоне
    iphone.displayInfo();
    
    // Запрос новой цены у пользователя
    System.out.print(
        "Вы привезли айфон из Дубая за "
            + iphone.getPrice()
            + ". Введите новую цену для Айфона в России: ");
    
    double newPrice = scanner.nextDouble();
    scanner.close();  // закрываем сканер, чтобы избежать утечки ресурсов
    
    // Меняем цену через сеттер
    iphone.setPrice(newPrice);
    
    // Показываем обновлённую информацию
    iphone.displayInfo();
  }
}