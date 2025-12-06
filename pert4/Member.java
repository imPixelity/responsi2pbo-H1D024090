class Member extends Customer {
    int poinReward;
    String levelKeanggotaan;

    Member(String nama, String idCustomer, int totalBelanja, int poinReward, String levelKeanggotaan) {
        super(nama, idCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.levelKeanggotaan = levelKeanggotaan;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poinReward + " | Level: " + levelKeanggotaan);
    }
}
