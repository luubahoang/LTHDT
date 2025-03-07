package Buoi3;

import java.util.Scanner;

public class Gach {
	private String maso;
	private String mau;
	private int soluongvien;
	private int chieudai;
	private int chieungang;
	private long gia;
	//ham mac nhien
	public Gach() {
		maso = new String();
		mau = new String();
		soluongvien=0;
		chieudai=0;
		chieungang=0;
		gia=0;
	}
	//ham nhieu tham so
	public Gach(String ms, String m, int slv, int cd, int cn, int g) {
		maso = new String(ms);
		mau = new String(m);
		soluongvien = slv;
		chieudai = cd;
		chieungang = cn;
		gia = g;
	}
	//ham sao chep
	public Gach(Gach k) {
		maso = new String(k.maso);
		mau = new String(k.mau);
		soluongvien = k.soluongvien;
		chieudai = k.chieudai;
		chieungang = k.chieungang;
		gia = k.gia;
	}
	//ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so cua hop gach : ");
		maso = sc.nextLine();
		System.out.println("Nhap mau cua hop gach : ");
		mau = sc.nextLine();
		System.out.println("Nhap so luong vien gach : ");
		soluongvien = sc.nextInt();
		System.out.println("Nhap chieu dai vien gach : ");
		chieudai = sc.nextInt();
		System.out.println("Nhap chieu ngang vien gach : ");
		chieungang = sc.nextInt();
		System.out.println("Nhap gia ban 1 hop : ");
		gia = sc.nextLong();
		sc.nextLine();
	}
	//ham in
	public void hienthi() {
		System.out.println(maso+"/"+mau+"/"+soluongvien+"/"+chieudai+"/"+chieungang+"/"+gia);
	}
	//ham tinh ban le 1 vien gach
	public float giabanle() {
		return 	(float)gia/(soluongvien*1.2f);
	}
	//ham tinh dien tich
	public int dientichLot() {
		return soluongvien*chieudai*chieungang;
	}
	//ham tinh so luong hop gach it nhat can lot 
	public int soluonghop(int D, int N) {
		int dientichnen = D * N;
		return (int)Math.ceil((double)dientichnen / dientichLot());
	}
	//ham tinh chi phi lot cho truoc
	public long chiphilot(int D,int N) {
		return soluonghop(D, N)*gia;
	}
	//ham tinh chi phi lot tren moi dien tich
	public float chiphitrendientich() {
		return (float)gia/dientichLot();
	}
}
