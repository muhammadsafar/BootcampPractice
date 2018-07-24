/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primafibonacci;

import java.util.Scanner;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class Main {
    
      public static void main (String args []){
    
          //ini fungsi prima
          Execute ambilPrima = new Execute();
          System.out.println(ambilPrima.primaaa(41));
          
          
          //ini fungsi fibo
          Execute lihatFibo = new Execute();
          System.out.print(lihatFibo.Fibo(2, 6, 114));
          
          System.out.println(lihatFibo.penjumlahan(3, 4));
          System.out.println(lihatFibo.faktorial(12));
   
    }
}
