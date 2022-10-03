package data.structures.map;

import java.security.Key;

public class HashTable<Key ,Value> implements Map<Key, Value>{

   protected Entry<Key, Value> arr[];
   protected int capatial;
   protected int numberofEntry;
   
   // constructor
   public HashTable() {
     this.capatial=11;
   }
   
   public HashTable(int initialcapital) {
     this.capatial= initialcapital;
     arr = new Entry[this.capatial];
     this.numberofEntry=0;
   }
   
  @Override
  public void clear() {
    // TODO Auto-generated method stub
    
    arr= new Entry[this.capatial];
   numberofEntry=0;
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
    for (int i=0 ; i< this.numberofEntry;i++) {
      Entry<Key, Value> entry = arr[i];
      if(entry.getValue().equals(value)) {
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
    return numberofEntry==0;
  }

  @Override
  public void put(Key key, Value value) {
    // TODO Auto-generated method stub
    if(containsKey(key)) {
      int hash = (key.hashCode())& (this.capatial-1);
      arr[hash]= new Entry<>(key,value);
      numberofEntry++;
    }
    else {
      int hash = tinhToanHash(key);
      arr[hash] = new Entry<>(key,value);
      numberofEntry++;
    }
  }

  @Override
  public Value remove(Key key) {
    return null;
    
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }
  
  private int tinhToanHash(Key key) {
    int hash = (key.hashCode())& (this.capatial-1);
    while( arr[hash]!=null && !arr[hash].getKey().equals(key)) {
      hash= (hash+1)& (this.capatial-1);
    }
    return hash;
  }

}

