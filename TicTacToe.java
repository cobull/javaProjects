import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class TicTacToe {
	
	String playerChar;
	String computerChar;
	JButton b1; JButton b2; JButton b3; JButton b4; JButton b5; JButton b6;
	JButton b7; JButton b8; JButton b9;
	
	public int getPlayerChar() {
		String[] options = {"O", "X"};
		
		int answer = (JOptionPane.showOptionDialog(null, 
			"What character would you like to be?",
			"",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.INFORMATION_MESSAGE,
			null,
			options,
			0));
		
		return  answer;
	}
	
	public void setPlayerChar(int answer) {
		if (answer == 1) {
			playerChar = "X";
			computerChar = "O";
		}
		else {
			playerChar = "O";
			computerChar = "X";
		}
	}
	
	public void computerMove() {
		Random r = new Random();
		boolean moveDone = false;
		int num;
		
		while (!moveDone) {
			num = r.nextInt(9) + 1;
			if (num == 1) {
				if (b1.getText().equals("")) {
					b1.setText(computerChar);
					moveDone = true;
				}
			}
			else if (num == 2) {
				if (b2.getText().equals("")) {
					b2.setText(computerChar);
					moveDone = true;
				}
			}
			else if (num == 3) {
				if (b3.getText().equals("")) {
					b3.setText(computerChar);
					moveDone = true;
				}
			}
			else if (num == 4) {
				if (b4.getText().equals("")) {
					b4.setText(computerChar);
					moveDone = true;
				}
			}
			else if (num == 5) {
				if (b5.getText().equals("")) {
					b5.setText(computerChar);
					moveDone = true;
				}
			}
			else if (num == 6) {
				if (b6.getText().equals("")) {
					b6.setText(computerChar);
					moveDone = true;
				}
			}
			else if (num == 7) {
				if (b7.getText().equals("")) {
					b7.setText(computerChar);
					moveDone = true;
				}
			}
			else if (num == 8) {
				if (b8.getText().equals("")) {
					b8.setText(computerChar);
					moveDone = true;
				}
			}
			else if (num == 9) {
				if (b9.getText().equals("")) {
					b9.setText(computerChar);
					moveDone = true;
				}
			}
		}
	}
	
	public boolean checkForMove() {
		boolean moveAvailable = false;
		if (b1.getText().equals("")) {
			moveAvailable = true;
		}
		else if (b2.getText().equals("")) {
			moveAvailable = true;
		}
		else if (b3.getText().equals("")) {
			moveAvailable = true;
		}
		else if (b4.getText().equals("")) {
			moveAvailable = true;
		}
		else if (b5.getText().equals("")) {
			moveAvailable = true;
		}
		else if (b6.getText().equals("")) {
			moveAvailable = true;
		}
		else if (b7.getText().equals("")) {
			moveAvailable = true;
		}
		else if (b8.getText().equals("")) {
			moveAvailable = true;
		}
		else if (b9.getText().equals("")) {
			moveAvailable = true;
		}
		
		return moveAvailable;
	}
	
	public boolean checkForPlayerWin() {
		boolean win = false;
		
		if (b1.getText().equals(playerChar) &&
			b4.getText().equals(playerChar) &&
			b7.getText().equals(playerChar)) {
				win = true;
		}
		else if (b2.getText().equals(playerChar) &&
				 b5.getText().equals(playerChar) &&
				 b8.getText().equals(playerChar)) {
				 	win = true;
		}
		else if (b3.getText().equals(playerChar) &&
				 b6.getText().equals(playerChar) &&
				 b9.getText().equals(playerChar)) {
				 	win = true;
		}
		else if (b1.getText().equals(playerChar) &&
				 b2.getText().equals(playerChar) &&
				 b3.getText().equals(playerChar)) {
				 	win = true;
		}
		else if (b4.getText().equals(playerChar) &&
				 b5.getText().equals(playerChar) &&
				 b6.getText().equals(playerChar)) {
				 	win = true;
		}
		else if (b7.getText().equals(playerChar) &&
				 b8.getText().equals(playerChar) &&
				 b9.getText().equals(playerChar)) {
				 	win = true;
		}
		else if (b1.getText().equals(playerChar) &&
				 b5.getText().equals(playerChar) &&
				 b9.getText().equals(playerChar)) {
				 	win = true;
		}
		else if (b3.getText().equals(playerChar) &&
				 b5.getText().equals(playerChar) &&
				 b7.getText().equals(playerChar)) {
				 	win = true;
		}
		else if (b2.getText().equals(playerChar) &&
				 b5.getText().equals(playerChar) &&
				 b8.getText().equals(playerChar)) {
				 	win = true;
		}
		
		return win;
	}
	
	public boolean checkForComputerWin() {
		boolean win = false;	
		
		if (b1.getText().equals(computerChar) &&
			b4.getText().equals(computerChar) &&
			b7.getText().equals(computerChar)) {
				win = true;
		}
		else if (b2.getText().equals(computerChar) &&
				 b5.getText().equals(computerChar) &&
				 b8.getText().equals(computerChar)) {
				 	win = true;
		}
		else if (b3.getText().equals(computerChar) &&
				 b6.getText().equals(computerChar) &&
				 b9.getText().equals(computerChar)) {
				 	win = true;
		}
		else if (b1.getText().equals(computerChar) &&
				 b2.getText().equals(computerChar) &&
				 b3.getText().equals(computerChar)) {
				 	win = true;
		}
		else if (b4.getText().equals(computerChar) &&
				 b5.getText().equals(computerChar) &&
				 b6.getText().equals(computerChar)) {
				 	win = true;
		}
		else if (b7.getText().equals(computerChar) &&
				 b8.getText().equals(computerChar) &&
				 b9.getText().equals(computerChar)) {
				 	win = true;
		}
		else if (b1.getText().equals(computerChar) &&
				 b5.getText().equals(computerChar) &&
				 b9.getText().equals(computerChar)) {
				 	win = true;
		}
		else if (b3.getText().equals(computerChar) &&
				 b5.getText().equals(computerChar) &&
				 b7.getText().equals(computerChar)) {
				 	win = true;
		}
		else if (b2.getText().equals(computerChar) &&
				 b5.getText().equals(computerChar) &&
				 b8.getText().equals(computerChar)) {
				 	win = true;
		}
		
		return win;
	}
	
	public int playerWin() {
		int answer;
		
		String[] options = {"Quit", "Start Over"};
		
		answer = (JOptionPane.showOptionDialog(null, 
			"Congrats, you won! What would you like to do?",
			"",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.INFORMATION_MESSAGE,
			null,
			options,
			0));
		
		return  answer;
	}
		
	public int playerLose() {
		int answer;
		
		String[] options = {"Quit", "Start Over"};
		
		answer = (JOptionPane.showOptionDialog(null, 
			"Sorry, you lost. What would you like to do?",
			"",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.INFORMATION_MESSAGE,				
			null,
			options,
			0));
		
		return  answer;
	}
				
	public TicTacToe () {
		
		setPlayerChar(getPlayerChar());
		
		JFrame frame = new JFrame("Tic Tac Toe");
		
		frame.setSize(500, 500);
		
		frame.setLayout(new GridLayout(3, 3, 0, 0));
		
		b1 = new JButton("");
		b2 = new JButton("");
		b3 = new JButton("");
		b4 = new JButton("");
		b5 = new JButton("");
		b6 = new JButton("");
		b7 = new JButton("");
		b8 = new JButton("");
		b9 = new JButton("");
		
		b1.setFont(new Font(null, Font.PLAIN, 40));
		b2.setFont(new Font(null, Font.PLAIN, 40));
		b3.setFont(new Font(null, Font.PLAIN, 40));
		b4.setFont(new Font(null, Font.PLAIN, 40));
		b5.setFont(new Font(null, Font.PLAIN, 40));
		b6.setFont(new Font(null, Font.PLAIN, 40));
		b7.setFont(new Font(null, Font.PLAIN, 40));
		b8.setFont(new Font(null, Font.PLAIN, 40));
		b9.setFont(new Font(null, Font.PLAIN, 40));
		
		frame.add(b1); frame.add(b2); frame.add(b3); frame.add(b4); 
		frame.add(b5); frame.add(b6); frame.add(b7); frame.add(b8); 
		frame.add(b9);
		
		b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (b1.getText().equals("")) {
						b1.setText(playerChar);
						if(checkForPlayerWin()) {
							int redo = playerWin();
							if (redo == 1) {
								new TicTacToe();
							}
							else {
								System.exit(0);
							}
						}
						if (!checkForPlayerWin() && checkForMove()) {
							computerMove();
							if(checkForComputerWin()) {
								int redo = playerLose();
								if (redo == 1) {
								new TicTacToe();
								}
								else {
								System.exit(0);
								}
							}
						}
					}
				}
		});
		b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (b2.getText().equals("")) {
						b2.setText(playerChar);
						if(checkForPlayerWin()) {
							int redo = playerWin();
							if (redo == 1) {
								new TicTacToe();
							}
							else {
								System.exit(0);
							}
						}
						if (!checkForPlayerWin() && checkForMove()) {
							computerMove();
							if(checkForComputerWin()) {
								int redo = playerLose();
								if (redo == 1) {
								new TicTacToe();
								}
								else {
								System.exit(0);
								}
							}
						}
					}
				}
		});
		b3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (b3.getText().equals("")) {
						b3.setText(playerChar);
						if(checkForPlayerWin()) {
							int redo = playerWin();
							if (redo == 1) {
								new TicTacToe();
							}
							else {
								System.exit(0);
							}
						}
						if (!checkForPlayerWin() && checkForMove()) {
							computerMove();
							if(checkForComputerWin()) {
								int redo = playerLose();
								if (redo == 1) {
								new TicTacToe();
								}
								else {
								System.exit(0);
								}
							}
						}
					}
				}
		}); 
		b4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (b4.getText().equals("")) {
						b4.setText(playerChar);
						if(checkForPlayerWin()) {
							int redo = playerWin();
							if (redo == 1) {
								new TicTacToe();
							}
							else {
								System.exit(0);
							}
						}
						if (!checkForPlayerWin() && checkForMove()) {
							computerMove();
							if(checkForComputerWin()) {
								int redo = playerLose();
								if (redo == 1) {
								new TicTacToe();
								}
								else {
								System.exit(0);
								}
							}
						}
					}
				}
		});
		b5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (b5.getText().equals("")) {
						b5.setText(playerChar);
						if(checkForPlayerWin()) {
							int redo = playerWin();
							if (redo == 1) {
								new TicTacToe();
							}
							else {
								System.exit(0);
							}
						}
						if (!checkForPlayerWin() && checkForMove()) {
							computerMove();
							if(checkForComputerWin()) {
								int redo = playerLose();
								if (redo == 1) {
								new TicTacToe();
								}
								else {
								System.exit(0);
								}
							}
						}
					}
				}
		});
		b6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (b6.getText().equals("")) {
						b6.setText(playerChar);
						if(checkForPlayerWin()) {
							int redo = playerWin();
							if (redo == 1) {
								new TicTacToe();
							}
							else {
								System.exit(0);
							}
						}
						if (!checkForPlayerWin() && checkForMove()) {
							computerMove();
							if(checkForComputerWin()) {
								int redo = playerLose();
								if (redo == 1) {
								new TicTacToe();
								}
								else {
								System.exit(0);
								}
							}
						}
					}
				}
		});
		b7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (b7.getText().equals("")) {
						b7.setText(playerChar);
						if(checkForPlayerWin()) {
							int redo = playerWin();
							if (redo == 1) {
								new TicTacToe();
							}
							else {
								System.exit(0);
							}
						}
						if (!checkForPlayerWin() && checkForMove()) {
							computerMove();
							if(checkForComputerWin()) {
								int redo = playerLose();
								if (redo == 1) {
								new TicTacToe();
								}
								else {
								System.exit(0);
								}
							}
						}
					}
				}
		});
		b8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (b8.getText().equals("")) {
						b8.setText(playerChar);
						if(checkForPlayerWin()) {
							int redo = playerWin();
							if (redo == 1) {
								new TicTacToe();
							}
							else {
								System.exit(0);
							}
						}
						if (!checkForPlayerWin() && checkForMove()) {
							computerMove();
							if(checkForComputerWin()) {
								int redo = playerLose();
								if (redo == 1) {
								new TicTacToe();
								}
								else {
								System.exit(0);
								}
							}
						}
					}
				}
		});
		b9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (b9.getText().equals("")) {
						b9.setText(playerChar);
						if(checkForPlayerWin()) {
							int redo = playerWin();
							if (redo == 1) {
								new TicTacToe();
							}
							else {
								System.exit(0);
							}
						}
						if (!checkForPlayerWin() && checkForMove()) {
							computerMove();
							if(checkForComputerWin()) {
								int redo = playerLose();
								if (redo == 1) {
								new TicTacToe();
								}
								else {
								System.exit(0);
								}
							}
						}
					}
				}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
		
	
	public static void main(String[] args) {
		
		new TicTacToe();
		
	}
}
		
		
		