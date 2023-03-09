import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Simple_LockScreen implements ActionListener {
	
	int password = 123;
	String userEnteredCode = "";
	JFrame frame;
	int numbersEntered = 0;
	
	public void checkPassword() {
		int userCode = Integer.parseInt(userEnteredCode);
		if (userCode == password) {
			frame.dispose();
		}
		else {
			numbersEntered = 0;
			userEnteredCode = "";
			frame.getContentPane().setBackground(Color.RED);
			frame.repaint();
		}
	}
		
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("1")) {
			userEnteredCode = userEnteredCode.concat("1");
			++numbersEntered;
			if (numbersEntered == 3) {
				checkPassword();
			}
		}
		if (e.getActionCommand().equals("2")) {
			userEnteredCode = userEnteredCode.concat("2");
			++numbersEntered;
			if (numbersEntered == 3) {
				checkPassword();
			}
		}
		if (e.getActionCommand().equals("3")) {
			userEnteredCode = userEnteredCode.concat("3");
			++numbersEntered;
			if (numbersEntered == 3) {
				checkPassword();
			}
		}
		if (e.getActionCommand().equals("4")) {
			userEnteredCode = userEnteredCode.concat("4");
			++numbersEntered;
			if (numbersEntered == 3) {
				checkPassword();
			}
		}
		if (e.getActionCommand().equals("5")) {
			userEnteredCode = userEnteredCode.concat("5");	
			++numbersEntered;
			if (numbersEntered == 3) {
				checkPassword();
			}
		}
		if (e.getActionCommand().equals("6")) {
			userEnteredCode = userEnteredCode.concat("6");
			++numbersEntered;
			if (numbersEntered == 3) {
				checkPassword();
			}
		}
		if (e.getActionCommand().equals("7")) {
			userEnteredCode = userEnteredCode.concat("7");
			++numbersEntered;
			if (numbersEntered == 3) {
				checkPassword();
			}
		}
		if (e.getActionCommand().equals("8")) {
			userEnteredCode = userEnteredCode.concat("8");
			++numbersEntered;
			if (numbersEntered == 3) {
				checkPassword();
			}
		}
		if (e.getActionCommand().equals("9")) {
			userEnteredCode = userEnteredCode.concat("9");
			++numbersEntered;
			if (numbersEntered == 3) {
				checkPassword();
			}
		}
		if (e.getActionCommand().equals("0")) {
			userEnteredCode = userEnteredCode.concat("0");	
			++numbersEntered;
			if (numbersEntered == 3) {
				checkPassword();
			}
		}
	}
	
	public Simple_LockScreen() {
		
		frame = new JFrame("LockScreen");
		frame.setLayout(new GridLayout(4, 4));
		frame.setSize(250, 500);
		frame.setLocationRelativeTo(null);
		
		
		JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b11, b12;
		
		b1 = new JButton("1"); b2 = new JButton("2"); b3 = new JButton("3");
		b4 = new JButton("4"); b5 = new JButton("5"); b6 = new JButton("6");
		b7 = new JButton("7"); b8 = new JButton("8"); b9 = new JButton("9");
		b0 = new JButton("0"); b11 = new JButton(""); b12 = new JButton("");
		
		b1.setActionCommand("1"); b2.setActionCommand("2"); b3.setActionCommand("3");
		b4.setActionCommand("4"); b5.setActionCommand("5"); b6.setActionCommand("6");
		b7.setActionCommand("7"); b8.setActionCommand("8"); b9.setActionCommand("9");
		b0.setActionCommand("0");
		
		b1.addActionListener(this); b2.addActionListener(this);
		b3.addActionListener(this); b4.addActionListener(this);
		b5.addActionListener(this); b6.addActionListener(this);
		b7.addActionListener(this); b8.addActionListener(this);
		b9.addActionListener(this); b0.addActionListener(this);
		
		b11.setBorder(BorderFactory.createEmptyBorder());
		b12.setBorder(BorderFactory.createEmptyBorder());
		
		frame.add(b1); frame.add(b2); frame.add(b3); frame.add(b4); frame.add(b5);
		frame.add(b6); frame.add(b7); frame.add(b8); frame.add(b9); frame.add(b11);
		frame.add(b0); frame.add(b12);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new Simple_LockScreen();
		
	}
}

