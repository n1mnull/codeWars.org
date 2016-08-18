package kata03TwoToOne;

/**
 * Created by Alenka on 08.08.2016.
 */
public class TwoToOne {

    public static void main(String[] args) {
        System.out.println("aehrsty : " + longest("aretheyhere", "yestheyarehere"));
//        System.out.println("abcdefghilnoprstu : " + longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
//        System.out.println("acefghilmnoprstuy : " + longest("inmanylanguages", "theresapairoffunctions"));
    }

    public static String longest (String s1, String s2) {

        s1 = s1.concat(s2);
        char[] chars = new char[32];
        char ch;

        for (int i = 0; i < s1.length(); i++) {
            ch = (char) (s1.substring(i,i+1).charAt(0) - 'a');
            chars[ch] = (char) (ch + 'a');
        }

        String str = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '\u0000') {
                str += String.valueOf(chars[i]);
            }
        }

        return str;
    }

//    public static String longest (String s1, String s2) {
//        Set<Character> set = new TreeSet<>();
//        for (char c : (s1 + s2).toCharArray()) {
//            set.add(c);
//        }
//        return set.toString().replaceAll("[\\[\\], ]", "");
//    }
}
