package com.gamingroom;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{

	private final List<Player> players;


	// removed declarations of id and name because Game extends Entity

	// Constructor with an identifier and name
	public Team(String name, String id) {
		super(name, id);
		players = new ArrayList<>();

	}

	public Player addPlayer(String name){
		// Create an iterator over the players list
		Iterator<Player> iterator = players.iterator();

		// Iterate over the players
		while (iterator.hasNext()) {
			Player player = iterator.next();
			// Check if a player with the same name already exists
			if (player.getName().equals(name)) {
				// If a player with the same name already exists, return that player
				return player;
			}
		}

		// If no player with the same name exists, create a new player and add to the list
		Player player = new Player(name, id);
		players.add(player);
		return player;
	}



	@Override
	public String toString() {
		return "Team [id=" + getId() + ", name=" + getName() + "]";
	}
}
