package kata06SpinWords;

/**
 * Created by Alenka on 08.08.2016.
 */
public class SpinWords {

    public static void main(String[] args) {

        System.out.println("Hey wollef sroirraw : " + new SpinWords().spinWords("Hey fellow warriors"));
        System.out.println(("emocleW : " + new SpinWords().spinWords("Welcome asdfg")));
//        System.out.println((" " + new SpinWords().spinWords(" ")));
    }

    public String spinWords(String sentence) {

        String answer = "";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
            answer = answer + words[i] + " ";
        }

        return answer.substring(0,answer.length()-1);
    }
}