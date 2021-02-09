package cen4010.pa1;

import static junit.framework.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
Instances of Vector3D should be immutable. This means that there will be no way to modify an instance of Vector3D; all of Vector3D's methods will return new instances
Provide the following operations/methods:
a constructor that takes the x, y, and z coordinates, which should be doubles.
Vector3D scale(double f); which should multiply x, y, and z by a common factor f.
Vector3D add(Vector3D v); which takes one Vector3D as an argument adds the corresponding coordinates to its own and produces a new Vector3D ( {x0, y0, z0} + {x1, y1, z1} = {x0+x1, y0+y1, z0+z1}, where x0, y0, and z0 are "this" object's coordinates and x1, y1, and z1 are the argument v's coordinates) .
Vector3D subtract(Vector3D v); Like add except you subtract argument v's coordinates from the corresponding coordinates in "this" producing a new Vector3D object.
Vector3D negate(); This is shorthand for scale by -1.
double dot(Vector3D v); Produce the dot product of "this" Vector3D and argument Vector3D v ( {x0, y0, z0} dot {x1, y1, z1} = x0*x1 + y0*y1 + z0*z1 ).
double magnitude(); returns the magnitude of a Vector3D ( sqrt(x*x + y*y + z*z) ).
Provide a toString method for reasonable output.
Provide an implementation of equals. Remember that float and double arithmetic is not exact. Thus, you must allow for a tolerance.
Remember that you're doing test-first development. Write a unit test first, then write the code that will pass it. Iterate on this. You'll turn in your test code in addition to the code for Vector3D.
 */

class Vector3DTest {

	// Member immutability tests for Vector3D object
	@Test
	void test_xImmutability() {
		Vector3D v = new Vector3D(0.0,0.0,0.0);
		v.x = 1.0;
		assertFalse(v.x == 1.0);
	}
	@Test
	void test_yImmutability() {
		Vector3D v = new Vector3D(0.0,0.0,0.0);
		v.y = 1.0;
		assertFalse(v.y == 1.0);
	}
	@Test
	void test_zImmutability() {
		Vector3D v = new Vector3D(0.0, 0.0, 0.0);
		v.z = 1.0;
		assertFalse(v.z == 1.0);
	}
}
