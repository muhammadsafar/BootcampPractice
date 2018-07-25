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
public class Execute {
    
    /**
     * fungsi ini digunakan untuk menghitung perkalian
     * @param a integer menentukan panjang karatkter yang akan diinput 
     * @param b integer menentukan panjang karatkter yang akan diinput
     * @return kali;
     */
    public int perkalian(int a, int b) {
        int kali;
        kali = a * b;
        return kali;
    }

    /**
     * Fungsi ini digunakan untuk menghitung bilangan berpangkat
     * @param nilai integer untuk panjang karakter
     * @param pangkat integer untuk panjang karakter
     * @return hasil;
     */
    public double pemangkatan(int nilai, int pangkat) {
        int i;
        double hasil = 1;
        double param = pangkat;
        if (pangkat < 0) {
            param = pangkat * -1; 
        }
        
        for (i = 0; i < param; i++) { 
            hasil = perkalian((int) hasil, nilai);
        }

        if (pangkat < 0) {
            hasil = 1 / hasil;
        }

        return hasil;
    }

    /**
     * fungsi ini digunakan untuk menghitung bilangan faktorial
     * @param angka integer untuk panjang karakter
     * @return (angka * faktorial(angka - 1)); //merupakan fungsi rekursif = memanggil dirinya sendiri
     */
    public int faktorial(int angka) { 
        if (angka == 0) {
            return 1;
        } else if (angka > 0) {
            return (angka * faktorial(angka - 1)); 
        } else {
            return 0;
        }
    }

    /**
     * fungsi ini digunakan untuk menghitung permutasi
     * @param n integer untuk panjang karakter. n untuk mengisikan angka pertama
     * @param r integer untuk panjang karakter. r untuk mengisikan angka kedua
     * @return permutasi;
     */
    public int permutasi(int n, int r) {
        int permutasi;

        if (n < 0) {
            permutasi = 0;
        } else {
            permutasi = faktorial(n) / faktorial(n - r);
        }

        return permutasi;

    }

    /**
     * fungsi ini digunakan untuk menghitung kombinasi
     * @param k integer untuk panjang karakter. k untuk mengisikan angka pertama
     * @param l integer untuk panjang karakter. l untuk mengisikan angka kedua
     * @return kombinasi;
     */
    public int kombinasi(int k, int l) {
        int kombinasi;

        if (k < 0) {
            kombinasi = 0;
        } else {
            kombinasi = faktorial(k) / (faktorial(l) * (faktorial(k - l)));
        }

        return kombinasi;
    }
    
}
