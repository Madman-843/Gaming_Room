package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author jacob.griggs1@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	

	    // Private constructor to prevent instantiation
	    private void nextGameId() {}

	    // Public method to provide access to the instance
	    public static <Singleton> long getGameId() {
	        if ( nextGameId = null) {
	            nextGameId = (long) new Singleton();
	        }
	        return nextGameId;
	    }
	}

	public class GameId {
	    public static void main(String[] args) {
	        Singleton singleton1 = Singleton.getGameId();
	        Singleton singleton2 = Singleton.getGameId();

	        System.out.println(singleton1 == singleton2);  // Output: true
	    }
	}
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		private Game(String name) {
	        this.name = name;
	    }

	    public static Game getGameName(String name) {
	        Iterator<Game> iterator = games.iterator();
	        while (iterator.hasNext()) {
	            Game game = iterator.next();
	             if (game.name.equals(name)) {
	                return game;
	            }
	        }
	        Game newGame = new Game(name);
	        games.add(newGame);
	        return newGame;
	    }

	    public String getName() {
	        return name;
	    }

	    public static void main(String[] args) {
	        Game game1 = Game.getName("Game");
	        Game game2 = Game.getName("Game2");
	        Game game3 = Game.getName("Game3");

	        System.out.println(game1 == game2);  // Output: true
	        System.out.println(game1 == game3);  // Output: false
	    }
	}
		    }
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		   private String id;
		    private String name;

		    private Game(String id, String name) {
		        this.id = gameId;
		        this.name = gameName;
		    }

		    public static Game getGameId(String id, String name) {
		        Game existingGame = null;
		        Iterator<Game> iterator = games.iterator();
		        while (iterator.hasNext()) {
		            Game game = iterator.next();
		            if (gameId.equals(id)) {
		                existingGame = game;
		                break;
		            }
		        }
		        if (existingGame != null) {
		            return existingGame;
		        } else {
		            Game newGame = new Game(id, name);
		            Game.add(newGame);
		            return newGame;
		        }
		    }

		    public String getId() {
		        return id;
		    }

		    public String getName() {
		        return name;
		    }

		    public static void main(String[] args) {
		        Game game1 = Game.getName("Game");
		        Game game2 = Game.getName("Game2");
		        Game game3 = Game.getName("Game3");

		        System.out.println(game1 == game2);  // Output: true
		        System.out.println(game1 == game3);  // Output: false
		    }

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		private String name;

	    private Game(String name) {
	        this.name = name;
	    }

	        Game existingGame = null;
	        Iterator<Game> iterator =  Game.iterator()
	        while (iterator.hasNext() {
	            Game game = iterator.next();
	            if (game.name.equals(name)) {
	                existingGame = game;
	                break;

	        }
	        if (existingGame != null) {
	            return existingGame;
	        } else {
	            Game newGame = new Game(name);
	            games.add(newGame);
	            return newGame;
	        }
	    }

	    public String getName() {
	        return name;
	    }

	    public static void main(String[] args) {
	        Game game1 = Game.getName("Game");
	        Game game2 = Game.getName("Game2");
	        Game game3 = Game.getName("Game3");

	        System.out.println(game1 == game2);  // Output: true
	        System.out.println(game1 == game3);  // Output: false
	    }

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}
