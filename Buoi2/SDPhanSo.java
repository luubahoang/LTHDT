package Buoi2;
import java.util.Scanner;


public class SDPhanSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo a = new PhanSo(3,7);
		PhanSo b = new PhanSo(4,9);
		a.hienthi();
		b.hienthi();
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		System.out.println("Nhap phan so x ");
		x.nhap(sc);
		System.out.println("Nhap phan so y ");
		y.nhap(sc);
		System.out.println("Gia tri nghich dao = "+x.nghichdao().toString());
		PhanSo kq = new PhanSo();
		kq = kq.congPS(x, y);
		System.out.println("Tong = "+kq.toString());
		kq = kq.truPS(x, y);
		System.out.println("Hieu = "+kq.toString());
		kq = kq.nhanPS(x, y);
		System.out.println("Tich = "+kq.toString());
		kq = kq.chiaPS(x, y);
		System.out.println("Thuong = "+kq.toString());
		int n;
		System.out.println("Danh sach co bao nhieu phan so: ");
		n = sc.nextInt();
		PhanSo ds[] = new PhanSo[n];
		for (int i = 0;i<n;i++) {
			System.out.println("Phan so thu "+(i+1));
			ds[i] = new PhanSo();
			ds[i].nhap(sc);
		}
		System.out.println("Danh sach phan so: ");
		for (int i = 0 ;i<n;i++) {
			ds[i].hienthi();
		}
		
		float tong = 0;
		for (int i = 0 ;i<n;i++) {
			tong += ds[i].giatriPS();
		}
		System.out.println("Tong cac phan so = "+tong);
		
		float max = ds[0].giatriPS();
		for (int i= 0 ;i<n;i++) {
			if ( ds[i].giatriPS()> max ) {
				max = ds[i].giatriPS();
			}
		}
		System.out.println("Phan so lon nhat trong danh sach "+max);
		
	}
}
