package Buoi3;

import java.io.InterruptedIOException;
import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap so loai gach : ");
		n = sc.nextInt();
		Gach []ds = new Gach[n];
		for (int i = 0 ;i < n ;i++) {
			ds[i]= new Gach();
			System.out.println("Nhap thong tin loai gach thu "+(i+1)+" :");
			ds[i].nhap();
		}
		for (int i = 0 ;i<n;i++) {
			ds[i].hienthi();
		}
		
		Gach gachMin = ds[0];
		for (int i =1 ;i<n;i++) {
			if (ds[i].chiphitrendientich() < gachMin.chiphitrendientich()) {
				gachMin = ds[i];
			}
		}
		System.out.println("Loai gach co chi phi lot thap nhat : ");
		gachMin.hienthi();
		
		int D=1500, N=500;
		System.out.println("Chi phi lot nen 500x1500 cho tung loai gach : ");
		for (int i = 0 ;i<n;i++) {
			System.out.println("Ma gach "+(i+1)+" "+ds[i].chiphilot(D, N)+" VND");
		}
	}
}
