
public class Car extends Machine {
	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}

	public void showInfo() {
		System.out.println("Car name:" + name);
	}

	@Override
	public void start() {
		System.out.println("Car Started");
	}

}
