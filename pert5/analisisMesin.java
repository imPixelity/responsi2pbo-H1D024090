class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] daftarMesin = new defaultMesin[5];

        daftarMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        daftarMesin[1] = new mesinTraktor("Kubota MX5200", 520, 4.5);
        daftarMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        daftarMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        daftarMesin[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (int i = 0; i < daftarMesin.length; i++) {
            daftarMesin[i].tampilInfo();
            System.out.println("Kategori: " + daftarMesin[i].kategoriMesin());
            System.out.printf("Performa: %.1f\n\n", daftarMesin[i].nilaiPerforma());
        }

        System.out.println("=== SUARA MESIN ===");
        for (int i = 0; i < daftarMesin.length; i++) {
            if (daftarMesin[i] instanceof mesinMotor) {
                mesinMotor motor = (mesinMotor) daftarMesin[i];
                motor.suaraMesin();
            } else if (daftarMesin[i] instanceof mesinTraktorListrik) {
                mesinTraktorListrik traktorListrik = (mesinTraktorListrik) daftarMesin[i];
                traktorListrik.suaraMesin();
            } else if (daftarMesin[i] instanceof mesinTraktor) {
                mesinTraktor traktor = (mesinTraktor) daftarMesin[i];
                traktor.suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        double perforTertinggi = 0;
        int indexTertinggi = 0;
        for (int i = 0; i < daftarMesin.length; i++) {
            if (daftarMesin[i].nilaiPerforma() > perforTertinggi) {
                perforTertinggi = daftarMesin[i].nilaiPerforma();
                indexTertinggi = i;
            }
        }
        System.out.printf("%s -> %.1f\n", daftarMesin[indexTertinggi].namaMesin, perforTertinggi);

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        defaultMesin[] mesinSorted = daftarMesin.clone();
        for (int i = 0; i < mesinSorted.length; i++) {
            for (int j = 0; j < mesinSorted.length - 1 - i; j++) {
                if (mesinSorted[j].nilaiPerforma() < mesinSorted[j + 1].nilaiPerforma()) {
                    defaultMesin temp = mesinSorted[j];
                    mesinSorted[j] = mesinSorted[j + 1];
                    mesinSorted[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d. %s -> %.1f\n", (i + 1), mesinSorted[i].namaMesin,
                    mesinSorted[i].nilaiPerforma());
        }
    }
}
