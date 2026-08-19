public class Car {
    private final int id;
    private final String brand;
    private final String model;
    private final int year;
    private final double price;
    private static   int count=0;
    private  boolean isAvailable;

    private final  float taxRate=0.14f;
    public Car(int id,String brand, String model,int year,double price ){
        this.brand=brand;
        this.id=id;
        this.model=model;
        this.year=year;
        this.price=price;
        count++;
    }


    public String getCarType() {
        return "Regular";
    }
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public float getTaxRate() {
        return taxRate;
    }

public double getCost(){

    return  price+(price*taxRate);
}

}

