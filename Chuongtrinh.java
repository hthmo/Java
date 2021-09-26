package tongAB;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Chuongtrinh {

	public static void main(String[] args) {

			Frame fr = new Frame("Tong cua A va B");
			fr.setSize(300, 350);
			fr.setLayout(null);
			fr.setResizable(false);
			
			Label lblA = new Label("A=");
			Label lblB = new Label("B=");
			Label lblKQ = new Label("A + B =");
			
			TextField txtA = new TextField();
			TextField txtB = new TextField();
			TextField txtKQ = new TextField();

			txtKQ.setEditable(false);
			
			Button btnCong = new Button("Tong =");
			
			fr.add(lblA);  fr.add(txtA);
			fr.add(lblB);  fr.add(txtB);
			fr.add(btnCong);
			fr.add(lblKQ);  fr.add(txtKQ);
			
			
			lblA.setLocation(40, 70);
			lblA.setSize(20, 20);
			txtA.setLocation(70, 70);
			txtA.setSize(150, 30);

			lblB.setLocation(40, 130);
			lblB.setSize(20, 20);
			txtB.setLocation(70, 130);
			txtB.setSize(150, 30);

			btnCong.setLocation(110, 210);
			btnCong.setSize(40, 30);

			lblKQ.setLocation(30, 290);
			lblKQ.setSize(50, 25);
			txtKQ.setLocation(80, 290);
			txtKQ.setSize(150, 20);

			ActionListener bolangnghe = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// Lay A, B
					String strA = txtA.getText();
					String strB = txtB.getText();
					// doi sang so 
					
					int a = Integer.parseInt(strA);
					int b = Integer.parseInt(strB);
					//  tong
					int c = a+b;
					
					//Xuat ket qua 
					
					txtKQ.setText(String.valueOf(c) );
					
				}
			};
			
			btnCong.addActionListener(bolangnghe);
			
			fr.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});

			fr.setVisible(true);
		}
	}

