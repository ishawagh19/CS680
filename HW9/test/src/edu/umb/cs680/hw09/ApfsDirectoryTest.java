package edu.umb.cs680.hw09;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;




class ApfsDirectoryTest {

	 LocalDateTime date = LocalDateTime.now();
	 APFS getInstance = APFS.getInstance();
		ApfsDirectory root = (ApfsDirectory) getInstance.initFileSystem("APFSDirectory", 2);
	  ApfsDirectory home = new ApfsDirectory( "home", 0, date,root,"APFS",date);
	  ApfsDirectory code = new ApfsDirectory( "code", 0, date,home,"APFS",date);
	  ApfsDirectory applications = new ApfsDirectory( "applications", 0, date,root,"APFS",date);
	 ApfsFile a = new ApfsFile( "a", 100, date,applications,"APFS",date);
	 ApfsFile b = new ApfsFile( "b", 200, date,applications,"APFS",date);
	 ApfsFile c = new ApfsFile( "c", 300, date,home,"APFS",date);
	 ApfsFile d = new ApfsFile( "d", 400, date,home,"APFS",date);
	 ApfsFile e = new ApfsFile( "e", 500, date,code,"APFS",date);
	 ApfsFile f = new ApfsFile( "f", 600, date,code,"APFS",date);
	 ApfsLink x = new ApfsLink("x",0, date, home,"APFS",date,applications);
	 ApfsLink y = new ApfsLink("y",0,date,code,"APFS",date,e);
	 
	 

	 private String[] dirToStringArray(ApfsDirectory d) {
			String parentName = null;
			ApfsDirectory parent = d.getParent();
			if (parent != null) {
				parentName = parent.getName();
			}
			String[] dirInfo = {  d.getName(), Integer.toString(d.getSize()),Boolean.toString(d.isDirectory()),
					d.getCreationTime().toString(),parentName, Integer.toString(d.getTotalSize()),
					d.getOwnerName(), d.getModifiedTime().toString()};
			return dirInfo;
		}
	 
	 @Test
		public void verifyDirectoryEqualityRoot() {
			
			String[] expected = {  "root", "0","true", date.toString(), null, "2100","APFS",date.toString() };
			ApfsDirectory actual = root;
			assertArrayEquals(expected, dirToStringArray(actual));
		}

		@Test
		public void verifyDirectoryEqualityHome() {
		
			String[] expected = {  "home", "0","true", date.toString(),"root", "1800","APFS",date.toString() };
			ApfsDirectory actual = home;
			assertArrayEquals(expected, dirToStringArray(actual));
		}

		

		@Test
		public void verifyDirectoryEqualityCode() {
		
			String[] expected = {  "code", "0","true", date.toString(), "home", "1100","APFS",date.toString() };
			ApfsDirectory actual = code;
			assertArrayEquals(expected, dirToStringArray(actual));
			
		}
		
		@Test
		public void verifyDirectoryEqualityApplications() {

			String[] expected = {  "applications", "0","true", date.toString(), "root", "300","APFS",date.toString() };
			ApfsDirectory actual = applications;
			assertArrayEquals(expected, dirToStringArray(actual));
		}
		
		
		
		

}