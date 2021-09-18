package InfoSV;
import java.util.Scanner;
public class CVvaDT {
	double dai, rong;

	public CVvaDT(double dai,double rong) {
		this.dai = dai;
		this.rong = rong;
		
	}

	public CVvaDT() {
		
	}
	public double getRong() {
        return rong;
    }
 
    public double getDai() {
        return dai;
    }
 
    public void setRong(double rong) {
        this.rong = rong;
    }
 
    public void setDai(double dai) {
        this.dai = dai;
    }
	//tao ham tinh chu vi
	double tinhChuVi() {
		return(dai+rong)*2;
		}
	
	
	//tao ham tinh dien tich
	double tinhDienTich() {
		return(dai*rong);
		}
	
	// tinh canh nho nhat 
	double CanhNhoNhat() {
		return(Math.min(dai, rong));
	}

	public static void main(String[] args) {
		CVvaDT hcn = new CVvaDT();
		Scanner scanner = new Scanner(System.in);
		//Yeu cau nhap chieu dai va chieu rong 
		System.out.println("Chieu dai:");
		hcn.setDai(scanner.nextDouble());
		System.out.println("chieu rong : ");
		hcn.setRong(scanner.nextDouble());
		
		// goi ham tinh chu vi , dien tich va canh nho nhat 
		System.out.println("chu vi hinh chu nhat  : " + hcn.tinhChuVi());
        System.out.println("Dien tich hinh chu nhat : " + hcn.tinhDienTich());
        System.out.println("Canh nho nhat : " + hcn.CanhNhoNhat());
	}

}
