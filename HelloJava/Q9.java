package Assignment_01;
import unit01.FirstClass;

public class Q9 {
	
	public static void main( String args[] ) {
		System.out.println("KARAN RANA OF SECTION H");
		FirstClass obj = new FirstClass();
		System.out.println(obj.a); // this is the member of public class FirstClass in Unit_01 package
		
		Access obj1 = new Access( 12 , 13 , 14 , 15 );
		
		System.out.println("Defaut : "+obj1.a);
		System.out.println("Public : "+obj1.b);
		System.out.println("Protected : "+obj1.c);
		
		//obj1.d can't be accessed outside Access class/
		//System.out.println("Private : "+obj1.d);
	}
}

class Access{
	int           a;
	public int    b;
	protected int c;
	private int   d;
	
	Access( int a , int b , int c , int d ){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	void display() {
		System.out.println("Defaut : "+a);
		System.out.println("Public : "+b);
		System.out.println("Protected : "+c);
		System.out.println("Private : "+d);
		
		return;
	}
}