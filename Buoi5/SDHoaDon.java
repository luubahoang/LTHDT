package Buoi51;

import java.util.Scanner;

public class SDHoaDon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Danh sach cua ban co bao nhieu hoa don: ");
		int n = sc.nextInt();
		HoaDon []ds = new HoaDon[n];
		for ( int i = 0 ;i < n ; i++) {
			System.out.println("Nhap thong tin hoa don thu "+(i+1));
			ds[i] = new HoaDon();
			ds[i].nhap();
		}
		System.out.println("Thong tin cac hoa don vua nhap");
		for ( int i = 0 ;i < n;i++) {
			System.out.println("Thong tin hoa don thu "+(i+1));
			ds[i].in();
		}
		
	}
}
