package Buoi51;

import java.util.Scanner;

public class Date {
	private int ngay,thang,nam;
	public Date() {
		ngay = 0 ;
		thang = 0 ;
		nam = 0;
	}
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	public Date(int d, int m, int y) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ngay : ");
		ngay = sc.nextInt();
		System.out.print("Nhap thang : ");
		thang = sc.nextInt();
		System.out.print("Nhap nam : ");
		nam = sc.nextInt();
	}
	public void in() {
		System.out.print(ngay+"/"+thang+"/"+nam);
	}
	public String toString() {
		return (ngay+"/"+thang+"/"+nam);
	}
}
