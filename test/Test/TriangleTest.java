package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import challenge.Triangle;
import challenge.TriangleType;

public class TriangleTest {
	
	@Test
	public void InvalidPoints() {
		//assertEquals(1, 1);
		Triangle x = new Triangle();
		assertEquals(TriangleType.INVALID, x.TriangleChallenge(0,0,2));
	}
	
	@Test
	public void InvalidPointsZero() {
		Triangle x = new Triangle();
		assertEquals(TriangleType.INVALID, x.TriangleChallenge(0,0,0));
	}	
	
	@Test
	public void Invalid() {
		Triangle x = new Triangle();
		assertEquals(TriangleType.INVALID, x.TriangleChallenge(0,1,0));
	}
	
	@Test
	public void InvalidTriangle() {
		Triangle x = new Triangle();
		assertEquals(TriangleType.INVALID, x.TriangleChallenge(8,0,0));
	}
	
	@Test
	public void InvalidPointNegativeFirst() {
		Triangle x = new Triangle();
		assertEquals(TriangleType.INVALID, x.TriangleChallenge(-5,0,0));
	}
	
	@Test
	public void InvalidPointNegativeMiddle() {
		Triangle x = new Triangle();
		assertEquals(TriangleType.INVALID, x.TriangleChallenge(0,-3,0));
	}
	
	@Test
	public void InvalidPointNegativeLast() {
		Triangle x = new Triangle();
		assertEquals(TriangleType.INVALID, x.TriangleChallenge(0,6,-6));
	}
	
	@Test
	public void AllInvalidPointsNegative() {
		Triangle x = new Triangle();
		assertEquals(TriangleType.INVALID, x.TriangleChallenge(-8,-6,-6));
	}
	
	@Test
	public void Scalene() {
		Triangle x = new Triangle();
		assertEquals(TriangleType.SCALENE, x.TriangleChallenge(7,10,5));
	}
	
	@Test
	public void Isosceles() {
		Triangle x = new Triangle();
		assertEquals(TriangleType.ISOSCELES, x.TriangleChallenge(7,7,10));
	}
	
	@Test
	public void Equilateral() {
		Triangle x = new Triangle();
		assertEquals(TriangleType.EQUILATERAL, x.TriangleChallenge(7,7,7));
	}
	
}
