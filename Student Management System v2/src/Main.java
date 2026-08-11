import java.util.Scanner;

public class Main {
    static void menu ()
    {
        System.out.println("==========Services==========");
        System.out.println("Display Students press 1");
        System.out.println("Calculate Average Grade press 2");
        System.out.println("Find Highest Grade press 3");
        System.out.println("Search Student by  press 4");
        System.out.println("Exit press 0");
        System.out.println("=============================");
    }

    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        String name;
        int id;
        double grade;
        int choose;

        System.out.println("Enter number of Student");
        int s =in.nextInt();
        Student [] stuArr= new Student[s];


        for (int i=0;i<s;i++)
        {
            in.nextLine();
            System.out.println("Enter Name for Student number "+(i+1));
            name =in.nextLine();
            System.out.println("Enter Id for Student number "+(i+1));
            id = in.nextInt();
            do {
                System.out.println("Enter Grade for Student number "+(i+1));
                grade=in.nextDouble();
            }while (grade <0||grade>100);

            stuArr[i]=new Student(name,id,grade);
        }

        do {
            System.out.println(" ");
            menu();
            choose= in.nextInt();
            switch (choose){
                case 1:

                    for (int i =0;i<s;i++)
                    {
                        if (stuArr[i].getGrade()>=90)
                        {
                            System.out.println(stuArr[i].getName()+"-> "+"Excellent");
                        }
                        else if (stuArr[i].getGrade()>=75)
                        {
                            System.out.println(stuArr[i].getName()+"-> "+"Very Good");
                        }
                        else if (stuArr[i].getGrade()>=60)
                        {
                            System.out.println(stuArr[i].getName()+"-> "+"Very Good");
                        }
                        else
                        {
                            System.out.println(stuArr[i].getName()+"-> "+" Fail");
                        }
                    }
                    break;
                case 2:
                    double avr=0;
                    for (int i =0;i<s;i++)
                    {
                        avr += stuArr[i].getGrade();
                    }
                    avr =avr/s;
                    System.out.println("Average of grades "+ avr);
                    break;
                case 3:
                    double highestGrade=stuArr[0].getGrade();
                    for (int i =1;i<s;i++)
                    {
                        if (stuArr[i].getGrade()>highestGrade)
                        {
                            highestGrade=stuArr[i+1].getGrade();
                        }
                    }
                    for (int i =1;i<s;i++)
                    {
                        if (stuArr[i].getGrade()==highestGrade)
                        {
                            System.out.println(stuArr[i].getGrade());
                        }
                    }
                    System.out.println( highestGrade);
                    break;

                case 4:
                    boolean found =false;
                    System.out.println("Enter The id to search");
                    int sID =in.nextInt();
                    for (int i =0;i<s;i++)
                    {
                        if (sID==stuArr[i].getStudentId())
                        {
                            System.out.println(stuArr[i].getName());
                            found=true;
                        }
                        else
                        {
                            found=false;
                        }
                    }
                    if (!found)
                    {
                    System.out.println("Not Found!");
                    }
                    break;
                case 0:
                    System.out.println("Thank You");
                    break;
            }

        }while (choose!=0);
        in.close();


    }
}