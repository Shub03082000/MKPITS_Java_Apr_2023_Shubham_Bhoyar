package Inheritance_by_getter_setter;

public class TeacherClass {
    private String designation = "teacher";
    private String collegeName = "Beginnersbook";

    //getter and setter
    public String getCollegeName(){
        return collegeName;
    }

    protected void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }

    public String getDesignation(){
        return designation;
    }

    protected void setDesignation(String designation){
        this.designation = designation;
    }

    //method
     public void doesSetGet(){
        System.out.println("Teaching");
    }
}
