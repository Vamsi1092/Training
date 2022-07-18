
public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// implicit type casting
		//Example 1
		char c ='F';
		int d = c;
		System.out.println("char"+" "+c+" "+"converted to int"+" "+d);
		//Example 2
		int a=16;
		double b =a;
		System.out.println("int"+" "+a+" "+"converted to double"+" "+b);
		
		
		//explicit type casting
		//Example 1
		int e = 78;
		char g = (char)e;
		System.out.println("int"+" "+e+" "+"converted to char explicitly"+" "+g);
		//example 2
		double h = 58.5757547;
		int i = (int) h;
		System.out.println("double"+" "+h+" "+"converted to int explicitly"+" "+i);
		//EXAMPLE 3
		double j = 5.4654686868464655;
		float k = (float)j;
		System.out.println("double"+" "+j+" "+"converted to float explicitly"+" "+k);
		
	}

}

