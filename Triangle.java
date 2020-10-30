public class Triangle {

  private Point v1,v2,v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
     v1 = new Point(x1,y1);
     v2 = new Point(x2,y2);
     v3 = new Point(x3,y3);
  }

  public double getPerimeter() {
     double side1 = v1.distanceTo(v2);
     double side2 = v2.distanceTo(v3);
     double side3 = v3.distanceTo(v1);
     double perimeter = side1 + side2 + side3;
     return perimeter;
  }

  public double getArea() {
    double side1 = v1.distanceTo(v2);
    double side2 = v2.distanceTo(v3);
    double side3 = v3.distanceTo(v1);
    double semi = (getPerimeter() / 2);
    double area = Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));
    return area;
  }

  public String classify() {
    double side1 = Math.round(v1.distanceTo(v2) * 10000.0) / 10000.0;
    double side2 = Math.round(v2.distanceTo(v3) * 10000.0) / 10000.0;
    double side3 = Math.round(v3.distanceTo(v1) * 10000.0) / 10000.0;
    if (side1 == side2 && side2 == side3 && side3 == side1){
      return "equilateral";
    }
    if (side1 == side2 || side2 == side3 || side3 == side1){
      return "isosceles";
    } else
      return "scalene";
  }

  public String toString() {
    return "v1(" + v1.getX() + ", " + v1.getY() + ") " +
           "v2(" + v2.getX() + ", " + v2.getY() + ") " +
           "v3(" + v3.getX() + ", " + v3.getY() + ")";
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    }
    if (index == 1) {
      v2 = newP;
    }
    if (index == 2) {
      v3 = newP;
    }
  }

}
