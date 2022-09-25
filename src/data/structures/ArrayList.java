package data.structures;

public class ArrayList<T> implements List<T> {

  protected T[] arr;
  protected int index;
  
  // constructor trong
  public ArrayList() {
    this(10);
  }
  // constructor co kisch thuoc duoc chi dinh 
  public ArrayList(int initial) {
    if(initial<0) {
      throw new IllegalArgumentException(" dung tich khong duoc âm");
    }
    arr= (T[]) new Object[initial];
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
    for (int i=0; i< index ; i++) {
      arr[i]=null;
    }
    index =0;
    
  }

  @Override
  public boolean add(T obj) {
    // TODO Auto-generated method stub
    
    arr[index++]=obj;
   
    return true;
  }

  @Override
  public boolean add(int pos, T obj) {
    // TODO Auto-generated method stub
    if(pos<0 || pos>index) {
      throw new IllegalArgumentException("vi tri nay khong ton tai");
    }   
    T[]newArr =(T[]) new Object[arr.length +1];
    for( int i=0; i<arr.length;i++) {
      if(i<pos) {
        T ele = arr[i];
        newArr[i]= ele;
      }else if(i==pos) {
        newArr[i]=obj;
      }else {
        T ele = arr[i-1];
        newArr[i]=ele;
      }
    }
    arr= newArr;
    index++;
    return true;
  }

  @Override
  public void addAll(T[] obj) {
    // TODO Auto-generated method stub
    for(T o :obj) {
      add(o);
    }
  }

  @Override
  public boolean remove(T obj) {
    // TODO Auto-generated method stub
    int id = findPos(obj);
    removeAt(id);
    return true;
  }

  @Override
  public T removeAt(int pos) {
    // TODO Auto-generated method stub
    if(pos<0|| pos>index) {
      throw new IllegalArgumentException("chỉ số không hợp lệ");
    }
    else {
     T val = arr[pos];
      
      while(pos<index) {
        arr[pos] = arr[pos+1];
        pos++;
      }
      index--;
      return val;
    }
    
  }



  @Override
  public T get(int pos) {
    // TODO Auto-generated method stub
    if(pos<0 || pos>arr.length) {
      throw new IllegalArgumentException("vi tri sai");
    }
    
    return arr[pos];
  }

  @Override
  public void set(int pos, T obj) {
    // TODO Auto-generated method stub
    if(pos<0 || pos>arr.length) {
      throw new IllegalArgumentException(" vi tri khong ton tai trong mang");
    }
    else {
      arr[pos] = obj;
    }
  }

  @Override
  public int findPos(T obj) {
    // TODO Auto-generated method stub
    for (int i=0; i< index ; i++) {
      if(arr[i].equals(obj)) {
        return i;
      }
    }
    return -1;
  }
  @Override
  public T remove() {
    // TODO Auto-generated method stub
    T[] newArray = (T[]) new Object[arr.length +1];
    
    return null;
  }
 

}