class Polymorphism {
    public static void main(String[] args) {
        Method obj1 = new Method();
        obj1.min(5,6);
        obj1.min(5,1,4);
    }
}
class Method{
    void min(int a, int b){ //Signature of the function is it gets two integer and returns a void function
        if(a<b){
            System.out.println("A is Minimum " + a);
        }
        else{
            System.out.println("B is Minimum " + b);
        }
    }
    void min(int a,int b,int c){//Signature of the function is it gets three integer and returns a void function
        if((a<b)&&(a<c)){
            System.out.println("A is Minimum " + a);
        }
        else if((b<c)&&(b<a)){
            System.out.println("B is Minimum " + b);
        }
        else {
            System.out.println("C is Minimum " + c);
        }
    }


}
//It is called Method (function) overloading