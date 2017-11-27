
public class BdayWish {
    static String msg;
    public static void main(String[] args) {
        setName("Rakib");
        System.out.println(getMsg());
    }

    public static void setName(String name) {
        msg = "Happy BirthDay to " + name;
    }

    public static String getMsg() {
        return msg;
    }
}
