public class Recursive_Function {
    public static void main(String[] args) {
        int num=5;
        natPrint(num);
    }
    public static void natPrint(int n){
        //Base case
        if(n==1){
            System.out.println(1);
        }
        //Recursive case
        else{
            System.out.println(n);
            natPrint(n-1);
        }
    }
}
