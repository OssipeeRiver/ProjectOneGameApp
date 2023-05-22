package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator; // import iterator
import java.util.UUID; // imported UUID to correct errors generated after implementing it in Player class

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static String nextGameId;

	// FIXME: Add missing pieces to turn this class a singleton

	private static GameService gameService = new GameService();

	// make constructor private so that the class cannot be instantiated
	private GameService(){}

	// Get the only object available
	public static GameService getInstance(){
		if (gameService == null) {
			gameService = new GameService();
		}
		return gameService;
	}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {
		// use iterator to find existing game with the same name
		Iterator<Game> iterator = games.iterator();
		while (iterator.hasNext()) {
			Game existingGame = iterator.next();
			if (existingGame.getName().equals(name)) {
				return existingGame;
			}
		}

		// if not found, create a new game
		nextGameId = UUID.randomUUID().toString(); // generates random ID
		Game newGame = new Game(nextGameId, name);
		games.add(newGame);

		return newGame;
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

		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		Iterator<Game> iterator = games.iterator();
		while (iterator.hasNext()) {
			Game existingGame = iterator.next();
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

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable
		Iterator<Game> iterator = games.iterator();
		while (iterator.hasNext()) {
			Game existingGame = iterator.next();
			if (existingGame.getName().equals(name)) {
				// If a game with the same name is found, assign the instance to the local variable
				return existingGame;
			}
		}

		return null;
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
