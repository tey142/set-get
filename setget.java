class setget1 {
    private String name;
    public String get(){
        return name;
    }
    public void set(String name){
        this.name=name;
    }
}
public class setget{
    public static void main(String[] args){
        setget1 s=new setget1();
        s.set("taylor @codingal");
        System.out.println(s.get());
    }
}
