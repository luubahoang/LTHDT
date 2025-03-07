package Buoi3;

import java.util.Scanner;

import Buoi2.Diem;

public class DoanThang {
	private Diem d1,d2;
	//ham mac nhien
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	//ham co 2 doi so 
	public DoanThang(Diem diem1, Diem diem2) {
		d1 = new Diem(diem1);
		d2 = new Diem(diem2);
	}
	//
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax,ay);
		d2 = new Diem(bx,by);
	}
	//ham nhap
	public void nhap() {
		System.out.println("Nhap diem dau : ");
		d1.nhapDiem();
		System.out.println("Nhap diem cuoi : ");
		d2.nhapDiem();
	}
	//ham in
	public void hienthi() {
		System.out.println("Diem dau : ");
		d1.hienThi();
		System.out.println("Diem cuoi : ");
		d2.hienThi();
	}
	//ham tinh tien 
	public void tinhtien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float dodai() {
		return d1.khoangCach(d2);
	}
}
