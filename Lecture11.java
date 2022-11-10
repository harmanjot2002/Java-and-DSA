class Student{
    int rollNo;
    String studentName;
}

public class Lecture11{
    public static void main(String[] args) {
        Student obj1=new Student();
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

        Student obj2=new Student();
        obj2.rollNo=2;
        obj2.studentName="Rahul";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);
    }
}