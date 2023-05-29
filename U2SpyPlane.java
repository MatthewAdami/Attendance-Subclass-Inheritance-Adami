package attendance5;

public class U2SpyPlane extends Plane {
	String PlaneName;
	String Color;
	String Wingspan;
	Float Wingspannumber;
	String Price;
	

	U2SpyPlane(String planeName, String color, String price, String Wingspan, Float Wingspannumber) {
		this.PlaneName = planeName;
		this.Color = color;
		this.Price = price;
		this.Wingspan = Wingspan;
		this.Wingspannumber = Wingspannumber;
		
		 // Print the details of the U2 Spy Plane
		System.out.println(planeName + color + price +  Wingspan + Wingspannumber);
	}

	@Override
	void startsEngine() {
		System.out.println("STARTING THE ENGINE");
	}
}