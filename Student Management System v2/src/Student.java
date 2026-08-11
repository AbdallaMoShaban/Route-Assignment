public class Student {
    private final String name ;
    private final int StudentId;
    private final double grade;
     Student(String n,int id ,double g){
         name=n;
         StudentId=id;
         grade=g;
     }

    public int getStudentId() {
        return StudentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }


}
