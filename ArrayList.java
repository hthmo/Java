import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class ArrayList {
	
	private JFrame mainFrame;
	private JTextField txtName;
	JLabel lblName;
	JButton btnAddName;
	JTextArea textAreaNList;
	JButton btnDisplay;
	JLabel lblStatus;

	ArrayList nameList;
	
	private JLabel lblToSearch;
	private JTextField txtToSearch;
	private JButton btnSearch;
	private JTextArea textAreaNameList_alt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList window = new ArrayList();
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
	public ArrayList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Bài tập ArrayList");
		mainFrame.setBounds(100, 100, 674, 475);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);

		lblName = new JLabel("Nhập Tên");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblName.setBounds(69, 26, 109, 25);
		mainFrame.getContentPane().add(lblName);

		txtName = new JTextField();
		txtName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblStatus.setText("Entering name...");
				lblStatus.setVisible(true);
			}
		});
		txtName.setBounds(151, 27, 344, 24);
		mainFrame.getContentPane().add(txtName);
		txtName.setColumns(10);

		nameList = new ArrayList();

		btnAddName = new JButton("Thêm Tên");
		btnAddName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToList(nameList);
			}

			private void addToList(ArrayList nameList) {
				// TODO Auto-generated method stub
				
			}
		});
		btnAddName.setBounds(336, 151, 95, 25);
		mainFrame.getContentPane().add(btnAddName);

		textAreaNList = new JTextArea();
		textAreaNList.setBorder(new LineBorder(new Color(0, 0, 0)));
		textAreaNList.setBounds(69, 273, 241, 143);
		mainFrame.getContentPane().add(textAreaNList);

		btnDisplay = new JButton("Danh sách");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayList(nameList);
			}
		});
		btnDisplay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDisplay.setBounds(268, 210, 109, 41);
		mainFrame.getContentPane().add(btnDisplay);

		lblStatus = new JLabel("Hiển thị trạng thái");
		lblStatus.setVisible(false);
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setForeground(Color.MAGENTA);
		lblStatus.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblStatus.setBounds(342, 52, 109, 17);
		mainFrame.getContentPane().add(lblStatus);

		lblToSearch = new JLabel("Tìm kiếm");
		lblToSearch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblToSearch.setBounds(69, 99, 85, 25);
		mainFrame.getContentPane().add(lblToSearch);

		txtToSearch = new JTextField();
		txtToSearch.setColumns(10);
		txtToSearch.setBounds(151, 100, 344, 24);
		mainFrame.getContentPane().add(txtToSearch);

		btnSearch = new JButton("Tìm kiếm");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchName(nameList);
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch.setBounds(179, 151, 98, 25);
		mainFrame.getContentPane().add(btnSearch);

		textAreaNameList_alt = new JTextArea();
		textAreaNameList_alt.setBorder(new LineBorder(new Color(0, 0, 0)));
		textAreaNameList_alt.setBounds(352, 273, 241, 143);
		mainFrame.getContentPane().add(textAreaNameList_alt);
	}

	protected void displayList(ArrayList nameList2) {
		// TODO Auto-generated method stub
		
	}

	void addToList(ArrayList arr) {
		String name = txtName.getText();

		arr.add(name);
		txtName.setText("");

		lblStatus.setText("Thêm thành công!");
		lblStatus.setVisible(true);

		textAreaNameList_alt.setText("");

		for (int i = 0; i < arr.size(); i++) {
			String element = arr.get(i);

			textAreaNameList_alt.append(element + "\n");
		}
	}

	private String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void add(String name) {
		// TODO Auto-generated method stub
		
	}

	void displayList1(ArrayList arr) {
		textAreaNList.setText("");

		// For loop iteration
		for (int i = 0; i < arr.size(); i++) {
			String element = arr.get(i);

			textAreaNList.append(element + "\n");
		}

		// Foreach
//		for (String element : arr) {
//			textAreaNameList.append(element + "\n");
//		}
	}


	void searchName(ArrayList arr) {
		String nameFound = "";
		int count = 0;

		if (count == 0)
			showDialog("Không tìm thấy tên!", "Không tìm thấy!", JOptionPane.ERROR_MESSAGE);
		else
			showDialog(nameFound, count + " name(s) found!", JOptionPane.INFORMATION_MESSAGE);
	}
	
	void showDialog(String msg, String title, int msgType) {
		JFrame frame = new JFrame("JDialog");
		JOptionPane.showMessageDialog(frame, msg, title, msgType);
	}
}
