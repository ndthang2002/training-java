package data.structures.map;

public interface  Map<Key , Value> {

  void clear();
  
  boolean containsKey(Key key);
  
  boolean containsValue(Value value);
  
  Value get(Key key);
  
  boolean isEmpty();
  
   void put(Key key ,Value value) ;
  
  Value remove(Key key);
  
  int size();
  class Entry<Key, Value> {
    Key key ;
    Value value;
    
    public Entry(Key key, Value value) {
      this.key = key ;
      this.value = value;
    }
    public Key getKey() { return this.key;}
    public Value getValue() {return this.value ;}
    public void setValue (Key key) { this.value = value;}
    public void setKey (Key key) {this.key = key;}
    
  }
}
