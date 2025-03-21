package Buoi5;

import java.util.ArrayList;
import java.util.Scanner;

public class SDTheBus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so the xe buyt: ");
		int m = sc.nextInt();
		
		ArrayList<TheBus> ds1 = new ArrayList<TheBus>();
		for (int i = 0; i < m ; i++) {
			System.out.println("Nhap the xe buyt thu "+(i+1)+": ");
			TheBus theBus = new TheBus();
			theBus.nhap();
			ds1.add(theBus);
			System.out.println("");
		}
		System.out.println("Thong tin tat ca the xe buyt : ");
		for (TheBus theBus : ds1 ) {
			theBus.in();
			System.out.println("");
		}
		System.out.println("Danh sach the xy buyt cos gia tri su dung 1 nam ");
		for (TheBus theBus : ds1) {
			if (theBus.isTheLoaiY()) {
				theBus.in();
				System.out.println("");
			}
		}
		System.out.println("danh sach khach hang co the phat hanh ngay 20/05/22 :");
		for (TheBus theBus : ds1 ) {
			if (theBus.isNgayPhatHanh("20/05/22")) {
				theBus.in();
				System.out.println("");
			}
		}
	}
}
