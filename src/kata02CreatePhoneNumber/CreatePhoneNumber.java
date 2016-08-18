package kata02CreatePhoneNumber;

/**
 * Created by Alenka on 08.08.2016.
 */
public class CreatePhoneNumber {

    public static void main(String[] args) {

        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));

    }

    public static String createPhoneNumber(int[] numbers) {

        char[] chars = new char[]{'(','*','*','*',')',' ','*','*','*','-','*','*','*','*'};
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '*') {
                chars[i] = (char) (numbers[count]+'0');
                count++;
            }
        }
        return String.valueOf(chars);
//        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }
}
