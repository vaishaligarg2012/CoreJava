
 class Animal {
   void makeNoise(){
	   System.out.println("generic noise");
   }
 }

class Dog extends Animal{
	void makeNoise(){
		System.out.println("bark");
	}
	void playDeed(){
		System.out.println("roll over");
	}
	
}


class CasrTest2{
	public static void main(String...args){
		Animal[] a ={new Animal(), new Dog(),new Animal()};
		for(Animal animal: a){
			animal.makeNoise();
			if(animal instanceof Dog){
			   Dog d = (Dog) animal;
				d.playDeed();
			}
		}
	}
}