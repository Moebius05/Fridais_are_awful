import java.util.Scanner;

import static java.lang.Integer.reverse;

public class Main {

    public static void main(String[] args)

    {
    NumberMirror numberMirror = new NumberMirror();
    System.out.println("Please write something clever on the keyboard! " );
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println(numberMirror.turnAround(input));


//        NumberMirror reverse = new NumberMirror();
  //      Integer result = NumberMirror("12345");


    SpecialNumber specialNumber = new SpecialNumber();
        System.out.println("Please write something!");
        System.out.println(SpecialNumber(input));


    }
}
