public class SpecialNumber {
    public String specialNumber(String original) {

        int value   = Integer.parseInt(original);
        value       = value +1;
        String originalPlusOne = Integer.toString(value);


        String turnedAroundAndOneAdded = "";

        int length = originalPlusOne.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            turnedAroundAndOneAdded = turnedAroundAndOneAdded + originalPlusOne.charAt(i);

        System.out.println("Turned around plus one: " + turnedAroundAndOneAdded);
        return turnedAroundAndOneAdded;}
}
