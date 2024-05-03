package learn.classes;

import java.util.Locale;

/**
 * String Class
 * - Seperti yang pernah dibahas di materi Java Dasar, String adalah object, artinya
 *   dia memiliki representasi class nya
 * - Ada banyak sekali method yang bisa kita gunakan di String, kita bisa melihat detail
 *   method apa saja yang tersedia di halaman dokumentasi javadoc nya
 *
 *   Method di String Class
 *   Method                             Keterangan
 *   - String toLowerCase()             Membuat string baru dengan format lower case
 *   - String toUpperCase()             Membuat string baru dengan format upper case
 *   - int lenght()                     Mendapatkan panjang string
 *   - boolean startsWith(value)        Mengecek apakah dimulai dengan string value
 *   - boolean endsWith(value)          Mengecek apakah diakhiri dengan string value
 *   - String[] split(value)            Memotong string dengan string value
 *
 */
public class StringApp {
    public static void main(String[] args) {

        String name = "Adrian Bimo Hernawan Pratama";
        String nameLowerCase = name.toLowerCase(Locale.ROOT);
        String nameUpperCase = name.toUpperCase(Locale.ROOT);


        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Adrian"));
        System.out.println(name.endsWith("Pratama"));

        String[] names = name.split("");
        for (var value : names){
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(8));

        char[] chars = name.toCharArray();
    }

}
