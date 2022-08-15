package springFrameworkDemo.annoBasedConfig;

public interface StaffAnno {
	
	default void assist() {
		System.out.println("default assisting...");
	}

}
