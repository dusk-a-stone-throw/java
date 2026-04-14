import java.util.HashMap;

class RestaurantOrders {
  private HashMap<Integer, Order> orders = new HashMap<>();

  // вставка
  public void addOrder(int tableNumber, Order order) {
    orders.put(tableNumber, order);
    System.out.println("Заказ добавлен для столика " + tableNumber);
  }

  // поиск
  public Order getOrder(int tableNumber) {
    return orders.get(tableNumber);
  }

  // удаление
  public void removeOrder(int tableNumber) {
    if (orders.containsKey(tableNumber)) {
      orders.remove(tableNumber);
      System.out.println("Заказ удалён для столика " + tableNumber);
    } else {
      System.out.println("Заказ не найден");
    }
  }

  // вывод всех заказов
  public void printAllOrders() {
    // ключ это номер столика
    for (Integer key : orders.keySet()) {
      System.out.println("Столик " + key + " -> " + orders.get(key));
    }
  }
}
