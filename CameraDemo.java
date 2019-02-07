
public class CameraDemo {

	public static void main(String[] args) {
		Camera b2 = new Camera();
		Camera b1 = new Camera();
		Camera b3 = new Camera("Peter", 84.7, 24, 11, 1000, 2, 1100, 120);
		b3.ToString();
		b3.resetValues("Mary", 32.5, 58, 10, 2000, 2, 2500, 150);
		b3.ToString();
		b1.printID();
		Camera.printStaticID();
	}
}
