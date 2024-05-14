package CIRCLE;

public class CircleRunner {
    public static void main(String[]args) {
    Circle circleOne = new Circle(3.0);
    double cTwo = circleOne.getC();
    System.out.println("getC = " + cTwo);
    double aTwo = circleOne.getArea();
    System.out.println("area = " + aTwo);
    circleOne.changeR(1);
    double aThree = circleOne.getArea();
    System.out.println("area2 = " + aThree);
    }
}