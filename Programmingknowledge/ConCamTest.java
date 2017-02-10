package Programmingknowledge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConCamTest {

	@Test
	public void ConCatest() {
		MyJunitClass junit = new MyJunitClass();
		String result = junit.ConCat("Hello", "There");
		assertEquals("HelloThere", result);

	}

}
