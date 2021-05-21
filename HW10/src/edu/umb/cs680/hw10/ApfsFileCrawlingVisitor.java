package edu.umb.cs680.hw10;

import java.util.LinkedList;
import java.util.List;

public class ApfsFileCrawlingVisitor implements ApfsFSVisitor {

	private List<ApfsFile> files = new LinkedList<ApfsFile>();

	public List<ApfsFile> getFiles() {
		return files;
	}

	public void visit(ApfsLink link) {
		// TODO Auto-generated method stub
		return;
	}

	public void visit(ApfsDirectory dir) {
		// TODO Auto-generated method stub
		return;
	}

	public void visit(ApfsFile file) {
		// TODO Auto-generated method stub
		files.add(file);
	}

}