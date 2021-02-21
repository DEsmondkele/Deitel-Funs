import.java util.

public class QuadraticRoot{
  public static void main(String... args){

	int a = 2;
	int b = 5;
	int c = 12;

      double root1;
      double root2;
   double determinant = b * b -4 * a * c;
 if (determinant > 0){
 
     root1 = (-b + Math.sqrt(determinant))/ (2 * a);
     root2 = (-b - Math.sqrt(determinant))/ (2 * a);
System.out.printf("root1 = %.2f and root2 = %.2f");
}

}



}