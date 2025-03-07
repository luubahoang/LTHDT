package Buoi4;

import java.util.Scanner;

public abstract class DVat {
	private String giong,maulong;
	private float cannang;
	//Default constructor
		public DVat() {
			giong = new String();
			maulong = new String();
			cannang = 0.0f;
		}

		//Coppy constructor
		public DVat(DVat d) {
			giong = new String(d.giong);
			maulong = new String(d.maulong);
			cannang = d.cannang;
		}

		//Hàm nhập thông tin con vật
		public void nhap() {
			Scanner sc = new Scanner(System.in);
			System.out.print("\nNhap ten giong: ");
			giong = sc.nextLine();
			System.out.print("\nNhap mau: ");
			maulong = sc.nextLine();
			System.out.print("\nNhap can nang: ");
			cannang = Float.parseFloat(sc.nextLine());
		}

		//Hàm in thông tin con vật
		public void hienthi() {
			System.out.println("\nTen giong: "+giong);
			System.out.println("\nMau: "+maulong);
			System.out.println("\nCan nang: "+cannang);
			System.out.print("\nTieng keu: ");
		}

		public abstract void Keu();

		//Hàm nhập danh sách các động vật
		public static void nhapdsDVat(DVat ds[]){
			Scanner sc = new Scanner(System.in);
			char c;
			System.out.println("\nNhap thong tin cac con vat co trong danh sach");
			for (int i=0;i<ds.length;i++) {
				System.out.println("\nNhap thong tin con vat thu "+(i+1));
				System.out.println("Bo nhap b.\nHeo nhap h.\nDe nhap d.");
				System.out.print("Nhap su lua chon cua ban: "); 	
				c = sc.nextLine().charAt(0);
				if (c == 'b') ds[i] = new Bo();
				else if (c == 'h') ds[i] = new Heo();
				else ds[i] = new De();
				ds[i].nhap();
			}
		}

		//Hàm in danh sách các động vật
		public static void indsDVat(DVat ds[]){
			for(int i=0;i<ds.length;i++){
				System.out.println("\nThong tin dong vat thu "+(i+1));
				ds[i].hienthi();
				ds[i].Keu();
			}
		}

		//Hàm chính
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);

			System.out.print("Nhap so dong vat: ");
			int n = Integer.parseInt(sc.nextLine());

			DVat ds[] = new DVat[n];

			DVat.nhapdsDVat(ds);
			
			DVat.indsDVat(ds);
		}
	
}
