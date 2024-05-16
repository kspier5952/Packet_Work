public class RunTravel {
     public static void main(String[]args) {
         for ( int i = 6; i <= 40; i += 2) {
             Travel t = new Travel(i);
             int v = t.goByVan();
             int c = t.goByCanoe();
             int p = t.goByPlane();
             System.out.println("people = " + i + ", vans = " + v + ", canoes = " + c + ", planes = " + p);
         }
     }
}