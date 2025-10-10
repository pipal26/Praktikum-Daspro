import java.util.Scanner;
public class ifElseWifiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Apakah anda mahasiswa atau dosen ?  ");
        String jenisPengguna = sc.nextLine();

        if (jenisPengguna.equalsIgnoreCase("dosen")){

            System.out.println("Akses wifi diberikan" );
            if (jenisPengguna.equalsIgnoreCase("mahasiswa"));
            System.out.println("Masukkan jumlah sks yang diambil : ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Akses wifi diberikan");
            } else {
                System.out.println("Akses wifi ditolak, karena jumlah sks kurang dari 12");
            }
        }
        else {
            System.out.println("Akses wifi ditolak");
        }

    }
}
