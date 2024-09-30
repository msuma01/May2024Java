package assignments;

public class MethodsAssignments {
//1. Write a program to print the addition/subtraction/division/multiplication of two numbers by defining your own method
	// 2. . Define a method that returns the product of two double numbers.
	// 3.Write a program to print the circumference and area of a circle of radius
	// entered by user by defining your own method. 
	// 4.  Define two methods to print the maximum and the minimum number respectively among three numbers.
	

	public void Addition() {
		int a = 19;
		int b = 30;
		int c = a + b;
		System.out.println(c);

	}

	public void Subtraction() {
		byte t = 29;
		byte i = 89;
		System.out.println(i - t);

	}

	public void Multiplication() {
		byte t = 29;
		byte i = 89;
		System.out.println(i * t);

	}

	public void Division() {
		float p = 29f;
		float r = 89;
		System.out.println(r / p);
	}

	public double Product(double d, double h) {

		double pro = h * d;
		return pro; // returning the product
	}

	public double cirmcumference(double radius) {

		return 2 * Math.PI * radius;

	}
	public double AreaOfcircle(double radius) {
		return Math.PI*radius*radius;
	}
	
	public int MaximumMethod() {
		int ty = Math.max(56, 98);
		int max = Math.max(ty, 567);
		return max;
	}
	public int minMethod() {
		int ty = Math.min(78, 98);
		int min = Math.min(ty, 567);
		return min;
	}
	//5. Define the number is even/odd
	public boolean evenOdd(int a) {
		boolean flag = a%2==0;
		if(flag) {
			System.out.println("even number");
			
		}
		else {
			System.out.println("Odd number");
		}
		return flag;
		
	}
	
	//6. Define a method to find out if the person is eligible to vote -True/False
	public boolean VoterEligibility( int c) {
		boolean flag = (c>=18);
		if (flag) {
			System.out.println("Voter is Eligible to vote");
		}else {
			System.out.println("Voter is not eligible to vote");
		}
			return flag;
	}
	//7. WAP to calculate the grade
	public String CalculateGrade(int marks) {
		
		if(marks>=91  && marks<=100) {
			return "AA";
		}else if(marks>=81  && marks<=90) {
			return "AB";
		
		}else if(marks>=71 && marks<=80) {
			return "BB";
		} else if(marks>=61 && marks<=70) {
			return "BC";
		}else if (marks>=51 && marks<=60) {
			return "CD";
		}else if(marks>=41 && marks<=50) {
			return "DD";
		}else {
			return "Fail";
		}
		
	}
	
	//8. Write a program to print the factorial of a number by defining a method named 'Factorial'
	public int Factorial(int n) {
		if( n==0 || n==1) {
			return 1;
			
		}else {
			return n* (n-1);
		}
	}

	public static void main(String[] args) {
		MethodsAssignments mA = new MethodsAssignments();
		mA.Addition();
		mA.Subtraction();
		mA.Multiplication();
		mA.Division();

		double r = mA.Product(67, 689);
		System.out.println(r);

		double an = mA.cirmcumference(13);
		System.out.println(an);
		
		double w = mA.AreaOfcircle(6);
		System.out.println(w);
		
		int max = mA.MaximumMethod();
		System.out.println("The Greatest of three numbers is" + " "+max);
		
		int min = mA.minMethod();
		
		System.out.println("The smallest of three numbers is" + " "+min);
		
		boolean b = mA.evenOdd(67);
		System.out.println(b);
		
		
		boolean el = mA.VoterEligibility(89);
		System.out.println(el);
		
		String grade = mA.CalculateGrade(35);
		System.out.println(grade);
	}
}
