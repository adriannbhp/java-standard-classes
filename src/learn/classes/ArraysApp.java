package learn.classes;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Arrays Class
 * - Arrays class adalah class yang berisikan static method yang bisa kita gunakan
 *   untuk memanipulasi data array, seperti pencarian dan pengurutan
 *
 * Method di Arrays Class
 * Method
 * - binarySearch(array, value)         Mencari value di array
 * - copyOf(...)                        Menyalin data aray
 * - equals(array1, array2)             Membandingkan array1 dan array2
 * - sort(array)                        Mengurutkan array
 * - toString(array)                    Mengembalikan representasi string
 * - ... dan masih banyak
 */

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {
                1, 5, 6,2, 7, 89, 99, 245, 45, 4
        };

        // Sorting
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 250)); // Jika dibawah 0 berarti data nya tidak ada

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
