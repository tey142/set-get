class shape {
    public double getarea(){
        return 0;
    }
}
class triangle extends shape{
    private double base;
    private double height;
    public triangle(double base, double height){
        this.base=base;
        this.height=height;
    }
    public double getarea(){
        return 0.5*base*height;
    }
}
class square extends shape{
    private double side;
    public square(double side){
        this.side=side;
    }
    public double getarea(){
        return side*side;
    }
}
public class shapes{
    public static void main(String[] args){
        shape[] shape=new shape[2];
        shape[0]=new square(5);
        shape[1]=new triangle(2, 14);
        System.out.println("area of square: "+shape[0].getarea());
        System.out.println("area of triangle: "+shape[1].getarea());
    }
}
