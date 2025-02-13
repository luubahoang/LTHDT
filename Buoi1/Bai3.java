package Buoi1;
import java.util.Scanner;
public class Bai3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        char ch;
	        while (true) {
	            System.out.print("Nhập một ký tự (nhập 'q' để kết thúc): ");
	            ch = scanner.next().charAt(0);

	            if (ch == 'q') {
	                break;
	            }

	            System.out.println("Bạn đã nhập: " + ch);
	        }

	        System.out.println("Chương trình kết thúc!");
	        scanner.close();
	    }

	public static int check_exception(Scanner sc) {
		return 0;
	}
}

