import java.util.Scanner;

public class BioskopWithScannerupdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu = 0;

        while (menu != 3) {
            System.out.println("\nMenu");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();
                int baris, kolom;

                while (true) {
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    
                    if (baris < 1 || baris > penonton.length
                            || kolom < 1 || kolom > penonton[baris - 1].length) {
                        System.out.println("Baris/kolom tidak tersedia!");
                    
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi, pilih yang lain!");
                    } else {
                        break;
                    }
                }
                penonton[baris - 1][kolom - 1] = nama;

            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        
                        System.out.print((penonton[i][j] == null ? "***" : penonton[i][j]) + "\t");
                    }
                    System.out.println();
                }
            } else if (menu != 3) {
                System.out.println("Menu tidak valid!");
            }
        }
    }
}