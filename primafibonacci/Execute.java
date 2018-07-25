/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primafibonacci;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.util.Scanner;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class Execute {

    /**
     *
     * @param masuk bilangan yang akan dicek
     * @return nilai bilngan prima
     */
    public String primaaa(int masuk) {

        String cek = "";
        int dataPrima;
        boolean prima = true;

        //penggunaan for loop
        for (int i = 2; i < masuk; i++) {
            dataPrima = masuk % i;
            if (dataPrima == 0) {
                prima = false;
                break;
            }
        }
        if (prima) {
            cek += +masuk + " adalah bilangan prima";
        } else {
            cek += +masuk + " bukan bilangan  prima";
        }
        return cek;
    }

    /**
     * 
     * @param firstValues nilai pertama dari bilangan fibonacci
     * @param secondValues nilai kedua dari bilangan fibonacci
     * @param batas batas pengecekan bilangan fibonacci
     * @return 
     */
    public String Fibo(int firstValues, int secondValues, int batas) {
        String hasilString = "";

        int fibarray[] = new int[batas];

        for (int i = 0; i < batas; i++) {
            
            if (i == firstValues || i == secondValues) {
                fibarray[i] = i;
            } else {
                fibarray[i] = fibarray[i - 1] + fibarray[i - 2];
            }
        }
       
        for (int i = 0; i < batas; i++) {
            if (fibarray[i] <= batas) {
                System.out.print(fibarray[i] + " ");
            }
        }
        return hasilString;
    }

}
