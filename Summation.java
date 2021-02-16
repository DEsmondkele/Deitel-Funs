import java.util.Scanner;

public class Summation{

public static void main(String... args){
Scanner picker = new Scanner(System.in);
	
	int a;
	int b;
	int c;
	int sum;
System.out.print("Input the value of a:");
	a = picker.nextInt();
System.out.print("input the value of b:");
	b =  picker.nextInt();
System.out.print("input the value of c:");
	c =  picker.nextInt();
	sum = a + b + c;
System.out.printf("sum is %d%n",sum);




}
}