package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Directory extends FSElement{

	private List<FSElement> children = new LinkedList<FSElement>();
	private List<Directory> myDirectory = new LinkedList<Directory>();
	private List<File> files = new LinkedList<File>();
	
	
	public Directory( String name, int size, LocalDateTime createdTime,Directory parent) {
		super( name, size, createdTime,parent);
		if (parent != null)
			parent.appendChild(this);
	}
	
	public boolean isDirectory() {
		return true;
	}
	
	public  boolean isFile() {
		return false;
	}
	
	public void appendChild(FSElement child) {
		this.children.add(child);
		child.setParent(this);
	}
	
	public List<FSElement> getChildren() {
		return children;
	}
	
	public int countChildren() {
		return getChildren().size();
	}
	
	public List<Directory> getSubDirectories() {
		for (FSElement e : getChildren()) {
			if (e.isDirectory())
				myDirectory.add((Directory) e);
		}
		return myDirectory;
	}
	
	public List<File> getFiles() {
		for (FSElement e : children) {
			if (e.isFile()) {
				files.add((File) e);
			}
		}
		return files;
	}
	
	public int getTotalSize() {
		int size = 0;
		for (FSElement e : getChildren()) {
			if (e.isDirectory())
				size += ((Directory) e).getTotalSize();
			else
				size += e.getSize();
		}
		return size;
	}
	
	
	
	
	
}