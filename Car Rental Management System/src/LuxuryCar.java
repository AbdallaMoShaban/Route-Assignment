public class LuxuryCar extends Car {
    private final float  insuranceFee;
    private int MinimumNumber=3;

    public LuxuryCar(int id, String brand, String model, int year, double price,float  insuranceFee ) {
        super(id, brand, model, year, price);
        this.insuranceFee=insuranceFee;

    }

    public void setMinimumNumber(int minimumNumber) {

        MinimumNumber = minimumNumber;


    }
    public float getInsuranceFee() {

        return insuranceFee;
    }

    public int getMinimumNumber() {
        return MinimumNumber;
    }
    @Override
    public String getCarType() {
        return "Luxury";
    }
    public double getCost(){
        return super.getPrice()+(super.getPrice()*insuranceFee);
    }
}

