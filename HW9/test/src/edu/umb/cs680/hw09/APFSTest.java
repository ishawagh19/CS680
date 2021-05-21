package edu.umb.cs680.hw09;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class APFSTest {
	public LocalDateTime date = LocalDateTime.now();

	APFS getInstance = APFS.getInstance();

	private String[] ApfsElementtoStringArray(ApfsElement element) {

		String[] elementInfo = { element.getName(), Boolean.toString(element.isDirectory()), element.getOwnerName() };

		return elementInfo;
	}

	@Test
	public void verify_APFS() {
		APFS a = APFS.getInstance();
		APFS b = APFS.getInstance();
		assertSame(a, b);
	}

	@Test
	public void verify_getRootDirs() {
        getInstance.initFileSystem("APFS", 717);
		ApfsDirectory actual = getInstance.getRootDirs();
		String[] expected = { "root", "true", "APFS" };
		assertArrayEquals(expected, ApfsElementtoStringArray(actual));
	}

	@Test
	public void verify_createDefaultRoot() {
        ApfsDirectory actual = getInstance.getRootDirs();
		String[] expected = { "root", "true", "APFS" };
		assertArrayEquals(expected, ApfsElementtoStringArray(actual));
	}
	
	@Test
	public void error_getRootDirs() {
        getInstance.initFileSystem("APFS", 7);
		ApfsDirectory actual = getInstance.getRootDirs();
		String[] expected = { "root", "true", "APFSFileSystem" };
		assertFalse(Arrays.deepEquals(expected, ApfsElementtoStringArray(actual)) );
	}

	@Test
	public void error_createDefaultRoot() {
        ApfsDirectory actual = getInstance.getRootDirs();
		String[] expected = { "root", "true", "APFSFileSystem" };
		assertFalse(Arrays.deepEquals(expected, ApfsElementtoStringArray(actual)) );
	}
	
	

}