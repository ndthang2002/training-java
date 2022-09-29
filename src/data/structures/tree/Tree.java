package data.structures.tree;

public interface Tree<T> {
  int size();
  
  void clear();
  
  void add(T obj);
  
  void addAll(T[] obj);
  
  boolean remove(T obj);
  
  boolean contains(T obj);
  
  class Node<T>{
    private Node<T> left;
    private Node<T> right;
    private Node<T> parent;
    private T item;
    
    Node(T item){
      this.item = item;
      this.left =null;
      this.right =null;
      this.parent=null;
    }
    T getItem() {return  this.item;}
    
    void setItem(T ite) { this.item=ite;}
    
    Node<T> getLeft(){ return this.left;}
    
    void setLeft(Node<T> lf) { this.left = lf;}
    
    Node<T> getRight(){return this.right;}
    
    void setRight(Node<T> rg) { this.right=rg;}
    
    Node<T> getParent() {return this.parent;}
    
    void setParent(Node<T> pr) {this.parent=pr;}
  }
}
