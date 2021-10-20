class Cat{
	String name; //ye dono state hai cat ka
	int legs,eyes;
	public void Walk() {
		System.out.println(name +"walked with " +legs+" legs and see with "+eyes+" eyes");
	}
	public void eat() {
		System.out.println("my cat name is "+name+" it has "+legs+" legs and "+eyes+" eyes");
	}
}
class Dog{ 
 String name;
 
 public void run() {
	 System.out.println("my dog "+name+" runs very fast");
 }
	
}

public class Oops {

	public static void main(String[] args) {
		Cat cat1 =new Cat(); //yha pr class Cat hai aur object cat1 hai;;;
		cat1.name ="Monty ";
		cat1.legs =4;
		cat1.eyes=2;
		cat1.Walk();
		Cat cat2 =new Cat();
		cat2.name =" jimmy ";
		cat2.legs =2;
		cat2.eyes=1;
		cat2.eat();
		Dog d1 =new Dog();
		d1.name="Entertainment";
       d1.run();
	}

}