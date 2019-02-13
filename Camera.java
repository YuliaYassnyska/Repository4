package Lab1;

class Camera {

private String NameOfTheManufacturer;
private double memoryCapacity;
private int multiplicityOfZoom;

private int color;
private int price;

private static int ID = 2;

protected int batteryCapacity;
protected int warrantyPeriod;

public Camera() {

}

public Camera(String NameOfTheManufacturer, double memoryCapacity, int multiplicityOfZoom, int color) {
	this.NameOfTheManufacturer = NameOfTheManufacturer;
	this.memoryCapacity = memoryCapacity;
	this.multiplicityOfZoom = multiplicityOfZoom;
	this.color = color;
}

public Camera(String NameOfTheManufacturer, 
		double memoryCapacity, 
		int multiplicityOfZoom, 
		int color, 
		int price, 
		int batteryCapacity, 
		int warrantyPeriod) {
	this (NameOfTheManufacturer, memoryCapacity, multiplicityOfZoom, color);
	this.price = price;
	this.batteryCapacity = batteryCapacity;
	this.warrantyPeriod = warrantyPeriod;
}

public String getNameOfTheManufacturer() {
	return NameOfTheManufacturer;
}

public void setNameOfTheManufacturer(String NameOfTheManufacturer) {
	this.NameOfTheManufacturer = NameOfTheManufacturer;
}

public double getMemoryCapacity(){
	return memoryCapacity;
}

public void setMemoryCapacity(double memoryCapacity) {
	this.memoryCapacity = memoryCapacity;
}

public int getMultiplicityOfZoom() {
	return multiplicityOfZoom;
}

public void setMultiplicityOfZoom(int multiplicityOfZoom) {
	this.multiplicityOfZoom =multiplicityOfZoom;
}

public int getColor() {
	return color;
}

public void setColor(int color) {
	this.color = color;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getBatteryCapacity() {
    return batteryCapacity;
}

public void setBatteryCapacity(int batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
}
 
public int getWarrantyPeriod() {
    return warrantyPeriod;
}
 
public void setWarrantyPeriod(int warrantyPeriod) {
    this.warrantyPeriod = warrantyPeriod;
}

public String toString() {
	String info = "\n ********************";
	info += "\n Name Of The Manufacturer: "+ NameOfTheManufacturer;
	info += "\n Memory Capacity: "+ memoryCapacity;
	info += "\n Multiplicity of zoom: "+ multiplicityOfZoom;
	info += "\n Color: "+ color;
	info += "\n Price: "+ price;
	info += "\n Battery Capacity: "+ batteryCapacity;
	info += "\n Warranty Period: "+ warrantyPeriod;
	return info;
	
}

public static int printStaticID() {
    System.out.println("***************************** \n ID: "+ ID);
    return ID;
}

public int printID() {
	System.out.println("***************************** \n ID: "+ ID);
    return ID;
}

public void resetValues(String NameOfTheManufacturer, double memoryCapacity, int multiplicityOfZoom, int color, int price, int batteryCapacity, int warrantyPeriod) {
	this.NameOfTheManufacturer = NameOfTheManufacturer;
    this.memoryCapacity = memoryCapacity;
    this.multiplicityOfZoom = multiplicityOfZoom;
    this.color = color;
    this.price = price;
    this.batteryCapacity = batteryCapacity;
    this.warrantyPeriod = warrantyPeriod;
}
}

