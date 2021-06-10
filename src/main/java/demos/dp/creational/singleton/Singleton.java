package demos.dp.creational.singleton;

public class Singleton {

	//Early Instantiation - Creating the object at load time
	//private static Singleton singleton = new Singleton();
	
	private static Singleton singleton = null;

	// Making the constructor as private. So, that the class cann't be instantiated
	private Singleton() {
	}

	// Factory method to return the object
	public static Singleton getSingleton() {
		if (null == singleton) {
			synchronized (Singleton.class) {
				if (null == singleton) { // Double check locking - checking null two times
					//Lazy Instantiation - Creating the object when first request
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
