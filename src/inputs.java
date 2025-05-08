import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
try (//        String a = new String("ds");
        //        String a = "Glorp";
        Scanner s = new Scanner(System.in)) {
            String b = s.nextLine();
            System.out.println("You have written " + b);
        }
    }
}
