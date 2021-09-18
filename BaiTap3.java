package InfoSV;
import java.util.Scanner;
public class BaiTap3 {
	double canh;
	
	public BaiTap3(double canh) {
		this.canh= canh;
		
	}
	 public BaiTap3() {
		 
	 }
	 
	 public double getCanh() {
		 return canh;
	 }
	 
	 public void setCanh(double canh) {
		 this.canh = canh;
		 
	 }
	 // tao ham tinh the tich khoi lap phuong 
	 double tinhLapPhuong() {
		 return(Math.pow(canh,3));
		 
	 }
	public static void main(String[] args) {
			BaiTap3 klp = new BaiTap3();
			Scanner scanner = new Scanner(System.in);
			// Nhap do dai cac canh 
			System.out.println("canh:");
			klp.setCanh(scanner.nextDouble());
			
			//xuat the tich cua khoi lap phuong
			System.out.println("The tich khoi lap phuong   : " + klp.tinhLapPhuong());
			

	}

}
