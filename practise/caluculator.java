package practise;
import java.util.*;
class input{
	double n1;
	double n2;
	double res;
}
	
public class caluculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operator;
		input obj = new input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first digit");
		obj.n1 = sc.nextDouble();
		System.out.println("Enter the second digit");
		obj.n2 = sc.nextDouble();
		System.out.println("Enter the operation to perform");
		operator = sc.next().charAt(0);
		switch (operator){
		case '+' :
			obj.res = obj.n1+obj.n2;
			System.out.println(obj.n1+" "+"+"+" "+obj.n2+" "+"="+" "+obj.res);
			break;
		case '-':
			obj.res = obj.n1-obj.n2;
			System.out.println(obj.n1+" "+"-"+" "+obj.n2+" "+"="+" "+obj.res);
			break;
		case '*':
			obj.res = obj.n1*obj.n2;
			System.out.println(obj.n1+" "+"*"+" "+obj.n2+" "+"="+" "+obj.res);
			break;
		case '/':
			obj.res = (float)(obj.n1/obj.n2);
			System.out.println(obj.n1+" "+"/"+" "+obj.n2+" "+"="+" "+obj.res);
			break;
		default:
			System.out.println("invalid operator");
			break;
		}

		}
	}
