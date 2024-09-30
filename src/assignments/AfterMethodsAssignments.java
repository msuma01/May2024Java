package assignments;

public class AfterMethodsAssignments {
// 1.  Write a method to print "Hello, World!" to the console without taking any input.
	
	 public void printHello() {
		 System.out.println("Hello, World!");
	 }
	 
	 //2. Method with Return Value (int) and with Parameters (int, int): add two integers
	 public int Add(int numb1, int number2) {
		 return numb1+number2;
	 }
	 
	 //3. Method with Return Value (boolean) and with Parameters (String, String):
	 // Write a method to compare two strings and return true if they are equal, false otherwise.
	 
	 public static boolean compareStrings(String str1, String str2) {
	        // Check if both strings are null
	        if (str1 == null && str2 == null) {
	            return true;
	        }
	        // Check if one string is null while the other is not
	        else if (str1 == null || str2 == null) {
	            return false;
	        }
	        // Compare the strings
	        return str1.equals(str2);
	        
	 }
	 
	 // 4. Write a method to calculate the average of elements in a double array and return the result
	 
	 public static double calculateAverage(double[] numbers) {
		 double sum =0.0;
		 for (double e: numbers) {
			 sum= sum+e;
		 }
		 
		 return sum/numbers.length;
		 
	 }
	 
	 //5. : Write a method to concatenate all strings in a string array and return the concatenated string.
	 public static String concatenateStrings(String[] mystr) {
		 String  str1 = " ";
		 for(String e: mystr) {
			str1= str1+e;
		 }
		 return str1;
	 }
	 
	 //6. Write a method to reverse the order of elements in an Object array and return the reversed array. 
	 
	 
	public static void main(String[] args) {
		AfterMethodsAssignments as = new AfterMethodsAssignments();
		
		as.printHello();
		int ad = as.Add(31, 98);
		System.out.println("Sum of the two numbers is:"+ ad);
		
		 String str1 = "hello";
	        String str2 = "hello";
	        
	        boolean result = compareStrings(str1, str2);
	        
	        System.out.println("Are the strings equal? " + result);
		

	        double d[] = {1.2,1.3,1.4,1.5};
	      double avg = calculateAverage(d);
			System.out.println(avg);
			
			String str[] = {"Naveen", "Automation", "Labs", "Java", "Selenium"};
			String st = AfterMethodsAssignments.concatenateStrings(str);
			System.out.println(st);
	}

}
