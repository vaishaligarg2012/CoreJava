
interface Greeter {
	void greeting();
}
class HelloGreeting implements Greeter {
	int x=20;
	@Override
	public void greeting() {
		System.out.println("Hello Greeting");
	}
}
class HiGreeting implements Greeter {
	int y=30;
	@Override
	public void greeting() {
		System.out.println("Hi Greeting");
	}
}
class Greeting{
	void doGreeting(Greeter greeter){
		
		/*Here , You will be able to access only those properties which are available in Greeter 
		 interface . To access the child specific properties e.g. x and y . then 
		 we have to convert the Greeter into Child class' s objects  . This concept is called
		 Downcasting*/
		greeter.greeting();
		
		if(greeter instanceof HelloGreeting){
		HelloGreeting obj=(HelloGreeting)greeter;
		System.out.println(obj.x);
		}
		if(greeter instanceof HiGreeting){
			HiGreeting obj=(HiGreeting)greeter;
			System.out.println(obj.y);
		}
	}
}
public class UpcastingDowncastingDemo {
	public static void main(String[] args){
		Greeting obj=new Greeting();
		
		/*Here , we are passing the object of HiGreeting class and HelloGreeting class in the
		 doGreeting method of Greeting class. These objects of HiGreeting and HelloGreeting will be
		 passed to the reference variable of Greeter which is parent interface of both the classes .
		 This concept is called Upcasting*/
		obj.doGreeting(new HiGreeting());
		obj.doGreeting(new HelloGreeting());
	}
}
