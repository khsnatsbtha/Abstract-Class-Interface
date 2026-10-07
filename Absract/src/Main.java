/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Thinkpad
 */
public class Main {
    public static void main(String[] args) {
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;

        stsk.hitungLuas();
        stsk.hitungKeliling();

        System.out.println("Luas STSK = " + stsk.luas);
        System.out.println("Keliling STSK = " + stsk.keliling);
    }
}
