package edu.umb.cs680.hw08;

import java.time.LocalDateTime;

public class Link extends FSElement {
	
     public FSElement target;
     
     public Link(String name, int size,LocalDateTime creationTime,Directory parent, FSElement target ) {
    	 super(name,size,creationTime,parent);
    	 this.target = target;
     }
     
     public boolean isLink() {
 		return true;
 	}

 	public boolean isDirectory() {
 		return false;
 	}

 	public boolean isFile() {
 		return false;
 	}
 	public FSElement getTarget() {
		return target;
	}
 	
 	
}