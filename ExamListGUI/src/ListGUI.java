import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ListGUI {

	private JFrame frame;
	private JPanel panel;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListGUI window = new ListGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 502, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 443, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 466, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel item = new JPanel(); // 첫 번째 아이템 추가
		item.setBackground(Color.red); // 배경색 지정
		item.setPreferredSize(new Dimension(0, 300)); // 아이템의 너비 높이 지정
		panel.add(item);
		item.setLayout(null);
		
		// 제목 라벨 추가
		JLabel lblNewLabel = new JLabel("\uC81C\uBAA9"); 
		lblNewLabel.setBounds(22, 37, 112, 29);
		item.add(lblNewLabel);
		
		// 텍스트 필드 추가
		textField = new JTextField();
		textField.setBounds(22, 87, 216, 35);
		item.add(textField);
		textField.setColumns(10);
		
		// 내용 라벨 추가
		JLabel lblNewLabel_1 = new JLabel("\uB0B4\uC6A9");
		lblNewLabel_1.setBounds(22, 162, 112, 29);
		item.add(lblNewLabel_1);
		
		JPanel item2 = new JPanel(); // 두 번째 아이템 추가
		item2.setBackground(Color.blue); // 배경색 지정
		item2.setPreferredSize(new Dimension(0, 300)); // 아이템의 너비 높이 지정
		panel.add(item2);
		
		JPanel item3 = new JPanel(); // 두 번째 아이템 추가
		item3.setBackground(Color.green); // 배경색 지정
		item3.setPreferredSize(new Dimension(0, 300)); // 아이템의 너비 높이 지정
		panel.add(item3);
	}
	
	public void addItem() {
		
	}
}
