class Camera {
private String NameOfTheManufacturer;
private double memoryCapacity;
private int multiplicity_of_zoom;
private int color;
private int price;
public static int ID = 2;
protected int battery_capacity;
protected int warranty_period;

public Camera(){
 
}


public Camera(String NameOfTheManufacturer, double memoryCapacity, int multiplicity_of_zoom, int color){
 this.NameOfTheManufacturer = NameOfTheManufacturer;
 this.memoryCapacity = memoryCapacity;
 this.multiplicity_of_zoom = multiplicity_of_zoom;
 this.color = color;
}


public Camera(String NameOfTheManufacturer, double memoryCapacity, int multiplicity_of_zoom, int color, int price, int ID, int battery_capacity, int warranty_period){
 this (NameOfTheManufacturer, memoryCapacity, multiplicity_of_zoom, color);
 this.price = price;
 this.battery_capacity = battery_capacity;
 this.warranty_period = warranty_period;
}


public String getNameOfTheManufacturer(){
 return NameOfTheManufacturer;
}


public void setNameOfTheManufacturer(String s){
 this.NameOfTheManufacturer = s;
}


public double getMemoryCapacity(){
 return memoryCapacity;
}


public void setMemoryCapacity(double k){
 this.memoryCapacity = k;
}


public int getMultiplicity_of_zoom(){
 return multiplicity_of_zoom;
}


public void setMultiplicity_of_zoom(int b){
 this.multiplicity_of_zoom = b;
}


public int getColor(){
 return color;
}


public void setColor(int a){
 this.color = a;
}


public int getPrice(){
 return price;
}


public void setPrice(int c){
 this.price = c;
}


public int getBattery_capacity(){
    return battery_capacity;
}


public void setBattery_capacity(int q){
    this.battery_capacity = q;
}


public int getWarranty_period(){
    return warranty_period;
}


public void setWarranty_period(int z){
    this.warranty_period = z;
}


public void ToString(){
 System.out.println("***************************** \n Name Of The Manufacturer: "+ NameOfTheManufacturer +"\n Memory Capacity: "+ memoryCapacity +"\n Multiplicity of zoom: "+ multiplicity_of_zoom +"\n Color: "+ color +"\n Price: "+ price +"\n Battery Capacity: "+ battery_capacity +"\n Warranty Period: "+ warranty_period);
}


public static int printStaticID(){
    System.out.println("***************************** \n ID: "+ ID);
    return ID;
}


public int printID(){
 System.out.println("***************************** \n ID: "+ ID);
    return ID;
}


public void resetValues(String NameOfTheManufacturer, double memoryCapacity, int multiplicity_of_zoom, int color, int price, int battery_capacity, int warranty_period){
 this.NameOfTheManufacturer = NameOfTheManufacturer;
 this.memoryCapacity = memoryCapacity;
 this.multiplicity_of_zoom = multiplicity_of_zoom;
 this.color = color;
 this.price = price;
 this.battery_capacity = battery_capacity;
 this.warranty_period = warranty_period;
}
}

