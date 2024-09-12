import java.util.Scanner;

public class MeterToMillimeter{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number to convert meter into millimeter:");
	
	double meter = scanner.nextDouble();
	
	double millimeter = meter * 1000;
	
	System.out.println( meter + " meters is equal to" + millimeter + " millimeters");
	
	}//Brenly Marion S. Camarillo XI-Acacia
}