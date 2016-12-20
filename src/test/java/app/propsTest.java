package app;

import java.awt.Rectangle;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
public class propsTest extends TestCase{
	static props properties;
	Rectangle rectangle;

	@Before
	public void setUp() throws Exception {
	properties = new props(); 
	 rectangle = new Rectangle(300,400,100,100);
	
	props.storeOptions(rectangle);
	}
	
	@Test
	public void testrestoreOptions() {
		try {
			assertEquals(props.restoreOptions(),rectangle);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
