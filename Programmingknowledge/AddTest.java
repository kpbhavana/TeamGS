package Programmingknowledge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddTest {

	@Test
	public void Addtest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(100, 200);
		assertEquals(300, result);

	}

}
