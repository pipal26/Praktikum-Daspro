import java.util.Scanner;
public class KelususanMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input

        System.out.print("==== Input Data Mahasiswa ====\n");
        String nama, nim;

        System.out.print("Nama : ");
        nama = sc.nextLine();

        System.out.print("NIM : ");
        nim = sc.nextLine();

        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        int utsmk1, uasmk1, tugasmk1;

        System.out.print("Nilai UTS : ");
        utsmk1 = sc.nextInt();

        System.out.print("Nilai UAS : ");
        uasmk1 = sc.nextInt();

        System.out.print("Nilai Tugas : ");
        tugasmk1 = sc.nextInt();
        
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        int utsmk2, uasmk2, tugasmk2;
    }
}
