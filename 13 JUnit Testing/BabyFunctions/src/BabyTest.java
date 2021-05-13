import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class BabyTest {
	Baby baby;
	@Rule
	public TemporaryFolder tmp=new TemporaryFolder();

	@Before
	public void testBaby() {
	  baby=new Baby("Mark!");	
	}

	@Test
	public void testGetName() throws Exception{
		assertEquals("Mark", baby.getName());
	}
	
	@Test
	public void testIsHappy() throws Exception{
		assertFalse(baby.isHappy());
	}
	
	@Test
	public void testPlayWithToy(){
		baby.playWithToy();
		assertTrue(baby.isHappy());
	}
	
	@Ignore("Exception is not yet Implemented")
	@Test(expected=IllegalStateException.class)
	public void noName(){
		baby.printHappMessage();
	}
	
	@Test(timeout=100)
    public void testTime(){
    	baby.waitTillHappy();
    }
	
	@Test
	public void fileTest() throws IOException{
		File file=tmp.newFolder("file.txt");
		assertTrue(file.isFile());
		assertEquals(tmp.getRoot(),file.getParentFile());
	}
	
}
