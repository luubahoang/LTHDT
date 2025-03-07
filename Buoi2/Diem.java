package Buoi2;

import java.util.Scanner;

public class Diem {
	private int x,y;
	//hÃ m máº·c nhiÃªn
	public Diem() {
		x = y =0;
	}
	//hÃ m cÃ³ 2 tham sá»‘
	public Diem(int a,int b) {
		x = a;
		y = b;
	}
	//hÃ m Ä‘á»‘i xá»©ng 
	public void doixung() {
		x = -y;
		y = -x;
	}
	//hÃ m nháº­p Ä‘iá»ƒm
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap x = ");
		x = sc.nextInt();
		System.out.println("Nhap y = ");
		y = sc.nextInt();
	}
	//hÃ m in
	public void hienThi() {
		System.out.println("("+x+","+y+")");
	}
	//hÃ m sao chÃ©p 
	public Diem(Diem k) {
		x = k.x;
		y = k.y;
	}
	//hÃ m dá»�i Ä‘iá»ƒm 
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
	//giÃ¡ trá»‹ x 
	public int giaTriX() {
		return x;
	}
	// giÃ¡ trá»‹ y
	public int giaTriY() {
		return y;
	}
	//ham toString
	public String toString(){
		return ("("+x+","+y+")");
	}
	// Khoáº£ng cÃ¡ch tá»« Ä‘iá»ƒm B Ä‘áº¿n gá»‘c tá»�a Ä‘á»™ 
	public float khoangCach() {
		return (float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
	//khoáº£ng cÃ¡ch tá»« Ä‘iá»ƒm B Ä‘áº¿n Ä‘iá»ƒm A
	public float khoangCach(Diem d) {
		return (float)Math.sqrt(Math.pow(x-d.x,2)+Math.pow(y-d.y, 2));
	}
}
