package Assignment_01;
public class Q4 {
	public static void main( String[] args ) {
		ClassThree obj = new ClassThree(1);
		System.out.println("\n");
		ClassThree obj1 = new ClassThree();
	}
}
class ClassOne{
	ClassOne( int x ){
		System.out.println("You are inside Class One's parameterized constructor.");
	}
}
class ClassTwo extends ClassOne{
	ClassTwo(){
		super(8);
		System.out.println("You are inside Class Two's default constructor.");
	}
}
class ClassThree extends ClassTwo{
	ClassThree(){
		System.out.println("You are inside Class Three's default constructor.");
	}
	ClassThree( int x ){
		System.out.println("You are inside Class Three's parameterized constructor.");
	}
}