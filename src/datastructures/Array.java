package datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	

	public static void main(String[] args) {
		int[] a = { 22, 2, 3, 6, 2, 7 };
//		array1();
		// có thể sử dụng với nhiều mảng khác nhau .
//		testarray2(a); 

		// copy array nay qua array khac bang arraycopy in system
//		char[] copyForm = { 'd', 't', 'h', 'a', 'n', 'g', 'l', 'o', 'n', 'g', 'a', 'd' };
//		char[] copyTo = new char[9];
//		System.arraycopy(copyForm, 1, copyTo, 0, 9);
//		System.out.println(new String(copyTo));
		
		int[] ten  = {1,4,7,3,7,9,2};	
		//sap xep tang dan
//		for(int f :ten) {
//			Arrays.sort(ten);
//			System.out.println(f);
//		}
//		gán giá trị cho mảng
//		Arrays.fill(ten,1);
//		System.out.println(Arrays.toString(ten));
		
		//tim kiem binarySearch
//		Arrays.sort(ten);
//		int so = 1;
//		System.out.println(Arrays.binarySearch(ten, so));
		
		//so sanh bang
		int[] arr1 = new int[] {1,2,3,4};
		int[]  arr2= new int[] {1,2,3,4};
		System.out.println("mang nay bang nhau? : "+Arrays.equals(arr1, arr2));
		System.out.println(a[2]);
		for (int ar :a) {
			System.out.println(ar);
		}
		
	}

	public static void array1() {
		int[] mang = new int[10];
		Scanner nhap = new Scanner(System.in);
		// input
		for (int i = 0; i < mang.length; i++) {
			System.out.println("nhap cac phan tu vao : ");

			mang[i] = nhap.nextInt();

		}
		// output
		for (int a : mang) {
			System.out.println("cac phan tu vua nhap : " + a);
		}

	}

	// truyền mảng vào phương thức nhằm tái sử dụng
	public static void testarray2(int arr[]) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max > arr[i]) {
				max = arr[i];

			}

		}
		System.out.println(max);
	}

}
