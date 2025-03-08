package javabasicpractices.JavaOOP.C1;
public class StudentClass {
    
    private float marks;
    protected String names;
    public int id;
    public int roll;
    
    public StudentClass(String names, int id, int roll){
        this.names = names;
        this.id = id;
        this.roll = roll;
    }
    
    public void getData(String names, int id, int roll){
        this.names = names;
        this.id = id;
        this.roll = roll;
    }
    
    public void display(){
        System.out.println("Name : "+names);
        System.out.println("Name : "+id);
        System.out.println("Name : "+roll);
    }
    
    
    
}
