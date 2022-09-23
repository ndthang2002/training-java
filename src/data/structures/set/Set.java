package data.structures.set;

import java.util.Collection;


public interface Set<E>  {

  boolean add(E obj);
  boolean allAll(E[] obj);
  void clear();
  boolean isEmpty();
  
  boolean remove(E obj);
  int size();
  boolean contains(E obj);
  boolean containsAll(E[] obj);
  
}
