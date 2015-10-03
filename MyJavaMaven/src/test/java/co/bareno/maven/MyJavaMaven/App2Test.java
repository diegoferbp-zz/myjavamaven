package co.bareno.maven.MyJavaMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class App2Test {

	@Test
	public void sumaDoubleTest() {
		App app = new App();
		assertEquals(8.3, app.suma(6.1, 2.2), 0.00001);
	
	}

}
