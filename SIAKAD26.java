import java.util.Scanner;

public class SIAKAD26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            double totalPerMahasiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah "+ (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerMahasiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + (totalPerMahasiswa / nilai[i].length));
    }
    System.out.println("\n============================================");
    System.out.println("Rata-rata nilai setiap mata kuliah");

    for (int j = 0; j < nilai[0].length; j++) {
        double totalPerMataKul = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            totalPerMataKul += nilai[i][j];
        }
        System.out.println("Mata kuliah "+ (j + 1) + ": " + (totalPerMataKul / nilai.length));
    
}

    }
}
