package springFrameworkDemo.xmlbasedConfig;

public class Doctor implements Staff{

	@Override
	public void assist() {
		System.out.println("doctor is assisting...");
	}
}
