import java.util.Scanner;
public class Percobaan623 {

    static int hitungLuas (int pjg, int Ib) {
        int Luas=pjg*Ib;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume= hitungLuas(a,b)*tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int p,I,t,L,vol;
    
        System.out.println("Masukkan panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        I=input.nextInt();
        System.out.println("Masukkan tinggi");
        t=input.nextInt();
        
        L=hitungLuas(p,I);
        System.out.println("Luas persegi panjang adalah "+L);
        vol=hitungVolume(t,p,I);
        System.out.println("Volume balok adalah "+vol);
    }
}