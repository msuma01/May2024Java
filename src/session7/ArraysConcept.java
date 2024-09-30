package session7;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		//Array
		//similar type of data in a collection
		//1. static array: size is fixed
		//2. dynamic array: dynamic size
		
		
		//two major limitations:
				//1. size is fixed(static array): to overcome this, we use ArrayList(Dynamic Array)
				//2. can store only similar data types: to overcome this, we can use Object array but this still a static array
				
		//1. using new keyword
		int i[]= new int[4];
		
		i[1]=20;
		i[2]=30;
		i[3]=40;
		int h = i.length;
		System.out.println("lenth is"+ h);
		System.out.println("highest index="+ (h-1));
		
		System.out.println(i[1]);
	//	System.out.println(i[-1]);// AIOB Exception // Index should not be negative
	//	System.out.println(i[4]);// AIOB Exception // since it is out of bound of arrray i
		System.out.println(i[0]); // since i[0] is not filled default value is filled
		System.out.println("Li is "+0);
		
		// to print all the values of array: use for loop: since the array range is fixed
		//o to 3
		for(int k=0;k<=i.length-1;k++) {
			System.out.println(i[k]);
		}
//		for(int k=0;k<=i.length;k++) { // AIOB
//			System.out.println(i[k]);
//		}
		// without for loop print the values of array -- to string method
		System.out.println(Arrays.toString(i));
		
		int l[] = new  int [3];
		l[1]=200;
//		System.out.println(l[1]);
//		System.out.println(l[0]);
//		System.out.println(l[2]); =
		//l[4]=50; //AIOB
		//int u[] = new int [-3]; // NegativeArraySizeException
		char k[] = new char[8];
		k[1] = 98;
		k[3]= 'a';
		System.out.println(k[1]);
		System.out.println("-------------Array Literals--------------");
		
		
		//Array Literals: static array:
		int num[] = {10,20,30,50,12,34};//6-->0 to 5
		
		for(int w=0; w<=num.length-1; w++) {
			System.out.println(num[w]);
		}
		
		
		
		
		//if we have the data already with us
		System.out.println(num.length);//6
		System.out.println(num[0]);
		//System.out.println(num[6]);
		System.out.println(Arrays.toString(num));
		num[0] = 400;
		System.out.println(Arrays.toString(num));
		
//		int test[] = new int[0];// AIOB
//		test[0]=1;
//		System.out.println(test[0]);


		
		int pop[] = new int[10];//if we are not sure about the full data
		pop[1]=98;


		String browser[] = {"chrome", "firefox", "edge"};//0-2
		System.out.println(browser.length);//3
		
		//browser[3] = "ie";
		
		
		
		for(String e : browser) {
			System.out.println(e);
		}

	}

}
