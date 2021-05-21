package edu.umb.cs680.hw10;

import java.time.LocalDateTime;



public abstract class ApfsElement extends FSElement {

	 private String ownerName;
	 private LocalDateTime modifiedTime;
	 
	 public ApfsElement( String name, int size, LocalDateTime createdTime, ApfsDirectory parent,String ownerName,
				LocalDateTime modifiedTime) {
			super( name, size, createdTime,parent);
			this.ownerName = ownerName;
			this.modifiedTime = modifiedTime;
		}

	public String getOwnerName() {
		return ownerName;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}
	public abstract void accept(ApfsFSVisitor visitor);
	protected abstract boolean isDirectory();
	protected abstract boolean isFile();
	protected abstract boolean isLink();


	 

}