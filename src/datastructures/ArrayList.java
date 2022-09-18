package datastructures;

import java.io.IOException;

public class ArrayList<T> implements List<T> {
  private T[] array;
	private int index;

	//constructor
	public ArrayList(){
	  this(10);
	}
	public ArrayList(int capacity) {
	  if(capacity<0) {
	    throw new IllegalArgumentException("kich thuoc khong duoc am"+capacity);
	  }
	  array = (T[]) new Object[capacity];
	  index=0;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return index;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
	  array[index]=null;
	}

	@Override
	public boolean add(T obj) {
		// TODO Auto-generated method stub
		array[index++] = obj;
		return true;
	}

	@Override
	public void addAll(T[] obj) {
	  for(T o :obj) {
	    add(o);
	  }
		// TODO Auto-generated method stub

	}

	@Override
	public boolean remove(T obj) {
		// TODO Auto-generated method stub
	  int pos = findPos(obj);
	  removeAt(pos);
		return true;
	}

	@Override
	public T removeAt(int pos) {
		// TODO Auto-generated method stub
	  if(pos >= index || pos <0) {
	    throw new IndexOutOfBoundsException();
	  }
	  T Val = array[pos];
	  while(pos<index) {
	    array[pos] = array[pos + 1];
	    pos++;
	  }
	  index--;
		return Val;
	}

	@Override
	public T get(int pos) {
		// TODO Auto-generated method stub
		return array[pos];
	}

	@Override
	public void set(int pos, T obj) {
	  array[pos]=obj;
		// TODO Auto-generated method stub

	}

	@Override
	public int findPos(T obj) {
	  for(int pos=0;pos<index;pos++) {
	    if(array[pos].equals(obj)) {
	      return pos;
	    }
	  }
		// TODO Auto-generated method stub
		return -1;
	}

}