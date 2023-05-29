package attendance5;

public class Main {

	public static void main(String[] args) {
		
		/* a) Create a subclass of Car class and name it Toyota-VIOS, 
			which has the following properties and methods (tire 
			type and method drive()); */
		ToyotaVios  car = new ToyotaVios("Car Name: Toyota VIOS", "\nColor: White","\nTire Type: Toyo Proxes R50","\nPrice:$ 1,005,000 ","\nSpeed: 170 mph");
		car.drive();
		car.stop();
		
		System.out.println();
		
		/*b) Create a subclass of Plane class and name it U-2 Spy 
			Plane, which has the following properties and methods 
			(wings span and method fly());*/
		U2SpyPlane plane = new U2SpyPlane( "Plane Name : U-2 Spy Plane ", "\nColor: White ","\nPrice: 1,800,000 $" ,"\nWingspan: ",80.5f);
		plane.startsEngine();
		plane.fly();
		plane.stop();
		
		/*c) Create a subclass of Boat class and name it Fandango 
		Yacht, which has the following properties and methods 
		(MainSail color and method float());*/
		System.out.println();
		Fandango boat = new Fandango("Boat Name: Fandango","\nColor: Pink","\nPrice: $ 500,000  ","\nSpeed: 70 mph");
		boat.FLOAT();
		boat.stop();
	}

}
