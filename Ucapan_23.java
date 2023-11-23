import java.util.Scanner;
public class Ucapan_23 {
        public static String penerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = penerimaUcapan();
        System.out.println("Thank you "+nama +"\nMay the force be with you.");
    }
}