import java.util.Scanner;
/**
 * ForKelipatan037
 */
public class WhileKelipatan03 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        double rataRata = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = sc.nextInt();

        int i = 1;
        while ( i<=50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }
        if (counter > 0) {
            rataRata = (double) jumlah / counter;
            System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
            System.out.printf("Jumlah bilangan kelipatan %d  dari 1 sampai 50 adalah %d\n" , kelipatan, jumlah);
            System.out.printf("Rata-rata bilangan kelipatan %d dari 1 samapai 50 adalah %2f\n", kelipatan, rataRata);
        }else {
            System.out.printf("Tidak ada bilangan kelipatan %d dari 1 samapi 50\n", kelipatan);
        
        }
    }
}