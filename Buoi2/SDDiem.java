package Buoi2;

import java.util.Scanner;

public class SDDiem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diem A = new Diem(3,4);
		A.hienThi();
		Diem B = new Diem();
		B.nhapDiem();
		B.hienThi();
		Diem C = new Diem(-B.giaTriY(),-B.giaTriX());
		C.hienThi();
		System.out.println("Khoang cach tu diem B den tam O = "+B.khoangCach());   
		System.out.println("Khoang cach tu diem A den diem B = "+B.khoangCach(A));
		int n;
		System.out.println("Danh sach co bao nhiei diem: ");
		n = sc.nextInt();
		Diem ds[]=new Diem[n];
		for (int i = 0 ;i<n;i++) {
			System.out.println("Diem thu "+(i+1)+": ");
			ds[i]= new Diem();
			ds[i].nhapDiem();
		}
		System.out.println("Danh sach vua nhap = ");
		for (int i = 0 ; i<n ; i++) {
			ds[i].hienThi();
		}
		
	}

}
