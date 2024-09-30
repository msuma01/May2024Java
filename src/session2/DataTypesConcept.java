package session2;

public class DataTypesConcept {

	public static void main(String[] args) {
		//Data types
		// 1. Primitive data type : All are reserved data types
			//Numeric type:
					// Integral value
		     			//Integer: byte, short, int, long
						//floating-type: float, double
					//character: char :$ a 1
		
			//Boolean type: Boolean(true/false)
		
		
		// 2. Non- Primitive data type : Class, array, objects, interface

	//1. byte:
		
		// size: 1byte = 8 bits
		// Range: -128 to +127 (2^7 to 2^7-1)
		byte d = 10;
		 d= 20; // now d=20
		 System.out.println(d);
		 byte h = 100;// (Yellow line represents unused variables)
		 byte c=-120;
		 System.out.println(c);
		 	// we cannot go beyond	 byte k = 130;
		 		// Eg: Age, months
		 
	//2. short:		
		 //size: 2 bytes = 2*8 = 16 bits
		 // range: -32768 to 32767 (-2^15 to 2^15-1)
		 
		 short jk = 300;
		 short oj =20;
		 System.out.println(jk);
		 short gh =1; // not a good practice since short is allocating 2 bytes but it is not required
		 short r = 500;
		 
	// 3. int
		 //size: 4 bytes = 4*8 = 32 bits
		 //Range: -2147483648 to 2147483647 (-2^31 to + 2^31+1)
		 //int o = 67.89; // not valid
		 int i = 200000;
		 int j=1; //4 bytes // not a good practice since 'int' will allocate 4 bytes but it require only 'byte'
		 System.out.println(i);
		 System.out.println(j);
		 
	// 4. long
		 //size: 8 bytes = 8*8 = 64 bits
		 // Range: (-2^63 to 2^63-1)
		 long l =4568798087877982754L; // to represent the long number we have to add suffix 'L' or 'l'
		 System.out.println(l);
		 // population, distance between sun and moon
		 
		 // mobile number, adhar, account ---> String
		 
	 // 5. Float
		 //size= 4 bytes = 4*8 = 32
		 //range: after . it can take up to 6-7 digits
		 float n = 7.34f;// 4bytes // to represent the float number we have to add 'f'
		 float number = (float)5.89;
		 float p= 299;
		 System.out.println(p);
		 System.out.println(n);
		 System.out.println(number);
		 
	 // 6.double
		 //size= 8bytes = 64 bits
		 double t = 43.78; // 8 bytes
		// range:after . it can take up to 15 decimal digits
		 System.out.println(t); 
		 double w =456;
		 System.out.println(w);
		 
	// 7. Character: 1 digit value  : unicode values + ASCII values
		 //size = 2 bytes = 8*2 = 16 bits
		 char ch = '9';
		 char ji = 'h';
		 System.out.println(ch);
		 char kl = '1';
		 char lo = '%';
		// char hj = '-3'; // we cannot define negative values
		 System.out.println(lo);
		 System.out.println(kl);
		 
		 System.out.println('t');
		 System.out.println('t'+10); // why it is 126? 
		// Gender value, 
		// why char are in numeric family?
		 
	// 8. Boolean : true/false
		 //size: ~ 1 bit 
		// boolean d23= 0; we cannot write 0 or 1
		 boolean bl = false; 
		 System.out.println(bl);
		 // if...else , assertion, validation
		 //Usauge
		 byte rt =3;
		 byte er = 5;
		// byte q = rt+er; // (the resultant may be out of range and rt and er may be dynamic and should not use byte)
		 // but we can use int in arithmetic operations
		 int s = rt+er; // the right data type for s is either 'int' or 'long'
		 System.out.println(s);
		 
		 float th = 223456789403287463829384928439025829312f;
		 // 39 digits
				 // 309 for double before the . in float
		 double ds = 124688;
		 
		 
		 
		 
		 
		
	}

}
