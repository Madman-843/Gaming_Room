package com gamingroom;


public class Entity {
	private String name;
	private long id;
	 
	public Entity( String name, long id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public long getId() {
		return id;
	}
	public String toString() {
		return "Entity [id = " + id + ", name =" + name " ]
	}
	}