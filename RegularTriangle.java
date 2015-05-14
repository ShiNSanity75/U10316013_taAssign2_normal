// Define the regular triangle class with two constructors
public class RegularTriangle {

	double side;

	RegularTriangle() {
		 side = 1;
	  }
	  
	  /** Construct a circle with a specified radius */
	RegularTriangle(double newSide) {
		 side = newSide;
	  }

	  /** Return the area of this circle */
	  double getArea() {
	    return side * side * Math.pow(3,0.5) / 4;
	  }

	  /** Return the perimeter of this circle */
	  double getPerimeter() {
	    return 3 * side;
	  }

	  /** Set a new radius for this circle */
	  void setSide(double newSide) {
		  side = newSide;
	  }
	  
}
