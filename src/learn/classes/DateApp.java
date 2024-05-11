package learn.classes;

import java.util.Calendar;
import java.util.Date;

/**
 * Date & Calendar
 * - Tiap bahasa pemrograman biasanya memiliki representasi tanggal, di Java juga
 *   sama, ada class Date & Calendar yang bisa kita gunakan sebagai representasi tanggal
 * - Sebenarnya di Java 8 sudah ada cara manipulasi tanggal yang baru menggunakan
 *   Java Date Time API, namun itu akan kita bahas di course terpisah
 * - Sekarang kita akan fokus menggunakan class Date dan Calendar
 */

public class DateApp {
    public static void main(String[] args) {

        // Menggunakan Date
        Date tanggal = new Date(1020527490000L);

        System.out.println(tanggal);

        /**
         *  Hubungan Date dan Calendar
         *  - Class Date adalah class representasi tanggal sampai presisi milisecond
         *  - Namun di class Date sudah banyak method-method yang di deprecated, sehingga untuk memanipulasi date tanggal, kita sekarang harus melakukan kombinasi antara class Date dan Calendar
         *  - Sederhananya Date untuk representasi tanggal, dan Calendar untuk memanipulasi tanggal
         */

        // Menggunakan Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -10);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 10);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
