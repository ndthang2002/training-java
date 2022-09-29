package data.structures;

public class ArrayList<T> implements List<T> {
  
  // arraylist sẽ có 1 mảng arr và vị trí hiện tại của phần tử
  protected T[] arr;
  protected int currpos ;
  
  //constructor mặc định có kích thước là 10
  public ArrayList() {
    this(10);
  }
  // constructor co tham so 
  public ArrayList(int initialCapaciti) {
    arr = (T[]) new Object[initialCapaciti];
  }
  
  @Override
  public int size() {
    // TODO Auto-generated method stub
    return currpos;
  }

  @Override
  public void clear() {
    for(int i=0; i<currpos;i++) {
      arr[i]=null;
    }
    currpos=0;
  }

  @Override
  public boolean add(T obj) {
    // TODO Auto-generated method stub
    // them vao phan tu cuoi cung cua mang 
    arr[currpos] = obj;
    currpos++;
    return true;
  }

  @Override
  public boolean add(int index, T obj) {
    // TODO Auto-generated method stub
    if(index<0 ||  index>arr.length) {
      throw new IllegalArgumentException("vị trí khong hop le"); // IllegalArgumentException là dành cho lỗi đối số
    }
    T[] newArray = (T[]) new Object[arr.length+1];
    // bat dau copy mang cu qua mang moi
    for (int i=0; i<arr.length;i++) {
      if(i<index) {
      //  T ele = arr[i]; dư
        newArray[i]= arr[i];
      }
      else if(i==index) {
        newArray[i]= obj;
      }
      else {
        //tại vì ở vị trí index ở vị trí thêm vô sau khi thêm nó thoát vòng lặp tăng i lên 1  
        T ele  = arr[i-1];
        newArray[i]= ele;
        
      }
    }
     arr= newArray;
     currpos++;
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
    int pos  = findPos(obj);
    removeAt(pos);
    currpos--;
    return true;
  }

  @Override
  public T removeAt(int pos) {
    // TODO Auto-generated method stub
    if(pos<0 ||  pos>arr.length) {
      throw new IllegalArgumentException( "vi tri khong hop le");
    } 
    
    else {
     
      arr[pos]=null;
      while(arr[pos]!=null) {
         arr[pos] = arr[pos+1];
      }
      currpos--;
    }
    T val = arr[pos];
   
    return val;
  }

  @Override
  public T remove() {
    // TODO Auto-generated method stub
    T val = arr[0];
    arr[0]=null;
    for (int i=0;i<arr.length-1;i++) {
      arr[i] = arr[i+1]; 
    }
    
    return val;
  }

  @Override
  public T get(int pos) {
    // TODO Auto-generated method stub
   if(arr[pos]==null) {
     return null;
   }
    
    return arr[pos];
  }

  @Override
  public void set(int pos, T obj) {
    // TODO Auto-generated method stub
    arr[pos]=obj;
  }

  @Override
  public int findPos(T obj) {
    // TODO Auto-generated method stub
    
     for (int i=0; i<currpos;i++) {
       if(arr[i].equals(obj)) {
         return i;
       }
     }
    return -1;
  }


}