package cen4010.pa1;

//Java Program to illustrate calling a 
//no-argument constructor 
import java.io.*; 
import java.lang.Math;

class Vector3D 
{ 
 int num; 
 String name; 
 float locx;
 float locy;
 float locz;

 // this would be invoked while an object 
 // of that class is created. 
 Vector3D(float x, float y, float z) 
 { 
   this.locx=x;
   this.locy=y;
   this.locz=z;
	 
	// System.out.println("Constructor 1 called"); 
 } 

 Vector3D vectornegate(Vector3D invect){
float negatex = invect.locx*-1; 
float negatey = invect.locy*-1; 
float negatez = invect.locz*-1; 
Vector3D outvect = new Vector3D(negatex,negatey,negatez);
return outvect;
 }
 
 double dot( Vector3D invect) {
	 double prodx = this.locx * invect.locx;
	 double prody = this.locy * invect.locy;
	 double prodz = this.locz * invect.locz;
	 double sum = prodx + prody + prodz;
	 return sum;
 }
 
 
 
double magnitude(Vector3D invect){
double magx = invect.locx; 
double magy = invect.locy; 
double magz = invect.locz; 
double temp=(magx*magx+magy*magy+magz*magz);
double output = Math.sqrt(temp);
return output;
 }



static void printvect(Vector3D invect)
{
	double px = invect.locx; 
	double py = invect.locy; 
	double pz = invect.locz; 
	System.out.println("X= "+px+"	Y= "+py+"	Z= "+pz);
}


 static boolean vectequals(Vector3D vec1,Vector3D vec2) {
	 double dx= vec1.locx-vec2.locx;
	 double dy= vec1.locy-vec2.locy;
	 double dz= vec1.locz-vec2.locz;
	 if((dx<.00001) && (dx>-.00001) && (dy<.00001) && (dy>-.00001) && (dz<.00001) && (dz>-.00001)) {
		 return true;
	 }
	 else {
		 return false;
	 }
	 
 }
 

public static void main (String[] args) 
 { 
     // this would invoke default constructor. 
     Vector3D geek1 = new Vector3D(1,2,3); 

     // Default constructor provides the default 
     // values to the object like 0, null 
     System.out.println(geek1.name); 
     System.out.println(geek1.num); 
     printvect(geek1);
 } 
}
