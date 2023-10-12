import java.util.Scanner;

public class WhileKelipatan02{
    public static void main (String args[]){

        Scanner input02 = new Scanner(System.in);

        int kelipatan, total = 0, jumlah = 0, counter = 0;
        double rata_rata;
    
        
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input02.nextInt();

        int i = 1;
        
        while (i <= 50) {
            i++;
            if (i % kelipatan == 0) {
                total += i;
                counter++;
                 
            }
        }

        rata_rata = (double) total/counter;

        System.out.println("Banyaknya bilangan " + kelipatan + " dari 1 sampai 50 adalah " + counter);
        System.out.println("Total bilangan kelipatan " + kelipatan + " dari 1 sampai 50 adalah " + total);
        System.out.println("Rata Rata bilangan kelipatan " + kelipatan + " dari 1 sampai 50 adalah " + rata_rata);
        
        

        
    }
}