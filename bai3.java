package helo;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc ;
		String tenSp;
		Double DonGia;
		Double GiamGia=null;
		
		sc = new Scanner(System.in);
		System.out.println("nhap vao ten sp");
		tenSp = sc.next();
		System.out.println("nhap vao gia sp");
		DonGia = sc.nextDouble();
		
		SanPham sp1 = new SanPham(tenSp,DonGia);
		SanPham sp2 = new SanPham(tenSp,DonGia,GiamGia);
		sp1.xuat();
		sp2.xuat();
		
	}

}
class SanPham{
	Scanner sc;
	String tenSp;
	Double DonGia;
	Double GiamGia;
	void nhap() {
		System.out.println("nhap vao ten sp");
		Scanner sc = new Scanner(System.in);
		tenSp = sc.next();
		System.out.println("nhap vao gia san pham");
		DonGia = sc.nextDouble();
		
		

	}
	public SanPham(String tenSp,Double DonGia,Double GiamGia) {
		this.tenSp = tenSp;
		this.DonGia = DonGia;
		this.GiamGia = GiamGia;
		
	}
	public SanPham(String tenSp, double DonGia){
		this.tenSp = tenSp;
		this.DonGia = DonGia;
	}
	
	private double getttnhap() {
		return GiamGia = DonGia - (DonGia/10);
	}
	public void xuat() {
		System.out.println("gia cua san pham = "+DonGia);
		System.out.println("gia cua san pham sau khia giam gia = "+getttnhap());
		
	}
	
}