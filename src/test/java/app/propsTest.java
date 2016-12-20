package app;

import java.awt.Rectangle;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class propsTest extends TestCase {
	props properties;
	Rectangle rectangle;

	@Before
	public void setUp() throws Exception {
		properties = new props();
		rectangle = new Rectangle(300, 400, 100, 100);

		props.storeOptions(rectangle);
	}

	@SuppressWarnings("static-access")
	@Test
	public void testrestoreOptions() {
		try {
			assertEquals(properties.restoreOptions(), rectangle);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
