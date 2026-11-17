import java.util.Scanner;

public class tugas26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] data = new int[10][6];
        int i, j, jumlah, total;
        double rata;

        
        for (i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (j = 0; j < 6; j++) {
                System.out.print("Jawaban pertanyaan " + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }

        // b. Rata-rata per responden
        System.out.println("\nRata-rata per responden:");
        for (i = 0; i < 10; i++) {
            jumlah = 0;
            for (j = 0; j < 6; j++) {
                jumlah += data[i][j];
            }
            rata = jumlah / 6.0;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }

        
        System.out.println("\nRata-rata per pertanyaan:");
        for (j = 0; j < 6; j++) {
            jumlah = 0;
            for (i = 0; i < 10; i++) {
                jumlah += data[i][j];
            }
            rata = jumlah / 10.0;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }

    
        total = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 6; j++) {
                total += data[i][j];
            }
        }
        rata = total / 60.0;
        System.out.println("\nRata-rata keseluruhan: " + rata);
    }
}