package data.structures;




 public class Node<T>{
    T value;
    Node<T> next;
    Node<T> prev;
    //contrucstor
    
    public Node(T obj) {
      this.value = obj;
      this.next=null;
    };
    
    public T getValue() {return value;};
    public void setValue(T value) { this.value=value;};
    public Node<T> getNext() { return next;}
    public void setNext(Node<T> next) {this.next=next;};
    public Node<T> getPrev(){return prev;};
    public void setPrev(Node<T> prev) {this.prev=prev;}
  
}
