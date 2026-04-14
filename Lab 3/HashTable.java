// ЗАДАНИЕ 1

import java.util.LinkedList;

public class HashTable<K, V> {
  // Внутренний класс для хранения пары ключ-значение
  private static class Entry<K, V> {
    private final K key;
    private V value;

    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }

    public void setValue(V value) {
      this.value = value;
    }
  }

  private static final int INITIAL_CAPACITY = 11;
  private final LinkedList<Entry<K, V>>[] table;
  private int size;

  // Конструктор
  public HashTable() {
    table = new LinkedList[INITIAL_CAPACITY];
    size = 0;
  }

  // Хэш-функция
  private int hash(K key) {
    if (key == null) {
      return 0;
    }
    // Получаем хеш и находим остаток от деления на длину, чтобы вернуть индекс в нашей таблице
    return Math.abs(key.hashCode()) % table.length;
  }

  // Добавление элемента
  public void put(K key, V value) {
    int index = hash(key);

    if (table[index] == null) {
      table[index] = new LinkedList<Entry<K, V>>();
    }

    for (Entry<K, V> entry : table[index]) {

      if (entry.getKey().equals(key)) {
        entry.setValue(value);
        return;
      }
    }

    table[index].add(new Entry<>(key, value));
    size++;
  }

  // Получение элемента
  public V get(K key) {
    int index = hash(key);

    if (table[index] != null) {
      for (Entry<K, V> entry : table[index]) {
        if (entry.getKey().equals(key)) {
          return entry.getValue();
        }
      }
    }

    return null;
  }

  // Удаление элемента
  public void remove(K key) {
    int index = hash(key);

    if (table[index] != null) {
      for (Entry<K, V> entry : table[index]) {
        if (entry.getKey().equals(key)) {
          table[index].remove(entry);
          size--;
          return;
        }
      }
    }
  }

  // Количество элементов
  public int size() {
    return this.size;
  }

  // Проверка на пустоту
  public boolean isEmpty() {
    return this.size == 0;
  }
}
