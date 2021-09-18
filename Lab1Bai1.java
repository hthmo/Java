package InfoSV;
	import java.util.Scanner;
public class Lab1Bai1 {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ho va Ten:");
		String hoTen = scanner.nextLine();
		System.out.print("Diem TB:");
		double diemTB= scanner.nextDouble();
		
		System.out.printf("%s%f",hoTen, diemTB);
		
		
		
		
	}
}
