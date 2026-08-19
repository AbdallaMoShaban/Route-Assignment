public class Customer {
    private  int id;
    private final String name;
    private final double phone;
    private int rentedCarId=-1;
    private int numberOfRentedDays=0;
    private double totalPaid;
    private  int count;

    public Customer(String name,double phone) {
    this.name=name;
    this.phone=phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRentedCarId(int rentedCarId) {
        this.rentedCarId = rentedCarId;
    }

    public void setNumberOfRentedDays(int numberOfRentedDays) {
        this.numberOfRentedDays = numberOfRentedDays;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPhone() {
        return phone;
    }

    public int getRentedCarId() {
        return rentedCarId;
    }

    public int getNumberOfRentedDays() {
        return numberOfRentedDays;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid += totalPaid;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setCount(int count) {
        this.count += count;
    }

    public int getCount() {
        return count;
    }
}

