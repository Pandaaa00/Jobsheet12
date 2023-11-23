import java.util.Scanner;
public class UcapanTerimakasih_23 {
    public static String penerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang anda ingin beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = penerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the word.\n"+ "You inspired in me a love for learning and made me feel like I could ask you anything.");
        UcapanTambahan("semoga sehat selalu");
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.println("Ucapan Tambahan: " + ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}