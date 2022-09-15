package daluong;

public class Multithreading {
  public static void main(String[] args) throws Exception {
//	MultithreadThing myThing =  new 	MultithreadThing();
//	MultithreadThing myThing2 =  new 	MultithreadThing();
//
//	myThing.start();
//	myThing2.start();
	  
	  for(int i=0;i<5;i++) {
			MultithreadThing myThing =  new MultithreadThing(i);
            //myThing.start();
			Thread myThread = new Thread(myThing);
			myThread.start();
			
	  }
	  ;
}
}
