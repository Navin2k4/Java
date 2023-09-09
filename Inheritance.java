class Inheritance {
    public static void main(String[] args) {
        Son S = new Son();
        System.out.println(S.Gender);
        S.print();

        Daughter D = new Daughter();
        System.out.println(D.Gender);
        D.print();

        Granddaughter GD = new Granddaughter();
        System.out.println(GD.Gender);
        D.print();

        GrandGranddaughter GGD = new GrandGranddaughter();
        System.out.println(GGD.Gender);
        D.print();
    }
}

class Father{
    char Gender = 'M';
    void print(){
        System.out.println("Parent Class");
    }
}
class Son extends Father{}
class Daughter extends Father{
    char Gender = 'F';
}
class Granddaughter extends Daughter{}
class GrandGranddaughter extends Granddaughter{}