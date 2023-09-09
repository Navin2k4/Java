
// Can reduce the creation of memory used for the object
class Static {
    public static void main(String[] args) {
        System.out.println(Example.Value);
        Example2.Value = 20 ;
        System.out.println(Example.Value);
        Example.print(); // Called without using the Object because we used the static keyword before the method
    }
}
class Example{
    static int Value = 10 ; // Dosen't create another variable as an instance but it consumes same variable
    static void print(){
        System.out.println("Printed from static function");
    }
}
class Example2 extends Example{}
