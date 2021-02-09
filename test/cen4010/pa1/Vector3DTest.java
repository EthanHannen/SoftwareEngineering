package cen4010.pa1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Vector3DTest {

	@Test
	void test_AddVectors() {
		Vector3D v1 = new Vector3D(1.0,1.0,1.0);
		Vector3D v2 = new Vector3D(2.0,2.0,2.0);
		assertTrue((v1.add(v2).equals(new Vector3D(3.0,3.0,3.0))));
	}
	
	@Test
	void test_SubVectors() {
		Vector3D v1 = new Vector3D(2.0,2.0,2.0);
		Vector3D v2 = new Vector3D(1.0,1.0,1.0);
		assertTrue((v1.subtract(v2).equals(new Vector3D(1.0,1.0,1.0))));
	}
	
	@Test
	void test_ScaleVectors() {
		Vector3D vOrg = new Vector3D(2.0,2.0,2.0);
		Vector3D vScl = vOrg.scale(2.0);
		assertTrue((vScl.equals(new Vector3D(4.0,4.0,4.0))));
	}
	
	@Test
	void test_NegateVectors() {
		Vector3D vOrg = new Vector3D(1.0,1.0,1.0);
		Vector3D vNeg = vOrg.negate();
		assertTrue(vNeg.equals(new Vector3D(-1.0,-1.0,-1.0)));
	}
	
	@Test
	void test_DotVectors() {
		Vector3D v = new Vector3D(1.0,1.0,1.0);
		double dotResult = v.dot(new Vector3D(1.0,1.0,1.0));
		assertTrue(dotResult == 3.0);
	}
	
	@Test
	void test_MagnitudeVectors() {
		Vector3D v = new Vector3D(2.0,2.0,1.0);
		double magnitude = v.magnitude();
		assertTrue(magnitude == 3.0);
	}
	
	@Test
	void test_StringifyVectors() {
		Vector3D v = new Vector3D(1.0,1.0,1.0);
		String s1 = v.toString();
		String s2 = "Vector Details | X: 1.0 Y: 1.0 Z: 1.0";
		assertTrue(s1.equals(s2));
	}
}
