package packages;

class polymorphism{
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends polymorphism {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends polymorphism {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    polymorphism myAnimal = new polymorphism();
	    polymorphism myPig = new Pig();
	    polymorphism myDog = new Dog();
	        
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	  }
	}

