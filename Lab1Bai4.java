package InfoSV;
import java.util.Scanner;
public class Lab1Bai4 {
	float a,b,c;
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.print("Nhap a = ");
        float a = Lab1Bai4.scanner.nextFloat();
        System.out.print("Nhap  b = ");
        float b = Lab1Bai4.scanner.nextFloat();
        System.out.print("Nhap  c = ");
        float c = scanner.nextFloat();
        Lab1Bai4.tinhDelta(a, b, c);

	}


	private static void tinhDelta(float a, float b, float c) {

		int delta = (int) (Math.pow(b,2)-4*a*c);
		float	CanDelta = (float) Math.sqrt(delta);
		
		System.out.println("Delta =   : " + delta);
		System.out.println(" Can Delta =   : " + CanDelta);
		
	
	}
	

}
