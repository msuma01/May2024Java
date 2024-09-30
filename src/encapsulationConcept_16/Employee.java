package encapsulationConcept_16;

public class Employee {
	// private class variables
		private String name;
		private int age;
		private double salary;
		private boolean isPerm;
		
		
		

		//public const.. is also like setter
	// for every private variable one getter and one setter should be created
		
		// setter is not mandatory to use, we can use constructor and is used to set the values for the first time
		// to update the values setters are used
		public Employee(String name, int age, double salary, boolean isPerm) {
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.isPerm = isPerm;
		}

		// public methods: getter/setter

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public boolean isPerm() {
			return isPerm;
		}

		public void setPerm(boolean isPerm) {
			this.isPerm = isPerm;
		}
}
