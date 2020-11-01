package com.abeg.pingpong;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Ball {
	int x,y;
	Image ball;
	public Ball(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		ball=new ImageIcon(getClass().getResource("ball.jpeg")).getImage();
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Image getBall() {
		return ball;
	}
	
	public void move() {
		x+=2;
		y+=2;
	}
}
