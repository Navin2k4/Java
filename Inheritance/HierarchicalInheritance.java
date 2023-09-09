package Inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Student stu = new Student("Navin",18,"CSE");
        Staff sta = new Staff("Kumaran",32,"ECE");
        System.out.println(stu);
        System.out.println(sta);
    }
}

class College{
    String Cname;
    int code;
    College(){
        Cname = "VCET";
        code = 5067;
    }
}
class Student extends College{
    String SName;
    int RollNo;
    String dept;
    Student(String n,int r,String d){
        SName = n;
        RollNo = r;
        dept = d;
    }
    @Override
    public String toString() {
        return "College Name : "+Cname+" Code : "+code +" Student Name :  "+SName+" RollNO : "+RollNo+" Dept : "+dept;
    }
}
class Staff extends College{
    String SName;
    int Id;
    String dept;
    Staff(String n,int r,String d){
        SName = n;
        Id = r;
        dept = d;
    }
    @Override
    public String toString() {
        return "College Name : "+Cname+" Code : "+code +" Staff Name :  "+SName+" IDNO : "+Id+" Dept : "+dept;
    }
}