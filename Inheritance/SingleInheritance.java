package Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        boxweight obj = new boxweight(10,20,30);
        System.out.println(obj.volume());
    }
}
class box{
    double width,height,depth;
    double volume(){
        return height*width*depth;
    }
}
class boxweight extends box{
    double weight;
    boxweight(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
}