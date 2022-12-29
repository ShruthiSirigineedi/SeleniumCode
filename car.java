package InterviewPreparation.InterviewPreparation;

public class car {
	static int bal=100;
	int amount=50;
	car c1= new car();
	
	public void start() {
		bal=200;
		amount=100;
		System.out.println("I am car class start method");
	}
	public static void stopsign() {
		bal=300;
		
		System.out.println("I am car class stop method");
	}
	public static void stop() {
		stopsign();
		System.out.println("I am car class stop method");
	}
	public void refuel() {
		c1.stopsign();
		System.out.println("I am car class refuel method");
	}

}
