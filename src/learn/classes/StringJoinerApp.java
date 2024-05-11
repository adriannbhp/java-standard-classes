package learn.classes;

import java.util.StringJoiner;

/**
 * StringJoiner Class
 * - StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan
 *   dengan delimiter
 * - StringJoiner juga mendukung prefix dan suffix jika kita ingin menambahkannya
 * - Ini sangat bagus ketika ada kasus misal kita ingin mem-print Aray dengan format yang kita mau
 */
public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Adrian");
        joiner.add("Bimo");
        joiner.add("Hernawan Pratama");

        String value = joiner.toString();
        System.out.println(value);
    }
}
