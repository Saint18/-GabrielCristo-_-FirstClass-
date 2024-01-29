import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Color;
public class ColorTests {
	Color c1;
	Color c2;
	Color c3;
	Color c4;
	Color c5;
	Color c6;
	
	@Before
	public void setUp()
	{
		c1 = new Color();
		c2 = new Color(100,100,100);
		c3 = new Color(0,0,0);
		c4 = new Color(255,255,255);
		c5 = new Color(-1,-1,-1);
		c6 = new Color(300,300,300);
	}
	
	//COLOR TESTS
	
	//Getters and setters were requested. Let's check
		@Test
		public void gettersAndSetters()
		{
			c1.setRValue(1);
			c1.setGValue(1);
			c1.setBValue(1);
			
			assertEquals(1,c1.getRValue());
			assertEquals(1,c1.getGValue());
			assertEquals(1,c1.getBValue());
		}
		
	
	//For our class a no argument constructor should create a color of 0,0,0
	//No argument constructor test
	@Test
	public void testNoArgConstructor() {
		assertEquals(0,c1.getRValue());
		assertEquals(0,c1.getGValue());
		assertEquals(0,c1.getBValue());
	}
	
	//All arg constructor test
	@Test
	public void testAllArgConstructor() {
		assertEquals(100,c2.getRValue());
		assertEquals(100,c2.getGValue());
		assertEquals(100,c2.getBValue());
	}
	
	//Colors should never be greater than 255 or less than 0
	//Defaults should be 0
	@Test
	public void valueBorderTest() {
		assertEquals(0,c5.getRValue());
		assertEquals(0,c5.getGValue());
		assertEquals(0,c5.getBValue());
		
		assertEquals(0,c6.getRValue());
		assertEquals(0,c6.getGValue());
		assertEquals(0,c6.getBValue());
	}
	
	//color checking tests
	@Test
	public void colorTestTests() {
		assertEquals(false, c3.isWhite());
		assertEquals(true, c3.isBlack());
		assertEquals(true, c4.isWhite());
		assertEquals(false, c4.isBlack());
	}
	
}
