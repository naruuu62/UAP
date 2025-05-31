package uap.bases;
public abstract class shape {
    private String name;
    public shape(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void printInfo();
}