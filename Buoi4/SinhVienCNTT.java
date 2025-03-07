package Buoi4;

import java.util.Scanner;

import Buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	private String taikhoan,matkhau,email;
	//ham mac nhien
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	//ham copy
	public SinhVienCNTT(SinhVienCNTT sv) {
		super((SinhVien)sv);
		taikhoan = new String(sv.taikhoan);
		matkhau = new String(sv.matkhau);
		email = new String(sv.email);
	}
	//ham nhap 
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tai khoan: ");
		taikhoan = sc.nextLine();
		System.out.println("Nhap mat khau: ");
		matkhau = sc.nextLine();
		System.out.println("Nhap email: ");
		email = sc.nextLine();
	}
	//ham in
	public void hienthi() {
		super.hienthi();
		System.out.println(taikhoan+"/"+matkhau+"/"+email);
	}
	//ham doi mat khau
	public void doi_mat_khau(String dmk) {
		matkhau = new String(dmk);
	}
	
	//ham nhap ds sinh vien
	public static void nhapdsSV(SinhVien ds[]){
		Scanner sc = new Scanner(System.in);
		char c;
		for(int i=0;i<ds.length;i++){
			System.out.println("\n---Sinh vien thu "+(i+1)+" thuoc khoa nao");
			System.out.println("\nNhap 1 ---> Khoa cong nghe thong tin");
			System.out.println("\nNhap 2 ---> Khoa khac");
			System.out.print("\n---Nhap lua chon cua ban: ");
			c = sc.nextLine().charAt(0);
			if(c=='1') ds[i] = new SinhVienCNTT();
			else ds[i] = new SinhVien();
			ds[i].nhap();
		}
	}
	//ham in ds sinh vien
	public static void indsSV(SinhVien ds[]){
		for(int i=0;i<ds.length;i++){
			System.out.println("\n--Thong tin sinh vien thu "+(i+1));
			ds[i].hienthi();
		}
	}
	//
	public String get_Email() {
		return email;
	}
	public String get_taikhoan() {
		return taikhoan;
	}
	public String get_matkhau() {
		return matkhau;
	}
}
