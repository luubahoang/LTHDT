package Buoi2;

import java.util.Scanner;


public class PhanSo {
	private int tuso, mauso;
	//hÃ m máº·c nhiÃªn 
	public PhanSo() {
		tuso = 0;
		mauso = 1;
	}
	//hÃ m cÃ³ 2 biáº¿n sá»‘
	public PhanSo(int tu, int mau) {
		tuso = tu ;
		mauso = mau;
	}
	//hÃ m sao chÃ©p
	public PhanSo(PhanSo k) {
		tuso = k.tuso;
		mauso = k.mauso;
	}
	//hÃ m nháº­p 
	public void nhap(Scanner sc) {
			System.out.println("Nhap tu so: ");
			tuso = sc.nextInt();
			System.out.println("Nhap mau so: ");
			mauso = sc.nextInt();
	}
	//hÃ m in 
	public void hienthi() {
		System.out.println(tuso+"/"+mauso);
	}
	//hÃ m in tráº£ vá»�
	public String toString() {
		String s = Integer.toString(tuso);
		if (tuso == 0) return "0";
		else if (mauso==1) return s;
		else if (tuso==mauso) return "1";
		else if (tuso*mauso<0) return ((-tuso)+"/"+Math.abs(mauso));
		else return (Math.abs(tuso)+"/"+Math.abs(mauso));
	}
	//hÃ m Æ°á»›c chung lá»›n nháº¥t
	public int ucln(int a, int b) {
		int temp;
		while (b!=0) {
			temp = a%b; 
			a = b;
			b = temp;
		}
		return a;
	}
	//hÃ m rÃºt gon;
	public PhanSo rutgon() {
		PhanSo z = new PhanSo(tuso,mauso);
		int UCLN = z.ucln(tuso, mauso);
		tuso = tuso / UCLN;
		mauso = mauso / UCLN;
		return z;
	}
	//giÃ¡ trá»‹ tá»­ sá»‘ 
	public int giatriTS() {
		return tuso;
	}
	//giÃ¡ trá»‹ máº«u sá»‘
	public int giatriMS() {
		return mauso;
	}
	//hÃ m nghá»‹ch Ä‘áº£o 
	public PhanSo nghichdao() {
		PhanSo k = new PhanSo(mauso,tuso);
		return k.rutgon();
	}
	//hÃ m cá»™ng 
	public PhanSo congPS(PhanSo a, PhanSo b){
		PhanSo k = new PhanSo();
		k.tuso = a.tuso * b.mauso + a.mauso*b.tuso;
		k.mauso = a.mauso*b.mauso;
		return k.rutgon();
	}
	//hÃ m trá»«
	public PhanSo truPS(PhanSo a, PhanSo b){
		PhanSo k = new PhanSo();
		k.tuso = a.tuso * b.mauso - a.mauso*b.tuso;
		k.mauso = a.mauso*b.mauso;
		return k.rutgon();
	}
	//hÃ m nhÃ¢n
	public PhanSo nhanPS(PhanSo a, PhanSo b){
		PhanSo k = new PhanSo();
		k.tuso = a.tuso * b.tuso;
		k.mauso = a.mauso * b.mauso;
		return k.rutgon();
	}
	//hÃ m chia
	public PhanSo chiaPS(PhanSo a, PhanSo b){
		PhanSo k = new PhanSo();
		k.tuso = a.tuso * b.mauso;
		k.mauso = a.mauso * b.tuso;
		return k.rutgon();
	}
	public PhanSo congPS(PhanSo a ) {
		int Tu= this.tuso * a.mauso +this.mauso* a.tuso;
		int Mau = this.mauso *a.mauso;
		return new PhanSo(Tu,Mau);
	}
	public double giatriPS() {
		return (double)tuso/mauso;
	}
	public boolean lonhon(PhanSo a) {
		return this.giatriPS() > a.giatriPS();
	}
}
