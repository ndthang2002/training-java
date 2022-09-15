package daluong;

public class MultithreadThing    implements Runnable{// extends Thread{
	private int threadNumber;
	 public MultithreadThing(int threadNumber) {
		 this.threadNumber = threadNumber;
	 }
@Override
	public void run() {
		
	for(int i=0;i<=5;i++) {
		System.out.println(i+"đây là luồng "+threadNumber);
		 if(threadNumber ==3) {
			 throw new RuntimeException();
		 }
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}
