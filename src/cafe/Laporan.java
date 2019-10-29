/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

/**
 *
 * @author Diva Maretta
 */
public class Laporan {
    public static void main(String[] args) {
        Beli Beli = new Beli();
        Jual Jual = new Jual ();
        
        System.out.println("Harga jual bersih : ");
        Beli.Minuman();
        Beli.Cake();
        Beli.harga();
        System.out.println("Harga Jual beserta pajaknya");
        Jual.Minuman();
        Jual.Cake();
        Jual.hargadenganpajak();
        
                
    }
}
