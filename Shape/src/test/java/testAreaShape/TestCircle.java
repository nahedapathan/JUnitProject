package testAreaShape;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import areaShape.Circle;

public class TestCircle {

	@Test
	public void testCircle() {
		Circle circle = new Circle(5);
		double expectedArea = Math.PI * 5 * 5;

		assertEquals("Something Wrong ", expectedArea, circle.getArea(), 0.001);
	}
}
