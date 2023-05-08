import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String roman = "LVIII";

        int result = romanToInt(roman);

        System.out.println(result);
    }

    public static int romanToInt(String roman) {

        Map<Character,Integer> numbers = new HashMap<Character, Integer>();

        int sum = 0;

        numbers.put('I',1);
        numbers.put('V',5);
        numbers.put('X',10);
        numbers.put('L',50);
        numbers.put('C',100);
        numbers.put('D',500);
        numbers.put('M',1000);

        roman=roman.replace("IV","IIII");
        roman=roman.replace("IX","VIIII");
        roman=roman.replace("XL","XXXX");
        roman=roman.replace("XC","LXXXX");
        roman=roman.replace("CD","CCCC");
        roman=roman.replace("CM","DCCCC");

        for(int i=0;i<roman.length();i++){
            sum = sum + (numbers.get(roman.charAt(i)));
        }
        return sum;
    }
}

