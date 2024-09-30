package session10;

public class Employee {

	//Class :category / template / blueprint to create an object
	//Object: physical entity created from the class
	//class vars:/ global variablws / template vaariables
	String name;
	int age;
	double salary;
	boolean ispermant;
	char gender;
	
	public static void main(String[] args) {
		//create object using new key word;
		// new employee ()--> object/ instance
		//obj --> object reference variable
		//Employee-> class
		//new-> keyword
		Employee obj = new Employee();
		System.out.println(obj.name);
		System.out.println(obj.ispermant);
		System.out.println(obj.age);
		System.out.println(obj.gender);
		System.out.println(obj.salary);
		
		obj.name = "Mani";
		obj.gender = 'F';
		obj.age =53;
		obj.ispermant = true;
		
		System.out.println(obj.name);
		System.out.println(obj.ispermant);
		System.out.println(obj.age);
		System.out.println(obj.gender);
		System.out.println(obj.salary);
		
		
		// no reference objects
		new Employee();
		new Employee().name = "Bhani";
		
		// null pointer object reference
		Employee o = new Employee();
		o= null;
		o.name = "krishna"; // Null pointer exception (NPE)
		System.out.println(o.name);
		//System.gc(); // there is no fixed garranty that it will call GC
		
		Employee p1;
		p1 = new Employee();
		p1.name = "Farahn";
		
		//System.gc();//there is no fix gurantee that it will call the GC....
		
		
		
				Employee p;//local var
				p = new Employee();
				
				String s = null;
				System.out.println(s.equals("naveen"));

	}

}
