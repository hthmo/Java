import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class GUISanPham {

	private JFrame mainFrame;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtDonGia;
	JLabel lblId;
	JLabel lblName;
	JLabel lblDonGia;
	JButton btnThem;
	JButton btnTim;
	JButton btnXoa;
	JButton btnSua;
	JTextArea textAreaProdList;
	
	List<SanPham> prodList;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUISanPham window = new GUISanPham();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUISanPham() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setTitle("GUI Product");
		mainFrame.setBounds(100, 100, 698, 450);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		lblId = new JLabel("Mã Sản Phẩm");
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblId.setBounds(35, 38, 91, 25);
		mainFrame.getContentPane().add(lblId);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtId.setBounds(147, 36, 281, 25);
		mainFrame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtName.setColumns(10);
		txtName.setBounds(147, 72, 281, 25);
		mainFrame.getContentPane().add(txtName);
		
		lblName = new JLabel("Tên Sản Phẩm");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblName.setBounds(35, 74, 102, 25);
		mainFrame.getContentPane().add(lblName);
		
		txtDonGia = new JTextField();
		txtDonGia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDonGia.setColumns(10);
		txtDonGia.setBounds(147, 108, 281, 25);
		mainFrame.getContentPane().add(txtDonGia);
		
		lblDonGia = new JLabel("Đơn giá ");
		lblDonGia.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDonGia.setBounds(45, 110, 102, 25);
		mainFrame.getContentPane().add(lblDonGia);
		
		prodList = new ArrayList<SanPham>();
		
		btnThem = new JButton("Thêm Sản Phẩm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThemSanPham(prodList);
			}

			private void ThemSanPham(List<SanPham> prodList) {
				// TODO Auto-generated method stub	
			}
		});
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnThem.setBounds(453, 36, 120, 25);
		mainFrame.getContentPane().add(btnThem);
		
		btnTim = new JButton("Tìm Sản Phẩm");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TimKiem(prodList);
			}
		});
		btnTim.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnTim.setBounds(453, 72, 120, 25);
		mainFrame.getContentPane().add(btnTim);
		
		btnXoa = new JButton("Xóa sản phẩm");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XoaSP(prodList);
			}
		});
		btnXoa.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnXoa.setBounds(453, 108, 120, 25);
		mainFrame.getContentPane().add(btnXoa);
		
		btnSua = new JButton("Sửa");
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SuaSP(prodList);
			}
		});
		btnSua.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSua.setBounds(453, 154, 120, 25);
		mainFrame.getContentPane().add(btnSua);
		
		textAreaProdList = new JTextArea();
		textAreaProdList.setBorder(new LineBorder(new Color(0, 0, 0)));
		textAreaProdList.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textAreaProdList.setBounds(35, 154, 405, 208);
		textAreaProdList.setText("Mã --- Tên --- Đơn giá");
		
		mainFrame.getContentPane().add(textAreaProdList);
	}

	protected void SuaSP(List<SanPham> prodList2) {
		// TODO Auto-generated method stub
		
	}

	protected void XoaSP(List<SanPham> prodList2) {
		// TODO Auto-generated method stub
		
	}

	protected void TimKiem(List<SanPham> prodList2) {
		// TODO Auto-generated method stub
		
	}

	protected void addToList(List<SanPham> arr) {
		String MaSP = txtId.getText();
		String TenSP = txtName.getText();
		String DonGia_text = txtDonGia.getText();
		
		int DonGia;
		
		try {
			DonGia = Integer.parseInt(DonGia_text);
		} catch (Exception ex) {
			DonGia = 0;
			txtDonGia.setText("");
		}
		
		String MaSP1 = null;
		int DonGia1 = 0;
		String TenSP1 = null;
		if(!(KiemTraMa(MaSP1)) || (MaSP1.equals("")) || (MaSP1.contains(" ")))
			showDialog("Invalid product ID!", "Warning!", JOptionPane.ERROR_MESSAGE);
		else
			arr.add(new SanPham(MaSP1, TenSP1, DonGia1));
		
		DanhSachSP1(arr);
		
		txtId.setText("");
		txtName.setText("");
		txtDonGia.setText("");
	}

	private void DanhSachSP1(List<SanPham> arr) {
		// TODO Auto-generated method stub
		
	}

	protected void TimSP(List<SanPham> arr) {
		String toSearch = txtId.getText();

		for (SanPham element : arr) {
			if (element.getMaSP().contains(toSearch)) {
				showDialog("Mã Sản Phẩm: " + element.getMaSP() + " - Tên Sản Phẩm: " + element.getTenSP() + " - Đơn giá: " + element.getDonGia(), "Sản phẩm tìm thấy!", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}
	}

	protected void XoaSP1(List<SanPham> arr) {
		String toDelete = txtId.getText();

		for (SanPham element : arr) {
			if (element.getMaSP().equals(toDelete)) {
				arr.remove(arr.indexOf(element));
				break;
			}
		}
		
		DanhSachSP1(arr);
	}
	
	protected void SuaSP1(List<SanPham> arr) {
		String toEdit = txtId.getText();

		for (SanPham element : arr) {
			if (element.getMaSP().equals(toEdit)) {
				arr.remove(arr.indexOf(element));
				addToList(arr);
				break;
			}
		}
		
		DanhSachSP1(arr);
	}

	private void DanhSachSP(List<SanPham> arr) {
		textAreaProdList.setText("Mã --- Tên --- Đơn Giá\n");

		for (SanPham element : arr) {
			textAreaProdList.append(element.getMaSP() + " --- " + element.getTenSP() + " --- " + element.getDonGia() + "\n");
		}
	}
	
	private boolean KiemTraMa(String MaSP) {
		for (SanPham element : prodList) {
			if(element.getMaSP().equals(MaSP))
				return false;
		}		
		return true;
	}
	
	private void showDialog(String msg, String title, int msgType) {
		JFrame frame = new JFrame("JDialog");
		JOptionPane.showMessageDialog(frame, msg, title, msgType);
	}
}
