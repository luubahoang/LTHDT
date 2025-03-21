package Buoi51;

import java.util.Scanner;

public class KhachHangVip extends KhachHang {
	private float tile;
	public KhachHangVip() {
		super();
		tile = 0;
	}
	public KhachHangVip(KhachHangVip khv) {
		super(khv);
		tile = khv.tile;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ti le : ");
		tile = sc.nextFloat();
	}
	public void in() {
		super.in();
		System.out.println("Ti le cua khach hang vip: "+tile);
	}
}
