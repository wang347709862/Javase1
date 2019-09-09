package Date0701;

public class People {
    private String name;
    private boolean isworker;
    private boolean isman;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsworker() {
        return isworker;
    }

    public void setIsworker(boolean isworker) {
        this.isworker = isworker;
    }

    public boolean isIsman() {
        return isman;
    }

    public void setIsman(boolean isman) {
        this.isman = isman;
    }

    People(){


    }
    People(String name,boolean isworker,boolean isman){
        this.isman=isman;
        this.isworker=isworker;
        this.name=name;
    }

}
