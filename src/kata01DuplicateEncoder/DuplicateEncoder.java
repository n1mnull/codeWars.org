package kata01DuplicateEncoder;

/**
 * Created by Alenka on 08.08.2016.
 */



public class DuplicateEncoder {

    public static void main(String[] args) {
        System.out.println("Prespecialized " + encode("Prespecialized"));
    }

    static String encode(String word){

        char[] chars = word.toLowerCase().toCharArray();

        char[] newChar = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {

            if (newChar[i] != ')') {
                newChar[i] = '(';
            }

            for (int j = i+1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {

                    newChar[i] = ')';
                    newChar[j] = ')';

                }
            }
        }

        return String.valueOf(newChar);
    }
}