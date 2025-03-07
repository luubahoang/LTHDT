package Buoi4;

import java.util.Scanner;

import Buoi2.Diem;

public class DiemMau  extends Diem{
	private String mau;
	// ham mac nhien
	public DiemMau() {
		super();
		mau = new String();
	}
	//ham co 3 tham so 
	public DiemMau(int a, int b, String m) {
		super(a,b);
		mau = new String(m);
	}
	//ham copy
	public DiemMau(DiemMau a) {
		super((Diem)a);
		mau = new String(a.mau);
	}
	//ham nhap 
	public void nhap() {
		super.nhapDiem();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mau cua diem: ");
		mau = sc.nextLine();
	}
	//ham in 
	public void hienthi() {
		super.hienThi();
		System.out.println("Mau: "+mau);
	}
	//ham in thong tin co kieu tra ve
	public String toString() {
		return super.toString()+" Mau: "+mau;
	}
	//ham gan mau
	public void GanMau(String m) {
		mau = new String(m);
	}
}
