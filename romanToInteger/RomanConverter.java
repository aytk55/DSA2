package romanToInteger;

import java.util.HashMap;

public class RomanConverter {
    private HashMap<Character, Integer> romanMap;

    public RomanConverter() {
        romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public int convertToInteger(String roman) {
        int total = 0;
        int size = roman.length();

        for (int i = 0; i <= size - 2; i++) {
            int first = romanMap.get(roman.charAt(i));
            int second = romanMap.get(roman.charAt(i + 1));

            if (first >= second) {
                total = total + first;
            } else {
                total = total - first;
            }
        }

        total = total + romanMap.get(roman.charAt(size - 1));
        return total;
    }
}
