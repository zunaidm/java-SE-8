
package day3.IfElse;

public class GreadSystem {
    public static void main(String[] args) {
        getGread(0);
        getGread(50);
        getGread(60);
        getGread(70);
        getGread(80);
        getGread(-1);
        
    }
    public static  void getGread(int mark){
        if(mark>=50 && mark<60){
            System.out.println("Grade : B");
        }
        else if(mark>=60 && mark<70){
            System.out.println("Grade : B+");
        }
        else if(mark>=70 && mark<80){
            System.out.println("Grade : A-");
        }
        else if(mark>=80 && mark<=100){
            System.out.println("Grade : A+");
        }
        else if(mark>=0 && mark<50){
            System.out.println("Faile !!");
        }
        else
            System.out.println("WRONG Input !!");
    }
}
