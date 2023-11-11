package com.example.learnspringframework.game;

public class MarioGame implements GameConsole{
	
	public void up() {
		System.out.println("Mario Jump");
	}
	
	public void down() {
		System.out.println("Enter into hole");
	}
	
	public void left() {
		System.out.println("Move left");
	}
	
	public void right() {
		System.out.println("Move Right");
	}

}
