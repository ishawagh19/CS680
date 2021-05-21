package edu.umb.cs680.hw10;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.jupiter.api.Test;



class ApfsFileTest {

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
	 
	 
	 
	 private String[] fileToString(ApfsFile file) {
			
			String[] fileInfo = {  file.getName(), Integer.toString(f.getSize()),Boolean.toString(file.isDirectory()),
					file.getCreationTime().toString(),file.getParent().getName(),
					file.getOwnerName(), file.getModifiedTime().toString()};
			return fileInfo;
		}

		
		@Test
		void verify_FileF() {
			String[] expected = {  "f", "600","false", date.toString(), "code","APFS",date.toString() };
			ApfsFile actual = f;
			assertArrayEquals(expected, fileToString(actual));
		}
		
		
		 @Test
		    void error_FileA() {
				
				String[] expected = {  "a", "80","true", date.toString(), "applications","APFS",date.toString() };
				ApfsFile actual = a;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			@Test
		    void error_FileB() {
				
				String[] expected = {  "i", "200", "false",date.toString(), "home","APFS",date.toString() };
				ApfsFile actual = b;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}

			@Test
			void error_FileC() {
				
				String[] expected = {  "w", "30","false", date.toString(), "home","APFS",date.toString() };
				ApfsFile actual = c;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			@Test
			 void error_FileD() {
				
				String[] expected = {  "d", "40","false", date.toString(), "code","APFS",date.toString()};
				ApfsFile actual = d;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			
			@Test
		     void error_FileE() {
			
				String[] expected = {  "y", "500","false", date.toString(), "code","APFS",date.toString() };
				ApfsFile actual = e;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			@Test
			void error_FileF() {
				String[] expected = {  "f", "600","true", date.toString(), "code","APFS",date.toString() };
				ApfsFile actual = f;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}

}