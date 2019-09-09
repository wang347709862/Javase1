package Date0703_anli3;

public class Circle extends Image implements Color{
    Circle(){}
    Circle(int r){
        this.r=r;
    }

    public final double PI=3.14;
    public int r;


    public double ZhouChang(){
        return 2*PI*r;
    }
    public double S(){
        return PI*r*r;
    }
}
