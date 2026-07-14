import java.util.Scanner;

public class Main {
    static Scanner input =new Scanner(System.in);

    static double totalPrice;
    static double coffee = 50;
    static double tea = 35;
    static double hotChocolate = 60;
    static double water = 20;
    static byte qCoffee=0;
    static byte qTea=0;
    static byte qHot=0;
    static byte qWater=0;
    static double paid;


    static void menu(){
        String [] product = {"Coffee","Tea","Hot chocolate","Water"};
        byte[] price ={50,35,60,20};

        for (int i =0;i<4;i++){
            System.out.print(product[i]+", ");
        }
        System.out.println(" ");
        for (int j =0;j<4;j++){
            System.out.print(" "+price[j]+" £  ");
        }

        System.out.println(" ");
    }
    static void drink(){

                System.out.println("You want a coffee (y/n) ");
                char z = input.next().charAt(0);
                if (z=='y')
                {
                 System.out.println("Enter your quantity");
                     qCoffee =input.nextByte();
                }

                else if (z=='n')
                {
                    System.out.println("okay");
                }

                System.out.println("You want a tea (y/n) ");
                char t = input.next().charAt(0);
                if (t=='y')
                {
                    System.out.println("Enter your quantity");
                    qTea =input.nextByte();

                }
                else if (t=='n')
                {
                    System.out.println("okay");
                }



                System.out.println("You want a hot chocolate (y/n) ");
                char h = input.next().charAt(0);
                if (h=='y')
                {
                    System.out.println("Enter your quantity");
                    qHot =input.nextByte();
                }

                else if (h=='n')
                {
                    System.out.println("okay");
                }
                System.out.println("You want a water (y/n) ");
                char w = input.next().charAt(0);
                if (w=='y')
                {
                    System.out.println("Enter your quantity");
                        qWater =input.nextByte();
                }
                else if (w=='n')
                {
                    System.out.println("okay");
                }
                    totalPrice = ((coffee*qCoffee)+(hotChocolate*qHot)+(tea*qTea)+(water*qWater));

                System.out.println("============================");
                System.out.println("========your order is=======");
                System.out.println("Drink ------"+" Quantity");
                System.out.println("Coffee ----- "+qCoffee);
                System.out.println("Tea ------- "+qTea);
                System.out.println("Hot Chocolate ---- "+qHot);
                System.out.println("Water  ---- "+qWater);
                System.out.println("------Payment------");



    }
    static void payment(){
        System.out.println("Your bill is " + totalPrice);
        System.out.println("Enter your amount to paid ");
         paid = input.nextInt();
        if (paid < totalPrice){
            System.out.println("Insufficient Amount");
            System.out.println("Please enter a valid amount");
            payment();
        }

    }

    static void receipt (){

        if (totalPrice>=300){
            System.out.println("You have a discount 15% ");
            double discount= totalPrice*0.15;
            double remain = paid-(totalPrice-discount);

            System.out.println("Your discount is " +(discount)+" £");
            System.out.println("Your final price is " + (totalPrice-discount)+" £");
            System.out.println("Your remaining amount " + remain+" £");
        }
        else if (totalPrice>=150){
            System.out.println("You have a discount 10% ");
            double discount= totalPrice*0.1;
            double remain = paid-(totalPrice-discount);
            System.out.println("Your discount is " +discount+" £");
            System.out.println("Your final price is " + (totalPrice-discount)+" £");
            System.out.println("Your remaining amount " +remain +" £");
        }
        else{
            double remain = paid-totalPrice;
            System.out.println("No discount");
            System.out.println("Your total is "+ totalPrice+" £");
            System.out.println("Your remaining amount " +remain +" £");

        }

    }
    static void bonus(){
        if (qCoffee>=5){
            System.out.println("You have a one coffee for free");
        }
    }

    public static void main(String[]args){
    menu();
    drink();
    payment();
    receipt();
    bonus();
        System.out.println("======================");
        System.out.println("SEE YOU LATER");


}}