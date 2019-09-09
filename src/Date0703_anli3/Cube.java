package Date0703_anli3;

public class Cube extends Image{
    Cube(int bianchang){
        this.bianchang=bianchang;
    }


    int bianchang;

    public double ZhouChang(){
        return bianchang*4;
    }
    public double S(){
        return bianchang*bianchang;
    }
}
