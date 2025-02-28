package Buoi3;

import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		SinhVien Hoang = new SinhVien();

		Hoang.nhap();;
		Hoang.themHPvaocuoi("LTHDT",3,"A");
		System.out.println("\nThong tin cua sinh vien Hoang");
		Hoang.hienthi();

		Hoang.dangkythem_HP(sc);
		System.out.println("\nUPDATE 1");
		Hoang.hienthi();

		System.out.print("\nNhap ten hoc phan can xoa: ");
		String name_delete = sc.nextLine();
		Hoang.xoa_HP(name_delete);
		System.out.println("\nUPDATE 2");
		Hoang.hienthi();
		
		System.out.print("\nDanh sach cua ban co bao nhieu sinh vien: ");
		int n = Integer.parseInt(sc.nextLine());
		SinhVien ds[] = new SinhVien[n];


		System.out.println("\nNhap thong tin cac sinh vien trong danh sach");
		SinhVien.nhapdsSinhVien(ds);

		

		//In danh sÃ¡ch táº¥t cáº£ sinh viÃªn 
		System.out.println("\nThong tin cac sinh vien vua nhap");
		SinhVien.hienthidsSinhVien(ds);

		//Danh sÃ¡ch sinh viÃªn sáº¯p xáº¿p theo tÃªn
		System.out.println("\nDanh sach da sap xep theo ten");
		SinhVien.selection_Sort(ds);
		SinhVien.print_Sort_Name(ds);

		//Danh sÃ¡ch Ä‘iá»ƒm tÃ­ch lÅ©y sinh 
		System.out.println("\nDanh sach diem tich luy cua toan bo sinh vien");
		SinhVien.print_KQ_DiemTL(ds);

		//Danh sÃ¡ch sinh viÃªn bá»‹ cáº£nh cÃ¡o há»�c vá»¥ 
		System.out.println("\nDanh sach sinh vien bi canh cao hoc vu");
		SinhVien.print_Warning_Study(ds);

	}
}
