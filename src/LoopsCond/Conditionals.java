package LoopsCond;

public class Conditionals {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 10;
        if (a*a + b*b== c*c){
            System.out.println(true);
        } else if(c == 0){
            System.out.println("C is 0, so a = b = c = 0");
        }else {
            System.out.println(false);
        }
    }
}
