package Buoi3;

import java.util.Scanner;

import Buoi2.Date;

public class SinhVien1 {
	private String MSSV;
	private String hoten;
	private Date ngaysinh;
	private int soluonghp;
	private String tenhp[];
	private String diemhp[];
	//ham mac nhien
	public SinhVien1() {
		MSSV = new String();
		hoten = new String();
		ngaysinh = new Date();
		soluonghp = 0;
		tenhp = new String[100];
		diemhp = new String[100];
	}
	//ham nhap 
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap MSSV : ");
		MSSV = sc.nextLine();
		System.out.println("Nhap ten sinh vien : ");
		hoten = sc.nextLine();
		System.out.println("Nhap ngay thang nam : ");
		ngaysinh.nhap();
		System.out.println("Hoc ki nay sinh vien "+hoten+" hoc bao nhiu hoc phan : ");
		soluonghp = sc.nextInt();
		sc.nextLine();
		for (int i =0 ;i<soluonghp;i++) {
			System.out.println("Nhap thong tin hoc phan thu "+(i+1));
			System.out.println("Nhap ten hoc phan thu "+(i+1)+":");
			tenhp[i]= sc.nextLine();
			System.out.println("Nhap diem(Diem chu) cua hoc phan thu "+ tenhp[i]+": ");
			diemhp[i]= sc.nextLine();
		}
	} 
	//ham in
	public void hienthi() {
		System.out.println("MSSV : "+MSSV);
		System.out.println("Ten sinh vien : "+hoten);
		System.out.println("Ngay thang nam sinh "+ngaysinh.toString());
		System.out.println("Hoc ki nay sinh vien "+hoten+ " hoc"+soluonghp+"hoc phan");
		for (int i = 0; i<soluonghp;i++) {
			System.out.println("Thong tin hoc phan thu "+(i+1));
			System.out.println("Ten hoc phan : "+tenhp[i]);
			System.out.println("Diem hoc phan : "+diemhp[i]);
		}
	}
	
}
