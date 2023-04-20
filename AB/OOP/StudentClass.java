class Student{
    public int roll=1;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)total()/3;
    }
    public char grade(){
        char g;
        if(average()>=90)
            g='A';
        else if(average()<90 && average()>=50)
            g='B';
        else    
            g='C';
        return g;
    }
    public String toString(){
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course;
    }
}

public class StudentClass{
    public static void main(String[] args) {
        Student s=new Student();
        
        s.name="Harman";
        s.course="BE";
        s.m1=23;
        s.m2=313;
        s.m3=0;
        System.out.println(s.grade());
        System.out.println(s);
    }
}