package kata07Tortoise;

/**
 * Created by Alenka on 08.08.2016.
 */
public class Tortoise {

    public static void main(String[] args) {
        race(720, 850, 70);
        race(80, 91, 37);
        race(80, 100, 40);
    }

    public static int[] race(int v1, int v2, int g) {

        if (v1 >= v2) return null;

        int[] hourMinSec = new int[3];

        float time = g * 60 * 60 / (v2 - v1);

        hourMinSec[0] = (int) time / (60 * 60);

        hourMinSec[1] = (int) (time - hourMinSec[0] * 60 * 60) / 60;

        hourMinSec[2] = (int) (time - hourMinSec[0] * 60 * 60 - hourMinSec[1] * 60) % 60;

        System.out.println(hourMinSec[0] + " " + hourMinSec[1] + " " + hourMinSec[2] + " " + time);

        return hourMinSec;
    }

}
