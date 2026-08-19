import java.util.Scanner;

public class Main {
    static void menu(){
        System.out.println(" ");
        System.out.println("========================================");
        System.out.println("SPEEDWAY RENTALS SYSTEM");
        System.out.println("========================================");
        System.out.println("1. Add Regular Car");
        System.out.println("2. Add Luxury Car");
        System.out.println("3. Add Customer");
        System.out.println("4. Display All Cars");
        System.out.println("5. Display Available Cars");
        System.out.println("6. Rent a Car");
        System.out.println("7. Return a Car");
        System.out.println("8. Search Car by ID");
        System.out.println("9. Search Car by Brand");
        System.out.println("10. Display All Customers");
        System.out.println("10. Exit  ");
        System.out.println("========================================");
        System.out.println(" ");
        System.out.print("Enter your choice:");

    }
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int MaxNumberOfCars = 20;
            int MaxNumberOfCustomer = 20;
            byte choice;
            Car[] regular = new Car[20];
            Customer[] customers = new Customer[20];
            do {
                menu();
                choice = in.nextByte();

                switch (choice) {
                    case 1: {
                        boolean isFull = true;
                        int count = -1;
                        for (int i = 0; i < 20; i++) {
                            if (regular[i] == null) {
                                isFull = false;
                                count = i;
                                break;
                            }
                        }
                        if (isFull) {
                            System.out.println("Array is full");
                        } else {
                            boolean isUsed;

                            int cid;
                            do {
                                isUsed = false;
                                System.out.println("Enter car id");
                                cid = in.nextInt();
                                for (int i = 0; i < 20; i++) {
                                    if (regular[i] != null) {
                                        if (regular[i].getId() == cid) {
                                            System.out.println("Re-Enter id");
                                            isUsed = true;
                                            break;
                                        }
                                    }
                                }
                            } while (isUsed);
                            in.nextLine();
                            System.out.println("Enter car Brand");
                            String cBrand = in.nextLine();
                            System.out.println("Enter Car model");
                            String cModel = in.nextLine();
                            System.out.println("Enter Car Year ");
                            int cYear = in.nextInt();
                            System.out.println("Enter Car price per day");
                            int cPrice = in.nextInt();
                            regular[count] = new Car(cid, cBrand, cModel, cYear, cPrice);
                            System.out.println("Add car successful");
                            regular[count].setAvailable(true);
                        }
                        break;
                    }
                    case 2: {
                        boolean isFull = true;
                        int count = -1;
                        for (int i = 0; i < 20; i++) {
                            if (regular[i] == null) {
                                isFull = false;
                                count = i;
                                break;

                            }
                        }
                        if (isFull) {
                            System.out.println("is full");
                        } else {
                            boolean isUsed;
                            int cid;
                            do {
                                isUsed = false;
                                System.out.println("Enter Id");
                                cid = in.nextInt();
                                for (int i = 0; i < 20; i++) {
                                    if (regular[i] != null && regular[i].getId() == cid) {
                                        System.out.println("Re-Enter id");
                                        isUsed = true;
                                        break;
                                    }
                                }
                            } while (isUsed);
                            in.nextLine();
                            System.out.println("Enter car Brand");
                            String cBrand = in.nextLine();
                            System.out.println("Enter Car model");
                            String cModel = in.nextLine();
                            System.out.println("Enter Car Year ");
                            int cYear = in.nextInt();
                            System.out.println("Enter Car price per day");
                            int cPrice = in.nextInt();
                            System.out.println("Enter Car insurance fee");
                            float insurance = in.nextFloat();
                            regular[count] = new LuxuryCar(cid, cBrand, cModel, cYear, cPrice, insurance);
                            System.out.println("luxury car was added");
                            regular[count].setAvailable(true);

                        }
                        break;
                    }
                    case 3: {
                        boolean isFull = true;
                        int count = -1;
                        for (int i = 0; i < 20; i++) {
                            if (customers[i] == null) {
                                isFull = false;
                                count = i;
                                break;
                            }
                        }
                        if (isFull) {
                            System.out.println("already full");
                        } else {
                            boolean isUsed;
                            int cid;
                            do {
                                isUsed = false;
                                System.out.println("Enter Customer id");
                                cid = in.nextInt();
                                for (int i = 0; i < 20; i++) {
                                    if (customers[i] != null && customers[i].getId() == cid) {
                                        System.out.println("Re-enter id");
                                        isUsed = true;
                                        break;
                                    }
                                }
                            } while (isUsed);
                            in.nextLine();
                            System.out.println("Enter customer name");
                            String name = in.nextLine();
                            System.out.println("Enter customer phone number");
                            double phone = in.nextDouble();
                            customers[count] = new Customer(name, phone);
                            customers[count].setId(cid);
                            System.out.println("customer name " + name);
                            System.out.println("customer id " + cid);

                        }
                        break;
                    }
                    case 4: {
                        boolean notAvailable = true;
                        for (int i = 0; i < 20; i++) {
                            if (regular[i] != null && regular[i].getBrand() != null) {
                                System.out.println(regular[i].getBrand());
                                notAvailable = false;
                            }
                        }
                        if (notAvailable) {
                            System.out.println("Fleet is empty");
                        }


                        break;
                    }
                    case 5: {
                        int count = 0;
                        boolean notFoundAnyCar = true;
                        for (int i = 0; i < 20; i++) {
                            if (regular[i] != null && regular[i].isAvailable()) {
                                System.out.println("Car Id: " + regular[i].getId() + "| Car Brand:" + regular[i].getBrand());
                                count = i;
                                notFoundAnyCar = false;

                            }
                        }
                        if (notFoundAnyCar) {
                            System.out.println("No car in the fleet");
                        }

                        assert regular[count] != null;
                        System.out.println(regular[count].getCount());

                        break;
                    }
                    case 6: {
                        int searchCustomer = -1;
                        System.out.println("Enter Customer id");
                        int cid = in.nextInt();
                        for (int i = 0; i < 20; i++) {
                            if (customers[i] != null && customers[i].getId() == cid) {
                                searchCustomer = i;
                                break;
                            }
                        }
                        if (searchCustomer == -1) {
                            System.out.println("Customer not found");
                        } else {

                            int searchCar = -1;
                            System.out.println("Enter Car id ");
                            int carId = in.nextInt();
                            for (int i = 0; i < 20; i++) {
                                if (regular[i] != null && regular[i].getId() == carId) {
                                    searchCar = i;
                                    break;
                                }
                            }
                            if (searchCar == -1) {
                                System.out.println("Car not found");
                            } else {
                                System.out.println("Number of days ");
                                int numDay;
                                do {
                                    numDay = in.nextInt();
                                    if (numDay <= 0) {
                                        System.out.println("Enter days greater than 0");
                                    }
                                } while (numDay <= 0);
                                boolean validDay = false;
                                boolean rented = false;
                                if (customers[searchCustomer].getRentedCarId() == -1) {
                                    if (regular[searchCar].isAvailable()) {
                                        if (regular[searchCar] instanceof LuxuryCar) {
                                            LuxuryCar lux = (LuxuryCar) regular[searchCar];
                                            if (numDay >= lux.getMinimumNumber()) {
                                                validDay = true;

                                            } else {
                                                System.out.println("Must be over " + lux.getMinimumNumber());
                                            }
                                        } else {
                                            validDay = true;
                                        }

                                    } else {
                                        System.out.println("Car not available");
                                    }
                                } else {
                                    System.out.println("Customer hold the car");
                                }

                                if (validDay) {
                                    customers[searchCustomer].setNumberOfRentedDays(numDay);
                                    customers[searchCustomer].setRentedCarId(carId);
                                    regular[searchCar].setAvailable(false);
                                    rented = true;
                                    customers[searchCustomer].setCount(1);
                                    System.out.println("Car rented Successful");
                                }


                                if (rented) {

                                    System.out.println("=======rental receipt=======");
                                    if (regular[searchCar] instanceof LuxuryCar) {
                                        LuxuryCar lux = (LuxuryCar) regular[searchCar];
                                        System.out.println("Customer name " + customers[searchCustomer].getName()
                                                + "Car brand " + lux.getBrand() + "Car Model " + lux.getModel()
                                                + "Number of days " + numDay);

                                        System.out.println("car type " + lux.getCarType() + " cost per day " + lux.getCost());
                                        double finalCost = numDay * lux.getCost();
                                        System.out.println("Final cost " + finalCost);
                                    } else {
                                        System.out.println("Customer name " + customers[searchCustomer].getName()
                                                + "Car brand " + regular[searchCar].getBrand() + "Car Model " + regular[searchCar].getModel()
                                                + "Number of days " + numDay);
                                        System.out.println("car type " + regular[searchCar].getCarType() + " cost per day " + regular[searchCar].getCost());
                                        double finalCost = numDay * regular[searchCar].getCost();
                                        System.out.println("Final cost " + finalCost);
                                        double totalPaid = finalCost;
                                        customers[searchCustomer].setTotalPaid(finalCost);
                                        System.out.println("Total customer paid " + customers[searchCustomer].getTotalPaid());
                                    }
                                    System.out.println("=========================");
                                }
                            }

                        }
                    }
                    break;
                    case 7: {
                        int carSearch = -1;
                        boolean foundCar = false;
                        int search = -1;
                        System.out.println("Enter Customer id");
                        int cid = in.nextInt();
                        for (int i = 0; i < 20; i++) {
                            if (customers[i] != null && customers[i].getId() == cid) {
                                search = i;
                                break;
                            }
                        }
                        if (search == -1) {
                            System.out.println("Customer not found");
                        } else //1
                        {
                            if (customers[search].getRentedCarId() == 0) {
                                System.out.println("Customer holds no car ");
                            } else //2
                            {
                                for (int i = 0; i < 20; i++) {
                                    if (regular[i] != null && regular[i].getId() == customers[search].getRentedCarId()) {
                                        carSearch = i;
                                        foundCar = true;
                                        break;
                                    }
                                }
                            }
                            if (foundCar) {
                                System.out.println("Car " + regular[carSearch].getBrand() + "Rented days " + customers[search].getNumberOfRentedDays());
                                regular[carSearch].setAvailable(true);
                                customers[search].setRentedCarId(-1);
                                customers[search].setNumberOfRentedDays(0);
                            }
                            System.out.println("Car returned Successful");
                        }
                    }
                    break;

                    case 8: {
                        int searchCar = 0;
                        boolean carFound = false;
                        System.out.println("Enter car id");
                        int carId = in.nextInt();
                        for (int i = 0; i < regular.length; i++) {
                            if (regular[i] != null && regular[i].getId() == carId) {
                                searchCar = i;
                                carFound = true;
                                break;
                            }
                        }
                        if (carFound) {
                            System.out.println("Car Brand  " + regular[searchCar].getBrand() + "Car model " + regular[searchCar].getModel() +
                                    "Car id " + regular[searchCar].getId() + "Car year " + regular[searchCar].getYear() +
                                    "Car price " + regular[searchCar].getPrice() + "Car availability " + regular[searchCar].isAvailable());
                        } else {
                            System.out.println("Car not found");
                        }
                    }
                    break;
                    case 9: {
                        int count = 0;

                        System.out.println("Enter Car Brand");
                        String brand = in.nextLine();
                        in.nextLine();

                        for (int i = 0; i < regular.length; i++) {
                            if (regular[i] != null && regular[i].getBrand().equalsIgnoreCase(brand)) {
                                System.out.println( " . counted car " + count);
                                count++;

                            }

                        }
                        if (count==0) {
                            System.out.println("car not found of brand "+brand);
                        } else {
                            System.out.println("Car found");
                        }

                    }
                    break;
                    case 10: {
                        for (int i = 0; i < customers.length; i++) {
                            if (customers[i] != null) {
                                if (customers[i].getRentedCarId() != 0) {

                                        System.out.println("Customer name " + customers[i].getName() + "Car id " +customers[i].getRentedCarId());

                                } else {
                                    System.out.println("Customer name " + customers[i].getName() + "  not Holds Car");}
                            }
                        }


                    }
                    break;
                    case 0:
                        System.out.println("good bye");
                        break;


                }
            } while (choice != 0);


    }} //main and class
