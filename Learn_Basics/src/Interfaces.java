// Used For multiple inheritance
/*
It is also same as class usually class has one parent but while using interface we can
have multiple parents it helps in abstraction and every class must be abstract
It is used where ew cant extend multiple classes in inheritance normally
*/
interface father{
    abstract void call();
    abstract void talk();
}
interface mother{
    abstract void call();
    abstract void talk();
}
class son implements father,mother{ //Implement keyword for interface
    public void call(){
        System.out.println("Hello from Interface");
    }
    public void talk(){
        System.out.println("Talking from Interface");
    }
    public static void main(String[] args) {
        son ob =new son();
        ob.call();
        ob.talk();
    }
}
