package kata05DirReduction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alenka on 08.08.2016.
 */
public class DirReduction {

//    public static void main(String[] args) {
//
//        String[] direct = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST", "WEST", "WEST", "EAST", "NORTH", "NORTH"};
//
//        String[] ans = dirReduc(direct);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i] + " ");
//        }
//        System.out.println();
//    }

    public static String[] dirReduc(String[] arr) {

        int flag = 0;

        if (arr.length <= 1) {
            return arr;
        }

        for (int i = 0; i < arr.length-1 ; i++) {
            if ((arr[i].equals("NORTH") && arr[i+1].equals("SOUTH")) ||
                    (arr[i+1].equals("NORTH") && arr[i].equals("SOUTH")) ||
                    (arr[i].equals("EAST") && arr[i+1].equals("WEST")) ||
                    (arr[i+1].equals("EAST") && arr[i].equals("WEST"))) {
                arr[i] = "";
                arr[i+1] = "";
                flag++;
            }
        }

        if (flag == 0)
            return arr;

        List<String> dirReduce = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(""))
                dirReduce.add(arr[i]);
        }

        return dirReduc(dirReduce.toArray(new String[dirReduce.size()]));

    }
}
