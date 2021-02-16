
 import java.util.Scanner;
  public class Calculate{
	//calculate the product of 3 integers
  public static void main(String... args){

	int x;
	int y;
	int z;
	int sum;

  Scanner strainer = new Scanner(System.in);
	
	System.out.print("Input X:");
	x = strainer.nextInt();
	System.out.print("Input y:");
	y = strainer.nextInt();
	System.out.print("Inpute z:");
	z = strainer.nextInt();
	
	sum = x * y * z;
  System.out.printf("product is %d%n", sum);
}


}