package BMI;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class BMI {
	public static void main(String[] args) {
		Frame fr = new Frame("Chi so BMI: ");
		fr.setSize(500, 400);
		fr.setLocationRelativeTo(null);
		fr.setLayout(null);
		fr.setResizable(false);
		
		Label lblA = new Label("Chieu cao: ");
		Label lblB = new Label("Can nang: ");
		Label lblResult = new Label("BMI: ");
		
		TextField txtA = new TextField();
		TextField txtB = new TextField();
		TextField txtResult= new TextField();
		
		txtResult.setEditable(false);
		
		Button btnCong = new Button("Tinh BMI: ");
		
		fr.add(lblA); fr.add(txtA);
		fr.add(lblB); fr.add(txtB);
		fr.add(lblResult); fr.add(txtResult);
		fr.add(btnCong);
		
		lblA.setLocation(130, 80);
		lblA.setSize(70, 25);
		txtA.setLocation(240, 80);
		txtA.setSize(150, 20);

		lblB.setLocation(130, 130);
		lblB.setSize(80, 25);
		txtB.setLocation(230, 140);
		txtB.setSize(150, 20);

		btnCong.setLocation(110, 220);
		btnCong.setSize(80, 25);

		lblResult.setLocation(140, 290);
		lblResult.setSize(55, 20);
		txtResult.setLocation(230, 290);
		txtResult.setSize(200, 20);

		ActionListener Bolangnghe = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                
                double weight=Double.parseDouble(txtB.getText());
                double height=Double.parseDouble(txtA.getText());
                
                double chisoBMI = weight / (height*height);
 
                 if (chisoBMI < 18) {
                	 txtResult.setText("Ban thieu can - BMI : "+chisoBMI);
                 } else if (chisoBMI <= 24.9) {
                	 txtResult.setText("Ban binh thuong - BMI : "+chisoBMI);
                 } else if (chisoBMI <= 29.9) {
                	 txtResult.setText("Béo Phi do I - BMI : "+chisoBMI);
                 } else if (chisoBMI <= 34.9) {
                	 txtResult.setText("Béo Phi do II - BMI : "+chisoBMI);
                 } else {
                	 txtResult.setText("Beo Phi do III - BMI : "+chisoBMI);
                 }
            }
        };
		  btnCong.addActionListener(Bolangnghe);
		
		  fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			  System.exit(0);
			}
		});
	  fr.setVisible(true);
	}
}
		
		
		
		


