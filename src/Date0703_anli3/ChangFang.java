package Date0703_anli3;

public class ChangFang extends Image{
    ChangFang(){}
    ChangFang(int chang,int kuan){
        this.chang=chang;
        this.kuan=kuan;
    }

    int chang;
    int kuan;

    public double ZhouChang(){
        return 2*(chang+kuan);
    }
    public double S(){
        return chang*kuan;
    }
}
