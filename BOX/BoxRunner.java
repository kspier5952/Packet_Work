package BOX;

public class BoxRunner {
    public static void main(String[]args){
        Box katelyn = new Box(2.0, 6.0);
        double area = katelyn.getArea();
        System.out.println("Area = " + area);
        katelyn.bigger(2);
        double perimeter = katelyn.getPerimeter();
        System.out.println("Perimeter = " + perimeter);
    }
}
