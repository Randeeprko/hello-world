package demo;

// to use interfaces we can implement that interface using implements keyword and must override all the abstract methods
// or make this class as abstract class
public class Players implements Player {

	public static void main(String[] args) {
	   Player player = new Players();
//	   System.out.println(player.id);       // can access static field using object but will get warning
	                                        // The static field Player.id should be accessed in a static way
 
	   System.out.println(Player.id);       // correct way to access static field ClassName.fieldName 
	   System.out.println(id);           
	   System.out.println(player.move());
	   
	   player.display();
	   Player.disp();
	   
	   // Player.id = 15;        // compilation error because we can't update final variable.

	}

	 
	 @Override // used this annotations to make sure method signature of overridden method is correct, its optional
	 public int move() { 
		 return 0; 
	 }
	

}
