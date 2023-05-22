package com.gamingroom;

public class Entity {
    protected String id;
    protected String name;

    // protected Entity(String name, String id){}

    public Entity(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
