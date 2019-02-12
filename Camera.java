package Lab1;

class Camera {

private String NameOfTheManufacturer;
private double memoryCapacity;
private int multiplicity_of_zoom;

private int color;
private int price;

private static int ID = 2;

protected int battery_capacity;
protected int warranty_period;

public Camera() {

}

public Camera(String NameOfTheManufacturer, double memoryCapacity, int multiplicity_of_zoom, int color) {
	this.NameOfTheManufacturer = NameOfTheManufacturer;
	this.memoryCapacity = memoryCapacity;
	this.multiplicity_of_zoom = multiplicity_of_zoom;
	this.color = color;
}

public Camera(String NameOfTheManufacturer, 
		double memoryCapacity, 
		int multiplicity_of_zoom, 
		int color, 
		int price, 
		int battery_capacity, 
		int warranty_period) {
	this (NameOfTheManufacturer, memoryCapacity, multiplicity_of_zoom, color);
	this.price = price;
	this.battery_capacity = battery_capacity;
	this.warranty_period = warranty_period;
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

public int getMultiplicity_of_zoom() {
	return multiplicity_of_zoom;
}

public void setMultiplicity_of_zoom(int multiplicity_of_zoom) {
	this.multiplicity_of_zoom =multiplicity_of_zoom;
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

public int getBattery_capacity() {
    return battery_capacity;
}

public void setBattery_capacity(int battery_capacity) {
    this.battery_capacity = battery_capacity;
}
 
public int getWarranty_period() {
    return warranty_period;
}
 
public void setWarranty_period(int warranty_period) {
    this.warranty_period = warranty_period;
}

public String toString() {
	String info = "\n ********************";
	info += "\n Name Of The Manufacturer: "+ NameOfTheManufacturer;
	info += "\n Memory Capacity: "+ memoryCapacity;
	info += "\n Multiplicity of zoom: "+ multiplicity_of_zoom;
	info += "\n Color: "+ color;
	info += "\n Price: "+ price;
	info += "\n Battery Capacity: "+ battery_capacity;
	info += "\n Warranty Period: "+ warranty_period;
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

public void resetValues(String NameOfTheManufacturer, double memoryCapacity, int multiplicity_of_zoom, int color, int price, int battery_capacity, int warranty_period) {
	this.NameOfTheManufacturer = NameOfTheManufacturer;
    this.memoryCapacity = memoryCapacity;
    this.multiplicity_of_zoom = multiplicity_of_zoom;
    this.color = color;
    this.price = price;
    this.battery_capacity = battery_capacity;
    this.warranty_period = warranty_period;
}
}

