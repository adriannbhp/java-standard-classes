package learn.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

//        String name = "Adrian";
//
//        name = name + " " + "Bimo";
//
//        name = name + " " + "Hernawan Pratama";
//
//        System.out.println(name);

        /** Output diatas mencetak 3 memory
             Output :
                Adrian
                Adrian Bimo
                Adrian Bimo Hernawan Pratama
         */

        /**
         * - String di java tidak bisa berubah
         * - Jika melakukan manipulasi string tidak direkomendasikan menggunakan string langsung
         *   seperti contoh diatas karena menggunakan banyak memory
         * - Contoh diatas menggunakan 3 memory sehingga tidak efisien :
         *   1. Adrian
         *   2. Adrian Bimo
         *   3. Adrian Bimo Hernawan Pratama
         */

        // Menggunakan String Builder

        StringBuilder builder = new StringBuilder();
        builder.append("Adrian");
        builder.append(" ");
        builder.append("Bimo");
        builder.append(" ");
        builder.append("Hernawan Pratama");

        String name = builder.toString();

        System.out.println(name);

        String name1 = "Adrian" +
                " " +
                "Bimo" +
                " " +
                "Hernawan Pratama";

        System.out.println(name1);

        // Menggunakan String builder lebih hemat memory meskipun kode programnya lebih banyak+

    }
}
