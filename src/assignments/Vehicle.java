package assignments;
public class Vehicle {
	String name;
	int price;
	String modelNumber;

	public static void main(String[] args) {
		//// 1. Assign car1 to car2 => car2 = car1
		Vehicle v1= new Vehicle();
		v1.name="Car";
		v1.price =56790;
		v1.modelNumber="34";
		
		Vehicle v2 = new Vehicle();
		v2.name="Bike";
		v2.price =6790;
		v2.modelNumber="Hero";
		
		Vehicle v3 = new Vehicle();
		v3.name="Cart";
		v3.price =1000;
		v3.modelNumber ="Bullock cart";
		
		Vehicle v4 = new Vehicle();
		v4.name="Train";
		v4.price = 100000;
		v4.modelNumber= "67829";
		System.out.println("Original values:");
		System.out.println(v1.name + " " + v1.price + " " + v1.modelNumber);
		System.out.println(v2.name + " " + v2.price + " " + v2.modelNumber);
		System.out.println(v3.name + " " + v3.price + " " + v3.modelNumber);
		System.out.println(v4.name + " " + v4.price + " " + v4.modelNumber);
		System.out.println("-------------------------------------");
		
		v2=v1;
		System.out.println("v2=v1");
		System.out.println(v1.name +" "+ v1.price+" " +v1.modelNumber);
		System.out.println(v1.name +" "+ v2.price+" " +v2.modelNumber);
		System.out.println("-------------------------------------");
		
		// 2. Assign car2 to car3 => car3 = car2
		v2=v3;
		System.out.println("v2=v3");
		System.out.println(v1.name +" "+ v1.price+" " +v1.modelNumber);
		System.out.println(v2.name +" "+ v2.price+" " +v2.modelNumber);
		System.out.println(v3.name +" "+ v3.price+" " +v3.modelNumber);
		System.out.println("-------------------------------------");
		//3. Assign car3 to car4 => car4 = car3
		v3=v4;
		System.out.println("if v3=v4");
		System.out.println(v1.name +" "+ v1.price+" " +v1.modelNumber);
		System.out.println(v2.name +" "+ v2.price+" " +v2.modelNumber);
		System.out.println(v3.name +" "+ v3.price+" " +v3.modelNumber);
		System.out.println(v4.name +" "+ v4.price+" " +v4.modelNumber);
		System.out.println("-------------------------------------");
		// 4. Assign car4 to car1 => car1 = car4
		v4=v1;
		System.out.println("if v4=v1");
		//5. // Print the values of car1, car2, car3 and car4 after each assignment
		System.out.println("Final values of all the vehicles");
		System.out.println(v1.name +" "+ v1.price+" " +v1.modelNumber);
		System.out.println(v2.name +" "+ v2.price+" " +v2.modelNumber);
		System.out.println(v3.name +" "+ v3.price+" " +v3.modelNumber);
		System.out.println(v4.name +" "+ v4.price+" " +v4.modelNumber);
		
		

	}

}
