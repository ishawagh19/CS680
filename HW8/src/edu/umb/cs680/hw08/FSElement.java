package edu.umb.cs680.hw08;

import java.time.LocalDateTime;

public abstract class FSElement {

	private String name;
	private int size;
	private LocalDateTime creationTime;
	private Directory parent;

	public FSElement(String name, int size, LocalDateTime creationTime, Directory parent) {

		this.name = name;
		this.size = size;
		this.creationTime = creationTime;
		this.parent = parent;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public LocalDateTime getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	public Directory getParent() {
		return this.parent;
	}

	public void setParent(Directory parent) {
		this.parent = parent;
	}

	public abstract boolean isDirectory();

	public abstract boolean isFile();

	public abstract boolean isLink();

}