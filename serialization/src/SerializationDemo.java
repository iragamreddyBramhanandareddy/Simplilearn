import java.io.FileOutputStream;

import com.mphasis.serialization.Employee;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee=new Employee(101,"SUrya", 05000);
		try {
			FileOutputStream fos=new FIleOutputStream("data.ser");
			
		}
		
		
	}

}
