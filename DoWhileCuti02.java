import java.util.Scanner;

public class DoWhileCuti02{
    public static void main (String args[]){

        Scanner input02 = new Scanner(System.in);
        
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = input02.nextInt();

        do {
            
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input02.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = input02.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.print("Sisa Jatah Cuti Anda Tidak Mencukupi\nApakah Anda ingin menambah jatah cuti (y/t)? ");
                    konfirmasi = input02.next();

                    if (konfirmasi.equalsIgnoreCase("y")) {
                        System.out.print("Jatah Cuti: ");
                         jatahCuti = input02.nextInt();
                        continue;
                    }else{
                        break;
                    }
                }
            }else{
            break;
            }
        } while (jatahCuti > 0); 
    }
}