package springFrameworkDemo.xmlbasedConfig;

import org.springframework.context.annotation.Scope;

//@Scope("prototype")    //singleton is default, request and prototype are 2 other types
public class Nurse implements Staff{
	
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
