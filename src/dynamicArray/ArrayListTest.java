package dynamicArray;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List(I) -----> ArrayList(C)
		// AL: it maintains the order/index
		ArrayList ar = new ArrayList();// vc=10,pc=0
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());// Virtual Capacity =8; Physical capacity =2
		ar.add(500);
		ar.add(600);

		System.out.println(ar.size());// VC=6, Pc=4

		ArrayList ar1 = new ArrayList(5);// vc=5,pc=0
		ArrayList ar2 = new ArrayList(50);// vc=50,pc=0

	}

}
