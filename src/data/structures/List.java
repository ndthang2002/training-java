package data.structures;

public interface List<T> {

  int size();

  void clear();

  boolean add(T obj);
  boolean add(int index,T obj);

  void addAll(T[] obj);

  boolean remove(T obj);

  T removeAt(int pos);
  T remove();

  T get(int pos);

  void set(int pos, T obj);

  int findPos(T obj);
}