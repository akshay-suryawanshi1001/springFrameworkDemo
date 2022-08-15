package springFrameworkDemo.annoBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoBasedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		StaffAnno doctor = context.getBean(DoctorAnno.class);
		doctor.assist();
		
		NurseAnno nurse = context.getBean(NurseAnno.class);
		nurse.assist();
		nurse.setName("nomli");
		System.out.println("nurse name is :" + nurse.getName());
		
		NurseAnno nurse3 = context.getBean(NurseAnno.class);
		System.out.println("nurse3 name is :" + nurse3.getName());
	}

}
