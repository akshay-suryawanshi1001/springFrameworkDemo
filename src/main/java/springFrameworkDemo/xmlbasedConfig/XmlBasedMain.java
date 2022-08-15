package springFrameworkDemo.xmlbasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBasedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Staff doctor = context.getBean(Doctor.class);
		doctor.assist();
		
		Nurse nurse = context.getBean(Nurse.class);
		nurse.assist();
		nurse.setName("nomli");
		System.out.println("nurse name is :" + nurse.getName());
		
		Nurse nurse3 = context.getBean(Nurse.class);
		System.out.println("nurse3 name is :" + nurse3.getName());
	}

}
