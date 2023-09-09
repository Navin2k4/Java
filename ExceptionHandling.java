class UserDefined extends Exception{
        UserDefined(String str){
            super(str); ;
        }
}
class ExceptionHandling {
    static void check(int age) throws UserDefined,ArithmeticException {
        if(age<18){
            throw new UserDefined("Value cannot be less than 18");
        }
        else{
            throw new ArithmeticException("It is Arithmetic Exception ");
        }
    }
    public static void main(String[] args) {
        try{
            check(19);
        }
        catch (UserDefined E){
            System.out.println(E.getMessage());
        }
        catch (ArithmeticException A){
            System.out.println(A);
        }
    }
}
















