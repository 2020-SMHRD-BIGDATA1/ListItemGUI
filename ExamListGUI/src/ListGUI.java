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
		
		JPanel item = new JPanel(); // ù ��° ������ �߰�
		item.setBackground(Color.red); // ���� ����
		item.setPreferredSize(new Dimension(0, 300)); // �������� �ʺ� ���� ����
		panel.add(item);
		item.setLayout(null);
		
		// ���� �� �߰�
		JLabel lblNewLabel = new JLabel("\uC81C\uBAA9"); 
		lblNewLabel.setBounds(22, 37, 112, 29);
		item.add(lblNewLabel);
		
		// �ؽ�Ʈ �ʵ� �߰�
		textField = new JTextField();
		textField.setBounds(22, 87, 216, 35);
		item.add(textField);
		textField.setColumns(10);
		
		// ���� �� �߰�
		JLabel lblNewLabel_1 = new JLabel("\uB0B4\uC6A9");
		lblNewLabel_1.setBounds(22, 162, 112, 29);
		item.add(lblNewLabel_1);
		
		JPanel item2 = new JPanel(); // �� ��° ������ �߰�
		item2.setBackground(Color.blue); // ���� ����
		item2.setPreferredSize(new Dimension(0, 300)); // �������� �ʺ� ���� ����
		panel.add(item2);
		
		JPanel item3 = new JPanel(); // �� ��° ������ �߰�
		item3.setBackground(Color.green); // ���� ����
		item3.setPreferredSize(new Dimension(0, 300)); // �������� �ʺ� ���� ����
		panel.add(item3);
	}
	
	public void addItem() {
		
	}
}
