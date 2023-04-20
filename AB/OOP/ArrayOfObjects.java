class Subject{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;
    public Subject(String subID,String name,int maxMarks){
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}
    public void setMaxMarks(int mm){
        maxMarks=mm;
    }
    public void setMarksObtain(int m){
        marksObtains=m;
    }
    boolean isQualified(){
        return marksObtains>=maxMarks/10*4;
    }
    public String toString(){
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+maxMarks;
    }
}
class Students{
    private String name;
    private String roll;
    private String dept;
    private Subject sub[];
    public Students(String roll,String name){
         this.roll=roll;
         this.name=name;
    }
    public String getRoll(){return roll;}
    public String getDept(){return dept;}
    public String getName(){return name;}
    public Subject[] getSubjects(){return sub;}
    public void setDept(String dept){
        this.dept=dept;
    }
    public void setSubjects(Subject ...subs){
        for(int i=0;i<subs.length;i++)
            sub[i]=subs[i];
    }
    public String toString(){
        return "Roll :" +roll+"\nName :"+name+"\nDept :"+dept;
    }
}
public class ArrayOfObjects{
    public static void main(String[] args) {
        Subject s[]=new Subject[3];
        s[0]=new Subject("CS120","DSA",90);
        s[1]=new Subject("CS34","AA",43);
        s[2]=new Subject("BE34","C",89);
        for(Subject i:s)
            System.out.println(i);
    }
}