package data.structures.map;

import java.util.Hashtable;


public class HashTablePlayGround {
  public static void main(String[] args) {
    Hashtable<Integer, String> hasht = new Hashtable<Integer,String>(); 
hasht.put(1, "thang");
hasht.put(4, "hihi");

System.out.println(hasht.get(1));
  }
}

