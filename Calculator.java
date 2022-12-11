import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn4;
	double first,second,result;
	String oper,answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 351, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(10, 11, 277, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(10, 36, 315, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("\u221A");
		btnR.setEnabled(false);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnR.setBounds(10, 115, 61, 56);
		frame.getContentPane().add(btnR);
		
		JButton btninv = new JButton("1/X");
		btninv.setEnabled(false);
		btninv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btninv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btninv.setBounds(10, 172, 61, 56);
		frame.getContentPane().add(btninv);
		
		JButton btncube = new JButton("x^3");
		btncube.setEnabled(false);
		btncube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btncube.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btncube.setBounds(10, 284, 61, 56);
		frame.getContentPane().add(btncube);
		
		JButton btncar = new JButton("X^2");
		btncar.setEnabled(false);
		btncar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a =a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btncar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btncar.setBounds(10, 340, 61, 56);
		frame.getContentPane().add(btncar);
		
		JButton btnfact = new JButton("n!");
		btnfact.setEnabled(false);
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  double a =Double.parseDouble(textField.getText());
			  double fact =1 ;
			  while(a!=0) {
				  fact *=a;
				  a--;
			  }
			  textField.setText("");
			  textField.setText(textField.getText()+fact);
			
			}
		});
		btnfact.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnfact.setBounds(10, 397, 61, 56);
		frame.getContentPane().add(btnfact);
		
		JButton btnplusminus = new JButton("+/-");
		btnplusminus.setEnabled(false);
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Double.parseDouble(String.valueOf(textField.getText()));
				a*=(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnplusminus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnplusminus.setBounds(10, 458, 61, 56);
		frame.getContentPane().add(btnplusminus);
		
		JButton btnexp = new JButton("e^X");
		btnexp.setEnabled(false);
		btnexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnexp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnexp.setBounds(74, 115, 61, 56);
		frame.getContentPane().add(btnexp);
		
		JButton btnlog = new JButton("log");
		btnlog.setEnabled(false);
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnlog.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnlog.setBounds(74, 172, 61, 56);
		frame.getContentPane().add(btnlog);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn7.setBounds(74, 284, 61, 56);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn4.setBounds(74, 340, 61, 56);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(74, 397, 61, 56);
		frame.getContentPane().add(btn1);
		
		JButton btnsin = new JButton("Sin");
		btnsin.setEnabled(false);
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		
		btnsin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnsin.setBounds(137, 115, 61, 56);
		frame.getContentPane().add(btnsin);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn8.setBounds(137, 284, 61, 56);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn5.setBounds(137, 340, 61, 56);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn2.setBounds(137, 397, 61, 56);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn0.setBounds(74, 458, 124, 56);
		frame.getContentPane().add(btn0);
		
		JButton btnback = new JButton("\uF0E7");
		btnback.setEnabled(false);
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnback.setFont(new Font("Wingdings", Font.PLAIN, 21));
		btnback.setBounds(201, 228, 61, 56);
		frame.getContentPane().add(btnback);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn9.setBounds(201, 284, 61, 56);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn6.setBounds(201, 340, 61, 56);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn3.setBounds(201, 397, 61, 56);
		frame.getContentPane().add(btn3);
		
		JButton btndot = new JButton(".");
		btndot.setEnabled(false);
		btndot.setFont(new Font("Tahoma", Font.BOLD, 21));
		btndot.setBounds(201, 458, 61, 56);
		frame.getContentPane().add(btndot);
		
		JButton btnequal = new JButton("=");
		btnequal.setEnabled(false);
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			second = Double.parseDouble(textField.getText());
			if(oper == "+") {
				result = first+second;
				answer = String.format("%.2f",result);
				textField.setText(answer);
			}	else if(oper == "-") {
				result = first-second;
				answer = String.format("%.2f",result);
				textField.setText(answer);
			} else if(oper == "*") {
				result = first*second;
				answer = String.format("%.2f",result);
				textField.setText(answer);
			} else if(oper == "/") {
				result = first/second;
				answer = String.format("%.2f",result);
				textField.setText(answer);
			}	else if(oper == "%") {
				result = first % second;
				answer = String.format("%.2f",result);
				textField.setText(answer);
			}	else if(oper == "X^Y") {
				double resultt =1;
				for(int i=0;i<second;i++) {
					resultt = first*resultt;
				}				
				answer = String.format("%.2f",resultt);
				textField.setText(answer);
			}	
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnequal.setBounds(264, 458, 61, 56);
		frame.getContentPane().add(btnequal);
		
		JButton btnadd = new JButton("+");
		btnadd.setEnabled(false);
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				oper="+";
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnadd.setBounds(264, 228, 61, 56);
		frame.getContentPane().add(btnadd);
		
		JButton btnsub = new JButton("-");
		btnsub.setEnabled(false);
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				oper="-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnsub.setBounds(264, 284, 61, 56);
		frame.getContentPane().add(btnsub);
		
		JButton btnmul = new JButton("*");
		btnmul.setEnabled(false);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				oper="*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnmul.setBounds(264, 340, 61, 56);
		frame.getContentPane().add(btnmul);
		
		JButton bntdiv = new JButton("/");
		bntdiv.setEnabled(false);
		bntdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				oper="/";
			}
		});
		bntdiv.setFont(new Font("Tahoma", Font.PLAIN, 21));
		bntdiv.setBounds(264, 397, 61, 56);
		frame.getContentPane().add(bntdiv);
		
		JButton btnClair = new JButton("C");
		btnClair.setEnabled(false);
		btnClair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClair.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnClair.setBounds(137, 228, 61, 56);
		frame.getContentPane().add(btnClair);
		
		JButton btnpers = new JButton("%");
		btnpers.setEnabled(false);
		btnpers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				oper="%";
			}
		});
		btnpers.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnpers.setBounds(74, 228, 61, 56);
		frame.getContentPane().add(btnpers);
		
		JButton btnpuissancse = new JButton("X^Y");
		btnpuissancse.setEnabled(false);
		btnpuissancse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				oper="X^Y";
			}
		});
		btnpuissancse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnpuissancse.setBounds(10, 228, 61, 56);
		frame.getContentPane().add(btnpuissancse);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCos.setBounds(201, 115, 61, 56);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTan.setBounds(264, 115, 61, 56);
		frame.getContentPane().add(btnTan);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSinh.setBounds(137, 172, 61, 56);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCosh.setBounds(201, 172, 61, 56);
		frame.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTanh.setBounds(264, 172, 61, 56);
		frame.getContentPane().add(btnTanh);
		
		JRadioButton bntON = new JRadioButton("ON");
		bntON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnsin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnlog.setEnabled(true);
				btnexp.setEnabled(true);
				btnadd.setEnabled(true);
				btnsub.setEnabled(true);
				btnmul.setEnabled(true);
				bntdiv.setEnabled(true);
				btndot.setEnabled(true);
				btnClair.setEnabled(true);
				btnback.setEnabled(true);
				btnequal.setEnabled(true);
				btnplusminus.setEnabled(true);
				btnpers.setEnabled(true);
				btnfact.setEnabled(true);
				btncar.setEnabled(true);
				btncube.setEnabled(true);
				btnpuissancse.setEnabled(true);
				btnR.setEnabled(true);
				btninv.setEnabled(true);
			}
		});
		buttonGroup.add(bntON);
		bntON.setFont(new Font("Tahoma", Font.BOLD, 11));
		bntON.setBounds(10, 85, 50, 23);
		frame.getContentPane().add(bntON);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnsin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnlog.setEnabled(false);
				btnexp.setEnabled(false);
				btnadd.setEnabled(false);
				btnsub.setEnabled(false);
				btnmul.setEnabled(false);
				bntdiv.setEnabled(false);
				btndot.setEnabled(false);
				btnClair.setEnabled(false);
				btnback.setEnabled(false);
				btnequal.setEnabled(false);
				btnplusminus.setEnabled(false);
				btnpers.setEnabled(false);
				btnfact.setEnabled(false);
				btncar.setEnabled(false);
				btncube.setEnabled(false);
				btnpuissancse.setEnabled(false);
				btnR.setEnabled(false);
				btninv.setEnabled(false);
				
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnOff.setBounds(62, 85, 50, 23);
		frame.getContentPane().add(rdbtnOff);
	}
}
