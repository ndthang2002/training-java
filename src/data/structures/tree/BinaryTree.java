package data.structures.tree;

import java.util.Currency;

public class BinaryTree<T extends Comparable<T>> implements Tree<T> {
  private Node<T> root;
  private int size;
  @Override
  public int size() {
    // TODO Auto-generated method stub
    return size;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void add(T obj) {
    // TODO Auto-generated method stub
    Node<T> newNode = new Node<>(obj);
    if( this.root==null) {
      this.root= newNode;
      size++;
    }else {
      insert(this.root , newNode);
    }
  }
  private void insert(Node<T> currNode , Node<T> newNode) {
   if(newNode.getItem().compareTo(currNode.getItem())<0) {
     if(currNode.getLeft()==null) {
       currNode.setLeft(newNode);
       newNode.setParent(currNode);
       size++;
     }else {
       insert(currNode.getLeft(),newNode);
     }
   }else if(newNode.getItem().compareTo(currNode.getItem())>0) {
     if(currNode.getRight()==null) {
       currNode.setRight(newNode);
       newNode.setParent(currNode);
       size++;
     }else {
       insert(currNode.getRight(), newNode);
     }
   }
    
  }

  @Override
  public void addAll(T[] obj) {
    // TODO Auto-generated method stub
    for(T o : obj) {
      add(o);
    }
  }

  @Override
  public boolean remove(T obj) {
    // TODO Auto-generated method stub
    boolean deleted = false;
    if( this.root==null) {
      return false ;
    }
    Node<T> currNode = get(obj);
    if(currNode!=null) {
      // co 3 truong hop 
      // nút lá , nút chưa 1 con , nút chứa 2 con
      if(currNode.getLeft()==null && currNode.getRight()==null) {
        unlink(currNode,null);
        deleted= true;
      }else if( currNode.getLeft()!=null&& currNode.getRight()== null) {
        unlink(currNode, currNode.getLeft());
        deleted=true;
      }else if( currNode.getRight()!=null && currNode.getLeft()==null) {
        unlink(currNode, currNode.getRight());
        deleted= true;
      }else {
        
         // chon cach node phai cung cua cay con ben trai
        Node<T> child = currNode.getLeft();
        while(child.getRight()!=null ) {
          child= child.getRight();
        }
        child.getParent().setRight(null);
        child.setLeft(currNode.getLeft());
        child.setRight(child.getRight());
        unlink(currNode, child);
        deleted=true;
      }
    }
    if(deleted) {
      size--;
    }
    return deleted;
  }
  private Node<T> get(T obj){
    Node< T> currNode = this.root;
    while(currNode!=null) {
      int val = obj.compareTo(currNode.getItem());
      if( val==0) {
        return currNode;
      }else if(val<0) {
        currNode= currNode.getLeft();
      }else if( val>0) {
        currNode= currNode.getRight();
      }
    }
    return null;
  }
  
  private void unlink(Node<T> cuNode ,Node<T> newNode) {
    if(cuNode== this.root) {
      newNode.setLeft(cuNode.getLeft());
      newNode.setRight(cuNode.getRight());
      this.root = newNode;
    }else if(cuNode.getParent().getRight()== cuNode) {
      cuNode.getParent().setRight(newNode);
    }else if( cuNode.getParent().getLeft()==cuNode) {
      cuNode.getParent().setLeft(newNode);
    }
  }

  @Override
  public boolean contains(T obj) {
    // TODO Auto-generated method stub
    return get(obj)!=null;
  }



}
