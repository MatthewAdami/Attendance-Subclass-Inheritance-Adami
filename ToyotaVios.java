package attendance5;

public class ToyotaVios extends Car{
	String name;
	String Speed;
	String Color;
	String Price;
	String  tireType;
	
	public ToyotaVios(String name, String speed, String color,String price,String  TireType) {
        // Assigning the provided values to the respective instance variables

		this.name = name;
		this.Speed = speed;
		this.Color = color;
		this.Price = price;
		this.tireType = TireType;
        // Assigning the provided values to the respective instance variables
		System.out.println(name +   color +TireType +price + speed );
	}
	void stop() {
		System.out.println("The car stop");
	}
}
