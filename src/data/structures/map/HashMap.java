package data.structures.map;

import org.junit.jupiter.api.Test;

public class HashMap<Key, Value> implements Map<Key, Value> {

  private Entry<Key, Value>[] arr;
  protected int  numberOfEntry;
  protected int  capacity;

  // constructor
  public HashMap() {
    this((int) Math.pow(2, 4));
  }

  public HashMap(int initialCapacity) {
    this.capacity = initialCapacity;
    arr = new Entry[this.capacity];
    this.numberOfEntry = 0;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
    arr = new Entry[this.capacity];
    numberOfEntry = 0;

  }

// kiem tra key ton tai ko
  @Override
  public boolean containsKey(Key key) {
    // TODO Auto-generated method stub
    int hash = tinhToanHash(key);
    if (arr[hash] == null) {
      return false;
    } else if (arr[hash] != null && arr[hash].getKey().equals(key)) {
      return true;
    }
    return false;
  }

  @Override
  public boolean containsValue(Value value) {
    // TODO Auto-generated method stub
    for (int i = 0; i < this.numberOfEntry; i++) {
      Entry<Key, Value> entry = arr[i];
      if (entry.getValue().equals(value)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Value get(Key key) {
    // TODO Auto-generated method stub
    int hash = tinhToanHash(key);
    if (arr[hash] == null) {
      return null;
    } else {
      return arr[hash].getValue();
    }

  }

  // kiem tra xem mang co phan tu khong

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return numberOfEntry == 0;
  }

  @Override
  public void put(Key key, Value value) {
    // TODO Auto-generated method stub
    if (containsKey(key)) {
      int hash = (key.hashCode()) & (this.capacity - 1);
      arr[hash] = new Entry<>(key, value);
      numberOfEntry++;
    } else {
      // phai su dung ham tinhtoanhash de kiem tra colision
      int hash = tinhToanHash(key);
      arr[hash] = new Entry<>(key, value);
      numberOfEntry++;
    }

  }

  @Override
  public Value remove(Key key) {
    Value result = get(key);
    if (result != null) {
      int hash = (key.hashCode()) & (this.capacity - 1);
      arr[hash] = null;
      numberOfEntry--;
      hash = (hash + 1) & (this.capacity - 1);

      while (arr[hash] != null) {
        Entry<Key, Value> entry = arr[hash];
        arr[hash] = null;
        put(entry.getKey(), entry.getValue());
        numberOfEntry--;
        hash = (hash + 1) & (this.capacity - 1);
      }

    }
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return numberOfEntry;
  }

  private int tinhToanHash(Key key) {
    // thu gon so nho lai
    int hash = (key.hashCode()) & (this.capacity - 1);
    // kiem tra colision
    while (arr[hash] != null && !arr[hash].getKey().equals(key)) {
      hash = (hash + 1) & (this.capacity - 1);

    }
    return hash;
  }

}