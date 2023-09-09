package packages;

class pen{
	String type;
	String brand;
	void display() {
		System.out.println("Write something");
	}
	void print() {
		System.out.println(this.type);
		System.out.println(this.brand);
	}
}
public class obj{
	public static void main(String args[]) {
		pen pen1 = new pen();
		pen1.type = "ball";
		pen1.brand = "butterflow";
		
		pen pen2 = new pen();
		pen2.type = "gel";
		pen2.brand = "Good";
		
		pen1.display();
		pen2.print();
		pen1.print();
	}
}
