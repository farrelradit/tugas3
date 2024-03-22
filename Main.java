package tugas3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList mahasiswas = new ArrayList();

        Scanner input = new Scanner(System.in);
        boolean next = true;
        while (next) {
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Nilai: ");
            String nilaiAngkaString = input.nextLine();
            int nilaiAngka = Integer.parseInt(nilaiAngkaString);

            // Hitung nilai huruf
            String nilaiHuruf;
            if (nilaiAngka >= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAngka >= 80) {
                nilaiHuruf = "B";
            } else if (nilaiAngka >= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAngka >= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(nim);
            mhs.setNama(nama);
            mhs.setNilaiAngka(nilaiAngka);
            mhs.setNilaiHuruf(nilaiHuruf);
            
            ArrayList<Matkul> matkuls = new ArrayList<>();
                System.out.print("Masukkan Kode MK: ");
                String kodeMK = input.nextLine();

                System.out.print("Masukkan Nama MK: ");
                String namaMK = input.nextLine();

                Matkul matkul = new Matkul();
                matkul.setKodeMK(kodeMK);
                matkul.setNamaMK(namaMK);
                matkuls.add(matkul);

            mhs.setMatkuls(matkuls);
            mahasiswas.add(mhs);
            System.out.print("Tambah lagi? (y/t) ");
            String tambah = input.nextLine();

            if (tambah.equals("t")) {
                next = false;
            }
        }

        System.out.println("==================================");
        for (int i = 0; i < mahasiswas.size(); i++) {
            Mahasiswa mhs = (Mahasiswa) mahasiswas.get(i);
            System.out.println("NIM : " + mhs.getNim());
            System.out.println("Nama : " + mhs.getNama());
            System.out.println("Nilai : " + mhs.getNilaiHuruf());
            ArrayList Matkuls = mhs.getMatkuls();
        for (int j = 0; i < Matkuls.size(); j++) {
            Matkul matkul = (Matkul) Matkuls.get(j);
            System.out.println("Kode MK : " + matkul.getKodeMK());
            System.out.println("Nama MK : " + matkul.getNamaMK());
        }
    }
}
}