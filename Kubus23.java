import java.util.Scanner;

public class Kubus23 {
    static int hitungVolume(int s) {
        int volume = s * s * s;
        return volume;
    }
    static int hitungLuasPermukaan(int s) {
        int luasPermukaan = 6 * (s * s);
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sisi, vol, l;

        System.out.println("Masukkan panjang sisi kubus:");
        sisi = input.nextInt();
        
        vol = hitungVolume(sisi);
        System.out.println("Volume kubus: " + vol);

        l = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus: " + l);
    }
}
