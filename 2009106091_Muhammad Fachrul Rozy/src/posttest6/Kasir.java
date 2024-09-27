/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author GEFORCE_i5
 */
public class Kasir{
    private Pemesanan kasir;

    public Kasir(Pemesanan kasir) {
        this.kasir = kasir;
    }
    
    void pesanb(){
        this.kasir.pesankan();
    }
    
    void batalkan(){
        this.kasir.batal();
    }

}
