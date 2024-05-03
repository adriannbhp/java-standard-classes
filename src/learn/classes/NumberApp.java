package learn.classes;

/**
 * Number Class
 * - Semua number class yang bukan primitif memiliki parent class yang sama, yaitu class Number
 * - Class number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain
 * - Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya
 *
 * Method di NumberClass
 * Method                       Keterangan
 * - byte byteValue()           Mengubah menjadi tipe byte value
 * - double doubleValue()       Mengubah menjadi tipe double value
 * - float floatValue()         Mengubah menjadi tipe float value
 * - int intValue()             Mengubah menjadi tipe int value
 * - long longValue()           Mengubah menjadi tipe long value
 * - short shortValue()         Mengubah menjadi tipe short value
 */

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

    }
}
