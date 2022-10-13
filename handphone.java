//Nama: Putri Fahriani Bukhoriyah
//Kelas: TI21F
//NIM: 20210040080
public class handphone {
    public String jenis_hp;
    public int tahun_pembuatan;

    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public String getJenisHP() {
        return jenis_hp;
    }

    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        handphone hp = new handphone();
        hp.setDataHP("infinix", 2022);
        System.out.println("Jenis HP : " + hp.getJenisHP());
        System.out.println("Tahun Dibuatnya HP : " + hp.getTahunPembuatan());
    }
    
}
