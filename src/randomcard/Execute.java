/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomcard;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class Execute {
    
     /**
     * Menampilkan kartu yang berbeda-beda yang diampilkan sesuai banyak
     * parameter pemainnya
     *
     * @param pemain parameter pembagian
     * @return kartu yang didapatkan oleh masing-masing pemain
     */
    public String randomCards(int pemain) {
        String jenis[] = {"Hati", "Sekop", "Wajik", "Kriting"};
        String nilai[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        ArrayList<String> dekk = new ArrayList<String>();
        String result = "";
        int idx = 0;
        for (int i = 0; i < jenis.length; i++) {
            for (int j = 0; j < nilai.length; j++) {
                dekk.add(new String(nilai[j] + " " + jenis[i]));
            }
        }
        Collections.shuffle(dekk);
        for (int i = 1; i <= pemain; i++) {
            result += "Pemain " + i + " mendapat kartu : ";
            for (int j = 1; j < 52 / pemain; j++) {
                result += dekk.get(idx);
                if (j == (52 / pemain) - 1) {
                    result += ".\n";
                } else {
                    result += ", ";
                }
                idx++;
            }
        }
        return result;
    }
    
}
