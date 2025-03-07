package Buoi4;

import java.util.Scanner;

import Buoi3.SinhVien;

public class SDSinhVienCNTT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Danh sach co bao nhieu sinh vien: ");
		int n = Integer.parseInt(sc.nextLine());
		SinhVien []ds = new SinhVien[n];
		System.out.println("Nhap thong tin cac sinh vien co trong danh sach: ");
		SinhVienCNTT.nhapdsSV(ds);
		
		System.out.println("Thong tin cac sinh vien vua nhap: ");
		SinhVienCNTT.indsSV(ds);
		System.out.print("\nNhap email cua sinh vien can tim kiem: ");
		String read_email = sc.nextLine();

		for(int i=0;i<n;i++){
			if(((SinhVienCNTT) ds[i]).get_Email().equals(read_email)){
				System.out.println("\nThong tin sinh vien can tim");
				System.out.println("\nTen sinh vien: " + ds[i].get_fullName());
				System.out.println("\nGmail: " + ((SinhVienCNTT) ds[i]).get_Email());
				System.out.println("\nTen tai khoan: " + ((SinhVienCNTT) ds[i]).get_taikhoan());
				System.out.println("\nMat khau tai khoan: " + ((SinhVienCNTT) ds[i]).get_matkhau());
				System.out.println("\nDiem trung binh tich luy trong hoc ki: " + ds[i].tich_Luy());
				break;
			}
		}		
	}
}
