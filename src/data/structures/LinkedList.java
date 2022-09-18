package data.structures;

public class LinkedList<T> implements List<T> {

  protected Node<T> head;
  protected Node<T> tail;
  private int currPos;

  public LinkedList() {
    this.head=null;
    this.tail=null;
    this.currPos=0;
  }
  
  public LinkedList(T[] obj) {
    this();
    
  }
 
  @Override
  public int size() {
    // TODO Auto-generated method stub
    return currPos;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
   Node<T> currNode=head;
   while(currNode!=null) {
     Node<T> nextnode = currNode.getNext();
     currNode.setValue(null);
     currNode.setNext(null);
     currNode = nextnode;
   }
   head=tail=null;
   currPos=0;
   
  }

  @Override
  public boolean add(T obj) {
    // TODO Auto-generated method stub
    if(head == null) {
      head = new Node<T>(obj);
      tail = head;
    }
    else {
      Node<T> newTailNode = new Node<T>(obj);
      tail.setNext(newTailNode);
      tail = newTailNode;
    }
    currPos++;
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
     
    return false;
  }

  @Override
  public T removeAt(int pos) {
    if(head==null) {
      throw new IllegalArgumentException("list nay khong ton tai");
    }
    else if(pos<0|| pos>currPos) {
       throw new IllegalArgumentException("chi so khong phu hop");
     }
    Node<T> vitrihientai = head;
    Node<T> vitritruocdo = head;
    for (int i=0;i<pos&& vitrihientai != null;i++) {
      vitritruocdo = vitrihientai;
      vitrihientai =vitrihientai.getNext();
      
    }
    T currelement =  vitrihientai.getValue();
    vitritruocdo.setNext(vitrihientai.getNext());
    // TODO Auto-generated method stub
    currPos--;
    return currelement;
  }

  @Override
  public void set(int pos, T obj) {
    // TODO Auto-generated method stub
 
  }

  @Override
  public int findPos(T obj) {
    // TODO Auto-generated method stub
    Node<T> curr = head;
    int pos =0;
    while(curr != tail) {
      if(curr.getValue().equals(obj)) {
        return pos;
      }
      curr= curr.getNext();
      pos++;
    }
    return -1;
  }

  static protected class Node<T> {

    T value;
    Node<T> next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }

    public T getValue() { return value; }

    public void setValue(T value) { this.value = value;}

    public Node<T> getNext() { return next;}

    public void setNext(Node<T> next) { this.next = next; }
  }

  @Override
  public T get(int pos) {
    // TODO Auto-generated method stub
    if(head == null) {
      throw new IllegalArgumentException("The Linked List is empty there are no elements to get!");
    }
    Node<T> currNode = head;
    int index = 0;
    while(index != pos) {
      currNode = currNode.getNext();
      index++;
    }
    return currNode.getValue();
  }
}
