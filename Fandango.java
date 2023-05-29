package attendance5;

public class Fandango extends Boat{
	String name;
	String color;
	String price;
	String speed;
	
	public Fandango(String name, String color, String price,String speed) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.speed = speed;
		// Print the details of the Fandango
		System.out.println(name + color + price + speed);
	}
	void stop() {
		System.out.println("The boat Stop");
	}

}
