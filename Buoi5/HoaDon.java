package Buoi51;

import java.util.Scanner;

public class HoaDon {
	private KhachHang kh;
	private KhachHangVip khv;
	private String mahd;
	private Date ngaylap;
	private ChiTietHH ct[];
	private int n;
	final int max = 50;
	public HoaDon() {
		kh = new KhachHang();
		khv = new KhachHangVip();
		mahd = new String();
		ngaylap = new Date();
		ct = new ChiTietHH[max];
		n = 0;
	}
	public HoaDon(HoaDon hd) {
		kh = new KhachHang(hd.kh);
		khv = new KhachHangVip(hd.khv);
		mahd = new String(hd.mahd);
		ngaylap = new Date(hd.ngaylap);
		ct = new ChiTietHH[max];
		n = hd.n;
		for (int i = 0 ; i < n ; i++) {
			ct[i]= new ChiTietHH(hd.ct[i]);
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chon 1 la khach hang thuong");
		System.out.println("Chon 2 la khach hang vip");
		char key;
		System.out.println("Nhap su lua chon cua ban:");
		key = sc.nextLine().charAt(0);
		if (key=='1') kh = new KhachHang();
		else if(key=='2') kh = new KhachHangVip();
		kh.nhap();
		System.out.println("Nhap ma so hoa don: ");
		mahd = sc.nextLine();
		System.out.println("Nhap ngay lap : ");
		ngaylap.nhap();
		System.out.println("Nhap so luong hang hoa can phai mua:");
		n = sc.nextInt();
		for (int i = 0 ; i < n; i++) {
			System.out.println("Nhap thong tin hang hoa thu"+(i+1));
			ct[i]= new ChiTietHH();
			ct[i].nhap();
		}
	}
	public void in() {
		System.out.println("_______________________________________________");
		System.out.println("Thong tin khach hang");
		kh.in();
		System.out.println("Thong tin hoa don cua khach hang");
		System.out.println("Ma so hoa don: "+mahd);
		System.out.println("Ngay thanh lap hoa don: "+ngaylap.toString());
		System.out.println("So luong hang hoa can mua cua khach hang: "+n);
		for ( int i = 0 ; i < n ; i++) {
			System.out.println("Thong tin hang hoa thu "+(i+1));
			ct[i].in();
		}
		System.out.println("_______________________________________________");
	}
}
