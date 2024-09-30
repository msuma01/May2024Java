package session9;

public class TimeComplexity {

	public static void main(String[] args) {
		//Tc: Big oh---Big O(n);
	
		//1.
		int i =1;
		System.out.println(i);
		//O(1);--- constant ttime
		//2. 
		for (int p=1; p<=10;p++) {
			System.out.println(p);
		}
		// 1+n+n+n (p=1;p<=10;syso one; p++) -->3n+1---> Linear equation
		//3n+1--->3n--->n -> O(n)
		//n+c -> n-> no of inputs c-> constant
		
		//
		
		
		
		//Tc: Big Oh()--Big O(n)
		
				//1. 
				int l = 1;
				System.out.println(l);
				
				//O(1) --constant time
				
				//2. 100 secs -->0.00001
				for(int p = 1; p<=10; p++) {
					System.out.println(p);
				}
				
				//1+n+n+n => 3n+1 --> Linear Equation: n+c
				//3n+1 ==> 3n --> n --> O(n)
		int k = 1;
		while(k<=10) {
			System.out.println(k);
			k++;
		}
		
		//1+n+n+n==>3n+1==>3n==>n==>O(n)
		
		//m*n
		for (int m = 0; m <= 5; m++) {
			for (int n = 0; n <= 5; n++) {
				System.out.print(m + "" + n + " ");
			}
			System.out.println();
			System.out.println("Hi");

		}
		
		//(1+n+n+n+n)(1+n+n+n)==>(1+4n)(1+3n)==>1+4n+3n+12n^2 ==> 12n^2+7n+1 ==> quadratic equation
		//12n^2+7n+1 ==>12n^2+7n ==> n(12n+7)==>12n^2 ==> n^2 ==> O(n^2)
		
		//n*n*n==>n^3==>O(n^3) --> cubic equation
		for (int m = 0; m <= 5; m++) {
			for (int n = 0; n <= 5; n++) {
					
					for(int v=0; v<=5; v++) {
						System.out.print(m + "" + n + v+ " ");

					}
				
				
			}
			System.out.println();

		}
		
		
		//log n:
		//n=32
		//n/2=16
		//n/4=4
		//n/8==2
		
		//tc = n/k
		//T = n/k;
		//log T = log(n/k);
		//log T = log n - log k
		//log T = 1-log k
		//log T = log k;
		//O(log n)

	}

}
