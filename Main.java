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

            // Hitung nilai huruf
            

            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(nim);
            mhs.setNama(nama);
            
            ArrayList<Matkul> matkuls = new ArrayList<>();
            boolean nextMatkul = true;
            while (nextMatkul) {
                System.out.print("Masukkan Kode MK: ");
                String kodeMK = input.nextLine();

                System.out.print("Masukkan Nama MK: ");
                String namaMK = input.nextLine();
                
                System.out.print("Masukkan Nilai: ");
            String nilaiAngkaString = input.nextLine();
            int nilaiAngka = Integer.parseInt(nilaiAngkaString);

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

            mhs.setNilaiAngka(nilaiAngka);
            mhs.setNilaiHuruf(nilaiHuruf);

                Matkul matkul = new Matkul();
                matkul.setKodeMK(kodeMK);
                matkul.setNamaMK(namaMK);
                matkuls.add(matkul);
                System.out.print("Tambah matkul? (y/t) ");
                String tambahMatkul = input.nextLine();

                if (tambahMatkul.equals("t")) {
                nextMatkul = false;
                }
            }

            mhs.setMatkuls(matkuls);
            mahasiswas.add(mhs);
            System.out.print("tambah lagi? (y/t) ");
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
                ArrayList Matkuls = mhs.getMatkuls();
                for (int j = 0; i < Matkuls.size(); j++) {
                    Matkul matkul = (Matkul) Matkuls.get(j);
                    System.out.println("Kode MK : " + matkul.getKodeMK());
                    System.out.println("Nama MK : " + matkul.getNamaMK());
                    System.out.println("Nilai : " + mhs.getNilaiHuruf());
            }
        }
    }
}