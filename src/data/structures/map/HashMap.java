package data.structures.map;

import org.junit.jupiter.api.Test;

public class HashMap<Key,Value>  implements Map<Key, Value>{

   private Entry<Key, Value>[] arr;
   protected int numberOfEntry;
   protected int capacity;
   
   //constructor
   public HashMap() {
     this((int)Math.pow(2, 4));
   }
   
   public HashMap(int initialCapacity) {
        this.capacity= initialCapacity;
        arr = new Entry[this.capacity];
        this.numberOfEntry=0;
  }
  
  @Override
  public void clear() {
    // TODO Auto-generated method stub
    arr= new Entry[this.capacity];
    numberOfEntry=0;
  }

  // kiem tra key 
 
  @Override
  public boolean containsKey(Key key) {
    // TODO Auto-generated method stub
    int hash= calculateHash(key);
    return arr[hash] != null && arr[hash].getKey().equals(key);
    
  }

  @Override
  public boolean containsValue(Value value) {
    for(int i=0 ;i< this.capacity;i++) {
      Entry<Key, Value> entry = arr[i];
      if (entry != null && entry.getValue().equals(value)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Value get(Key key) {
    // TODO Auto-generated method stub
    int hash = calculateHash(key);
    if(arr[hash] == null) {
      return null;
    }else {
      return arr[hash].getValue();
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return numberOfEntry==0;
  }

  @Override
  public void put(Key key, Value value) {
    if(containsKey(key)) {
      // tim vi tri
      int hash = (key.hashCode()% this.capacity);
      arr[hash] = new Entry<>(key, value);
    }
    else {
      int hash = calculateHash(key);
      arr[hash] = new Entry<>(key, value);
      numberOfEntry++;
    }
    
  }

  @Override
  public Value remove(Key key) {
    // TODO Auto-generated method stub
    Value result = get(key);
    if(result != null) {
      int index = calculateHash(key);
      arr[index] = null;
      numberOfEntry--;
      index =(index+1) % this.capacity;
      while(arr[index] != null) {
        Entry<Key, Value> entry =arr[index];
        arr[index] = null;
        put(entry.getKey(), entry.getValue());
        numberOfEntry--;
        index =(index +1)% this.capacity;
      }
    }
    return result;
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return numberOfEntry;
  }
  
  // tinh toan hashvalue cua key
  private int calculateHash(Key key ) {
   int hash = (key.hashCode()) & (this.capacity - 1);
   while(arr[hash]!= null && !arr[hash].getKey().equals(key)) {
     hash = (hash+1) % this.capacity;
   }
   
   
  return hash;
}
}
