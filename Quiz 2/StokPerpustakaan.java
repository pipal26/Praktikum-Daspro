public class StokPerpustakaan {
    public static void main(String[] args) {

        String[] mapel = { "Basis Data", "Matematika", "Bahasa Inggris", "Algoritma" };

        int[][] stokBuku = {
            { 20, 4, 1 },    
            { 40, 7, 0 },
            { 40, 10, 5 },
            { 50, 20, 10 }
        };

        System.out.println("=== DATA STOK BUKU ===");

        for (int i = 0; i < stokBuku.length; i++) {
            int stokMasuk = stokBuku[i][0];
            int stokRusak = stokBuku[i][1];
            int stokKeluar = stokBuku[i][2];

            System.out.println("\nMata Pelajaran : " + mapel[i]);
            System.out.println("Stok Masuk     : " + stokMasuk);
            System.out.println("Stok Rusak     : " + stokRusak);
            System.out.println("Stok Keluar    : " + stokKeluar);
        }

        System.out.println("=== DATA STOK BUKU YANG DAPAT DIPINJAM ===");

        for (int i = 0; i < stokBuku.length; i++) {
            int stokMasuk = stokBuku[i][0];
            int stokRusak = stokBuku[i][1];
            int stokKeluar = stokBuku[i][2];

            int stokTersedia = stokMasuk - stokRusak - stokKeluar;

            System.out.println("\nMata Pelajaran : " + mapel[i]);
            System.out.println("Stok Masuk     : " + stokMasuk);
            System.out.println("Stok Rusak     : " + stokRusak);
            System.out.println("Stok Keluar    : " + stokKeluar);
            System.out.println("Stok Bisa Dipinjam: " + stokTersedia);
        }

        System.out.println("Daftar buku yang laku dipinjam:");
        for (int i = 0; i < stokBuku.length; i++) {
            int stokKeluar = stokBuku[i][2];
            if (stokKeluar > 0) {
                System.out.println("- " + mapel[i] + " (Dipinjam: " + stokKeluar + ")");
            }
        }
    }
}
