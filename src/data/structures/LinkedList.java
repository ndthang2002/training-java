package data.structures;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {

  protected Node<T> head;
  protected Node<T> tail;
  private int currSize;

  public LinkedList() {
    this.head = null;
    this.tail = null;
    this.currSize = 0;
  }

  public LinkedList(T[] obj) {
    addAll(obj);
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return currSize;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
    Node<T> currNode = head;
    while (currNode != null) {
      Node<T> nextNode = currNode.getNext();
      currNode.setNext(null);
      currNode.setValue(null);
      
      currNode = nextNode;

    }
    head = tail = null;
    currSize = 0;

  }

  @Override
  public boolean add(T obj) {
    if (head == null) {
      head = new Node<T>(obj);
      tail = head;
    } else {
      Node<T> newTailNode = new Node<T>(obj);
      tail.setNext(newTailNode);
      tail = newTailNode;
    }
    currSize++;
    return true;
  }

  @Override
  public void addAll(T[] obj) {
    // TODO Auto-generated method stub
    for (T o : obj) {
      add(o);
    }
  }

  @Override
  public boolean remove(T obj) {
    // TODO Auto-generated method stub
    int index = findPos(obj);
    if (index == -1) {
      throw new IllegalArgumentException("khong tim thay phan tu ");
    }
    removeAt(index);
    currSize--;
    return true;
  }

  @Override
  public T removeAt(int pos) {
    // TODO Auto-generated method stub
    if (pos <= 0 || pos >= currSize) {
      throw new IllegalArgumentException();

    }

    Node<T> nodeHienTai = head;
    Node<T> nodeTruocDo = head;

    for (int i = 0; i < pos && nodeHienTai != null; i++) {
      nodeTruocDo = nodeHienTai;
      nodeHienTai = nodeHienTai.getNext();
    }

    T val = nodeHienTai.getValue();
    nodeTruocDo.setNext(nodeHienTai.getNext());
    currSize--;

    return val;
  }

  @Override
  public T get(int pos) {
    // TODO Auto-generated method stub
    if (pos < 0 || pos > currSize || head == null) {
      throw new IllegalArgumentException("loi");
    }
    Node<T> currNode = head;
    int index = 0;
    ;
    while (index != pos) {
      currNode = currNode.getNext();
      index++;
    }

    return currNode.getValue();
  }

  @Override
  public void set(int pos, T obj) {
    // TODO Auto-generated method stub
    Node<T> node = head;
    for (int i = 0; i < pos && node != null; i++) {
      node = node.getNext();
    }
    node.setValue(obj);
  }

  @Override
  public int findPos(T obj) {
    // TODO Auto-generated method stub
    Node<T> nodeDau = head;
    int index = 0;
    while (nodeDau != null) {
      if (nodeDau.getValue().equals(obj)) {
        return index;
      }
      nodeDau = nodeDau.getNext();
      index++;
    }
    return -1;
  }

  /*
   * // static protected class Node<T>{ // T value; // Node<T> next; // Node<T>
   * prev; // //contrucstor // // public Node(T obj) { // this.value = obj; //
   * this.next=null; // }; // // public T getValue() {return value;}; // public
   * void setValue(T value) { this.value=value;}; // public Node<T> getNext() {
   * return next;} // public void setNext(Node<T> next) {this.next=next;}; //
   * public Node<T> getPrev(){return prev;}; // public void setPrev(Node<T> prev)
   * {this.prev=prev;} // }
   */
  @Override
  public T remove() {
    T val = head.getValue();
    head = head.getNext();
    currSize--;
    return val;
  }

  @Override
  public boolean add(int index, T obj) {
    // TODO Auto-generated method stub
    if(head==null) {
      head = new Node<T>(obj);
      tail = head;
    }
    else {
      
       Node<T> currNode = head;
    for (int i=0 ;i<index && currNode != null; i++) {
      currNode = currNode.getNext();
    }
    Node<T> newNode = new Node<T>(obj);
    Node<T> nextNode = currNode.getNext();
    
    }
    currSize++;
    
    return true;
  }

}
