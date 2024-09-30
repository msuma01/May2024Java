package assignments;

public class Employee {
	//q1: Define a class named Employee with the following attributes:
	String name;
	int age;
	double salary;
	static double totalSalary=0;

	public static void main(String[] args) {
	//q2: Define a class named Employee with the following attributes:
		
		//q3: Create three Employee objects and initialize their properties with different values.
		//Employee1
		Employee e1 = new Employee();
		
		e1.name = "Raja";
		e1.age=28;
		e1.salary = 30000;
		
		double ts =totalSalary +e1.salary;
		
		//q4: Print the details of each employee and the total salary of all employees.
		System.out.println("Name:"+e1.name+" "+"Age:"+e1.age);
		System.out.println("Salary: "+ts);
		
		//Employee2
		Employee e2 = new Employee();
		
		e2.name = "Jhansi";
		e2.age=24;
		e2.salary = 28000;
		double ts2=ts+e2.salary;
	
		
		//q4: Print the details of each employee 
				System.out.println("Name:"+e2.name+" "+"Age:"+e2.age);
				System.out.println("Salary: "+e2.salary);
				System.out.println("Total salaries of two Employee:"+ ts2);
		
		//Employee3
		Employee e3 = new Employee();
	
		e3.name = "Susmitha";
		e3.age=30;
		e3.salary = 40000;
		double ts3=ts2+e3.salary ;
		
		
		//q4: Print the details of each employee
		System.out.println("Name:"+e3.name+" "+"Age:"+e3.age);
		System.out.println("Salary: "+e3.salary);
		
		//q4:  the total salary of all employees.
		System.out.println("Total salaries of all three employees:"+ (ts3));
		
		
		
		//q5: Give a raise to one employee by increasing their salary, and update the total salary accordingly.
		e1.salary= 50000;
		System.out.println("Updating the salary of employee1"+" "+ e1.salary);
		
		double ts4= ts3+e1.salary;
		System.out.println("Total updated salaries of all  the employees:"+ ts4);
		
		//q5: Create another Employee object with a different salary and update the total salary of all employees.
		
		Employee e4= new Employee();
		e4.name = "Surya";
		e4.age= 35;
		e4.salary= 70000;
		//q6:Print the details of the new employee and the updated total salary of all employees.
		double ts5 =ts4+ e4.salary;
		System.out.println("Total updated salaries of all four employees: "+ ts5);
	
		

		
	
		

	}

}
