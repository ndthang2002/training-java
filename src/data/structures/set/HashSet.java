package data.structures.set;

import java.awt.RenderingHints.Key;
import java.rmi.server.LoaderHandler;
import java.util.Collection;

import java.util.LinkedHashMap;

import data.structures.map.HashMap;
import data.structures.map.Map;

public class HashSet<E> implements Set<E>{

  private java.util.HashMap<E, Object> map;
  private final Object PRESSENT = new Object();
  
  public HashSet() {
    map = new java.util.HashMap<>();
  }
  @Override
  public boolean add(E obj) {
    // TODO Auto-generated method stub
    map.put(obj, PRESSENT);
    return true;
  }

  @Override
  public boolean allAll(E[] obj) {
    // TODO Auto-generated method stub
    for (E o :obj) {
      map.put(o, PRESSENT);
    }
    return true;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
    map = new java.util.HashMap<>();
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return  map.size()==0;
  }

  @Override
  public boolean remove(E obj) {
    // TODO Auto-generated method stub
    
    map.remove(obj);
    return true;
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return map.size();
  }

  @Override
  public boolean contains(E obj) {
    // TODO Auto-generated method stub
   
    return  map.containsKey(obj);
  }

  @Override
  public boolean containsAll(E[] obj) {
    // TODO Auto-generated method stub
    for(E o :obj) {
      map.containsKey(o);
    }
    return false;
  }
 
}