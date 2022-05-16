package demo;

public interface Player {
	// In interfaces only one access specifier public is used
    // by default public, static and final 
    int id = 10;
	// public and abstract
	int move();
	
	// Since jdk 1.8 we can have default and static methods in interfaces, no need to override these
	default void display() {
		name();
		System.out.println("hello");
	}
	
	// can access without creating objects
	static void disp() {
		sub();
		System.out.println("world");
	}
	
	// Since jdk 1.9 we can have private and private static methods
    private static void sub() {
		System.out.println("private static method");
	}
	
    private void name() {
		System.out.println("private method");
	}
}
