package edu.umb.cs680.hw09;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ApfsDirectory extends ApfsElement {

	private List<ApfsElement> children = new LinkedList<ApfsElement>();
	private List<ApfsDirectory> myDirectory = new LinkedList<ApfsDirectory>();
	private List<ApfsFile> files = new LinkedList<ApfsFile>();
	private List<ApfsLink> linkS = new LinkedList<ApfsLink>();

	public ApfsDirectory(String name, int size, LocalDateTime createdTime, ApfsDirectory parent, String ownerName,
			LocalDateTime modifiedTime) {
		super(name, 0, createdTime, parent, ownerName, modifiedTime);
		if (parent != null)
			parent.appendChild(this);
	}

	public boolean isDirectory() {
		return true;
	}

	public boolean isFile() {
		return false;
	}

	public boolean isLink() {
		return false;
	}

	public void appendChild(ApfsElement child) {
		this.children.add(child);
		child.setParent(this);
	}

	public List<ApfsElement> getChildren() {
		return this.children;
	}

	public int countChildren() {
		return getChildren().size() - getLinks().size();
	}

	public List<ApfsDirectory> getSubDirectories() {
		for (FSElement e : children) {
			if (e.isDirectory())
				myDirectory.add((ApfsDirectory) e);
		}
		return myDirectory;
	}

	public List<ApfsFile> getFiles() {
		for (FSElement e : children) {
			if (e.isFile()) {
				files.add((ApfsFile) e);
			}
		}
		return files;
	}

	public List<ApfsLink> getLinks() {
		for (FSElement e : getChildren()) {
			if (e.isLink())
				linkS.add((ApfsLink) e);
		}
		return linkS;
	}

	public int getTotalSize() {
		int size = 0;
		for (FSElement e : children) {
			if (e.isDirectory()) {
				size += ((ApfsDirectory) e).getTotalSize();
			} else {
				size += e.getSize();
			}
		}
		return size;
	}

}