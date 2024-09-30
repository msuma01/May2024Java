package session9;

public class NestedLoop {

	public static void main(String[] args) {
		//---for -- outer loop
		///- for --- inner loop
		
		// Use cases 
		//1. Web table
		//2. Using Excel sheets
		
		//00 to 55
		for (int i=0;i<=5;i++) {
			for(int j=0; j<=5;j++) {
				System.out.println(i+""+j);
			}
		}
		//00 01 02 03 04 05
		//10 11 12 13 14 15
		//20 21 22 23 24 25
		//30 31 32 33 34 35
		//40 41 42 43 44 45
		
		
		
		for (int i=0;i<=5;i++) {
			for(int j=0; j<=5;j++) {
				System.out.print(i+""+j+" ");
				
			}
			System.out.println();
		}
		
//		///00 
//		10 
//		20 
//		30 
//		40 
//		50 
//			
		
		for (int i=0;i<=5;i++) {
			for(int j=0; j<=5;j++) {
				System.out.print(i+""+j+" ");
				break;
			}
			System.out.println();
		}
		
		/// 00 01 02 03 04 05 
		for (int i=0;i<=5;i++) {
			for(int j=0; j<=5;j++) {
				System.out.print(i+""+j+" ");
				
			}
			System.out.println();
			break;
		}
		///00
		for (int i=0;i<=5;i++) {
			for(int j=0; j<=5;j++) {
				System.out.print(i+""+j+" ");
				break;
			}
			System.out.println();
			break;
		}


	}

}
