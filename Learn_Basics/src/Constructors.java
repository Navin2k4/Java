class Constructors {
    int rollno;
    int marks;
    Constructors(){ //Default Constructor
        System.out.println("It is a default constructor");
    }
    Constructors(int num,int mark){ // Parameterized Constructors
        System.out.println("It is parameterized constructor");
        rollno=num;
        marks=mark;
    }

}

class  Construct{
    public static void main(String[] args) {
        Constructors obj = new Constructors(71,50); // Default values to the Constructor
        System.out.println(obj.rollno);
        System.out.println(obj.marks);
        Constructors obj1 = new Constructors();
        System.out.println(obj1.rollno);
        System.out.println(obj1.marks);
    }
}