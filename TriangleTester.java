public class TriangleTester {

  public static void main(String[] args) {
    Triangle t1 = new Triangle(0,3,4,0,0,0);
    Triangle t2 = new Triangle(0,0,0,0,0,0);
    Triangle t3 = new Triangle(0,0,0,0,1,0);
    System.out.println(t1.getPerimeter());
    System.out.println(t1.getArea());
    System.out.println(t1.classify());
    System.out.println(t2.classify());
    System.out.println(t3.classify());
  }

}
