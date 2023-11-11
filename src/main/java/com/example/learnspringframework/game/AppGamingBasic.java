package com.example.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.PTMan;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperGame();
		//var game = new PTMan(); //We are creating the object
		//var gameRunner = new GameRunner(game); // And we are wiring the object,
								
		
	//we are making dependency here. Game is dependency of GameRunner
		//gameRunner.run();

		
		try(var context  = new AnnotationConfigApplicationContext(GameConfiguration.class)){
			
			MarioGame marioGame =  (MarioGame) context.getBean("game");
			marioGame.up();
			//GameRunner gameRunner =  (GameRunner) context.getBean("gameRunner");
			//gameRunner.run();
			
			var console = context.getBean(GameConsole.class);
			console.up();
			
		}
	}

}
