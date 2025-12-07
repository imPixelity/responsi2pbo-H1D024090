public class EWalletPayment implements PaymentMethod {
    private String namaPenyedia;
    private double saldo;
    private double nominalTransaksi;

    public EWalletPayment(String namaPenyedia, double saldoAwal, double nominalTransaksi) {
        this.namaPenyedia = namaPenyedia;
        this.saldo = saldoAwal;
        this.nominalTransaksi = nominalTransaksi;
    }

    @Override
    public void processPayment() {
        if (saldo >= nominalTransaksi) {
            saldo -= (nominalTransaksi + getTransactionFee());
            System.out.println("Pembayaran berhasil");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaPenyedia;
    }

    @Override
    public double getTransactionFee() {
        return 2000;
    }

    @Override
    public double getBalance() {
        return saldo;
    }

    public double getNominalTransaksi() {
        return nominalTransaksi;
    }
}
