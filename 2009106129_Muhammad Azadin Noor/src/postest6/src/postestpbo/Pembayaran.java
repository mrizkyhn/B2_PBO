
package postestpbo;

public class Pembayaran implements Transaksi {

    @Override
    public void BRI() {
        System.out.println("Pembayarn Transfer ke no rek:11111111111");
        System.out.println("=========================================");
        System.out.println("Terimahkasih telah bertransaksi");
    }

    @Override
    public void BNI() {
        System.out.println("Pembayarn Transfer ke no rek:2222222222");
        System.out.println("=========================================");
        System.out.println("Terimahkasih telah bertransaksi");
    }

    @Override
    public void DANA() {
        System.out.println("Pembayarn Transfer ke no rek:3333333333");
        System.out.println("=========================================");
        System.out.println("Terimahkasih telah bertransaksi");
    }

    @Override
    public void COD() {
        System.out.println("Terima ");
    }
    
}
