public class Student {
    private final String name;
     private final  int studentId;
      private final double grade;
    Student(String n, int id ,double g){
        name =n;
        studentId=id;
        grade=g;
    }
    int getStudentId(){return studentId;}
    double getGrade(){
        return grade;
    }
    String  status(){
        if (grade>=0&&grade<=100){
            if (grade >= 90){return "Excellent";}
            else if (grade >= 75){ return "VeryGood";}
            else if (grade >= 60){return "Pass";}
            else{return "Fail";}
        }
        return "invalid";

    }
    void print(){
        System.out.println("Student name "+name);
        System.out.println("Student id "+studentId);
        System.out.println("Student Grade "+getGrade());
        System.out.println("Student Status " + status());
    }

}
