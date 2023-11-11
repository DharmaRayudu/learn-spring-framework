package com.example.learnspringframework.game;

public class GameRunner {
	
	private GameConsole game;
	public GameRunner(GameConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running MarioGame "+ game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
