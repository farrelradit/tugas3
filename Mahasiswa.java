package tugas3;

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private int nilaiAngka;
    private String nilaiHuruf;
    private ArrayList<Matkul> matkuls=new ArrayList();

    public ArrayList<Matkul> getMatkuls() {
        return matkuls;
    }

    public void setMatkuls(ArrayList<Matkul> matkuls) {
        this.matkuls = matkuls;
    }
    
    public String getNilaiHuruf() {
        return nilaiHuruf;
    }
    public void setNilaiHuruf(String nilaiHuruf) {
        this.nilaiHuruf = nilaiHuruf;
    }
    public int getNilaiAngka() {
        return nilaiAngka;
    }
    public void setNilaiAngka(int nilaiAngka) {
        this.nilaiAngka = nilaiAngka;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
