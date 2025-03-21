package Buoi51;

import java.util.Scanner;

public class ChiTietHH {
	private int sl,dg;
	private HangHoa h;
	public ChiTietHH() {
		sl = 0;
		dg = 0;
		h = new HangHoa();
	}
	public ChiTietHH(ChiTietHH hh) {
		sl = hh.sl;
		dg = hh.dg;
		h = new HangHoa(hh.h);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		h.nhap();
		System.out.print("Nhap so luong hang hoa : ");
		sl = sc.nextInt();
		System.out.print("Nhap do gia hang hoa : ");
		dg = sc.nextInt();
	}
	public void in() {
		h.in();
		System.out.println("So luong : "+sl);
		System.out.println("Gia tien : "+dg);
	}
}
