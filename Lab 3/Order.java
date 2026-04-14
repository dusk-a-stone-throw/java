import java.time.LocalDateTime;
import java.util.Arrays;

class Order {
  private final String[] dishes;
  private final double cost;
  private final LocalDateTime time;

  public Order(String[] dishes, double cost, LocalDateTime time) {
    this.dishes = dishes;
    this.cost = cost;
    this.time = time;
  }

  public String[] getDishes() {
    return dishes;
  }

  public double getCost() {
    return cost;
  }

  public LocalDateTime getTime() {
    return time;
  }

  @Override
  public String toString() {
    return "Блюда: " + Arrays.toString(dishes) + ", Стоимость: " + cost + ", Время: " + time;
  }
}
