public class PointTester {

  public static void main(String[] args) {
    Point origin = new Point(0, 0);
    Point other = new Point(3,5);
    Point other2 = new Point(3,5);
    System.out.println(origin.distanceTo(other));
    System.out.println(origin.equals(other));
    System.out.println(other.equals(other2));
  }

}
