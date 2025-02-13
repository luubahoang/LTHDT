package Buoi2;

import java.util.Scanner;


public class PhanSo {
	private int tuso, mauso;
	//hàm mặc nhiên 
	public PhanSo() {
		tuso = 0;
		mauso = 0;
	}
	//hàm có 2 biến số
	public PhanSo(int tu, int mau) {
		tuso = tu ;
		mauso = mau;
	}
	//hàm sao chép
	public PhanSo(PhanSo k) {
		tuso = k.tuso;
		mauso = k.mauso;
	}
	//hàm nhập 
	public void nhap(Scanner sc) {
			System.out.println("Nhap tu so: ");
			tuso = sc.nextInt();
			System.out.println("Nhap mau so: ");
			mauso = sc.nextInt();
	}
	//hàm in 
	public void hienthi() {
		System.out.println(tuso+"/"+mauso);
	}
	//hàm in trả về
	public String toString() {
		String s = Integer.toString(tuso);
		if (tuso == 0) return "0";
		else if (mauso==1) return s;
		else if (tuso==mauso) return "1";
		else if (tuso*mauso<0) return ((-tuso)+"/"+Math.abs(mauso));
		else return (Math.abs(tuso)+"/"+Math.abs(mauso));
	}
	//hàm ước chung lớn nhất
	public int ucln(int a, int b) {
		int temp;
		while (b!=0) {
			temp = a%b; 
			a = b;
			b = temp;
		}
		return a;
	}
	//hàm rút gon;
	public PhanSo rutgon() {
		PhanSo z = new PhanSo(tuso,mauso);
		int UCLN = z.ucln(tuso, mauso);
		tuso = tuso / UCLN;
		mauso = mauso / UCLN;
		return z;
	}
	//giá trị tử số 
	public int giatriTS() {
		return tuso;
	}
	//giá trị mẫu số
	public int giatriMS() {
		return mauso;
	}
	//hàm nghịch đảo 
	public PhanSo nghichdao() {
		PhanSo k = new PhanSo(mauso,tuso);
		return k.rutgon();
	}
	//hàm cộng 
	public PhanSo congPS(PhanSo a, PhanSo b){
		PhanSo k = new PhanSo();
		k.tuso = a.tuso * b.mauso + a.mauso*b.tuso;
		k.mauso = a.mauso*b.mauso;
		return k.rutgon();
	}
	//hàm trừ
	public PhanSo truPS(PhanSo a, PhanSo b){
		PhanSo k = new PhanSo();
		k.tuso = a.tuso * b.mauso - a.mauso*b.tuso;
		k.mauso = a.mauso*b.mauso;
		return k.rutgon();
	}
	//hàm nhân
	public PhanSo nhanPS(PhanSo a, PhanSo b){
		PhanSo k = new PhanSo();
		k.tuso = a.tuso * b.tuso;
		k.mauso = a.mauso * b.mauso;
		return k.rutgon();
	}
	//hàm chia
	public PhanSo chiaPS(PhanSo a, PhanSo b){
		PhanSo k = new PhanSo();
		k.tuso = a.tuso * b.mauso;
		k.mauso = a.mauso * b.tuso;
		return k.rutgon();
	}
}
