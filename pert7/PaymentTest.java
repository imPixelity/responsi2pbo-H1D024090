public class PaymentTest {
    public static void main(String[] args) {
        EWalletPayment ewallet = new EWalletPayment("OVO", 150000, 50000);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        System.out.println("Saldo awal: Rp" + ewallet.getBalance());
        System.out.println("Memproses pembayaran sebesar: Rp" + ewallet.getNominalTransaksi());
        ewallet.processPayment();
        System.out.println("Sisa saldo: Rp " + ewallet.getBalance());
        System.out.println("Detail Transaksi: " + ewallet.getPaymentDetails());
    }
}
