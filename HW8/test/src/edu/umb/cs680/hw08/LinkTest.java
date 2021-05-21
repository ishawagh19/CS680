package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class LinkTest {

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
	 Link x = new Link("x",1, date, home,applications);
	 Link y = new Link("y",2,date,code,e);
	 


		
		@Test
		public void verify_LinktoX() {
			
			Directory expected = applications;
			FSElement actual = x.getTarget();
			assertSame(expected, actual);
		}
		
		@Test
		public void error_LinktoX() {
			
			Directory expected = root;
			FSElement actual = x.getTarget();
			assertNotEquals(expected, actual);
		}
		
		@Test
		public void verify_LinkToY() {
			File expected = e;
			FSElement actual = y.getTarget();
			assertSame(expected,actual);
		}
		
		@Test
		public void error_LinkToY() {
			File expected = c;
			FSElement actual = y.getTarget();
			assertNotEquals(expected,actual);
		}
		
		

}