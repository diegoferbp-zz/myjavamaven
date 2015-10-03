package co.bareno.maven.MyJavaMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void sumaIntTest() {
		App app = new App();
		assertEquals(8, app.suma(6, 2));
	
	}
	
	@Test
	public void restaIntTest() {
		App app = new App();
		assertEquals(4, app.resta(6, 2));
	
	}

}
