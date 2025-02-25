package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author jacob.griggs1@snhu.edu
 */
public class SingletonTester {

	public static final char[] singletonInstance = null;

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		class Main {
		    public void main(String[] args) {
		    System.out.println(singletonInstance);
		    };
		    }
		GameService service = null; 
		
		// a simple for loop to print the games
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}
	
}
