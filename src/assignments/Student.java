package assignments;

public class Student {
	String name;
	int age;
	int rollnumber;
	static final String classname = "5th standard" ;
	char section;
	int MarksScored;
	public static void main(String[] args) {
		  int totalStudents = 0;
		  
		// q1: Create two Student objects and initialize their properties.
		
		  Student s1 = new Student();
		s1.name ="Sundar";
		s1.age=10;
		s1.rollnumber =18;
		s1.section ='A';
		s1.MarksScored = 50;
		totalStudents++;
		// q2: Print the details of each student and the total number of students
		
				System.out.println(Student.classname);
				System.out.println("Name :"+" "+s1.name+ " "+"Age:"+ s1.age);
				System.out.println("Rollnumber:"+s1.rollnumber +" "+"Sec:"+ s1.section +" "+"Marks"+s1.MarksScored);
				System.out.println("Total number of Students:" + " "+ totalStudents );
				
		
		Student s2 = new Student();
		s2.name ="Shyam";
		s2.age= 9;
		s2.rollnumber = 14;
		s2.section ='B';
		s2.MarksScored = 89;
		totalStudents++;
		
		
		
		System.out.println(Student.classname);
		System.out.println("Name :"+" "+s2.name+ " "+"Age:"+ s2.age);
		System.out.println("Rollnumber:"+s2.rollnumber +" "+"Sec:"+ s2.section +" "+"Marks:"+s2.MarksScored);
		System.out.println("Total number of Students:" + " "+ totalStudents );
	
		
		//Modifying the age and print the updated details.
		s1.age= 9;
		System.out.println("Age is modified for student s1");
		System.out.println("Name :"+" "+s1.name+ " "+"Age:"+ s1.age);
		System.out.println("Rollnumber:"+s1.rollnumber +" "+"Sec:"+ s1.section +" "+"Marks"+s1.MarksScored);
		
		// q4: Create another Student object and update the total number of students.
		Student s3 = new Student();
		s3.name ="Krishna";
		s3.age= 11;
		s3.rollnumber = 19;
		s3.section ='A';
		s3.MarksScored = 98;
		totalStudents++;
		
		System.out.println(Student.classname);
		System.out.println("Name :"+" "+s2.name+ " "+"Age:"+ s2.age);
		System.out.println("Rollnumber:"+s2.rollnumber +" "+"Sec:"+ s2.section +" "+"Marks:"+s2.MarksScored);
		System.out.println("Total number of Students:" + " "+ totalStudents );
	
		
		
		

	}

}
