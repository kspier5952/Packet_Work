public class CubeRunner {
    public static void main(String[]args){
        Cube cube1 = new Cube(3.0);
        System.out.println("The surface area is " + cube1.surfaceArea() + " sq. units");
        System.out.println("The volume is " + cube1.volume() + " cu. units");
        Cube cube2 = new Cube(5.0);
        cube2.setSideForVolume(125.0);
        System.out.println("The side is now " + cube2.getSide() + " units");
        System.out.println("The surface area is " + cube2.surfaceArea() + " sq. units");
    }
}