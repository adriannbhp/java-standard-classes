package learn.classes;

import java.util.Random;

/**
 * Random Class
 * - Random Class adalah Class yang bisa kita gunakan untuk
 *   men-generate random number
 */
public class RandomApp {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int value = random.nextInt(1000);
            System.out.println(value);
        }
    }
}
