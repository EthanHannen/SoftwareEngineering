package cen4010.pa1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Vector3DTest {

	@Test
	void testToString() {
		Vector3D v = new Vector3D(1.0,1.0,1.0);
		String s1 = v.toString();
		String s2 = "Vector Details | X: 1.0 Y: 1.0 Z: 1.0";
		assertTrue(s1.equals(s2));
	}
	
	@Test
	void testEquals1() {
		// Equal to myself
		Vector3D v = new Vector3D(2.0,2.0,2.0);
		assertTrue(v.equals(v));
	}
	
	@Test
	void testEquals2() {
		// Equal to another object
		Vector3D v1 = new Vector3D(2.0,2.0,2.0);
		Vector3D v2 = new Vector3D(2.0,2.0,2.0);
		assertTrue(v1.equals(v2));
	}
	
	@Test
	void testEquals3() {
		// Not equal an object with diff coordinates
		Vector3D v1 = new Vector3D(2.0,2.0,2.0);
		Vector3D v2 = new Vector3D(1.0,2.0,2.0);
		assertFalse(v1.equals(v2));
	}

	@Test
	void testScale() {
		Vector3D vOrg = new Vector3D(2.0,2.0,2.0);
		Vector3D vScl = vOrg.scale(2.0);
		assertTrue((vScl.equals(new Vector3D(4.0,4.0,4.0))));
	}
	
	@Test
	void testAdd() {
		Vector3D v1 = new Vector3D(1.0,1.0,1.0);
		Vector3D v2 = new Vector3D(2.0,2.0,2.0);
		assertTrue((v1.add(v2).equals(new Vector3D(3.0,3.0,3.0))));
	}
	
	@Test
	void testSubtract() {
		Vector3D v1 = new Vector3D(2.0,2.0,2.0);
		Vector3D v2 = new Vector3D(1.0,1.0,1.0);
		assertTrue((v1.subtract(v2).equals(new Vector3D(1.0,1.0,1.0))));
	}
	
    @Test
	void testNegate() {
		Vector3D vOrg = new Vector3D(1.0,1.0,1.0);
		Vector3D vNeg = vOrg.negate();
		assertTrue(vNeg.equals(new Vector3D(-1.0,-1.0,-1.0)));
	}
	
	@Test
	void testDot() {
		Vector3D v = new Vector3D(1.0,1.0,1.0);
		double dotResult = v.dot(new Vector3D(1.0,1.0,1.0));
		assertTrue(dotResult == 3.0);
	}
	
	@Test
	void testMagnitude() {
		Vector3D v = new Vector3D(2.0,2.0,1.0);
		double magnitude = v.magnitude();
		assertTrue(magnitude == 3.0);
	}
}
