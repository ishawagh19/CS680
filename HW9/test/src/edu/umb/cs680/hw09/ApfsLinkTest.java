package edu.umb.cs680.hw09;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class ApfsLinkTest {


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
	 
	 
	 
	 @Test
	  public void verify_LinkX() {
			ApfsDirectory expected = applications;
			FSElement actual = x.getTarget();
			assertSame(expected, actual);
		}
	  
	  @Test
	  public void verify_LinkY() {
			ApfsFile expected = e;
			FSElement actual = y.getTarget();
			assertSame(expected, actual);
		}
	  
	  @Test
	  public void error_LinkX() {
			ApfsDirectory expected = root;
			FSElement actual = x.getTarget();
			assertNotSame(expected, actual);
		}
	  
	  @Test
	  public void error_LinkY() {
			ApfsFile expected = f;
			FSElement actual = y.getTarget();
			assertNotSame(expected, actual);
		}
	  
	 
	  
	  
	 
	 

}