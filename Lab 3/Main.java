import java.time.LocalDateTime;

public class Main {
  static void main(String[] args) {
    // ЗАДАНИЕ 1
    System.out.println("Задание 1");
    HashTable<String, Integer> hashTable = new HashTable<>();
    hashTable.put("apple", 5);
    hashTable.put("banana", 3);
    hashTable.put("watermelon", 7);
    hashTable.put("mango", 2);
    System.out.println("banana: " + hashTable.get("banana")); // 3
    System.out.println("apple: " + hashTable.get("apple")); // 5

    hashTable.remove("banana");

    System.out.println("banana после удаления: " + hashTable.get("banana")); // NULL

    System.out.println("Размер: " + hashTable.size()); // 3
    System.out.println("Пустая ли таблица: " + hashTable.isEmpty()); // FALSE

    // ЗАДАНИЕ 2
    System.out.println("=================================");
    System.out.println("Задание 2");
    RestaurantOrders ordersManager = new RestaurantOrders();

    // добавление заказов
    ordersManager.addOrder(1, new Order(new String[] {"Пицца", "Кола"}, 900, LocalDateTime.now()));

    ordersManager.addOrder(
        2, new Order(new String[] {"Суши", "Чай", "Десерт"}, 1500, LocalDateTime.now()));

    // поиск
    System.out.println("\nПоиск заказа столика 1:");
    System.out.println(ordersManager.getOrder(1));

    // удаление
    System.out.println("\nУдаление заказа столика 2:");
    ordersManager.removeOrder(2);

    // все заказы
    System.out.println("\nВсе заказы:");
    ordersManager.printAllOrders();
  }
}
