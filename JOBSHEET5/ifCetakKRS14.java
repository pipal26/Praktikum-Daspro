package JOBSHEET5;

import java.util.Scanner;

public class ifCetakKRS14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uktLunas;
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        uktLunas = sc.nextBoolean();
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }
    }
}