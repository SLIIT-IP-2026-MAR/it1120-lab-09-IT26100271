import java.util.Scanner;


public class IT26100271Lab9Q2{
	
    public static double circleArea(double radius, double pi){
	    return (pi*(radius*radius));
    }

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double pi = 3.14;
		double radius;
		
		System.out.print("Enter the radius of the circle: ");
		radius = input.nextDouble();
		
		double area = circleArea(radius, pi);
		
		System.out.print("The area of the circle with radius " + radius + " is : " + area);
		
		
		
	}
	
	

}
