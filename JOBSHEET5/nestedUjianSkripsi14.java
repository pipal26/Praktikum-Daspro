import java.util.Scanner;

public class nestedUjianSkripsi14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("Masukkan jumlah log bimbingan Pembimbing 1");
        int Bimbingan1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan Pembimbing 2");
        int Bimbingan2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (Bimbingan1 >= 8 && Bimbingan2 >= 4) {
                System.out.println("Semua syarat terpenuhi. Mahasiswa dapat mengikuti ujian skripsi");
            } else if (Bimbingan1 < 8) {
                System.out.println(
                        "Mahasiswa belum dapat mengikuti ujian skripsi karena log bimbingan Pembimbing 1 kurang dari 8");
            } else {
                System.out.println(
                        "Mahasiswa belum dapat mengikuti ujian skripsi karena log bimbingan Pembimbing 2 kurang dari 4");

            }

        } else {
            System.out.println("Mahasiswa belum dapat mengikuti ujian skripsi karena log bimbingan kurang dari 3");
        }
    }
}
    

