package assignments;

import java.util.Arrays;

public class ArraysAssignments {

	public static void main(String[] args) {
		
//		
//		//1.//matrix n*n*n
////i--->0 to 5
////j--->0 to 5
////k--->0 to 5
////6*6*6
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<=5;j++){
//			for(int k=0;k<=5;k++) {
//				System.out.print(i+""+j+""+k+" ");
//			}
//			
//		}
//		
//
//			System.out.println();
//
//	} how can this be done?
		//1.  WAP to delete a specific number from the given array.
		
		//Need to remove 22 from the p[] array.
// output should be: [1, 4, 5, 2, 3, 31, 2]
		int p[] = {1,4,5,2,3,22,31, 2}; 
		int[] a = new int[p.length-1];
		System.out.println(Arrays.toString(p));
		int j = 0;
		for (int i = 0; i < p.length; i++) {
		    if (p[i] != 22) {
		        a[j] = p[i];
		        j++;
		    }
		}

		System.out.println(Arrays.toString(a));

		
		//2. Write a program to create a static Array, having following cricket data:
//		
//
//		-
		//1.--name, age, team name, DOB, gender, Strike Rate
		String name[] = new String[3];
		name[0]= "Shane Watson";
		name[1] =" M.S.Dhoni";
		name[2]= "Virat Kohli";
		
		int age[] = new int[3];
		age[0] =56;
		age[1]=34;
		age[2]=68;
		
		String team[] = new String[3];
		team[0]="India";
		team[1]="Australia";
		team[2]="South Africa";
		System.out.println(age[0]);
		
		
		
		//2.Try to create multiple Object Arrays for different players 
		Object obj1[] = new Object[7];
		obj1[0]= "Bhavani";
		obj1[1] =34;
		obj1[2]= "India";
		obj1[3] = "23-5-1990";
		obj1[4]= 'F';
		obj1[5]= 56.456;
		
		//object2
		Object obj2[] = new Object[7];
		obj2[0]= "Rani";
		obj2[1] =30;
		obj2[2]= "India";
		obj2[3] = "29-08-1992";
		obj2[4]= 'F';
		obj2[5]= 100.456;
		
		//object3
		Object obj3[] = new Object[7];
		obj3[0]= "Bahadur";
		obj3[1] =32;
		obj3[2]= "India";
		obj3[3] = "29-08-1991";
		obj3[4]= 'M';
		obj3[5]= 166.456;
		
		
		
		//3. Try to print all the values of each player on the console using for and for each loops
		for(int i=0; i<=6;i++) {
			System.out.print(obj1[i] +" ");
		
			System.out.print(obj2[i] +" ");
			
			System.out.print(obj3[i] +" ");
		}
		
//		for(Object e: obj1) {
//			System.out.println(obj1[e]);
//			
//		}
//		
//		for (Object e : data) {
//			System.out.println(e);
//			if (e.equals(30)) {
//				System.out.println("age is less than 50");
//			}
//		}
}
}