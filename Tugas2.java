import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        String[] mahasiswa = new String[jumlahMahasiswa];
        int[][] nilai = new int[jumlahMahasiswa][jumlahTugas];

        System.out.println("Masukkan nilai tugas mahasiswa");

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print("Nama Mahasiswa " + (i + 1) + ": ");
            mahasiswa[i] = scanner.next();
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }
        
        int[] totalNilaiPerHari = new int[7];
        
        for (int j = 0; j < 7; j++) {
            int totalNilaiHari = 0;
            for (int i = 0; i < mahasiswa.length; i++) {
                totalNilaiHari += nilai[i][j];
            }
            totalNilaiPerHari[j] = totalNilaiHari;
        }

        int hariTertinggi = 0;
        for (int j = 1; j < 7; j++) {
            if (totalNilaiPerHari[j] > totalNilaiPerHari[hariTertinggi]) {
                hariTertinggi = j;
            }
        }

        System.out.println("\nHari dengan nilai tertinggi adalah Minggu ke- " + (hariTertinggi + 1));
        System.out.println("\nMahasiswa dengan nilai tertinggi:");
        for (int i = 0; i < mahasiswa.length; i++) {
            if (nilai[i][hariTertinggi] == nilai[i][hariTertinggi]) {
                System.out.println(mahasiswa[i] + " memiliki nilai tertinggi pada Minggu ke-" + (hariTertinggi + 1) + " dengan nilai " + nilai[i][hariTertinggi]);
            }
        }
    }
}
