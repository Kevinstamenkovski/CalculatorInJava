package file.one;
import  java.util.*;

public class Main {

    private static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {
        float a = input.nextInt();
        float r = a;
        char operator = input.next().charAt(0);

        while(operator != '='){  //While Loop
            switch(operator) {
                case '+':
                    r += a;
                    break;
                case '-':
                    r -= a;
                    break;
                case '*':
                    r *= a;
                    break;
                case '/':
                    r /= a;      //NOT WORKING
                    break;
                default:
                    System.err.println("There Is an error With The Operator");
                    break;
            }
            a = input.nextInt();
            operator = input.next().charAt(0);
        }
        System.out.println(r);
    }
}
