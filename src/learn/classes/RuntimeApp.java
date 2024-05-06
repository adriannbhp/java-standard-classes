package learn.classes;

/**
 * Runtime Class
 * - Ketika aplikasi Java berjalan, kita bisa melihat informasi environment aplikasi Java
 *   berjalan
 * - Informasi itu terdapat di class Runtime.
 * - Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single object. Kita bisa
 *   mengakses object tersebut menggunakan static method getRuntime() milik class Runtime
 *
 *   Method di Runtime Class
 *   Method                                 Keterangan
 *   - int availableProcessors()            Mendapatkan jumlah core cpu
 *   - long freeMemory()                    Mendapatkan jumlah memory bebas di JVM
 *   - long totalMemory()                   Mendapatkan jumlah total memory
 *   - long maxMemory()                     Mendapatkan jumlah maksimum memory di JVM
 *   - void (gc)                            Menjalankan garbage collector untuk menghinglangkan data
 *                                          di memory yang sudah tidak terpakai
 */
public class RuntimeApp {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
    }
}
