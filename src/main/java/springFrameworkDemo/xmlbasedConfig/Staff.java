package springFrameworkDemo.xmlbasedConfig;

public interface Staff {
	
	default void assist() {
		System.out.println("default assisting...");
	}

}
