// simulasi smarthome, alat data dasar yg  sm, ttpi fungsi n fitur yg brbeda sesuai dgn alatnya
abstract class PerangkatElektronik { 
    String merk;
    int dayaListrik;

    public PerangkatElektronik(String merk, int dayaListrik) {
        this.merk = merk;
        this.dayaListrik = dayaListrik;
    }

    public abstract void cekFungsi();

    public void infoPower(){
        System.out.println(merk + " menggunakan daya sebesar " + dayaListrik + " watt");
    }
}
// method tnp isi
// yg mnggunkn hrs mngisi
interface  InteraksiInternet {
    void hubungkanWifi();
}

interface KontrolSuara {
    void prosesPerintah(String perintah);
}
