public class PesawatTempur extends KendaraanGalaksi {
    private int jumlahRudal;

    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    void jelajah(int jarak) {
        int energiDiperlukan = 3 * jarak;
        if (getLevelEnergi() < energiDiperlukan) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            int energiBaru = getLevelEnergi() - energiDiperlukan;
            setLevelEnergi(energiBaru);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        int energiBaru = getLevelEnergi() + jumlah;
        if (energiBaru > 100) {
            energiBaru = 100;
        }
        setLevelEnergi(energiBaru);
        System.out.println("Energi ditambah sebesar " + jumlah + "%. Energi saat ini: " + getLevelEnergi() + "%");
    }

    void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal tidak cukup! Rudal tersedia: " + jumlahRudal);
        }
    }
}