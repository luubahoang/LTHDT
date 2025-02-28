package Buoi3;
import Buoi2.Date;
import java.util.Scanner;

public class SinhVien{

	//Khai bÃ¡o thuá»™c tÃ­nh 
	private String MSSV;
	private String fullname;
	private Date ngaysinh;
	private int sl;
	private String tenhp[];
	private String diemhp[];
	private int sotc[];
	private final int MAX = 50;

	//Default constructor 
	public SinhVien(){
		MSSV = new String();
		fullname = new String();
		ngaysinh = new Date();
		sl = 0;
		tenhp = new String[MAX];
		diemhp = new String[MAX];
		sotc = new int[MAX];
	}

	//Coppy Constructor
	public SinhVien(SinhVien sv){
		MSSV = new String(sv.MSSV);
		fullname = new String(sv.fullname);
		ngaysinh = new Date(sv.ngaysinh);
		sl = sv.sl;
		tenhp = new String[MAX];
		diemhp = new String[MAX];
		sotc = new int[MAX];

		for(int i=0;i<sv.sl;i++){
			tenhp[i] = new String(sv.tenhp[i]);
			diemhp[i] = new String(sv.diemhp[i]);
			sotc[i] = sv.sotc[i];
		}

	}	

	//HÃ m nháº­p thÃ´ng tin sinh viÃªn
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap mssv: ");
		MSSV = sc.nextLine();
		System.out.print("\nNhap ten sinh vien: ");
		fullname = sc.nextLine();
		System.out.println("\nNhap ngay thang nam sinh");
		ngaysinh.nhap();;
		System.out.print("\nHoc ki nay sinh vien " + fullname + " hoc bao nhieu hoc phan: ");
		sl = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<sl;i++){
			System.out.println("\nNhap thong tin hoc phan thu " + (i+1));
			System.out.print("\nNhap ten hoc phan thu " + (i+1) + ": ");
			tenhp[i] = sc.nextLine();
			System.out.print("\nNhap diem(Diem chu) cua hoc phan thu " + tenhp[i] + ": ");
			diemhp[i] = sc.nextLine();
			System.out.print("\nNhap so tin chi cua hoc phan " + tenhp[i] + ": ");
			sotc[i] = check_exception(sc);
		}

	}

	//HÃ m in thÃ´ng tin sinh viÃªn
	public void hienthi(){
		System.out.println("\nTen sinh vien: "+fullname);
		System.out.println("\nMSSV: "+MSSV);
		System.out.println("\nNgay thang nam sinh: "+ngaysinh.toString());
		System.out.println("\nHoc ki nay sinh vien " + fullname + " hoc " + sl + " hoc phan");
		for(int i=0;i<sl;i++){
			System.out.println("\nThong tin hoc phan thu " + (i+1));
			System.out.println("\nTen hoc phan: "+tenhp[i]);
			System.out.println("\nDiem hoc phan " + tenhp[i] + ": " + diemhp[i]);
			System.out.println("\nSo tin chi hoc phan " + tenhp[i] + ": " + sotc[i]);
		}
	}

	//HÃ m xá»­ lÃ­ ngoáº¡i lá»‡
	public static int check_exception(Scanner sc){
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

	//ThÃªm há»�c pháº§n vÃ o cuá»‘i danh sÃ¡ch 
	public void themHPvaocuoi(String tenhp1, int stc, String diem){
		tenhp[sl] = new String(tenhp1);
		diemhp[sl] = new String(diem);
		sotc[sl] = stc;
		sl++;
	}

	//ThÃªm n há»�c pháº§n vÃ o cuá»‘i danh sÃ¡ch
	public void dangkythem_HP(Scanner sc){
		System.out.print("Nhap vao so luong hoc phan muon dang ky them: ");
		int n = Integer.parseInt(sc.nextLine());
		int k = sl;
		sl = sl + n;
		for (int i = k; i < sl; i++){
			System.out.print("Nhap hoc phan thu " + (i+1) + " can dang ki: ");
			tenhp[i] = sc.nextLine();
			System.out.print("\nNhap diem chu cua hoc phan " + tenhp[i] + " : ");
			diemhp[i] = sc.nextLine();
			System.out.print("\nNhap STC cua hoc phan " + tenhp[i] + " : ");
			sotc[i] = Integer.parseInt(sc.nextLine());
		}
	}

	//HÃ m xÃ³a há»�c pháº§n
	public void xoa_HP(String key){
		int pos = -1;
		for(int i=0;i<sl;i++){
			if(tenhp[i].equals(key)){
				pos = i;
				break;
			}
		}
		if(pos!=-1){
			for(int i=pos;i<sl;i++){
				tenhp[i] = tenhp[i+1];
				diemhp[i] = diemhp[i+1];
				sotc[i] = sotc[i+1];
				sl--;
			}
		}
	}

	//HÃ m Ä‘á»•i Ä‘iá»ƒm chá»¯ sang Ä‘iá»ƒm sá»‘ (theo thang Ä‘iá»ƒm 4)
	public double doi_Diem(String s){
		if(s.equals("A"))	return 4;
		else if(s.equals("B+"))	return 3.5;
		else if(s.equals("B")) return 3;
		else if(s.equals("C+"))	return 2.5;
		else if(s.equals("C")) return 2;
		else if(s.equals("D+")) return 1.5;
		else if(s.equals("D")) return 1;
		else return 0;
	}

	//HÃ m tÃ­nh Ä‘iá»ƒm trung bÃ¬nh tÃ­ch lÅ©y 
	public double tich_Luy() {
		double total = 0;
		int count = 0;
		String s;
		for(int i = 0;i<sl;i++) {
			count += sotc[i];
			s = new String(diemhp[i]);
			total += (sotc[i] * doi_Diem(s));
		}
		return (double)total/count;
	}

	//HÃ m láº¥y tÃªn
	public String get_Name(){
		String get_Name = new String(fullname);
		get_Name = get_Name.trim();
		return get_Name.substring(get_Name.lastIndexOf(" ")+1);
	}

	//HÃ m láº¥y há»� tÃªn 
	public String get_fullName(){
		return fullname;
	}

	//Thuáº­t toÃ¡n sáº¯p xáº¿p chá»�n, sáº¯p xáº¿p tÃªn theo Alphabet cá»§a tÃªn 
	public static void selection_Sort(SinhVien ds[]){
		for(int i=0;i<ds.length-1;i++){
			for(int j=i+1;j<ds.length;j++){
				if(ds[i].get_Name().compareTo(ds[j].get_Name())>0){
					SinhVien t = ds[i];
							ds[i] = ds[j];
							ds[j]=t;
				}
			}
		}
	}

	//HÃ m nháº­p thÃ´ng tin toÃ n bá»™ sinh viÃªn
	public static void nhapdsSinhVien(SinhVien ds[]){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<ds.length;i++){
			System.out.println("\nNhap thong tin sinh vien thu " + (i+1));
			ds[i] = new SinhVien();
			ds[i].nhap();
		}
	}

	//HÃ m in thÃ´ng tin toÃ n bá»™ sinh viÃªn 
	public static void hienthidsSinhVien(SinhVien ds[]){
		for(int i=0;i<ds.length;i++){
			System.out.println("\n--Thong tin sinh vien thu " + (i+1));
			ds[i].hienthi();  
		}
	}

	//In thÃ´ng tin sinh viÃªn theo há»� tÃªn Ä‘Ã£ Ä‘Æ°á»£c sáº¯p xáº¿p 
	public static void print_Sort_Name(SinhVien ds[]){
		for(int i=0;i<ds.length;i++){
			System.out.println((i+1)+". " + ds[i].get_fullName());
		}
	}

	//HÃ m in thÃ´ng tin sinh viÃªn bá»‹ cáº£nh cÃ¡o há»�c vá»¥ 
	public static void print_Warning_Study(SinhVien ds[]){
		for(int i=0;i<ds.length;i++){
			if(ds[i].tich_Luy() <  1.0){
				System.out.println((i+1)+". "+ds[i].get_fullName());
			}
		}
	}

	//HÃ m in káº¿t quáº£ Ä‘iá»ƒm tÃ­ch lÅ©y cá»§a táº¥t cáº£ sinh viÃªn
	public static void print_KQ_DiemTL(SinhVien ds[]){
		for(int i=0;i<ds.length;i++){
			System.out.println((i+1)+". "+ds[i].get_fullName()+" "+ds[i].tich_Luy());
		}
	}

	//HÃ m láº¥y email, user, password sáº½ Ä‘Æ°á»£c giáº£i Ä‘Ã¡p trong buá»•i 4(Káº¿ thá»«a trong java)
	public String get_Email(){
		return "";
	}
	public String get_User(){
		return "";
	}
	public String get_passWord(){
		return "";
	}
}