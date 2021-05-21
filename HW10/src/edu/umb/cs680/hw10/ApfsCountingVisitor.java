package edu.umb.cs680.hw10;

public class ApfsCountingVisitor implements ApfsFSVisitor {
	
	private int dirNum = 0;
	private int fileNum = 0;
	private int linkNum = 0;
	
	public void visit(ApfsFile file) {
		fileNum++;
	}
	
	public void visit(ApfsDirectory dir) {
		dirNum++;
	}
	
	public void visit(ApfsLink link) {
		linkNum++;
	}
	
	public int getDirNum() {
		return this.dirNum;
	}
	
	public int getFileNum() {
		return this.fileNum;
	}
	public int getLinkNum() {
		return this.linkNum;
	}

}