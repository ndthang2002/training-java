package data.structures.map;

public class HashMap<Key ,Value> implements Map<Key, Value> {

  // nó có một mảng một số lượgn phần tử và một kích thước của hashmap
  private Entry<Key,Value>[] arr ;
  private int numberOfEntry;
  private int capacity;
  
  //constuctor măc dinh 
  public HashMap() {
    this((int)Math.pow(2, 4));
  }
  public HashMap(int initialCapacity) {
    this.capacity= initialCapacity;
    arr= new Entry[this.capacity];
    numberOfEntry=0;
    
  }
  @Override
  public void clear() {
    // TODO Auto-generated method stub
    arr= new Entry[this.capacity];
    numberOfEntry=0;
  }

  @Override
  public boolean containsKey(Key key) {
    // TODO Auto-generated method stub
    int hash = tinhToanHash(key);
    
    return arr[hash]!=null && arr[hash].getKey().equals(key);
  }

  @Override
  public boolean containsValue(Value value) {
    // TODO Auto-generated method stub
    for ( int i=0 ; i<this.capacity;i++) {
      Entry<Key, Value>entry = arr[i];
      if(entry!=null && entry.getValue().equals(value)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Value get(Key key) {
    // TODO Auto-generated method stub
    int hash = tinhToanHash(key);
   if(arr[hash]==null) {
     return null;
   }
    return arr[hash].getValue();
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return numberOfEntry==0;
  }

  @Override
  public void put(Key key, Value value) {
    // TODO Auto-generated method stub
    if(containsKey(key)) {
      int hash = (key.hashCode())& (this.capacity-1);
      arr[hash] = new  Entry<>(key, value);      numberOfEntry++;
    }else {
      int hash = tinhToanHash(key);
      arr[hash] = new Entry<>(key, value);
      numberOfEntry++;
    }
  }

  @Override
  public Value remove(Key key) {
    // TODO Auto-generated method stub
    Value result = get(key);
    if(result !=null) {
      int hash = tinhToanHash(key);
      arr[hash]=null;
      numberOfEntry--;
      hash = (hash+1) & (this.capacity-1);
      while(arr[hash]!=null) {
        Entry<Key, Value> entry = arr[hash];
        arr[hash]=null;
        put(entry.getKey(), entry.getValue());
        numberOfEntry--;
        hash = (hash+1) & (this.capacity-1);
      }
    }
    return result;
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return numberOfEntry;
  }

  // phuong thuc tinh toan hash 
  private int tinhToanHash(Key key) {
    int hash = (key.hashCode())& (this.capacity-1);
    while(arr[hash]!=null && !arr[hash].getKey().equals(key)) {
      hash = (hash+1) & (this.capacity-1);
    }
    return hash;
  }
 
}
