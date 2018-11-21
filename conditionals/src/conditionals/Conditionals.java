package conditionals;

public class Conditionals {
	
	public static void main(String[] args) {
		System.out.println(add(6,6,false));

	}
	public static int add(int num1, int num2, boolean boo) {
		if (boo == true) 
			return num1 + num2;
		else 
			return num1 * num2;
	}

}
