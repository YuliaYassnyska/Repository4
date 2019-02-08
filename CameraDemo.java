public class CameraDemo {

 public static void main(String[] args) {
  Camera b2 = new Camera();
  Camera b1 = new Camera();
  Camera b3 = new Camera("Gary", 84.7, 24, 11);
  b3.ToString();
  b2.resetValues("Mary", 32.5, 58, 10, 2000, 2500, 150);
  b2.ToString();
  b1.ToString();
  b1.printID();
  Camera.printStaticID();
 }
}