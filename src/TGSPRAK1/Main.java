
package TGSPRAK1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Perintah Output
        System.out.println("Hello, world!");

        // Perintah Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        // Perintah Kondisi
        if (angka > 0) {
            System.out.println("Angka positif");
        } else {
            System.out.println("Angka tidak positif");
        }

        // Perintah Perulangan
        for (int i = 1; i <= angka; i++) {
            System.out.println("Iterasi ke-" + i);
        }

        // Perintah class
        MyClass obj = new MyClass();
        obj.myMethod();
    }
}

class MyClass {
    public void myMethod() {
        System.out.println("Ini adalah method dari class MyClass");
    }
}