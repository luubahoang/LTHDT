package Buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		A.hienThi();
		Diem B = new Diem();
		B.nhapDiem();
		B.hienThi();
		Diem C = new Diem(-B.giaTriY(),-B.giaTriX());
		C.hienThi();
		System.out.println("Khoang cach tu diem B den tam O = "+B.khoangCach());   
		System.out.println("Khoang cach tu diem A den diem B = "+B.khoangCach(A));
	}

}
