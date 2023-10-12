import java.util.Scanner;

public class WhileGaji02{
    public static void main (String args[]){

        Scanner input02 = new Scanner(System.in);

        int jumlah_karyawan, jumlah_jamlembur;
        double gajilembur = 0, total_gajilembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlah_karyawan = input02.nextInt();

        int i = 0;

        while (i < jumlah_karyawan ) {
            System.out.println("Pilihan Jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan Jabatan Karyawan ke-" + (i+1) + ": ");
            jabatan = input02.next();
            System.out.print("Masukkan Jumlah Jam Lembur: ");
            jumlah_jamlembur = input02.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajilembur = jumlah_jamlembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajilembur = jumlah_jamlembur * 75000;
            } else {
                System.out.println("Jabatan tidak ditemukan");
            }

            total_gajilembur += gajilembur;
            System.out.println("Total Gaji Lembur: " + total_gajilembur);
        }
    }
}