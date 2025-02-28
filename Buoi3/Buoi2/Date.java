package Buoi2;

import java.util.Scanner;

public class Date {
	private int ngay, thang , nam;
	//hàm mặc nhiên
	public Date() {
		ngay = 1 ;
		thang = 1 ;
		nam = 2000;
	}
	//hàm có 3 tham số 
	public Date(int a, int b, int c) {
		ngay = a;
		thang = b; 
		nam = c;
	}
	//hàm sao chep
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	//hàm in 
	public void hienthi() {
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	//hàm kiểm tra nam nhuan
	public boolean namnhuan() {
		if ( (nam%400==0) || (nam%4==0 && nam%100!=0)) 
			return true;
		return false;
	}
	//hàm kiểm tra ngày hợp lệ 
	public boolean hople() {
		int arr[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if (namnhuan()) arr[2]=29;
		if ( ngay > 0  && (thang >0 && thang <13) && nam>0 && ngay <=arr[thang]) {
				return true;
		}
		return false;
	}
	//ham tra ve
	public String toString() {
		return ngay+"/"+thang+"/"+nam;
	}
	//hàm nhập 
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay = ");
			ngay = sc.nextInt();
			System.out.println("Nhap thang = ");
			thang = sc.nextInt();
			System.out.println("Nhap nam = ");
			nam = sc.nextInt();
			if (!hople()) {
				System.out.println("Sai roi !!! Vui long nhap lai!");
			}
		} while (!hople());
	}
	//hàm ngày hôm sau
	public Date ngayhomsau() {
		Date d = new Date(ngay,thang,nam);
		d.ngay +=1;
		if (!d.hople()) {
			d.ngay = 1;
			d.thang +=1;
			if (!d.hople()) {
				d.thang =1 ;
				d.nam += 1;
			}
		}
		return d;
	}
	//hàm tim ngay thu n va nhap n tu ban phim
	public Date congNgay(int n) {
		Date d = new Date(ngay,thang,nam);
		for (int i = 0;i<n;i++) {
			d = d.ngayhomsau();
		}
		return d;
	}
}
