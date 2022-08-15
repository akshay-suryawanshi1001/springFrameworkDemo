package springFrameworkDemo.annoBasedConfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")    //singleton is default, request and prototype are 2 other types
@Component
public class NurseAnno implements StaffAnno{
	
	private String name;

	@Override
	public void assist() {
		System.out.println("Nurse is assisting...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
