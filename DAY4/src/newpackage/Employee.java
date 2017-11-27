
package newpackage;


public class Employee {
    private int id ; 
    private String name , email;
    private double slary;
    private Depertment depertment;

    public Employee() {
    }

    public Employee(int id, String name, String email, double slary, Depertment depertment) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.slary = slary;
        this.depertment = depertment;
    }
    
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSlary() {
        return slary;
    }

    public Depertment getDepertment() {
        return depertment;
    }

 
    
   
}

