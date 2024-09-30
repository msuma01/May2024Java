package session1;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		//Practice for concatenation
		
		for (int i=0;i<=5;i++) {
			for(int j=0; j<=5;j++) {
				System.out.print(i+""+j+" ");
				break;
			}
			System.out.println();
		}
		
		
		int i=1, j=2, k=3;
        int m = i-- - j-- - k--;
        System.out.println("m="+m);

System.out.println("i="+i);

System.out.println("j="+j);
System.out.println("k="+k);



String alphabet = "H";
switch(alphabet) {
case "A":
	System.out.println("a is vowel");
	break;
case "E":
	System.out.println("e is vowel");
	break;
case "I":
	System.out.println("i is vowel");
	break;
case "O":
	System.out.println("o is vowel");
	break;
case "u":
	System.out.println("u is vowel");
	break;
	
default :
	
	System.out.println(alphabet + " is a consonant ");
	break;

	
}


	}

}
