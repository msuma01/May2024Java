package assignments;

public class LoopAssignments {

	public static void main(String[] args) {
//		//1. WAP to print following output
//		for(int i=0;i<=4;i++) {
//			System.out.println("Iam Batman");
//		}
//		System.out.println("--------------------");
		
//		//2.WAP to print following output i.e, Iam Batman1
		
//		for(byte j=1; j<=9;j++) {
//			System.out.println("I am Batman"+" "+j);
//		}
	//3.WAP to print 10 to 1 using for, while and do-while loop
		
		//for
//		System.out.println("*******Using for loop*******");
//		for(byte k =10;k>=1;k--) {
//			System.out.println(k);
//		}
//		//while
//		System.out.println("*******Using while loop*******");
//		int i=10;
//		while(i>=1) {
//			System.out.println(i);
//			i--;
//		}
//		System.out.println("*******Using do- while loop*******");
//		int u=10;
//		do {
//			System.out.println(u);
//			u--;
//		}while(u>=1);
//		
		
		
		//4.Write a program in Java to print "Hello World" ten times using while loop
		
//		byte l =10;
//		while(l>=1) {
//			System.out.println("Hello World");
//			l--;
//		}
//		//5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		
//		// 1. for
//		 for(int i=1;i<=100;i++) {
//			 int w= i*5;
//			 System.out.println("5 *"+i + " ="+w);
//		 }
		 //2.while loop
//		int j=1;
//		while(j<=100) {
//			int w= j*5;
//			System.out.println("5 *"+ j+ " ="+w);
//			j++;
//		}
		//3. do-while
//		int y=1;
//		do {
//			
//			int w= y*5;
//			System.out.println("5 *"+ y+ " ="+w);
//			y++;
//		}while(y<=100);
//		
		
		
		
		//6. Print all odd and even numbers between 1 to 100
		
//		  for (byte j=1;j<=100;j++) {
//			  if(j%2==0) {
//				  System.out.println("Even number"+j);
//			  }
//			  
//		  }
//		  //odd
//		  for (byte p=1;p<=100;p++) {
//			  if(p%2!=0) {
//				  System.out.println("Odd number"+p);
//			  }
//		  }
////		//7. output?
		
//		  int i = 1;
//		  while(i<=1){
//			  System.out.println("Hi Java");
//			  }  // infinite loop since increment or decrement is not given
		
//		 // /8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		
//		  for(int j=97;j<=122;j++) {
//			  System.out.println((char)j + "="+" "+j);
//		  }
//		  for(char m='A'; m<='Z';m++) {
//			  System.out.println(m + "="+" "+(byte)m);
//		  }
//		  for(char n ='0'; n<='9';n++) {
//			  System.out.println("ASCII value of number"+n+" is"+(byte)n);
//		  }
//		System.out.println("Using while loop");
//		//Using while loop
//		  //A-Z
//		  char k='A';
//		  while(k<='Z') {
//			  System.out.println(k + "="+" "+(byte)k);
//			  k++;
//		  }
//		 //a-z
//		  char l='a';
//		  while(l<='z') {
//			  System.out.println(l + "="+" "+(byte)l);
//			  l++;
//		  }
//		  char p='0';
//		  while(p<='9') {
//			  System.out.println(p + "="+" "+(byte)p);
//			  p++;
//		  }
	//9. 1. Even Numbers Series: Write a Java program to print the series of even numbers from 2 to 100.
		
		  //for
//		  for (byte i=1;i<=100;i++) {
//			  
//			    if(i%2==0){
//			  
//			  System.out.println(i);}
//		  }
		//or even number series
		for(byte d=1;d<=100;d++) {
			d++;
			System.out.println(d);
			
		}
//		  //while
//		  byte u=1;
//		  while(u<=100) {
//			  if(u%2==0){
//				  
//				  System.out.println(u);
//				  }
//			  u++;
//		  }
//	//9. 2.Reverse Alphabet Series: Develop a Java program to print the series of lowercase alphabets in reverse order from 'z' to'a'
		
//		  //for
//		  for(char f='z';f>='a';f--) {
//			  System.out.println(f);
//		  }
//		  //while
//		char ch ='z';
//		while(ch>='a') {
//			System.out.println(ch);
//			ch--;
//		}
		  
//	//9.3.	 Floating Point Series: Write a Java program to print the series of floating-point numbers from 1.0 to 10.0.
		
//		  for(float h=1.0f;h<=10.0f;h++) {
//			  System.out.println(h);
//			  
//		  }
//		  //while
//		float g =1.0f;
//		while(g<=10.0) {
//			System.out.println(g);
//			g++;
//		}
		  
	//9.4. Multiples of 9 Series: Develop a Java program to print the series of numbers where each number is a multiple of 9, starting from 0 and ending at 99.	
		// 1. for
//			 for(int i=0;i<=99;i++) {
//				 int w= i*9;
//				 System.out.println("9 *"+i + " ="+w);
//			 }
//			// 2.while loop
//			int j=0;
//			while(j<=99) {
//				int l= j*9;
//				System.out.println("9 *"+ j+ " ="+l);
//				j++;
//			}
		
	//10. Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		
			// for
//			for (char y='a';y<='z';y++) {
//				if(y=='a'|| y=='e'||y=='i'||y=='o'||y=='u') {
//					System.out.println(y + " ");
//				}
//			}
//			//while
//			char f='a';
//			while(f<='z') {
//				if(f=='a'|| f=='e'||f=='i'||f=='o'||f=='u') {
//					System.out.println(f + " ");
//					
//			}
//				f++;
//
//	}
			//11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		
//			for(int i=1;i<=10;i++) {
//				if(i%7==0) {
//					System.out.println("bye, see you tomorrow");
//				}else
//				{
//					System.out.println(i);
//					
//				}
//				
//			}
//			//while loop
//		int k=1;
//		while(k<=10) {
//			if(k%7==0) {
//				System.out.println("bye, see you tomorrow");
//			}else
//			{
//				System.out.println(k);
//			}
//				
//				k++;	
//
//	
//			}
}
}