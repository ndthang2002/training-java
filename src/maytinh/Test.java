package maytinh;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("test cau a:");
  MayTinhcasio500 mfx500 = new MayTinhcasio500();
  MayTinhVincal mvn500 = new MayTinhVincal();
  System.out.println("5+3"+mfx500.cong(5, 4));
  System.out.println("4*5"+ mvn500.nhan(4,5));
  System.out.println("4/0 ="+mvn500.chiai(4, 0));
  
  
  System.out.println("test cau b:");
  double[] arr = new double[] {5,3,1,5,2,6,82};
  double[] arr2 = new double[] {2,2,5,7,3,8,4,8};

  SapXepChon sxchon = new SapXepChon();
  
  sxchon.sapxeptang(arr);
   for (int i=0;i<arr.length;i++) {
	   System.out.println(arr[i]);
   }

   System.out.println("test cau c:");
    PhanMemMayTinh maytinh = new PhanMemMayTinh();
    System.out.println("4+5 =="+maytinh.cong(4, 5));
    
    maytinh.sapxeptang(arr2);
    for(int i=0;i<arr2.length;i++) {
    	System.out.println(arr2[i]);
    }
	}

}
