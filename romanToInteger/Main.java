package romanToInteger;

public class Main {
    public static void main(String[] args) {
        String romanNumeral = "MCMXC";


        RomanConverter romanConverter = new RomanConverter();


        int result = romanConverter.convertToInteger(romanNumeral);


        System.out.println(result);
    }
}