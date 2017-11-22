
package day3.IfElse;

public class NewClass {
    private static int passMark = 50;
    public static void main(String[] args) {
        getMark(50);
    }
    public static void getMark(int obtainMark){
        if(obtainMark>passMark){
            System.out.println(":PASS!!:");
        }
        else
            System.out.println(":FAILE!!:");
    }
}
