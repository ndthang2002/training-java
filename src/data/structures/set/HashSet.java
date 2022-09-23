package data.structures.set;

import java.rmi.server.LoaderHandler;
import java.util.Collection;

import java.util.LinkedHashMap;

import data.structures.map.HashMap;

public class HashSet<E> implements Set<E>{
  HashSet<String > sett = new  HashSet<String>();

  
  private transient java.util.HashMap<E, Object> map;
  
  private static final Object PRESENT = new Object();
  
  public HashSet() {
    map  = new java.util.HashMap<>();
  };
  
  public HashSet( E[] obj){
    map = new java.util.HashMap<>(Math.max((int)(obj.length/.75f)+1, 16));
    allAll(obj);
  }
  public HashSet(int initialCapacity, float loadFactor) {
    map = new java.util.HashMap<>(initialCapacity, loadFactor);
  }
  public HashSet(int initialCapacity ) {
    map = new java.util.HashMap<>(initialCapacity);
  }
  public HashSet(int initialCapacity , float loadFactor, boolean dummy) {
    map = new LinkedHashMap<>(initialCapacity,loadFactor);
 
  }

  @Override
  public boolean add(E obj) {
    // TODO Auto-generated method stub
    map.put(obj, PRESENT);
    return true;
  }
  

  @Override
  public boolean allAll(E[] obj) {
    // TODO Auto-generated method stub
    for (E o : obj) {
      map.put(o, PRESENT);
    }
    return false;
  }

  @Override
  public void clear() {
    map.clear();
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return map.size()==0;
  }

  @Override
  public boolean remove(E obj) {
    // TODO Auto-generated method stub
    
    return map.remove(obj)==PRESENT;
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return map.size();
  }

  @Override
  public boolean contains(E obj) {
    // TODO Auto-generated method stub
    if(map.get(obj).equals(obj)) {
      return true;
    }
    return false;
  }

  
  @Override
  public boolean containsAll(E[] obj) {
    // TODO Auto-generated method 
    for (E o : obj) {
     if(map.get(obj).equals(o)) {
       return true;
     }
    }
    return false;
  }


  
}
