package Date0704;

import java.util.Objects;

public class ToString {
    public ToString(){}
//    public ToString(String name,int sex){
//        this.name
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToString toString = (ToString) o;
        return sex == toString.sex &&
                Objects.equals(name, toString.name);
    }

//    @Override
//    public int hashCode() {
//
//        return Objects.hash(sex, name);
//    }

    private int sex;
    private String name;

    public String toString(){
        return ("ToString{sex:"+sex+",name:"+name+"}");
    }
}
