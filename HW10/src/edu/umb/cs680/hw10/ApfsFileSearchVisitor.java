package edu.umb.cs680.hw10;

import java.util.LinkedList;
import java.util.List;

public class ApfsFileSearchVisitor implements ApfsFSVisitor {
	
	private String fileName;
	private List<ApfsFile> foundFiles = new LinkedList<ApfsFile>();
	
	public void visit(ApfsFile file) {
		if(file.getName().contentEquals(fileName)) {
			foundFiles.add(file);
		}
	}
	
	public void visit(ApfsDirectory dir) {
		return;
	}
	
	public void visit(ApfsLink link) {
		return;
	}
	
	public List<ApfsFile> getFoundFiles(){
		return foundFiles;
	}
	
	 public ApfsFileSearchVisitor(String fileName) {
	        this.fileName = fileName;
	    }
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}