package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;




class DirectoryTest {

	 LocalDateTime date = LocalDateTime.now();
	  Directory root = new Directory( "root", 0, date,null);
	 Directory home = new Directory( "home", 0, date,root);
	 Directory code = new Directory( "code", 0, date,home);
	 Directory applications = new Directory( "applications", 0, date,root);
	 File a = new File( "a", 100, date,applications);
	 File b = new File( "b", 200, date,applications);
	 File c = new File( "c", 300, date,home);
	 File d = new File( "d", 400, date,home);
	 File e = new File( "e", 500, date,code);
	 File f = new File( "f", 600, date,code);
	 Link x = new Link("x",0, date, home,applications);
	 Link y = new Link("y",0,date,code,e);
	 
	 
	 private String[] dirToStringArray(Directory d) {
			String parentName = null;
			Directory parent = d.getParent();
			if (parent != null) {
				parentName = parent.getName();
			}
			String[] dirInfo = {  d.getName(), Integer.toString(d.getSize()),Boolean.toString(d.isDirectory()),
					d.getCreationTime().toString(),parentName, Integer.toString(d.countChildren()),Integer.toString(d.getTotalSize()) };
			return dirInfo;
		}
	 
	 @Test
		public void verifyDirectoryEqualityRoot() {
			
			String[] expected = {  "root", "0","true", date.toString(), null, "2","2100" };
			Directory actual = root;
			assertArrayEquals(expected, dirToStringArray(actual));
		}

		@Test
		public void verifyDirectoryEqualityHome() {
		
			String[] expected = {  "home", "0","true", date.toString(),"root", "3","1800" };
			Directory actual = home;
			assertArrayEquals(expected, dirToStringArray(actual));
		}

		

		@Test
		public void verifyDirectoryEqualityCode() {
		
			String[] expected = {  "code", "0","true", date.toString(), "home", "2","1100" };
			Directory actual = code;
			assertArrayEquals(expected, dirToStringArray(actual));
			
		}
		
		@Test
		public void verifyDirectoryEqualityApplications() {

			String[] expected = {  "applications", "0","true", date.toString(), "root", "2","300" };
			Directory actual = applications;
			assertArrayEquals(expected, dirToStringArray(actual));
		}
		
	 
	 

}