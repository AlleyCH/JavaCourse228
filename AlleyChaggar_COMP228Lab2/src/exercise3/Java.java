package exercise3;

public class Java {
	
	static public String name = "Alley";
	static public String message = "Hello World!";
	
	  public static String overLoad(String name) {
		return name;	
	}
	
	public static String overLoad() {
		return name;
	}
	
	public static String overLoad(String name, String message) {
		return name + message;
	}
}
