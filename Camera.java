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

public Camera(String NameOfTheManufacturer, double memoryCapacity, int multiplicity_of_zoom, int color, int price, int ID, int battery_capacity, int warranty_period) {
	this (NameOfTheManufacturer, memoryCapacity, multiplicity_of_zoom, color);
	this.price = price;
	this.battery_capacity = battery_capacity;
	this.warranty_period = warranty_period;
}

public String getNameOfTheManufacturer() {
	return NameOfTheManufacturer;
}

public void setNameOfTheManufacturer(String manufactorer) {
	this.NameOfTheManufacturer = manufactorer;
}

public double getMemoryCapacity(){
	return memoryCapacity;
}

public void setMemoryCapacity(double capacity) {
	this.memoryCapacity = capacity;
}

public int getMultiplicity_of_zoom() {
	return multiplicity_of_zoom;
}

public void setMultiplicity_of_zoom(int zoom) {
	this.multiplicity_of_zoom = zoom;
}

public int getColor() {
	return color;
}

public void setColor(int colorr) {
	this.color = colorr;
}

public int getPrice() {
	return price;
}

public void setPrice(int price1) {
	this.price = price1;
}

public int getBattery_capacity() {
    return battery_capacity;
}

public void setBattery_capacity(int battery) {
    this.battery_capacity = battery;
}

public int getWarranty_period() {
    return warranty_period;
}

public void setWarranty_period(int period) {
    this.warranty_period = period;
}

public String toString() {
	System.out.println("***************************** \n Name Of The Manufacturer: "+ NameOfTheManufacturer);
	System.out.println("\n Memory Capacity: "+ memoryCapacity);
	System.out.println("\n Multiplicity of zoom: "+ multiplicity_of_zoom);
	System.out.println("\n Color: "+ color);
	System.out.println("\n Price: "+ price);
	System.out.println("\n Battery Capacity: "+ battery_capacity);
	System.out.println("\n Warranty Period: "+ warranty_period);
	return "String";
	
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

