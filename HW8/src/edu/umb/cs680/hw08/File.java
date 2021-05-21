package edu.umb.cs680.hw08;

import java.time.LocalDateTime;



public class File extends FSElement {
	public File( String name, int size, LocalDateTime createdTime,Directory parent) {
		super( name, size, createdTime,parent);
		parent.appendChild(this);
	}

	

	public boolean isDirectory() {
		return false;
	}
	
	public boolean isFile() {
		return true;
	}
	
	public boolean isLink() {
		return false;
	}
	
}