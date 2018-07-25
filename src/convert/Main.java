/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert;

import java.util.Scanner;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Execute kb = new Execute();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("KONVERSI BILANGAN:");
        System.out.println("1. Biner");
        System.out.println("2. Desimal");
        System.out.println("3. Oktal");
        System.out.println("4. Heksadesimal");
        System.out.print("Masukkan pilihan anda: ");
        
        int pilih = sc.nextInt();
        
        switch (pilih) { 
            case 1: 
                System.out.print("Masukkan nilai biner: ");
                String biner = sc.next();
                System.out.println("Hasil Desimal     : "+kb.BinertoDesimal(biner));
                System.out.println("Hasil Oktal       : "+kb.BinertoOktal(biner));
                System.out.println("Hasil Heksadesimal: " +kb.BinertoHexa(biner));
                break;
            case 2: 
                System.out.print("Masukkan nilai desimal: ");
                int desimal = sc.nextInt();
                System.out.println("Hasil Biner       : " +kb.DesimaltoBiner(desimal));
                System.out.println("Hasil Oktal       : " +kb.DesimaltoOktal(desimal));
                System.out.println("Hasil Heksadesimal: " +kb.DesimaltoHexa(desimal));
                break;
            case 3:
                System.out.print("Masukkan nilai oktal: ");
                int oktal = sc.nextInt();
                System.out.println("Hasil Biner       : "+kb.OktaltoBiner(oktal));
                System.out.println("Hasil Desimal     : "+kb.OktaltoDesimal(oktal));
                System.out.println("Hasil Heksadesimal: "+kb.OktaltoHexa(oktal));
                break;
            case 4:
                System.out.print("Masukkan nilai heksadesimal: ");
                String heksa = sc.next();
                System.out.println("Hasil Biner  : "+kb.HexatoBiner(heksa));
                System.out.println("Hasil Desimal: "+kb.HexatoDesimal(heksa));
                System.out.println("Hasil Oktal  : "+kb.HexatoOktal(heksa));
                break;
        default: 
            System.out.println("Pilihan tidak tersedia.");break;
        }
    }
    
}
