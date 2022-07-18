package simplilearn;
import java.util.*;

public class caluculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1,n2;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first digit");
		n1 = sc.nextDouble();
		System.out.println("Enter the second digit");
		n2 = sc.nextDouble();
		System.out.println("Enter the operation to perform");
		operator = sc.next().charAt(0);
		switch (operator){
		case '+' :
			System.out.println(n1+" "+"+"+" "+n2+" "+"="+" "+(n1+n2));
			break;
		case '-':
			System.out.println(n1+" "+"-"+" "+n2+" "+"="+" "+(n1-n2));
			break;
		case '*':
			System.out.println(n1+" "+"*"+" "+n2+" "+"="+" "+(n1*n2));
			break;
		case '/':
			System.out.println(n1+" "+"/"+" "+n2+" "+"="+" "+(n1/n2));
			break;
		default:
			System.out.println("invalid operator");
			break;
		}

		}
	}
