package Buoi1;
import java.util.Scanner;
public class Bai4 {
	public static int check_Exception(Scanner sc){
		String s;
		int n;
		do{
			s = sc.nextLine();
			try{n = Integer.parseInt(s);}
			catch(NumberFormatException e){
				n = Integer.MAX_VALUE;
				System.out.print("\nSai dinh dang, nhap lai: ");
			}
		}while(n==Integer.MAX_VALUE);
		return n;
	}

	//Hàm tính tổng
	public static int SUM(int a, int b){
		return a+b;
	}

	//Hàm chính
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nNhap so nguyen a: ");
		int a = Bai4.check_Exception(sc);

		System.out.print("\nNhap so nguyen b: ");
		int b = Bai4.check_Exception(sc);
		
		System.out.println("\nTong " + a + " + " + b + " = " + Bai4.SUM(a,b));
	}
}
