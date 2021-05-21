package edu.umb.cs680.hw08;

import java.util.LinkedList;
import java.util.List;



public class FileSystem {
private List<Directory> rootDirs = new LinkedList<Directory>();
	
	private static FileSystem file_System = null;
	private FileSystem() {
		
	}
	
	public static FileSystem getFileSystem() {
		if(file_System == null) {
			file_System = new FileSystem();
		}
		
		return file_System;
	}
	
	public List<Directory> getRootDirs(){
		return  this.rootDirs;
	}
	
	public void addRootDirs(Directory dirs) {
		 rootDirs.add(dirs);
		}
	
}