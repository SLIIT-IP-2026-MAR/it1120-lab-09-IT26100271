import java.util.Scanner;



public class IT26100271Lab9Q1{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int a_value = 0;
		int b_value = 0;
		int c_value = 0;
		double root1 , root2 , discriminant , squareRoot;
		
		for(int i = 0; i < 3; i++){
			if(i < 1){
				System.out.print("Enter Value a: ");
				a_value = input.nextInt();
			}else if(i < 2){
				System.out.print("Enter Value b: ");
				b_value = input.nextInt();
			}else{
				System.out.print("Enter Value c: ");
				c_value = input.nextInt();
			}
		}
		
		//calculation part
		discriminant = (b_value * b_value) - 4 * ((a_value) * (c_value));
		squareRoot = Math.sqrt(discriminant);
		
		root1 = (((-1) * (b_value)) + squareRoot) / (2 * a_value);
		root2 = (((-1) * (b_value)) - squareRoot) / (2 * a_value);
		
		System.out.println();
		System.out.println("Roots are real and different : ");
		System.out.println("Root 1: " + root1);
		System.out.println("Root 2: " + root2);
		
	}


}