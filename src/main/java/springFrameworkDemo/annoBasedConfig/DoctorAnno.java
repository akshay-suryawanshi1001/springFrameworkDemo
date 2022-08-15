package springFrameworkDemo.annoBasedConfig;

import org.springframework.stereotype.Component;

@Component
public class DoctorAnno implements StaffAnno{

	@Override
	public void assist() {
		System.out.println("doctor is assisting...");
	}
}
