/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationmath;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Execute nomor1 = new Execute();
       
        System.out.println(nomor1.perkalian(-2, -3));
        System.out.println(nomor1.pemangkatan(2, 3));
        System.out.println(nomor1.faktorial(-1));
        System.out.println(nomor1.permutasi(-1, 2));
        System.out.println(nomor1.kombinasi(-1, 3));
    
    }
    
}
