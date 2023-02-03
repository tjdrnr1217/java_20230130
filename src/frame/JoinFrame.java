package frame;
//2023.02.03(6)
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Checkbox;
import java.awt.Button;
import java.awt.Font;

// 1.extends JDialog 상속
public class JoinFrame extends JDialog{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	public JoinFrame() {
		setTitle("학생용");
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(26, 87, 225, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPw = new JLabel("비밀번호");
		lblPw.setHorizontalAlignment(SwingConstants.LEFT);
		lblPw.setFont(new Font("함초롬바탕", Font.BOLD, 12));
		lblPw.setBounds(26, 118, 70, 15);
		getContentPane().add(lblPw);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(26, 135, 225, 21);
		getContentPane().add(textField_1);
		
		JLabel lblId = new JLabel("아이디");
		lblId.setHorizontalAlignment(SwingConstants.LEFT);
		lblId.setFont(new Font("함초롬바탕", Font.BOLD, 12));
		lblId.setBounds(26, 65, 51, 15);
		getContentPane().add(lblId);
		
		JLabel lblNewLabel = new JLabel("회원 등록");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 27));		
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(74, 20, 128, 29);
		getContentPane().add(lblNewLabel);
		
		Button button = new Button("완료");
		button.setBackground(new Color(255, 255, 255));
		button.setFont(new Font("함초롬바탕", Font.BOLD, 12));
		button.setBounds(172, 366, 102, 35);
		getContentPane().add(button);
		
		JLabel lblPw_1 = new JLabel("이름");
		lblPw_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPw_1.setFont(new Font("함초롬바탕", Font.BOLD, 12));
		lblPw_1.setBounds(26, 164, 59, 15);
		getContentPane().add(lblPw_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(26, 181, 225, 21);
		getContentPane().add(textField_2);
		
		JLabel lblPw_1_1 = new JLabel("이메일");
		lblPw_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPw_1_1.setFont(new Font("함초롬바탕", Font.BOLD, 12));
		lblPw_1_1.setBounds(26, 212, 70, 15);
		getContentPane().add(lblPw_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(26, 229, 225, 21);
		getContentPane().add(textField_3);
		
		JLabel lblPw_1_1_1 = new JLabel("주민번호");
		lblPw_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPw_1_1_1.setFont(new Font("함초롬바탕", Font.BOLD, 12));
		lblPw_1_1_1.setBounds(26, 258, 70, 15);
		getContentPane().add(lblPw_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(26, 275, 225, 21);
		getContentPane().add(textField_4);
		
		JLabel lblPw_1_1_1_1 = new JLabel("전화번호");
		lblPw_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPw_1_1_1_1.setFont(new Font("함초롬바탕", Font.BOLD, 12));
		lblPw_1_1_1_1.setBounds(26, 306, 70, 15);
		getContentPane().add(lblPw_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(26, 323, 225, 21);
		getContentPane().add(textField_5);
		
		// 3줄 추가하기
		this.setModal(true);
		this.setSize(300, 450);
		this.setVisible(true);
	}
}
