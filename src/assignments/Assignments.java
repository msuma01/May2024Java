package assignments;

public class Assignments {

	public static void main(String[] args) {
//	//1.
//		String a ="Harsha";
//		String b ="Naik";
//		
//		System.out.println(a+b);//HarshaNaik
//	//2.	
//		byte c= 74;
//		byte d = 36;
//		System.out.println(c+d);//110
//	//3.
//		byte e = 50;
//		byte f = 3;
//		System.out.println(e/f);
//	//4.
//		double g = 25.5 * 3.5 - 3.5 * 3.5;
//		double h = 40.5 - 4.5;
//		double i = (g)/(h);
//		System.out.println(i);
//	//5.
//		String name ="HelloSelenium";
//		char ch = 't';
//		System.out.println(name+ ch);
//	//6.
//		int j =100;
//		int k = 200;
//		int l = 3400;
//		System.out.println("Your Total amount is " +(j+k+l));
//	//7. ASCII Value of 'h'
//		char jk = 'h';
//		System.out.println((byte)jk);
//	//8.
//		char hi = 'd';
//		int jg = hi+3;
//		
//		System.out.println((char) (jg));
//		
//		char ch3 = 'd';//99
//
//		int res = ch3+3;//100
//
//		System.out.println((char) res);
//		
//	//9. Square of 3.9
//		double nm = 3.9;
//		System.out.println(nm*nm);
//		//or
////	System.out.println(Math.pow(nm, 2));
////		
//		double num = 3.9;
//
//		System.out.println(Math.pow(num, 2));

// Type Casting
		// Widening Examples
		// 1.int to float conversion
//		int g = 200;
//		long d = g;
//		float j = d;
//		double k = j;
//		System.out.println("Int value: " + g);
//
//		System.out.println("Long value: " + d);
//
//		System.out.println("Float value: " + j);
//
//		System.out.println("Double value: " + k);
//		
//		
//		byte a = 49;
//		int h = a;
//		System.out.println(h);
//		
//		// Example 2: From char to integral types
//		char name ='p';
//		int lk = name;
//		System.out.println(lk);
//		System.out.println((byte)name);
//		// Example 1: From floating-point to integral types
//		double db = 89.345;
//		int bh = (int)db;
//		System.out.println(bh);
//		// From Long to smaller types
//		long hs = 354546345L;
//		int fj = (int)hs;
//		short sh = (short)fj;
//		byte by = (byte)sh;
//		System.out.println("Long value: " + hs);
//
//		System.out.println("Converted Int value: " + fj); // Potential loss of magnitude
//
//		System.out.println("Converted Short value: " + sh); // Potential loss of magnitude
//
//		System.out.println("Converted Byte value: " + by); // Potential loss of magnitude
//		
//		
//		/// Example 3: From char to byte
//		char hame = 'G';
//		byte hi = (byte)hame;
//		System.out.println(hi);

		// Incremental and Decremental operations
// 1.		
//			int i = 11;
//		
//			int	j = i++ + ++i;
//		
//			System.out.println(i);
//			System.out.println(j);
////2.
//			int a=11, b=22, c;
//			
//			c = a + b + a++ + b++ + ++a + ++b;
//			
//			System.out.println("a="+a);
//			System.out.println("b="+b);
//			System.out.println("c="+c);
////3.
//			int k=0;
//			int l = k++ - --k + ++k - k--;
//			System.out.println(k);
////			System.out.println(l);
//4.Is the below program written correctly?		
//			boolean g = true;
//			g++; // cannot convert from boolean to int since incremental or decremental operators are performed on mathematical calculations
//			System.out.println(g);

//5. What will be the output of the below program?	
//		int i=1, j=2, k=3;
//        int m = i-- - j-- - k--;
//      
//System.out.println("i="+i);
//
//System.out.println("j="+j);
//System.out.println("k="+k);
//System.out.println("m="+m);
		// 5. Copied
//		 int i=1, j=2, k=3;
//
//		         
//
//		        int m = i-- - j-- - k--;
//
//	
//
//		        System.out.println("i="+i);
//
//		        System.out.println("j="+j);
//
//		        System.out.println("k="+k);
//
//		        System.out.println("m="+m);
		// 6.
//		int a=1, b=2; 
//		System.out.println(--b - ++a + ++b - --a); //0
//		System.out.println(a);//1
//		System.out.println(b);//2

//7.
//		int i=19, j=29, k=0;
//
//int m = i-- - j-- - k--;
//
//
//
//	System.out.println("i="+i);
//
//	System.out.println("j="+j);
//
//	System.out.println("k="+k);
//	System.out.println("m="+m);

//8. What is wrong with the below program? Why it is showing compilation error?

//	int i = 11;
//
////int j = --(i++); //Both the operators cannot be given once
// int j = --i;
// int l = i++;
// System.out.println(j);
// System.out.println(l);
////9 Guess the value of p in the below program
// int m = 0, n = 0;
//
//int p = --m * --n * n-- * m--;
//
//System.out.println(p);
//System.out.println(m);
//System.out.println(n);

//10.
//		int a=1;
//   
//		a = a++ + ++a * --a - a--;
//     
//     System.out.println(a);
// 11.
//		int a = 11++; // Incremental and decremental cannot be performed on numbers
//       int a =11;
//       
//       System.out.println(a++);
//		// 12.
//		int ch1 = 'A';
//		
//
//   System.out.println(ch1++); 
////13. 
//   char ch = 'A';
//
//  
//   System.out.println(++ch); 
//

//14.
//		double d = 1.5, D = 2.5;
//
//	System.out.println(d++ + ++D);//1.5 + 3.5 = 5.0
//	System.out.println(d);
//	System.out.println(D);

//practice
		// 1.
//	        int x = 001, y=010, z=100;
//	         
//	        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
//	         
//	        System.out.println("x="+x);
//	        System.out.println("y="+y);
//	        System.out.println("z="+z);
//	        System.out.println("i="+i);
//	//2.
//	        int m=1010, n=1010;
//	        System.out.println(m++);
//	       System.out.println(++n);
//	       System.out.println(n--);
//	       System.out.println(--m);
//	       double j = (m++ / ++n * n-- / --m);
//	       System.out.println(j);
//	        System.out.println(m++ / ++n * n-- / --m); 
//	        int h = 1/1;
//	        System.out.println(h);
//	        int g = 3/8;
//	        System.out.println(g);
		// 3.
//		char ch = "123".charAt(1);
//		char ch1 = "123".charAt(1);
//		System.out.println(ch1);
//
//		System.out.println(ch++ + ++ch);
		
		// IFELSE
	//1. find the greatest of 25,78 and 87
		byte a=25;
		byte b=78;
		byte c = 87;
		if(a>b&&a>c) {
			System.out.println("the greatest of all three numbers is" +a);
		}else if(b>a&&b>c) {
			System.out.println("The greatest of all three numbers is" +b);
		}else
		{
			System.out.println("The greatest of all three numbers is" +c);
		}
		
   //1b. Find out the greatest of 25, 78, 87,97
		byte d= 97;
		if(a>b&&a>c&&a>d) {
			System.out.println("the greatest of all four numbers is" +a);
		}else if(b>a&&b>c&&b>d) {
			System.out.println("The greatest of all four numbers is" +b);
		}else if(c>a&&c>b&&c>d){
			System.out.println("The greatest of all four numbers is" +c);
		}else
		{
			System.out.println("The greatest of all four numbers is" +d);
		}
	//2. WAP to test a number is positive or negative	
		//TESt Data: byte number= 35; byte number = -11
		 byte number = -11;
		
		if(number>0) {
			System.out.println("The given number"+" "+number+ " is a positive number");
			}else if(number<0) {
				System.out.println("The given number"+" "+number+ " is a negative number");
			}else {
				System.out.println("The given number"+" "+number+ " is neither positive nor negative number");
			}
		
	//3. WAP to check number is even or odd	
		byte num = -99;
		if(num%2==0) {
			System.out.println(+num +":"+" It is an even number");
		}else {
			System.out.println(+num+ ":"+"It is an Odd number");
		}
	//4. WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		char alphabet = 'e';
		switch(alphabet) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;
			
		default :
			
			System.out.println(alphabet + " is a consonant ");
			break;
		
			
		}
		//5. WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		 String Environment ="raja";
		 switch(Environment) {
		 case "QA" :
			 System.out.println("Running the testcases in "+Environment+ " " +"Environment");
			break;
		 case "Stage" :
			 System.out.println("Running the testcases in "+Environment+ " " +"Environment");
				break;
		 case "Dev" :
			 System.out.println("Running the testcases in "+Environment+ " " +"Environment");
				break;
		 case "UAT" :
			 System.out.println("Running the testcases in "+Environment+ " " +"Environment");
			 break;
		 case "Prod" :
			 System.out.println("Running the testcases in "+Environment+  " " +"Environment");
			default:
				System.out.println("Please provide a valid Environment");
		 }
		 
