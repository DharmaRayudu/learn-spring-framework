package com.example.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfiguration {
	
	
	@Bean
	@Primary
	public GameConsole game() {
		return new MarioGame();
	}
	
	@Bean
	//@Primary
	@Qualifier("suG")
	public GameConsole superGame() {
		return new SuperGame();
	}

	@Bean
	public GameRunner gameRunner(@Qualifier("suG") GameConsole superGame) {
		return new GameRunner(superGame);
	}
//	@Bean
//	public MarioGame game() {
//		return new MarioGame();
//	}
//	
//	@Bean
//	public SuperGame superGame() {
//		return new SuperGame();
//	}
}
