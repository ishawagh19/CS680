package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FileSystemTest {

static LocalDateTime creationTime = LocalDateTime.now();
	
	
	private String[] fileSystemToString(Directory d) {
		String[] dirInfo = {  d.getName(), Integer.toString(d.getSize()),null, d.getCreationTime().toString() };
		return dirInfo;
	}
	
	
	@Test
	void verify_FileSystem() {
		FileSystem one = FileSystem.getFileSystem();
		FileSystem two = FileSystem.getFileSystem();
		assertSame(one, two);
	}

	@Test
	void verify_addRootDirTest() {
		Directory root = new Directory( "root", 177, creationTime,null);
		String[] expected = { "root", "177",null, creationTime.toString() };
		Directory actual = root;
		assertArrayEquals(expected, fileSystemToString(actual));
	}
	
	@Test
	void verify_addRootDirTest_invalid() {
		Directory root = new Directory( "main", 1717, creationTime,null);
		String[] expected = { "root", "177",null, creationTime.toString() };
		Directory actual = root;
		assertFalse(Arrays.deepEquals(expected, fileSystemToString(actual)) );
		
	}
	
	
	
	

}