		//6. WAP to book the specific type of car from the Uber app using Switch - Case. //1. Car Type: Mini, Sedan, SUV, Premium
		String CT = "Premium";
		switch (CT) {
		case "Mini":
			System.out.println("You have opted " + " " + CT + "type of car from Uber App");
			break;
		case "Sedan":
			System.out.println("You have  opted " + " " + CT + "type of car from Uber App");
			break;
		case "SUV":
			System.out.println("You have  opted " + " " + CT + "type of car from Uber App");
			break;
		case "Premium":
			System.out.println("You have  opted " + " " + CT + "type of car from Uber App");
			break;
		default:
			System.out.println("Please select the right Car type from Uber App ");
			break;
		 
		 }
		
		//7. WAP to launch browsers using If-ElseIf and Switch Case.
		
		String browser = "firefox";
		
		if(browser.equals("chrome")) {
			System.out.println("chrome is launched");
		}
		else if(browser.equals("firefox")) {
			System.out.println("firefox is launched");
		}
		else if(browser.equals("edge")) {
			System.out.println("edge is launched");
		}
		else if(browser.equals("ie")) {
			System.out.println("ie is launched");
		}
		else {
			System.out.println("plz pass the right browser name : " + browser);
		}
		System.out.println(browser +" " + "is launched");
		System.out.println("******Using Switch**********");
 // 7. Using Switch case
		String browser2 = "chrome";
		switch (browser2.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "IE":
			System.out.println("launch IE");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("plz pass the right browser : " + browser);
			break;


		}
		System.out.println(browser2 +" " + "is launched");
		
		
	//8. WAP to define the interest rate on the basis of Loan type using Switch Case
		String loanType = "Housing Loan";
        double salary = 30000;
        double interestRate = 0.0;

        switch (loanType) {
            case "Car Loan":
                interestRate = 8.5;
                break;
            case "Housing Loan":
                if (salary < 35000) {
                    System.out.println("NOT APPLICABLE FOR Housing Loan");
                    break;
                }
                interestRate = 6.5;
                break;
            case "Personal Loan":
                interestRate = 10.0;
                break;
            case "Education Loan":
                interestRate = 7.0;
                break;
            default:
                System.out.println("Invalid loan type");
                break;
        }

        System.out.println("Interest rate for " + loanType + " is " + interestRate + "%");
    

	}

}
