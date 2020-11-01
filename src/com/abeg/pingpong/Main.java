package com.abeg.pingpong;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class Main extends JFrame {

	private static JPanel contentPane;
	static CardLayout layout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		layout=new CardLayout();
		contentPane.setLayout(layout);
		
		Menu panel = new Menu();
		contentPane.add(panel, "menuPanel");
		
		Game panel_1 = new Game();
		contentPane.add(panel_1, "gamePanel");
		
		layout.show(contentPane, "menuPanel");
	}
	
	public static void showPanel(String panel) {
		layout.show(contentPane, panel);
	}
}
