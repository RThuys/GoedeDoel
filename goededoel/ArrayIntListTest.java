import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayIntListTest {

	@Test
	public void testSetTest() {
		ArrayIntList list = new ArrayIntList("Hello World");
		assertEquals("Hello World", list);
	}

}
