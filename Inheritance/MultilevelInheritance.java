package Inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        boxcost obj = new boxcost(10,20,30,40,100);
        System.out.println(obj.volume());
        System.out.println(obj.weight);
        System.out.println(obj.cost);
    }
}
class box1{
    double width,height,depth;
    double volume(){
        return height*width*depth;
    }
}
class boxweight1 extends box{
    double weight;
    boxweight1(){

    }
}
class boxcost extends boxweight1{
    double cost;
    boxcost(double w,double h,double d,double we,double c){
            width =w;
            height = h;
            depth = d;
            weight = we;
            cost = c;

    }
}