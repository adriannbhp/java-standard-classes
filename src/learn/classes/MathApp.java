package learn.classes;

/**
 * Math Class
 * - Class Math merupakan class utilities yang berisikan banyak sekali static method untuk
 *   operassi numerik, seperti trigonometric, logarithm, akar pangkat, dan lain-lain
 *
 * Method di Math Class
 * Method                       Keterangan
 * - double cos(double)         Menghitung cos di trigonometric
 * - double sin(double)         Menghitung sin di trigonometric
 * - double tan(double)         Menghitung tan di trigonometric
 * - min(number1, number2)      Mengambil nilai terkecil
 * - max(number1, number1)      Mengambil nilai terbesar
 * - ...dan masih banyak
 */
public class MathApp {
    public static void main(String[] args) {

        var min = Math.min(1000, 2000);
        System.out.println(min);

        var max = Math.max(1000, 2000);
        System.out.println(max);

        System.out.println(Math.PI);
    }
}
