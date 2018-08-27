package welcome;
import java.util.Scanner;

class Computer {
	//declaring variables.
	private int result;
	private float divResult;
	
	//function to add two numbers
public int addition(int a, int b) { 
	
	return result = a+b;
}

//function to subtract two numbers
public int subtraction(int a, int b) {
	if(a>b) {
		return result = a-b;
	}
	else {
		return result = b-a;
	}
}

//function to multiply two numbers
public int multiplication(int a, int b) {
	
	return result = a * b;
}

//function to divide two numbers
public float division(int a, int b) {
	if(b==0) {
		System.out.println("Not divisible by 0.");
	}
	else {
		divResult = (float) a/b;
		
	}
	return divResult;
}
}

public class TestComputer {


	public static void main(String[] args) {
		Computer com = new Computer();
		int a,b,result;
		float divResult;
		Scanner input = new Scanner(System.in);
		System.out.println("Input first number: ");
		a= input.nextInt();
		System.out.println("Input second number: ");
		b= input.nextInt();
		
		
		//calling methods from Computer class.
					result = com.addition(a, b);
					System.out.println("Result of addition of: "+a+" and "+b+" is: "+result);
				
				
					result = com.subtraction(a, b);
					System.out.println("Result of subtraction of: "+a+" and "+b+" is: "+result);
				
				
					result = com.multiplication(a, b);
					System.out.println("Result of multiplication of: "+a+" and "+b+" is: "+result);
				
				
					divResult = com.division(a, b);
					System.out.println("Result of division of: "+a+" and "+b+" is: "+divResult);
				
				
			
	}

}
