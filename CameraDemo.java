package Lab1; 

public class CameraDemo {

	 public static void main(String[] args) {
		 Camera object1 = new Camera();
		 Camera object2 = new Camera("Gary", 84.7, 24, 11);
		 Camera object3 = new Camera("Mary", 32.5, 58, 10, 2000, 2500, 150);
		 System.out.println(object1.toString());
		 System.out.println(object2.toString());
		 System.out.println(object3.toString());

		 object1.printID();
		 Camera.printStaticID();
	}
}