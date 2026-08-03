import java.util.*;

public class Main {

    static int menu(Scanner in) {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Display Students");
        System.out.println("2. Calculate Average Grade");
        System.out.println("3. Find Highest Grade");
        System.out.println("4. Search Student by ID");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
        return in.nextInt();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of Students: ");
        byte N = in.nextByte();

        Student[] student = new Student[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter info for student " + (i + 1) + ":");

            System.out.print("Enter name: ");
            in.nextLine();
            String name = in.nextLine();

            System.out.print("Enter id: ");
            int id = in.nextInt();

            double grade;
            while (true) {
                System.out.print("Enter grade (0-100): ");
                grade = in.nextDouble();
                if (grade >= 0 && grade <= 100) {
                    break;
                }
                System.out.println("Invalid grade! Please enter a value between 0 and 100.");
            }

            student[i] = new Student(name, id, grade);
        }

        int choose;
        do {
            choose = menu(in);

            switch (choose) {
                case 1:
                    System.out.println("\n--- Students List ---");
                    for (int i = 0; i < N; i++) {
                        student[i].print();
                    }
                    break;

                case 2:
                    double sum = 0;
                    for (int i = 0; i < N; i++) {
                        sum += student[i].getGrade();
                    }
                    if (N > 0) {
                        double avr = sum / N;
                        System.out.println("Average grade: " + avr);
                    } else {
                        System.out.println("No students available.");
                    }
                    break;

                case 3:
                    if (N > 0) {
                        Student highestGrade = student[0];
                        for (int i = 1; i < N; i++) {
                            if (student[i].getGrade() > highestGrade.getGrade()) {
                                highestGrade = student[i];
                            }
                        }
                        System.out.println("Student with highest grade:");
                        highestGrade.print();
                    }
                    break;

                case 4:
                    System.out.print("Enter student id to search: ");
                    int id = in.nextInt();
                    boolean found = false;
                    for (int i = 0; i < N; i++) {
                        if (student[i].getStudentId() == id) {
                            student[i].print();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choose != 5);

        in.close();
    }
}