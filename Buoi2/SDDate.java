package Buoi2;

import java.util.Scanner;

public class SDDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date A = new Date(24,9,2005);
		A.hienthi();
		Date B = new Date();
		B.nhap(sc);
		B.hienthi();
		System.out.println("Ngay hom sau: "+B.ngayhomsau().toString());
		int a;
		System.out.println("So ngay cong them : ");
		a = sc.nextInt();
		System.out.println("Ngay cong them "+a+": "+B.congNgay(a).toString());
		int n;
		System.out.println("Danh sach co bao nhiu ngay: ");
		n = sc.nextInt();
		Date ds[]= new Date[n];
		for (int i = 0 ;i<n;i++) {
			System.out.println("Nhap thong tin ngay thu "+(i+1)+": ");
			ds[i] = new Date();
			ds[i].nhap(sc);
		}
		System.out.println("Danh sach vua nhap: ");
		for (int i=0; i<n;i++) {
			ds[i].hienthi();
		}
	}

}
