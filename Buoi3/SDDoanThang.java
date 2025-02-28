package Buoi3;

import java.util.Scanner;

import Buoi2.Diem;

public class SDDoanThang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diem A = new Diem(2,5);
		Diem B = new Diem(20,35);
		DoanThang AB = new DoanThang(A,B);
		AB.tinhtien(5,3);
		AB.hienthi();
		DoanThang CD = new DoanThang();
		System.out.println("Nhap thong tin cua diem CD: ");
		CD.nhap();
		System.out.println("Do dai cua doan thang CD: "+CD.dodai());
		int n;
		System.out.println("Nhap so luong doan thang : ");
		n = sc.nextInt();
		DoanThang []ds = new DoanThang[n];
		for (int i = 0 ;i< n;i++) {
			ds[i] = new DoanThang();
			System.out.println("nhap thong tin diem thu "+(i+1)+": ");
			ds[i].nhap();
		}
		for (int i =0 ;i<n;i++) {
			ds[i].hienthi();
		}
	}
}
