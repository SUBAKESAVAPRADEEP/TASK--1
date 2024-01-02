package Task;

public class Smaller {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 30;


        if (x < y && x < z) {
            System.out.println("smallest number" + x);
        } else if (y < z) {
            System.out.println("smallest  number is" + y);
        } else {
System.out.println("smallest number"+z);
        }
    }
}