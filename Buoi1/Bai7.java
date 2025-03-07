package Buoi1;
import java.util.Scanner;
public class Bai7 {
	public static String extractFirstName(String fullName) {
       
        String[] parts = fullName.trim().split("\\s+");
       
        if (parts.length > 0) {
            return parts[parts.length - 1];  
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Nhap vao ho ten: ");
        String fullName = scanner.nextLine();
       
        String firstName = extractFirstName(fullName);
        System.out.println("Ten la: " + firstName);
       
        scanner.close();
    }
}