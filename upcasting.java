class animal{
	public void eat(){
		System.out.println("animal is eating");
	}
}
class dog extends animal{
	public void eat(){
		System.out.println("Dog is eating");
	}
	public void bark(){
		System.out.println("Dog is barking");
	}

}
public class upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog obj = new dog();
		obj.eat();
// if we do this always eat in dog class is called . How to call eat in animal class
		
		// the method in animal class is overridden by the dog class.
        animal obj1 = new animal();
// doubt get clarified
	}

}
