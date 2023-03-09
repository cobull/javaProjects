import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Simple_Calculator implements ActionListener {
	
	JTextField result;
	JTextField overview;
	String operation = "";
	boolean multipleOperation = false;
	int int1;
	int int2;
	double double1;
	double double2;
	boolean int1Set = false;
	boolean int2Set = false;
	boolean double1Set = false;
	boolean double2Set = false;
	boolean hitEqual = false;
	boolean hasDecimal = false;
	
	public void informationMessage() {
		JOptionPane.showMessageDialog(null, "This calculator only performs one operation at a time. Please press \"CLEAR\" in between operations.",
			                          "IMPORTANT INFORMATION", JOptionPane.PLAIN_MESSAGE);
	}
									  
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void clearOperation() {
		operation = "";
	}
	
	public void setMultipleOperationTrue() {
		multipleOperation = true;
	}
	
	public void setMultipleOperationFalse() {
		multipleOperation = false;
	}
	
	public void setHitEqualTrue() {
		hitEqual = true;
	}
	
	public void setHitEqualFalse() {
		hitEqual = false;
	}
	
	public String getOperation() {
		return operation;
	}
	
	public void setHasDecimalTrue() {
		hasDecimal = true;
	}
	
	public void setHasDecimalFalse() {
		hasDecimal = false;
	}
	
	public int findIndexOfOperation(String equation) {
		int index = 0;
		for (int i = index; index < equation.length(); ++index) {
			if (equation.charAt(index) == '+' || equation.charAt(index) == '-' ||
				equation.charAt(index) == 'x' || equation.charAt(index) == '/') {
				break;
			}
		}
		return index;
	}
	
	public void errorMessage() {
		JOptionPane.showMessageDialog(null, "Invalid Operation", "ERROR",
									  JOptionPane.ERROR_MESSAGE);
	}
		
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("nine")) {
			result.setText(result.getText() + "9");
		}
		if (e.getActionCommand().equals("eight")) {
			result.setText(result.getText() + "8");
		}
		if (e.getActionCommand().equals("seven")) {
			result.setText(result.getText() + "7");
		}
		if (e.getActionCommand().equals("six")) {
			result.setText(result.getText() + "6");
		}
		if (e.getActionCommand().equals("five")) {
			result.setText(result.getText() + "5");
		}
		if (e.getActionCommand().equals("four")) {
			result.setText(result.getText() + "4");
		}
		if (e.getActionCommand().equals("three")) {
			result.setText(result.getText() + "3");
		}
		if (e.getActionCommand().equals("two")) {
			result.setText(result.getText() + "2");
		}
		if (e.getActionCommand().equals("one")) {
			result.setText(result.getText() + "1");
		}
		if (e.getActionCommand().equals("zero")) {
			result.setText(result.getText() + "0");
		}
		if (e.getActionCommand().equals("decimal")) {
			if (!hasDecimal) {
				result.setText(result.getText() + ".");
				setHasDecimalTrue();
			}
		}
		if (e.getActionCommand().equals("clear")) {
			result.setText("");
			setOperation("");
			setMultipleOperationFalse();
			setHasDecimalFalse();
			setHitEqualFalse();
			int1 = 0;
			int2 = 0;
			double1 = 0;
			double2 = 0;
		}
		if (e.getActionCommand().equals("plus")) {
			try {
			if (!multipleOperation) {
				setHasDecimalFalse();
				setOperation("+");
				setMultipleOperationTrue();
				String input = result.getText();
				try {
					int1 = Integer.parseInt(input);
					int1Set = true;
				}
				catch (NumberFormatException ex) {
					double1 = Double.parseDouble(input);
					double1Set = true;
				}
				result.setText(result.getText() + " + ");
			}
			else {
				errorMessage();
				result.setText("");
				setOperation("");
				setMultipleOperationFalse();
				setHasDecimalFalse();
			}
			}
			catch (Exception ex) {
				errorMessage();
				result.setText("");
				setOperation("");
				setMultipleOperationFalse();
				setHasDecimalFalse();
			}	
		}
		if (e.getActionCommand().equals("minus")) {
			try {
			if (!multipleOperation)  {
				setHasDecimalFalse();
				setOperation("-");
				setMultipleOperationTrue();
				String input = result.getText();
				try {
					int1 = Integer.parseInt(input);
					int1Set = true;
				}
				catch (NumberFormatException ex) {
					double1 = Double.parseDouble(input);
					double1Set = true;
				}
				result.setText(result.getText() + " - ");
			}
			else {
				errorMessage();
				result.setText("");
				setOperation("");
				setMultipleOperationFalse();
				setHasDecimalFalse();
			}
			}
			catch (Exception ex) {
				errorMessage();
				result.setText("");
				setOperation("");
				setMultipleOperationFalse();
				setHasDecimalFalse();
			}
		}
		if (e.getActionCommand().equals("multiply")) {
			try {
			if (!multipleOperation) {
				setHasDecimalFalse();
				setOperation("x");
				setMultipleOperationTrue();
				String input = result.getText();
				try {
					int1 = Integer.parseInt(input);
					int1Set = true;
				}
				catch (NumberFormatException ex) {
					double1 = Double.parseDouble(input);
					double1Set = true;
				}
				result.setText(result.getText() + " x ");
			}
			else {
				errorMessage();
				result.setText("");
				setOperation("");
				setMultipleOperationFalse();
				setHasDecimalFalse();
			}
			}
			catch (Exception ex) {
				errorMessage();
				result.setText("");
				setOperation("");
				setMultipleOperationFalse();
				setHasDecimalFalse();
			}
		}
		if (e.getActionCommand().equals("divide")) {
			try {
			if (!multipleOperation) {
				setHasDecimalFalse();
				setOperation("/");
				setMultipleOperationTrue();
				String input = result.getText();
				try {
					int1 = Integer.parseInt(input);
					int1Set = true;
				}
				catch (NumberFormatException ex) {
					double1 = Double.parseDouble(input);
					double1Set = true;
				}
				result.setText(result.getText() + " / ");
			}
			else {
				errorMessage();
				result.setText("");
				setOperation("");
				setMultipleOperationFalse();
				setHasDecimalFalse();
				
			}
			}
			catch (Exception ex) {
				errorMessage();
				result.setText("");
				setOperation("");
				setMultipleOperationFalse();
				setHasDecimalFalse();
			}
		}	
		if (e.getActionCommand().equals("equal")) {
			try {
			if (!hitEqual) {
			setHitEqualTrue();
			String equation = result.getText();
			int index = findIndexOfOperation(equation);
			String input2 = equation.substring(index + 2);
			try {
				int2 = Integer.parseInt(input2);
				int2Set = true;
			}
			catch (NumberFormatException ex) {
				double2 = Double.parseDouble(input2);
				double2Set = true;
			}
			if (getOperation().equals("+")) {
				if (int1Set && int2Set) {
					result.setText(Integer.toString(int1 + int2));
				}
				else if (int1Set && double2Set) {
					result.setText(Double.toString(int1 + double2));
				}
				else if (double1Set && int2Set) {
					result.setText(Double.toString(double1 + int2));
				}
				else if (double1Set && double2Set) {
					result.setText(Double.toString(double1 + double2));
				}
			}
			else if (getOperation().equals("-")) {
				if (int1Set && int2Set) {
					result.setText(Integer.toString(int1 - int2));
				}
				else if (int1Set && double2Set) {
					result.setText(Double.toString(int1 - double2));
				}
				else if (double1Set && int2Set) {
					result.setText(Double.toString(double1 - int2));
				}
				else if (double1Set && double2Set) {
					result.setText(Double.toString(double1 - double2));
				}
			}
			else if (getOperation().equals("x")) {
				if (int1Set && int2Set) {
					result.setText(Integer.toString(int1 * int2));
				}
				else if (int1Set && double2Set) {
					result.setText(Double.toString(int1 * double2));
				}
				else if (double1Set && int2Set) {
					result.setText(Double.toString(double1 * int2));
				}
				else if (double1Set && double2Set) {
					result.setText(Double.toString(double1 * double2));
				}
			}
			else if (getOperation().equals("/")) {
				if (int1Set && int2Set) {
					result.setText(Integer.toString(int1 / int2));
				}
				else if (int1Set && double2Set) {
					result.setText(Double.toString(int1 / double2));
				}
				else if (double1Set && int2Set) {
					result.setText(Double.toString(double1 / int2));
				}
				else if (double1Set && double2Set) {
					result.setText(Double.toString(double1 / double2));
				}
			}
			}
			else {
				errorMessage();
				result.setText("");
				setOperation("");
				setMultipleOperationFalse();
				setHitEqualFalse();
				setHasDecimalFalse();
			}
			}
			catch (Exception ex) {
				errorMessage();
				result.setText("");
				setOperation("");
				setMultipleOperationFalse();
				setHitEqualFalse();
				setHasDecimalFalse();
			}	
		}
				
	}
	
	public Simple_Calculator() {
		
		informationMessage();
		JFrame frame = new JFrame("Calculator");
		frame.setSize(450, 300);
		frame.setLocationRelativeTo(null);
		
		frame.setLayout(new BorderLayout());
		
		result = new JTextField();
		result.setFont(new Font("Arial", Font.PLAIN, 30));
		result.setHorizontalAlignment(JTextField.RIGHT);
		result.setEditable(false);
		frame.add(result, BorderLayout.PAGE_START);
		
		JPanel keys = new JPanel();
		GridLayout grid = new GridLayout(4, 4, 0, 0);
		keys.setLayout(grid);
	
		JButton plus, minus, divide, multiply, one, two, three, four, five;
		JButton six, seven, eight, nine, zero, decimal, equal;
		
		plus = new JButton("+"); minus = new JButton("-");
		divide = new JButton("/"); multiply = new JButton("x");
		equal = new JButton("="); decimal = new JButton(".");
		one = new JButton("1"); two = new JButton("2");
		three = new JButton("3"); four = new JButton("4");
		five = new JButton("5"); six = new JButton("6");
		seven = new JButton("7"); eight = new JButton("8");
		nine = new JButton("9"); zero = new JButton("0");
		
		plus.setActionCommand("plus"); minus.setActionCommand("minus");
		divide.setActionCommand("divide"); multiply.setActionCommand("multiply");
		decimal.setActionCommand("decimal"); zero.setActionCommand("zero");
		one.setActionCommand("one"); two.setActionCommand("two");
		three.setActionCommand("three"); four.setActionCommand("four");
		five.setActionCommand("five"); six.setActionCommand("six");
		seven.setActionCommand("seven"); eight.setActionCommand("eight");
		nine.setActionCommand("nine"); equal.setActionCommand("equal");
		
		plus.addActionListener(this); minus.addActionListener(this);
		multiply.addActionListener(this); divide.addActionListener(this);
		one.addActionListener(this); two.addActionListener(this);
		three.addActionListener(this); four.addActionListener(this);
		five.addActionListener(this); six.addActionListener(this);
		seven.addActionListener(this); eight.addActionListener(this);
		nine.addActionListener(this); decimal.addActionListener(this);
		zero.addActionListener(this); equal.addActionListener(this);
	
		keys.add(seven); keys.add(eight); keys.add(nine); keys.add(plus);
		keys.add(four); keys.add(five); keys.add(six); keys.add(minus);
		keys.add(one); keys.add(two); keys.add(three); keys.add(multiply);
		keys.add(zero); keys.add(decimal); keys.add(equal); keys.add(divide);
		
		frame.add(keys, BorderLayout.CENTER);
		
		JButton clear = new JButton("CLEAR");
		clear.setActionCommand("clear");
		clear.addActionListener(this);
		
		frame.add(clear, BorderLayout.LINE_START);
			
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Simple_Calculator();
		
	}
}