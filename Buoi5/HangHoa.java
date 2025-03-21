package Buoi51;

import java.util.Scanner;

public class HangHoa {
	private String mshh,tenhh,namsx;
	public HangHoa() {
		mshh = new String();
		tenhh = new String();
		namsx = new String();
	}
	public HangHoa(HangHoa hh) {
		mshh = new String(hh.mshh);
		tenhh = new String(hh.tenhh);
		namsx = new String(hh.namsx);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap mshh : ");
		mshh = sc.nextLine();
		System.out.print("Nhap tenhh : ");
		tenhh = sc.nextLine();
		System.out.print("Nhap namsx : ");
		sc.nextLine();
	}
	public void in() {
		System.out.println("Ma so hang hoa : "+mshh);
		System.out.println("Ten hang hoa : "+tenhh);
		System.out.println("Nam san xuat hang hoa : "+namsx);
	}
}
