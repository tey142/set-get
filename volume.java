import java.util.Scanner;
class shape{
    public double getvol(){
        return 0;
    }
}
class faceshape extends shape{
    private double length;
    private double width;
    private double height;
    public faceshape(double length, double width, double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public double getvol(){
        return length*width*height;
    }
}
class othershape extends shape{
    private double base;
    private double height;
    public othershape(double base, double height){
        this.base=base;
        this.height=height;
    }
    public double getvol(){
        return base*height;
    }
}
public class volume{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("~~~~prism volume calculator~~~~");
        System.out.println("does this shape have 6 faces (enter y for yes and n for no)");
        String a=sc.nextLine();
        if(a.equals("y")){
            System.out.println("enter the length: ");
            float length=sc.nextFloat();
            System.out.println("enter the width: ");
            float width=sc.nextFloat();
            System.out.println("enter the height");
            float height=sc.nextFloat();
            shape s[]=new shape[2];
            s[0]=new faceshape(length, width, height);
            s[1]=new othershape(0,0);
            System.out.println("shape volume: "+s[0].getvol());
        }
        else if(a.equals("n")){
            System.out.println("enter base area: ");
            float area=sc.nextFloat();
            System.out.println("enter the height: ");
            float height=sc.nextFloat();
            shape s[]=new shape[2];
            s[0]=new faceshape(0,0,0);
            s[1]=new othershape(area, height);
            System.out.println("shape volume: "+s[1].getvol());
        }
        else{
            System.out.println("invalid entry");
        }
        sc.close();
    }
}