// Define the square class with two constructors
public class Square {

	 double side;

	 Square() {
		 side = 1;
	  }
	  
	  /** Construct a circle with a specified radius */
	 Square(double newSide) {
		 side = newSide;
	  }

	  /** Return the area of this circle */
	  double getArea() {
	    return side * side;
	  }

	  /** Return the perimeter of this circle */
	  double getPerimeter() {
	    return 4 * side;
	  }

	  /** Set a new radius for this circle */
	  void setSide(double newSide) {
		  side = newSide;
	  }
	  
}
