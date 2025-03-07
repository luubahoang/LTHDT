package Buoi4;

import java.util.Scanner;

public class SDDiemMau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DiemMau A = new DiemMau(5, 10, "Trang");
		System.out.println("Thong tin diem A vua nhap :"+A.toString());
		DiemMau B = new DiemMau();
		B.nhap();
		B.doiDiem(10, 8);
		B.GanMau("Vang");
		B.hienthi();
		System.out.println("Danh sach co bao nhiu diem mau: ");
		int n = sc.nextInt();
		DiemMau []ds = new DiemMau[n];
		for (int i = 0 ;i < n; i++) {
			System.out.println("Nhap thong tin cua diem mau thu "+(i+1)+" :");
			ds[i] = new DiemMau();
			ds[i].nhap();
		}
		for (int i = 0; i<n;i++) {
			System.out.println("Thong tin diem mau thu "+(i+1)+" :");
			ds[i].hienthi();
		}
	}

}
