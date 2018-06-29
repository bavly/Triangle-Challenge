package challenge;

public class Triangle {

	public TriangleType TriangleChallenge(long a, long b , long c) {
		
		//if (a <-1 || b < -1 || c < -1 ) return TriangleType.INVALID;
		if (a == 0 && b == 0 && c == 0 ) return TriangleType.INVALID;
		if (a <= 0 || b <= 0 || c <= 0) return TriangleType.INVALID; // added test
		if (a == b && b == c) return TriangleType.EQUILATERAL;
		if (a >= b+c || c >= b+a || b >= a+c) return TriangleType.INVALID;
		if (b==c || a==b || c==a) return TriangleType.ISOSCELES;
		return TriangleType.SCALENE;
	}

}
