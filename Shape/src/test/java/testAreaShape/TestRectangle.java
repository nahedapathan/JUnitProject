package testAreaShape;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import areaShape.Rectangle;

public class TestRectangle {

	@Test
	public void testRectangleArea()
	{
		Rectangle rect=new Rectangle(4, 5);
		double expectedArea=4*5;
		assertEquals("Something Wrong",expectedArea,rect.getArea(),0.001);
	}
}
