public class DogName implements Cloneable{
    private String dogName;

    public DogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogName(){
        return dogName;
    }

    public Object clone() throws CloneNotSupportedException{
        return (DogName) super.clone();
    }
}
