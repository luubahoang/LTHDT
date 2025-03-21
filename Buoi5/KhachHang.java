package Buoi51;

import java.util.Scanner;

public class KhachHang {
	private String hoten, diachi;
	private Boolean gioitinh;
	private Date ngaysinh;
	public KhachHang() {
		hoten = new String();
		diachi = new String();
		gioitinh = true;
		ngaysinh = new Date();
	}
	public KhachHang(KhachHang kh) {
		hoten = new String(kh.hoten);
		diachi = new String(kh.diachi);
		gioitinh = kh.gioitinh;
		ngaysinh = new Date(kh.ngaysinh);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten khach hang : ");
		hoten = sc.nextLine();
		System.out.println("Nhap dia chi : ");
		diachi = sc.nextLine();
		System.out.println("Nhap gioi tinh (true-nam)-(false-nu) : ");
		gioitinh = sc.nextBoolean();
		System.out.println("Nhap ngay thang nam sinh : ");
		ngaysinh.nhap();
	}
	public void in() {
		System.out.println("Ten khach hang: "+hoten);
		System.out.println("Dia chi : "+diachi);
		if (gioitinh = true ) System.out.println("Gioi tinh : Nam");
		else if (gioitinh = false) System.out.println("Gioi tinh : Nu");
		System.out.println("Ngay thang nam sinh : "+ngaysinh.toString());
	}
}
