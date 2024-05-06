package learn.classes;

/**
 * System Class
 * - Class Sytem adalah class yang berisikan banyak utility static method di Java, contohnya
 *   sebelumnya kita sudah sering menggunakan method println milik field out di class System.
 *
 * Method di System Class
 * Method                               Keterangan
 * - String getenv(key)                 Mendapatkan environment variable sistem operasi
 * - void exit(status)                  Menghentikan program Java
 * - long currentTimeMilis()            Mendapatkan waktu saat ini dalam milisecond
 * - long nanoTime()                    Mendapatkan waktu saat ini dalam nanosecond
 * - void gc()                          Menjalankan Java garbage collection
 * - ... dan masih banyak
 */
public class SystemApp {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv());
        System.out.println(System.getenv("APP"));

        System.gc();

        System.exit(0);

        System.out.println("High");

    }
}
