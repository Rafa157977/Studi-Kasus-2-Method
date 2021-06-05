/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodnonvoid;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class VolumeKubus {
    Scanner in = new Scanner (System.in);
    double sisi, total;
    String hasil;
    
    void input(){
        System.out.println("Masukkan sisi Kubus :");
        sisi = in.nextDouble();
        
    }
    void hitung(){
    total = sisi * sisi * sisi; 
    }
    String hasil(){
        System.out.println("========================================");
        System.out.println("Hasil volume Kubus :"+total);
        return hasil;
    }
}
