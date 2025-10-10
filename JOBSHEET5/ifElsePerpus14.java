import java.util.Scanner;
public class ifElsePerpus14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistem Akses Perpustakaan");
        System.out.print("Apakah Anda membawa Kartu Perustakaan (Ya/Tidak)? ");
        String kartuPerpus = scanner.nextLine().trim().toLowerCase();

        System.out.print("Apakah Anda sudah melakukan Registrasi Online (Ya/Tidak)? ");
        String registrasi = scanner.nextLine().trim().toLowerCase();

        if (kartuPerpus.equalsIgnoreCase("ya") || registrasi.equalsIgnoreCase("ya")) {
            System.out.println("Diizinkan masuk");
        } else {
            System.out.println("Ditolak masuk");
        }
        }
    }
    

