package edu.umb.cs680.hw08;



import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FileTest {

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
	 
	 
	 private String[] fileToString(File file) {
			String parentName = null;
			Directory parent = file.getParent();
			if (parent != null) {
				parentName = parent.getName();
			}
			String[] fileInfo = {  file.getName(), Integer.toString(f.getSize()),Boolean.toString(file.isDirectory()),
					file.getCreationTime().toString(),parentName };
			return fileInfo;
		}

		
		@Test
		void verify_FileF() {
			String[] expected = {  "f", "600","false", date.toString(), "code" };
			File actual = f;
			assertArrayEquals(expected, fileToString(actual));
		}
		
		
		 @Test
		    void error_FileA() {
				
				String[] expected = {  "a", "80","true", date.toString(), "applications" };
				File actual = a;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			@Test
		    void error_FileB() {
				
				String[] expected = {  "i", "200", "false",date.toString(), "home" };
				File actual = b;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}

			@Test
			void error_FileC() {
				
				String[] expected = {  "w", "30","false", date.toString(), "home" };
				File actual = c;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			@Test
			 void error_FileD() {
				
				String[] expected = {  "d", "40","false", date.toString(), "code" };
				File actual = d;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			
			@Test
		     void error_FileE() {
			
				String[] expected = {  "y", "500","false", date.toString(), "code" };
				File actual = e;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			@Test
			void error_FileF() {
				String[] expected = {  "f", "600","true", date.toString(), "code" };
				File actual = f;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
		
		

}
