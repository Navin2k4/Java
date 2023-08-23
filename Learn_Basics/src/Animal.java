//Inheritance

// Parent-Child Single inheritance
// Parent's Parent-Parent-Child Multi level inheritance
// Parent-Many children Hierarchical inheritance
// Hybrid
// Multiple
class Animal { // Parent class / Base class / Super Class
    int noLegs = 4;
    public void eat(){
        System.out.println("I am Eating");
    }
    public void walk() {
        System.out.println("I am Walking");
    }
}
// Sub class or Child Class
class Dog extends Animal{ //Inheriting the traits from the class Animal which reduces the repetation of code
    Boolean canWalk = true;
    int noLegs = 5;
    public void eat(){
        System.out.println("Dog is Eating");
    }

}
class Call{
    public static void main(String[] args) {
        Dog obj = new Dog();
        System.out.println(obj.noLegs); //Prints 5 called method overriding
        System.out.println(obj.canWalk);
        obj.eat(); //here the eat function is overriding called field or method overriding
        obj.walk();
    }
}
