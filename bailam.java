package helo;
import java.util.Scanner;

public class bailam {
	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham();
		
		sp1.nhap();
		sp2.nhap();
		sp1.xuat();
		sp2.xuat();
		
	}

}
class SanPham{
	Scanner sc;
	String tenSp;
	Double DonGia;
	Double GiamGia;
	void nhap(){
		System.out.println("nhap vao ten sp");
		Scanner sc = new Scanner(System.in);
		tenSp = sc.next();
		System.out.println("nhap vao gia san pham");
		DonGia = sc.nextDouble();
		
		

	}
	double getttnhap() {
		return GiamGia = DonGia - (DonGia/10);
	}
	void xuat() {
		System.out.println("gia cua san pham = "+DonGia);
		System.out.println("gia cua san pham sau khia giam gia = "+getttnhap());
		
	}
	
}