package Buoi1;
import java.util.Scanner;
public class Bai8 {
	// Hàm nhập mảng các số nguyên
	public static void read_List(int[] arr, Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.print("\nNhap so thu "+(i+1)+": ");
			arr[i] = Bai4.check_Exception(sc);
		}
	}

	//Hàm tìm giá trị x xuất hiện bao nhiêu lần trong mảng(x nhập từ bàn phím)
	public static int countX(int[] arr, int x){
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == x){
				count += 1;
			}
		}
		return count;
	}

	//Hàm đổi chỗ hai phần tử
	public static void swap(int[] arr, int i, int count){
		int temp = arr[i];
			arr[i] = arr[count];
			arr[count] = temp;
	}

	//Thuật toán sắp xếp chọn
	public static void selection_Sort(int[] arr){
		int i,j,count,min;
		for(i=0;i<arr.length-1;i++){
			min = arr[i];
			count = i;
			for(j=i+1;j<arr.length;j++){
				if(arr[j] < min ){
					min = arr[j];
					count = j;
				}
			}
			swap(arr,i,count);
		}
	}

	//Hàm in mảng các số nguyên
	public static void print_List(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
 	//Hàm chính
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);

		System.out.print("\nDanh sach ban co bao nhieu so nguyen: ");
		int n = Bai4.check_Exception(sc);
		//Ta sử dụng lại hàm check_Exception của Bài 4
		//Sử dụng được vì phạm vi truy cập là public
		//Nếu phạm vi truy cập là public nhưng khác gói thì chúng ta phải import vào

		int[] arr = new int[n];
		Bai8.read_List(arr,sc);

		System.out.print("\nNhap phan tu can tim kiem: ");
		int x = Bai4.check_Exception(sc);

		System.out.println("\nDanh sach co " + (Bai8.countX(arr,x)) + " so " + x);
		
		System.out.println("\nDanh sach da sap xep");
		Bai8.selection_Sort(arr);

		Bai8.print_List(arr);
	}
}
