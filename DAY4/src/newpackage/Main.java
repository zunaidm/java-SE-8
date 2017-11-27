/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;



import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
      
        
        List<Employee>  persList = new ArrayList<>();
        persList.add(new Employee(100, "Zunaid", "100@gmail.com", 1000.00, new Depertment(1, "Software")));
        persList.add(new Employee(101, "Zunaid", "100@gmail.com", 1000.00, new Depertment(2, "WEB")));
        
        for(Employee st:persList){
            //We can search also 
           // if(st.getDepertment().getDptName().equals("Software"))
            System.out.println("ID : "+st.getId()
                    +" Name : "+ st.getName()
                    +" Email : "+ st.getEmail()
                    +" Salaray : "+ st.getSlary()
                    +" Dept ID : "+ st.getDepertment().getId()
                    +" Dept Name : "+ st.getDepertment().getDptName()
                    );
           
        }
    }
}
