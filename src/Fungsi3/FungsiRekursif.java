/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi3;
import java.util.Scanner;//library untuk inputan keyboard
/**
 *
 * @author MOKLET-2
 */
public class FungsiRekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Untuk mengambil input dari keyboard
        Scanner masukan = new Scanner(System.in);
        //Mendeklarasikan Variabel
        int bil, hasil;
        //User memasukkan nilai Variabel
        System.out.print("Masukkan suatu bilangan : ");
        bil = masukan.nextInt();
        hasil = faktorial(bil);
        //Perintah untuk menghasilkan output program
        System.out.println("Nilai faktorial "+ bil +" adalah "+ hasil);
    }
    //method int faktorial
    private static int faktorial(int a){
    //Percabangan
        if (a==1)
    //Kegunaan return digunakan sebagai fungsi pada program
            return 1;
        else
    //Kegunaan return digunakan sebagai fungsi pada program
            return (a*faktorial(a-1));
            
    }
    
}
    
    
    

   
