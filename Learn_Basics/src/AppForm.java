// General template is called class
// Specific details used is object - instance(copy) of a class
// Encapsulation - Methods and Variables combined in class is Encapsulation
// Abstraction - Hiding the unnecessary details from the user by the use of access modifiers
// Polymorphism - Defining same function but in different forms
// Inheritance - Inheriting the traits from the class
//Class - Variables(Fields) , Functions(Methods) are called members of a class
//Access Modifiers  PUBLIC     -  Any file in any package can have the access
//                  PRIVATE    -  Cannot access outside of its class
//                  PROTECTED  -  Works in this file but not in other file in the package
class AppForm{
    String name;
    int roll_no;
    public void display(){
        System.out.println(name);
        System.out.println(roll_no);
    }
    public void set_name(String str, int num){ //Setter Function
        name = str;
        roll_no=num;
    }
    public String get_value(){ //Getter function
        return name;
    }


}
class main{
    // Public - Any Package in any file can access this class
    public static void main(String[] args) {

        //Assigning values using functions
        AppForm example = new AppForm();
        example.set_name("Example1",101);
        example.display();

        // Many objects can be created
        // Normal way of assigning value
        AppForm example2 = new AppForm();
        example2.set_name("Example2",102);  //Setter function used
        example2.display();
        String std2 = example2.get_value();  // Getter Function Used
        System.out.println(std2);

    }
}










