// menghitung gaji dari 2 mcm jenis krywan brdsrkn khdiran, bonus, menggunakan aturan gaji sesuai jenis krywn
abstract class Karyawan {  //
    private String nama;
    private String idKaryawan;
    private int jumlahKehadiran;

    public Karyawan(String nama, String idKaryawan) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.jumlahKehadiran = 0;
    }

    public String getNama(){ // mnpilkn nilai atb priv 
        return nama;
    }

    public String getIdKaryawan(){
        return idKaryawan;
    }

    public int getJumlahKehadiran(){
        return jumlahKehadiran;
    }

    public void absen(){
        jumlahKehadiran++;
    }

    public abstract double hitungGaji();
    // tiap subclass beda cara mengitung hitung gajinya
}