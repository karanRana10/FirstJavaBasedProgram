package unit01;

public class P4_Task02_StringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringInJava obj = new StringInJava();
		obj.StringDefinition();
		obj.charAndString();
	}

}

class StringInJava {
	void StringDefinition() {
		String s = "hello there!";
		String s1 = new String("hgjfjfg");

		System.out.println(s);

		// get length of a string
		System.out.println(s.length());

		// loop through a string
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		String first = "karan";
		String second = "rana";

		// add two string
		String third = first + second;
		System.out.println(third);

		// compare two string
		boolean result1 = first.equals(second);
		System.out.println(result1);

		/*
		 * Javaa strings are immutable In java, the JVM maintains a string pool to store
		 * all of its strings inside the memory. the string pool helps in reusing the
		 * string. - if the string already exists, the new string is not created.
		 * Instead,the new reference ,examle points to the already existed string
		 * (java). -if the string does not exist,the new string(java is created).
		 */
		String fourth = "karan";
		String fifth = new String("rana");

	}

	/*
	 * character arrays are mutable but string are not
	 */
	void charAndString() {
		char[] ch = { 'h', 'e', 'l', 'l', 'o', ' ', 'T', 'h', 'e', 'r', '!' };
		char[] ch2 = { '!', '!' };

		System.out.println(ch);

		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		String s1 = new String(ch);
		System.out.println(s1);

		// character arrays are mutable but string are not!
		ch[0] = 'h';
		// s1.charAT(0)= 'h';
		/*
		 * join two java strings - +, can be used to append strings together to form a
		 * new string- but not possible in char array.
		 */
		s1 = s1 + 'a'; // s1 is new object with new memory.
		// ch= ch+ch2;

		// string to char array
		String s2 = "GEEKS";
		char[] ch4 = s2.toCharArray();

		// char array to string
		char[] a2 = { 'A', 'K', 'A' };
		String s3 = new String(a2);
	}
}
