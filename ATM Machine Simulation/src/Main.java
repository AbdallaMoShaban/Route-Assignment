import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("Check Balance press 1");
        System.out.println("Deposit press 2");
        System.out.println("WithDraw press 3");
        System.out.println("Show Account Status press 4");
        System.out.println("Exit press 0");
    }

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        double balance =2500.75;
        byte choose ;
        String password = "";
        byte attempts=0;
        final byte maxAttempts=3;

        while (attempts<maxAttempts){
            System.out.println("enter password");
            password=in.nextLine();

            if (password.equals("1234"))
            {
                System.out.println("Access granted\n");
                break;
            }
            attempts++;
        }
        if (attempts==maxAttempts){
            System.out.println("you account has been looked");
        }
        if (password.equals("1234")){
            do {

                System.out.println("====Bank services==== ");
                menu();
                 choose =in.nextByte();
                 switch (choose){
                     case 1:
                         System.out.println("your balance is ");
                         System.out.println(balance);

                         break;
                     case 2:
                         System.out.println("Enter Amount ");
                         double deposit =in.nextDouble();
                         if (deposit<=0){
                             System.out.println("invalid amount");
                         }
                         else {
                             balance+=deposit;
                             System.out.println("Now your balance is");
                             System.out.println(balance);
                         }

                         break;

                     case 3:
                         System.out.println("Enter Amount  ");
                         double wihDraw =in.nextDouble();
                         if (wihDraw<=0){
                             System.out.println("invalid amount");
                         }
                         else {
                             balance+=wihDraw;
                             System.out.println("Now your balance is");
                             System.out.println(wihDraw);
                         }

                         break;

                     case 4:
                         if (balance>=5000){
                             System.out.println("VIP Customer");
                         } else if (balance>=1000&&balance<=4999.99) {
                             System.out.println("Regular Customer");
                         }
                         else{
                             System.out.println("low balance");
                         }
                         break;

                     case 0:
                         System.out.println("Thank you for using our ATM");
                         break;


                 }
            }
            while (choose!=0);
        }in.close();

        }}