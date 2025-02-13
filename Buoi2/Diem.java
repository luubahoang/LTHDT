package Buoi2;

import java.util.Scanner;

public class Diem {
	private int x,y;
	//hàm mặc nhiên
	public Diem() {
		x = y =0;
	}
	//hàm có 2 tham số
	public Diem(int a,int b) {
		x = a;
		y = b;
	}
	//hàm đối xứng 
	public void doixung() {
		x = -y;
		y = -x;
	}
	//hàm nhập điểm
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập x = ");
		x = sc.nextInt();
		System.out.println("Nhập y = ");
		y = sc.nextInt();
	}
	//hàm in
	public void hienThi() {
		System.out.println("("+x+","+y+")");
	}
	//hàm sao chép 
	public Diem(Diem k) {
		x = k.x;
		y = k.y;
	}
	//hàm dời điểm 
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
	//giá trị x 
	public int giaTriX() {
		return x;
	}
	// giá trị y
	public int giaTriY() {
		return y;
	}
	// Khoảng cách từ điểm B đến gốc tọa độ 
	public float khoangCach() {
		return (float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
	//khoảng cách từ điểm B đến điểm A
	public float khoangCach(Diem d) {
		return (float)Math.sqrt(Math.pow(x-d.x,2)+Math.pow(y-d.y, 2));
	}
}
