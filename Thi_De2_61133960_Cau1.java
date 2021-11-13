import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
public class Thi_De2_61133960_Cau1 {
// Tinh chi so BMI
	
	
	
	public static void main(String[] args) {
	double chieucao, cannang, chisoBMI;
	String KetQua;
	
	Locale vn = new Locale("vi", "VN");
	DecimalFormat dcf = new DecimalFormat("#.##");
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Nhap can nang: ");
	cannang = scanner.nextDouble();
	System.out.println("Nhap chieu cao: ");
	chieucao = scanner.nextDouble();
	
	// tính chỉ số BMI
	chisoBMI = cannang / (chieucao* chieucao);
	System.out.println("chi so BMI = " + dcf.format(chisoBMI));
	
	// Phân loại dựa vào chỉ số BMI 
	if (chisoBMI < 18) {
		KetQua = " Bạn là người gầy!";
	}
	else if( chisoBMI <= 24.9) {
		KetQua = " Bạn là người bình thường";
	}
	else if( chisoBMI <= 29.9) {
		KetQua = " Bạn là người béo phì độ I";
	}
	else if( chisoBMI <= 34.9) {
		KetQua = " Bạn là người béo phì độ II";
	}	
	else  {
		KetQua = " Bạn là người béo phì độ III";
	}	
	
	System.out.println(KetQua);
	}
	
		
	}


