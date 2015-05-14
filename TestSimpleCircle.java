// Define the circle class with two constructors
public class TestSimpleCircle {
  double radius;

  TestSimpleCircle() {
	  radius = 1;
  }
  
  /** Construct a circle with a specified radius */
  TestSimpleCircle(double newRadius) {
    radius = newRadius;
  }

  /** Return the area of this circle */
  double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return the perimeter of this circle */
  double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /** Set a new radius for this circle */
  void setRadius(double newRadius) {
    radius = newRadius;
  }
}
