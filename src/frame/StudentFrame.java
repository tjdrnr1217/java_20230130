package frame;
//2023.02.01(4)
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
//StudentFrame 마우스 오른쪽 -> 3번째 -> 4번째

public class StudentFrame extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public StudentFrame() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("학번");
		lblNewLabel.setBounds(26, 22, 57, 15);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(95, 19, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(26, 59, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 56, 116, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("학년");
		lblNewLabel_2.setBounds(26, 95, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 92, 116, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("등록하기");
		btnNewButton.setBounds(26, 150, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소하기");
		btnNewButton_1.setBounds(151, 150, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		this.setSize(500,400);
		this.setVisible(true);
		
		//Main6을 만들어서 객체생성
		//StudentFrame obj = new StudentFrame();
	}
}
