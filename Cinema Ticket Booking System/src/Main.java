import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void menu(){
        System.out.println("========Service========");
        System.out.println("Display Seats press 1");
        System.out.println("Book Seat press 2");
        System.out.println("Cancel Booking press 3");
        System.out.println("Show all movies press 4");
        System.out.println("Show number of available and booked seats press 5");
        System.out.println("Exit");
        System.out.println("=======================");
        System.out.print("-> "); //bonus
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] seats = new char[5][6];
        String[] movieNames = {"Superman", "Avatar", "Minecraft", "Inside Out", "F1"};
        for (int i = 0; i < seats.length; i++) {
            Arrays.fill(seats[i], 'X');
        }
        byte choose;
        do {
            menu();
            choose = in.nextByte();


            switch (choose) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.printf(seats[i][j]+" ");
                        }
                        System.out.println();
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    int count =0;
                    for (int i =0; i<seats.length;i++){
                        for (int j =0;j<seats[i].length;j++){
                            if (seats[i][j]=='O')count++;}}

                    if (count==24){ //bonus
                        System.out.println("Almost Done");
                        break;
                    }
                    else {
                    System.out.println("ُEnter from available seats");
                    byte r; byte c;
                    do {
                         r= in.nextByte() ; c= in.nextByte();
                         if ((r<1||r>5)&&c<1||c>6){
                             System.out.println("Re-Enter seat number");
                         }

                    }while ((r<1||r>5)||(c<1||c>6));
                        if (seats[r-1][c-1]=='O'){
                            System.out.println("Seat is already booked");
                        }
                        else {
                    seats[r-1][c-1]='O';}}
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("Enter your booked seat");
                    byte row; byte colm;
                    do  {

                        row= in.nextByte() ; colm= in.nextByte();
                        if ((row<1||row>5)&&colm<1||colm>6){
                            System.out.println("Re-Enter");
                        }

                    }while ((row<1||row>5)||(colm<1||colm>6));

                    seats[row-1][colm-1]='X';
                    System.out.println(" ");
                    break;
                case 4:
                    for (int i =0 ;i<movieNames.length;i++){
                        System.out.println(movieNames[i]);
                    }
                    System.out.println(" ");
                    break;
                case 5:
                    int available= 0;
                    int notAvailable= 0;
                    for (char[] rows :seats){
                        for (char seat:rows){
                            if (seat=='O'){available++;}
                            else {notAvailable++;
                        }
                    }
                    }
                    System.out.println("Number of available seats is "+ available);
                    System.out.println("Number of  not available seats is "+ notAvailable);
                    System.out.println(" ");
                case 0:
                    System.out.println("GOOD BYE.");
                    break;


            }
        } while (choose != 0);


    }}
