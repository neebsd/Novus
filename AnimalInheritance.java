
public class AnimalInheritance {
	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println(c.sound());
		
		Dog d = new Dog();
		System.out.println(d.sound());
		
		Bird b = new Bird();
		System.out.println(b.sound());
	}
}

class Animal{
	int animal;
	String s;
	
	public String animalSound(int a) {
		switch(a) {
			case 1:
				s = "The cat goes meow";
				break;
			case 2:
				s = "The dog goes woof";
				break;
			case 3:
				s = "The bird goes tweet";
				break;
		}
		return s;
	}
}

class Cat extends Animal{
	public String sound() {
		this.animal = 1;
		String s = this.animalSound(animal);
		return s;
	}
}

class Dog extends Animal{
	public String sound() {
		this.animal = 2;
		String s = this.animalSound(animal);
		return s;
	}
}

class Bird extends Animal{
	public String sound() {
		this.animal = 3;
		String s = this.animalSound(animal);
		return s;
	}
}

// choice2.equals("cat") 

