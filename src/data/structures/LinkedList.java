package data.structures;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {

  protected Node<T> head;
  protected Node<T> tail;
  protected int     currSize;

  public LinkedList() {
    this.head = null;
    this.tail = null;
    this.currSize = 0;
  }

  public LinkedList(T[] arr) {
    addAll(arr);
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return currSize;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
    Node<T> cuNode = head;
    while (cuNode != null) {
      Node<T> nextNode = cuNode.getNext();
      cuNode.setNext(null);
      cuNode.setValue(null);
      cuNode = nextNode;
    }
    head = tail = null;
    currSize = 0;
  }

  @Override
  public boolean add(T obj) {
    // TODO Auto-generated method stub
    if (head == null) {
      head = new Node<T>(obj);
      tail = head;
    } else {
      Node<T> newNode = new Node<T>(obj);

      tail.setNext(newNode);
      tail = newNode;
    }
    currSize++;
    return true;
  }

  @Override
  public boolean add(int index, T obj) {
    if (index >= currSize) {
      throw new IllegalArgumentException(" loi vi tri");
    }
    // TODO Auto-generated method stub
    int idex = 1;
    Node<T> curNode = head;
    while (idex < index && curNode != null) {
      curNode = curNode.getNext();
      idex++;
    }
    Node<T> nextNode = curNode.getNext();
    Node<T> newNode = new Node<>(obj);

    curNode.setNext(newNode);
    newNode.setNext(nextNode);
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
    int pos = findPos(obj);
    removeAt(pos);

    return true;
  }

  @Override
  public T removeAt(int pos) {
    // TODO Auto-generated method stub
    if (head == null) {
      throw new IllegalArgumentException(" chuoi trong");

    }
    if (pos < 0 || pos > currSize) {
      throw new IllegalArgumentException("vi tri khong ton tai");

    }
    Node<T> currNode = head;
    Node<T> preNode = head;
    for (int i = 0; i < pos && currNode != null; i++) {
      preNode = currNode;
      currNode = currNode.getNext();
    }
    T val = currNode.getValue();
    preNode.setNext(currNode.getNext());
    currSize--;
    return val;
  }

  @Override
  public T remove() {
    // TODO Auto-generated method stub
    if (head == null) {
      throw new IllegalStateException("The Linked List is empty and there are no element to remove!");
    }
    head = head.getNext();
    currSize--;
    return head.getValue();
  }

  @Override
  public T get(int pos) {
    // TODO Auto-generated method stub
    if (head == null) {
      throw new IllegalArgumentException(" chuoi ko ton tai");
    } else if (pos < 0 || pos > currSize) {
      throw new IllegalArgumentException(" chi so khong phu hop");

    }

    Node<T> currNode = head;
    int index = 0;
    while (index < pos) {
      currNode = currNode.getNext();
      index++;
    }
    return currNode.getValue();
  }

  @Override
  public void set(int pos, T obj) {
    // TODO Auto-generated method stub
    Node<T> cuNode = head;
    int index = 0;
    while (index < pos && cuNode != null) {
      cuNode = cuNode.getNext();
      index++;
    }

    cuNode.setValue(obj);
  }

  @Override
  public int findPos(T obj) {
    // TODO Auto-generated method stub
    int pos = 0;
    if (head == null) {
      throw new IllegalArgumentException("lien ket khong ton tai");
    } else {
      Node<T> cuNode = head;
      while (cuNode != null) {
        if (cuNode.getValue().equals(obj)) {
          return pos;
        }
        cuNode = cuNode.getNext();
        pos++;
      }
    }

    return -1;
  }

}
