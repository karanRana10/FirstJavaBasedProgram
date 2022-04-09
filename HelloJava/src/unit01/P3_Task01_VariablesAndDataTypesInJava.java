package unit01;
/*
variables in java is a data container that saves the data values during the java execution.
Types of variables:
In java, there are three types of variables:
Local variabes- Declare inside the body of method.

Instance variables - instance variables are declared without the STATIC keyword.
-They are defined outside a method declaration.
-They are object specific and are known as instance variables.

 Static variables - 
 -static var. are defined with the static keyword.
 -static var. are initialized only once,at the start of the program execution.
 -these static variable should be initialzed first,before the limitations of any other.
 
 Data Types In Java:
 
 */

public class P3_Task01_VariablesAndDataTypesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     //void declaration
		int a,b,c;
		float pi;
		double d;
		char e;
		
		//void Initialization
		pi=3.14f;
		d=20.22d;
		e= 'v';
		
		a=10;
		b=10;
		c=10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum = 5;//integer whole num.
		float myfloatNum= 5.99f;//floating point num.
		char myLetter= 'D';//character
		boolean myBool= true;//boolean
		String myText="hello";//string
		 System.out.println(myNum);
		 System.out.println(myfloatNum);
		 System.out.println(myLetter);
		 System.out.println(myBool);
		 System.out.println(myText);
		 
		 /*
		  * Java variable type conversion & type casting: Detail given below
		  */
		 double f;
		 int i=10;
		 f=i;
		
		 //type conversion
		 
		 double g=10;
		 int j;
		 j=(int) g;//type casting
		 System.out.println(f);
		 System.out.println(i);
		 System.out.println(g);
		 System.out.println(j);
		 
		 byte k= 10;//1byte
		 boolean l = true; //1bit = true or false only
		 long m= 10L;
		 float n=1.2f;
		 double o= 1.2d;
		 
		 System.out.println(k);
		 System.out.println(l);
		 System.out.println(m);
		 System.out.println(n);
		 System.out.println(o);
		 
		 System.out.println(ABC.j);//DATA + FUNCTIONS/METHODS
		 //ABC.display();
		  ABC obj1 = new ABC();
		  System.out.println(obj1.i++);
		  System.out.println(obj1.i);
		  
		  ABC obj2 = new ABC();
		  System.out.println(obj2.i);
		  
		 // System.out.println(obj.j++);
		 // System.out.println(obj1.i);
		//  System.out.println(obj2.j);
		  System.out.println(ABC.j++);
		  System.out.println(ABC.j);
		  
		  ABC.typeConversionAndTypeCasting();
	
	}  	
	
	int r=10;
	void display() {
	
	int a=5; //local variable
	System.out.println("this is display method");
	System.out.println(a);
	}
 
 }

class ABC{
	
	static int j=10;  //classic variable/static variable
	int i=10;  //instance variable
	
	static void display() {
		int a= 5;  //local variable
		System.out.println("this is display method");
	    System.out.println(a);
	}
	static void typeConversionAndTypeCasting()
	{
		/*
		 * double f;  //8bytes= 64bits/slots int i=10;  //4bytes=32 bits/slots
		 * =i; //type conversion system.out.println(f);
		 * 
		 * double g=10;  //64 int j;  //32 j=(int)g;
		 */
		double f;  //64 slots
		int i=10; //32 slots
		f = i;  //type conversion
		System.out.println(f);
		
		double g =10; //64
		int j; //32
		j= (int)g; //type casting
		
		//32 bits = 63 bits
		
		System.out.println(i);
		System.out.println(j);
	
	}
}
