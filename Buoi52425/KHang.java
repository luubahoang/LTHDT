package Buoi5;

import java.util.Scanner;

public class KHang {
	private String ten;
	private boolean gtinh;
	private int nsinh;
	public KHang() {
		ten = new String();
		gtinh = true;
		nsinh = 0 ;
	}
	public KHang(KHang kh) {
		ten = new String(kh.ten);
		gtinh = kh.gtinh;
		nsinh = kh.nsinh;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten khach hang: ");
		ten = sc.nextLine();
		System.out.println("Nhap gioi tinh (true-nam)-(false-nu): ");
		gtinh = sc.nextBoolean();
		System.out.println("Nhap nam sinh : ");
		nsinh = sc.nextInt();
	}
	public void in() {
		System.out.println("Ten khach hang: "+ten);
		if (gtinh == true) System.out.println("Gioi tinh : Nam ");
		else if (gtinh == false) System.out.println("Gioi tinh : Nu");
		System.out.println("Nam sinh : "+nsinh);
	}
}
