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
public class Execute {
    
    String biner[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    int desimal[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int oktal[] = {0, 1, 2, 3, 4, 5, 6, 7};
    String heksa[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
    
    /**
     * fungsi ini digunakan untuk mengkonversi bilangan biner menjadi bilangan desimal
     * @param bilBiner bertipe data String
     * @return hslakhir yang akan dihasilkan dari fungsi tersebut
     */
    public int BinertoDesimal(String bilBiner){
        int pangkat[] = {3, 2, 1, 0};
        int basis = 2;
        String num = String.valueOf(bilBiner);
        int hasil[] = new int[num.length()];
        int bnr[] = new int[num.length()];
        int hslakhir = 0;
        for (int i = 0; i < num.length(); i++) {
            bnr[i] = Character.digit(num.charAt(i), 10);
        }
        for (int i = 3; i >= 0; i--) {
            hasil[i] = bnr[i]*((int)Math.pow(basis, pangkat[i]));
            hslakhir += hasil[i];
        }
        return hslakhir;
    }
    
    /**
     * fungsi OktaltoDesimal adalah fungsi yang digunakan untuk mengkonversi bilangan oktal ke desimal
     * @param bilOkt digunakan untuk sebagai masukkan bilangan oktal
     * @return hslakhir yang akan dihasilkan dari fungsi OktaltoDesimal
     */
    public int OktaltoDesimal (int bilOkt){
        int basis = 8;
        String num = String.valueOf(bilOkt);
        int hasil[] = new int[num.length()];
        int okt[] = new int[num.length()];
        int hslakhir = 0;
        for (int i = 0; i < num.length(); i++) {
            okt[i] = Character.digit(num.charAt(i), 10);
        }
        int a = 0;
        for (int i = num.length()-1; i >= 0; i--) {
            hasil[i] = okt[i]*((int)Math.pow(basis, 0+a));
            hslakhir += hasil[i];
            a++;
        }
        return hslakhir;
    }
    
    /**
     * fungsi ini merupakan fungsi yang digunakan untuk mengubah bilangan heksadesimal menjadi bilangan desimal
     * @param hexa bertipe data String
     * @return nilai yang akan dikembalikan dalam fungsi HexatoDesimal
     */
    public int HexatoDesimal (String bilHex){
        int basis = 16;
        String ch[] = bilHex.split("");
        String hx[] = new String[ch.length];
        int hslakhir = 0;
        int temp;
        
        for (int i = 0; i < ch.length; i++) {
            hx[i] = ch[i];
        }
        int hasil[] = new int[hx.length];
        int a = 0;
        for (int i = hx.length - 1; i >= 0; i--){
            if (hx[i].equals("A")){
                temp = 10;
            } else if (hx[i].equals("B")){
                temp = 11;
            } else if (hx[i].equals("C")){
                temp = 12;
            } else if (hx[i].equals("D")){
                temp = 13;
            } else if (hx[i].equals("E")){
                temp = 14;
            } else if (hx[i].equals("F")){
                temp = 15;
            } else
                temp = Integer.parseInt(hx[i]);
            hasil[i] = temp * ((int) Math.pow(basis, 0+a));
            hslakhir += hasil[i];
            a++;
        }
        return hslakhir;
    }
    
    /**
     * fungsi ini merupakan fungsi yang digunakan untuk mengkonversi bilangan desimal menjadi bilangan biner
     * @param bilDesimal bertipe data integer
     * @return hslakhir yang akan dikembalikan pada fungsi DesimaltoBiner
     */
    public String DesimaltoBiner (int bilDesimal){
        String hslakhir = "";
        String num = String.valueOf(bilDesimal);
        int sisa = bilDesimal;
        int temp = 0;
        int i = 0;
        do {
            temp = bilDesimal / 2;
            sisa = bilDesimal % 2;
            bilDesimal = temp;
            hslakhir += sisa;
            if (temp == 1){
                hslakhir += temp;
            }
        } while (temp >= 2);
        StringBuffer balik;
        balik = new StringBuffer(hslakhir);
        String hslfinal = balik.reverse().toString();
        return hslfinal;
    }
    
    /**
     * fungsi ini merupakan fungsi yang digunakan untuk mengubah bilangan desimal menjadi bilangan oktal
     * @param bilDesimal bertipe data int
     * @return nilai yang akan dikembalikan oleh fungsi DesimaltoOktal
     */
    public String DesimaltoOktal (int bilDesimal){
        String hslakhir = "";
        String num = String.valueOf(bilDesimal);
        int sisa = bilDesimal;
        int temp = 0;
        int i = 0;
        do {
            temp = bilDesimal / 8;
            sisa = bilDesimal % 8;
            bilDesimal = temp;
            hslakhir += sisa;
            if (temp == 1){
                hslakhir += temp;
            }
        } while (temp >= 2);
        StringBuffer balik;
        balik = new StringBuffer(hslakhir);
        String hslfinal = balik.reverse().toString();
        return hslfinal;
    }
    
    /**
     * fungsi ini merupakan fungsi yang digunakan untuk mengubah bilangan desimal menjadi bilangan heksadesimal
     * @param bilDesimal bertipe data integer
     * @return nilai yang akan dikembalikan oleh fungsi ini
     */
    public String DesimaltoHexa (int bilDesimal){
        String hslakhir = "";
        String num = String.valueOf(bilDesimal);
        int sisa = bilDesimal;
        int temp = 0;
        int i = 0;
        String sisaAkhir = "";
        do {
            temp = bilDesimal / 16;
            sisa = bilDesimal % 16;
            bilDesimal = temp;
            if (sisa == 10){
                sisaAkhir = "A";
            } else if (sisa == 11){
                sisaAkhir = "B";
            } else if (sisa == 12){
                sisaAkhir = "C";
            } else if (sisa == 13){
                sisaAkhir = "D";
            } else if (sisa == 14){
                sisaAkhir = "E";
            } else if (sisa == 15){
                sisaAkhir = "F";
            } else
                sisaAkhir = Integer.toString(sisa);
            hslakhir += sisaAkhir;
            if (temp == 1){
                hslakhir += temp;
            }
        } while (temp >= 2);
        StringBuffer balik;
        balik = new StringBuffer(hslakhir);
        String hslfinal = balik.reverse().toString();
        return hslfinal;
    }
    
    /**
     * fungsi OktaltoBiner merupakan fungsi yang digunakan untuk mengkonversi bilangan oktal ke biner
     * @param bilOkt merupakan parameter untuk memasukkan nilai oktal dengan tipe data integer
     * @return nilai yang akan dikembalikan oleh fungsi OktaltoBiner
     */
    public String OktaltoBiner (int bilOkt){
        int okt[] = new int[3];
        String hasil[] = new String[3];
        String num = String.valueOf(bilOkt);
        String hslakhir = "";
        for (int i = 0; i < num.length(); i++) {
            okt[i] = Character.digit(num.charAt(i), 10);
        }
        
        for (int i = 0; i < okt.length; i++) {
            for (int j = 0; j < oktal.length; j++) {
                if (okt[i] == oktal[j]) {
                    hasil[i] = biner[j];
                }
            }
            hslakhir += hasil[i];
        }
        return hslakhir;
    }
    
    /**
     * fungsi HexatoBiner merupakan fungsi yang digunakan untuk mengkonversi bilangan heksadesimal ke biner
     * @param bilHexa bertipe data String
     * @return nilai yang akan dikembalikan oleh fungsi HexatoBiner
     */
    public String HexatoBiner (String bilHexa){
        String ch[] = bilHexa.split("");
        String hx[] = new String[ch.length];
        String hasil[] = new String[ch.length];
        String hslakhir = "";
        
        for(int i = 0; i < ch.length; i++) {
            hx[i] = ch[i];
        }
        
        for (int i = 0; i < hx.length; i++) {
            for (int j = 0; j < heksa.length; j++) {
                if (hx[i].equals(heksa[j])){
                   hasil[i] = biner[j];
                }
            }
            hslakhir += hasil[i];
        }
        return hslakhir;
    }
    
    /**
     * fungsi BinertoHexa merupakan fungsi yang digunakan untuk mengkonversi bilangan biner ke hexa
     * @param bilBiner bertipe data String
     * @return nilai yang akan dikembalikan pada fungsi BinertoHexa
     */
    public String BinertoHexa (String bilBiner){
        String hslakhir = "";
        for (int i = 0; i < heksa.length; i++) {
            if (bilBiner.equals(biner[i])) {
                hslakhir = heksa[i];
            }
        }
        return hslakhir;
    }
    
    public String OktaltoHexa (int bilOktal){
        int basis = 8;
        String num = String.valueOf(bilOktal);
        int hasil[] = new int[num.length()];
        int okt[] = new int[num.length()];
        int hslakhir = 0;
        for (int i = 0; i < num.length(); i++) {
            okt[i] = Character.digit(num.charAt(i), 10);
        }
        int a = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            hasil[i] = okt[i] * ((int) Math.pow(basis, 0 + a));
            hslakhir += hasil[i];
            a++;
        }
        String hsl = "";
        int sisa = hslakhir;
        int temp = 0;
        int i = 1;
        String sisaFix = "";
        do {
            temp = hslakhir / 16;
            sisa = hslakhir % 16;
            hslakhir = temp;
            if (sisa == 10) {
                sisaFix = "A";
            } else if (sisa == 11) {
                sisaFix = "B";
            } else if (sisa == 12) {
                sisaFix = "C";
            } else if (sisa == 13) {
                sisaFix = "D";
            } else if (sisa == 14) {
                sisaFix = "E";
            } else if (sisa == 15) {
                sisaFix = "F";
            } else {
                sisaFix = Integer.toString(sisa);
            }
            hsl += sisaFix;
            if (temp == 1) {
                hsl += temp;
            }
        } while (temp > 2);
        StringBuffer balik;
        balik = new StringBuffer(hsl);
        String hslfinal = balik.reverse().toString();
        return hslfinal;
    }
    
    public String HexatoOktal (String bilHexa){
        int basis = 16;
        String ch[] = bilHexa.split("");
        String hx[] = new String[ch.length];
        int hslakhir = 0;
        int temp = 0;
        for (int i = 0; i < ch.length; i++) {
            hx[i] = ch[i];
        }
        int hasil[] = new int[hx.length];
        int a = 0;
        for (int i = hx.length - 1; i >= 0; i--) {
            if (hx[i].equals("A")) {
                temp = 10;
            } else if (hx[i].equals("B")) {
                temp = 11;
            } else if (hx[i].equals("C")) {
                temp = 12;
            } else if (hx[i].equals("D")) {
                temp = 13;
            } else if (hx[i].equals("E")) {
                temp = 14;
            } else if (hx[i].equals("F")) {
                temp = 15;
            } else {
                temp = Integer.parseInt(hx[i]);
            }
            hasil[i] = temp * ((int) Math.pow(basis, 0+a));
            hslakhir += hasil[i];
            a++;
        }
        String sementara = "";
        int sisa = hslakhir;
        int temp1 = 0;
        do {
            temp1 = hslakhir / 8;
            sisa = hslakhir % 8;
            hslakhir = temp1;
            sementara += sisa;
            if (temp1 == 1) {
                sementara += temp1;
            }
        } while (temp1 > 2);
        StringBuffer balik;
        balik = new StringBuffer(sementara);
        String hslfinal = balik.reverse().toString();
        return hslfinal;
    }
    
    public String BinertoOktal (String bilBiner){
        int basis = 2;
        String num = String.valueOf(bilBiner);
        int hasil[] = new int[num.length()];
        int bin[] = new int[num.length()];
        int hslakhir = 0;
        for (int i = 0; i < num.length(); i++) {
            bin[i] = Character.digit(num.charAt(i), 10);
        }
        int a = bin.length - 1;
        for (int i = 0; i <= bin.length - 1; i++) {
            hasil[i] = bin[i] * ((int) Math.pow(basis, 0 + a));
            hslakhir += hasil[i];
            a--;
        }
        
        String sementara = "";
        String num1 = String.valueOf(hslakhir);
        int sisa = hslakhir;
        int temp = 0;
        do {
            temp = hslakhir / 8;
            sisa = hslakhir % 8;
            hslakhir = temp;
            sementara += sisa;
            if (temp == 1) {
                sementara += temp;
            }
        } while (temp > 2);
        StringBuffer balik;
        balik = new StringBuffer(sementara);
        String hslfinal = balik.reverse().toString();
        return hslfinal;
    }

    
    
}
