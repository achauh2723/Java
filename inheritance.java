package packages;

class Parent {
 void eat() {
     System.out.println("The animal is parent class.");
 }
}

class Child extends Parent{
 void bark() {
     System.out.println("This is child class");
 }
}

public class inheritance{
 public static void main(String[] args) {
     Child myDog = new Child();
     myDog.eat(); 
     myDog.bark(); 
 }
}

