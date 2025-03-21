package Buoi5;

import java.util.Scanner;

public class TheBus {
	private String maThe,nph;
	private char loai;
	private KHang kh;
	public TheBus() {
		maThe = new String();
		nph = new String();
		loai = 'H';
	}
	public TheBus(TheBus d) {
		maThe = new String(d.maThe);
		nph = new String(d.nph);
		loai = d.loai;
		kh = new KHang(d.kh);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma the :");
		maThe = sc.nextLine();
		System.out.println("Nhap ngay phat hanh (dd/mm/yy): ");
		nph = sc.nextLine();
		System.out.println("Nhap loai (H/D/M/Y) : ");
		loai = Character.toUpperCase(sc.next().charAt(0));
		kh = new KHang();
		kh.nhap();
	}
	public void in() {
		System.out.println("Ma the : "+maThe);
		System.out.println("Ngay phat hanh : "+nph);
		System.out.println("Loai : "+loai);
		kh.in();
	}
	public Boolean isTheLoaiY() {
		return loai == 'Y';
	}
	public Boolean isNgayPhatHanh(String ngay) {
		return nph.equals(ngay);
	}
}
