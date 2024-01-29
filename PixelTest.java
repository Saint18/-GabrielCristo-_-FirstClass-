import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTests {


	@Test
	public void MyTests() {
		// code that runs
		Pixel pixel = new Pixel();
		assertEquals(pixel.getX(), 0);
		assertEquals(pixel.getY(), 0);
		Color defaultColor = new Color();
		assertTrue(pixel.getColor().equals(defaultColor));
	}

	@Test
	public void testTwoArgsConstructor() {
		// code that runs
		Pixel pixel = new Pixel(10, 13);
		assertEquals(pixel.getX(), 10);
		assertEquals(pixel.getY(), 13);
		Color defaultColor = new Color();
		assertTrue(pixel.getColor().equals(defaultColor));
	}

	@Test
	public void testPixelNoArgsConstructor() {
		// code that runs
		Pixel pixel = new Pixel();
		Color color = new Color(100, 100, 100);
		pixel.setColor(color);
		assertTrue(pixel.getColor().equals(color));
	}

	@Test
	public void testAllArgConstructor() {
		// code that runs
		Color color = new Color(100, 100, 100);
		Pixel pixel = new Pixel(1, 5, color);
		assertTrue(pixel.getColor().equals(color));
	}
}