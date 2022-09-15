package abstract_hinh;

public class Test {

	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(7, 9);

		ToaDo td3 = new ToaDo(12, 1);
//Hinh h= new Hinh(td1);  lớp trừng tượng không thể gọi làm đối tượgn;
		Hinh h1 = new DiemCham(td1);
		h1.tinhdientich();
		Hinh h2 = new HinhTron(td2,10);
		
		Hinh H3 = new HinhChuNhat(td2,7,3);
		
       System.out.println("dien tich hinh tron la : "+h2.tinhdientich());
       System.out.println("dien tich hinh chu nhat la :"+H3.tinhdientich());
	}
}
