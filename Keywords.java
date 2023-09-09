//Final, This, Super
// Final keyword is a constant variable cannot be updated or overriding
// Super it uses the variable of the parent function and do not override it
// This used to access the instance variable without initializing it again
class Keywords {
    public static void main(String[] args) {
        key K = new key();
        K.print('T',100);
        System.out.println(K.note);
        System.out.println(K.num);
/*
        Final F = new Final();
        System.out.println(F.note);
        F.print();
 */
    }

}
class key{
    char note;
    int num;
    void print(char note,int num){
        this.note = note;
        this.num = num;
        System.out.println("It is a parent class");
    }
}
/*
class Final extends key{
    char note = 'F';
    void print(){
        System.out.println("Child class");
        super.print();
    }
}
 */