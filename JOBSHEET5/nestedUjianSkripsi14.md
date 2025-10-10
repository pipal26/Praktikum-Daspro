1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Mengapa demikian?
2. Jelaskan maksud dari potongan kode berikut!
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
runtut untuk semua kondisi!
jawaban
1. program tetap berjalan karena adanya .trim()
2. Jika ingin kondisi true harus memenuhi kedua kondisi operasi tersebut
Tanya: Bebas kompen?
Input: "Ya" atau "Tidak"
Jika jawab "Ya" → Lanjut cek log bimbingan
Cek: P1 ≥ 8 DAN P2 ≥ 4?
2a. Jika YA (P1 ≥ 8 DAN P2 ≥ 4):
Output: "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi"
KESIMPULAN: LOLOS ✓
2b. Jika TIDAK (P1 < 8 DAN P2 < 4):
Output: "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali"
KESIMPULAN: GAGAL ✗
2c. Jika P1 < 8 saja:
Output: "Gagal! Log bimbingan P1 belum mencapai 8 kali"
KESIMPULAN: GAGAL ✗
2d. Jika P2 < 4 saja:
Output: "Gagal! Log bimbingan P2 belum mencapai 4 kali"
KESIMPULAN: GAGAL ✗
Jika jawab "Tidak" → Tidak perlu cek log bimbingan
Output: "Gagal! Mahasiswa masih memiliki tanggungan kompen"
KESIMPULAN: GAGAL ✗
SELESAI