package trekk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PCCreator {

	JFrame PCWindow;
	Container con;
	JPanel nameTextPanel, inputTextPanel, buttonPanel;
	JLabel q;
	JTextField t;
	JButton b;
	String playerName;
	buttonHandler bHandler = new buttonHandler();
	Swing S;
	
	public class buttonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			submit();
			PCWindow.setVisible(false);
		}
	}
	
	public void submit() {
		S.player = new PC(t.getText());
		S.createGameScreen();
		
	}
	
	
	public PCCreator(Swing s) {
		
		S = s;
		
		PCWindow = new JFrame();
		PCWindow.setSize(250,140);
		
		PCWindow.getContentPane().setBackground(Color.black);
		
		nameTextPanel = new JPanel();
		nameTextPanel.setBounds(16,50,200,200);
		nameTextPanel.setBackground(Color.BLACK);
		
		inputTextPanel = new JPanel();
		inputTextPanel.setBounds(0,0,0,0);
		inputTextPanel.setBackground(Color.BLACK);
		
		buttonPanel = new JPanel();
		buttonPanel.setBounds(0,50,20,20);
		buttonPanel.setBackground(Color.BLACK);
		
		b = new JButton("Submit");
		b.setBackground(Color.BLACK);
		b.addActionListener(bHandler);
		
		q = new JLabel("What is your name?");
		q.setForeground(Color.WHITE);
		
		
		t = new JTextField(12);
		t.setBounds(100,100,100,100);
		PCWindow.setVisible(true);
		
		con = PCWindow.getContentPane();
		
		
		
		inputTextPanel.add(t);
		inputTextPanel.add(q);
		nameTextPanel.add(b);
		con.add(nameTextPanel);
		con.add(inputTextPanel);
	
		
	}
	
}
