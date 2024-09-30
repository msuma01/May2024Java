package exceptionHandling_21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 9/0; //RunTime Exception
		try {
			FileInputStream ip = new FileInputStream("test.xls");//CT
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
