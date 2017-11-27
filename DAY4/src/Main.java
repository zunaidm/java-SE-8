
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        OOP ob = new OOP();
        System.out.println(ob.getId());
        System.out.println(ob.getName());
        
        Student info = new Student(10,"ZUnaid","email@email.com");
        Student info1 = new Student(101,"ZUnaid1","1email@email.com");
        Student info2 = new Student(102,"ZUnaid2","2email@email.com");
        System.out.println("ID : "+info.getId());
        System.out.println("Name : "+info.getName());
        System.out.println("Email : "+info.getEmail());
        
        List<Student>  persList = new ArrayList<>();
        persList.add(info1);
        persList.add(info2);
        persList.add(new Student(103, "Zunaid 3", "3@gmail.com"));
        
        for(Student st:persList){
            System.out.println("ID : "+st.getId());
            System.out.println("Name : "+st.getName());
            System.out.println("Email : "+st.getEmail());
        }
    }
}
