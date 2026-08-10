import java.util.Scanner;

public class Main {

    static void menu(){
        System.out.println("Show All Students names press 1");
        System.out.println("Show all Students grades in each subject press 2");
        System.out.println("Search Student by name press 3");
        System.out.println("Count Passed Students press 4");
        System.out.println("Exit press 0");

    }
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        String student;
        double grade1 = 0;
        double grade2=0;
        double grade3=0;
        boolean valid =true;
    String [] name = new String[5];
    double [] subject1=new double[5];
    double [] subject2=new double[5];
    double [] subject3=new double[5];
    for (int i =0;i< name.length;i++){
        System.out.println("Enter Student names number "+(i+1));
        student=in.nextLine();
        name[i]=student;
    }

        for (int i =0;i< 5;i++){
            do {
            System.out.println("Enter the grade for subject 1 for student number " + (i + 1));
            grade1 = in.nextDouble();
            }
            while (grade1<0||grade1>100);
            subject1[i] = grade1;
        }

        for (int i =0;i< 5;i++){
            do {
            System.out.println("Enter the grade for subject 2 for student number " + (i + 1));
            grade2 = in.nextDouble();
                }
            while (grade2<0||grade2>100);
            subject2[i] = grade2;
        }

        for (int i =0;i< 5;i++){
            do {
            System.out.println("Enter the grade for subject 3 for student number " + (i + 1));
            grade3 = in.nextDouble();

            }while (grade3<0||grade3>100);
            subject3[i] = grade3;
        }

        int choose;
        do {
            menu();
            choose = in.nextInt();
            switch (choose) {
                case 1:
                    for (int i = 0; i < name.length; i++) {
                        System.out.println(name[i]);
                    }
                    break;
                case 2:
                    for (int i = 0; i < name.length; i++) {
                        System.out.println(name[i] + " " + subject1[i] + " " + subject2[i] + " " + subject3[i]);
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    in.nextLine();
                    System.out.println("Enter Student name ");
                    String n = in.nextLine();
                    for (int i = 0; i < name.length; i++) {
                        if (name[i].equals(n)) {
                            System.out.println(name[i]);
                        } else {
                            System.out.println("not found");
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < name.length; i++) {
                        if (subject1[i] >= 50) {
                            System.out.println(name[i] + " passed in subject 1");
                        } else {
                            System.out.println("not passed in subject 1");
                        }
                        if (subject2[i] >= 50) {
                            System.out.println(name[i] + " passed in subject 2");
                        } else {
                            System.out.println("not passed in subject 2");
                        }
                        if (subject3[i] >= 50) {
                            System.out.println(name[i] + " passed in subject 3");
                        } else {
                            System.out.println("not passed in subject 3");
                        }

                    }
                    break;
                case 0:
                    break;
            }
        }while (choose!=0);

        }}



