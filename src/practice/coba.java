/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */

import java.math.*;

public class coba {
    
    public void onlyTest (){
        System.out.println("bismillah");
    }
    
    /**
     * untuk  nilai kembali 
     * @return 
     */
    
    public String cobaLagi(){
    return "saya";
    }
    
    /**
     * menghitung dengan 2 variabel type integer.
     *
     * @param a alas
     * @param b tinggi type koma.
     * @return
     */
    public double hitung (int a, int b){
    return 0.0;
    }
    
    /**
     * untuk mencetak bintang
     * @param tinggi  lebar bintang kebawah
     * @return hasil
     */
    public String bintang (int tinggi){
        String hasil = "";
        
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < i; j++) {
                hasil += "* ";
            }
            hasil += "\n";
        }
        return hasil;
    }
   
    
    public String testPecahan(int uang){
        String lihat = "";

        int arrayData[] = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};

        int besar[] = new int[10];

        for (int i = 0; i < 10; i++) {

            besar[i] = uang / arrayData[i];
            uang = uang - besar[i] * arrayData[i];

            System.out.println("Rp." + arrayData[i] + " Sebanyak " + besar[i]);
        }
        return lihat;

    }
    
     /**
     * Menampilkan pecahan nominal dari parameter yang diinputkan
     *
     * @param parameter integer
     * @return pecahan perhitungan
     */
    
    public String pecahan(int parameter) {
        int nominal[] = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
        int hasil[] = new int[nominal.length];
        String output = "";
        int i = 0;
        while (i < hasil.length) {
            hasil[i] = parameter / nominal[i];
            output += "Rp " + nominal[i] + " - " + hasil[i] + "\n";
            parameter = parameter - nominal[i] * hasil[i];
            i++;
        }
        return output;
    }

}
