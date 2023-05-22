package com.gamingroom;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {

	// declare teams attribute as List
	private final List<Team> teams;

	// removed declarations of id and name because Game extends Entity

	// removed the default constructor to prevent creating empty instances.


	// Constructor with an identifier and name
	public Game(String name, String id) {
		super(name, id);
		teams = new ArrayList<>();
	}

	// add and remove element from the teams list
	public Team addTeam(String name) {
		// Create an iterator over the team list
		Iterator<Team> iterator = teams.iterator();

		// Iterate over the teams
		while (iterator.hasNext()) {
			Team team = iterator.next();
			// Check if a team with the same name already exists
			if (team.getName().equals(name)) {
				// If a player with the same name already exists, return that player
				return team;
			}
		}

		// If no player with the same name exists, create a new team and add to the list
		Team newTeam = new Team(name, id);
		teams.add(newTeam);
		return newTeam;
	}

	// getId and getName are no longer needed in this class

	@Override
	public String toString() {

		return "Game [id= " + getId() + ", name= " + getName() + "]";
	}


}
