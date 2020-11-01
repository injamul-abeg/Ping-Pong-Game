package com.abeg.pingpong;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements ActionListener{

	private int x=10,y=10,v=2;
	private Timer timer;
	Ball ball;
	public Game() {
		//setBackground(Color.ORANGE);
		//setLayout(null);
		ball=new Ball(100, 100);
		timer=new Timer(100,this);
		timer.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//setBackground(Color.BLACK);
		//g.setColor(Color.red);
		//g.fillOval(x, y, 30, 30);
		g.drawImage(ball.getBall(), ball.getX(), ball.getY(), this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		updateBall();
		repaint();
	}

	private void updateBall() {
		ball.move();
	}


}
