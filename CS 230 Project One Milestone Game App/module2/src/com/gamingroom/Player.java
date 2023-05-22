package com.gamingroom;

import java.util.UUID; // imported to create uniqueness of player IDs

/**
 * A simple class to hold information about a player
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Player extends  Entity{

	public Player(String name, String id) {
		super(name, UUID.randomUUID().toString()); //  ensures uniqueness across multiple machines and promotes scalability
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
}
