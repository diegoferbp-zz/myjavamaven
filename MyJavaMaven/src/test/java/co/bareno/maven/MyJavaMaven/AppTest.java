package co.bareno.maven.MyJavaMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App app = new App();
		assertEquals(8, app.suma(6, 2));
	
	}

}
