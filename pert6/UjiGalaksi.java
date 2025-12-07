public class UjiGalaksi {
    public static void main(String[] args) {
        PesawatTempur pesawat = new PesawatTempur("Astra-Fury", 2, 8);
        KapalEksplorasi kapal = new KapalEksplorasi("Voyager X", 10, 4);

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===\n");

        System.out.println("--- PESAWAT TEMPUR ---");
        pesawat.aktifkanMesin();
        pesawat.jelajah(10);
        pesawat.jelajah(30);
        pesawat.tembakRudal(3);
        pesawat.tampilStatus();

        System.out.println("\n--- KAPAL EKSPLORASI ---");
        kapal.aktifkanMesin();
        kapal.jelajah(15);
        kapal.scanPlanet("Kepler-442b");
        kapal.tampilStatus();
    }
}
