package abstraction_19;

public class Practice {
	
	 static void swapValuesWithoutUsingThirdVariable(int[] values) {
//	        // Steps as listed in algorithm
//	        // Difference of 2nd from 1st
//	        // is stored in first variable
//	        values[0] = values[0] - values[1];
//	        // Sum is stored in second variable
//	        values[1] = values[0] + values[1];
//	        // Difference of 1st from 2nd
//	        // is replaced in first variable
//	        values[0] = values[1] - values[0];
		 
		
	    }
	 public static String add_Binary(String x, String y) {
		 int num1 = Integer.parseInt(x, 2);
	        // converting binary string into integer(decimal
	        // number)
				 System.out.println(num1);
	 
	        int num2 = Integer.parseInt(y, 2);
	        // converting binary string into integer(decimal
	        // number)
	        System.out.println(num2);
	 
	        int sum = num1 + num2;
	        // Adding those two decimal numbers and storing in
	        // sum
	        System.out.println(sum);
	 
	        String result = Integer.toBinaryString(sum);
	        // Converting that resultant decimal into binary
	        // string
	 
	        return result;
	 }
	 
	 
	


	public static void main(String[] args) {
		 String x = "011011", y = "1010111";
		 System.out.print(add_Binary(x, y));
	       
	    }

	}


