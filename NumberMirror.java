import java.util.Scanner;

public class NumberMirror {
    public String turnAround(String original) {

        String turnedAround = "";
        //Scanner in = new Scanner(System.in);

        //original = in.nextLine();

        int length = original.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            turnedAround = turnedAround + original.charAt(i);

        System.out.println("Turned araound: " + turnedAround);
    return turnedAround;}
}

