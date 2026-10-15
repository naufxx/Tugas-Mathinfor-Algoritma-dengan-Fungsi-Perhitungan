import java.util.*;

public class umur{
    static boolean valid(int umur) {
        return (umur >= 0) && (umur <= 120);
    }

    static String kategoriDepkes(int umur){
        if (!valid(umur)){
            return "Usia tidak valid";
        } else if (umur <= 5) {
            return "Bayi dan Balita";
        } else if (umur <= 9) {
            return "Anak-anak";
        } else if (umur <= 18) {
            return "Remaja";
        } else if (umur <= 59) {
            return "Dewasa";
        } else if (umur <= 64) {
            return "Lansia";
        } else {
            return "Manula";
        }
    }

    static String kategoriBps(int umur){
        if (!valid(umur)){
            return "Usia tidak valid";
        } else if (umur <= 14) {
            return "Belum Produktif";
        } else if (umur <= 64) {
            return "Produktif";
        } else {
            return "Tidak Produktif";
        }
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan data yang akan diproses: ");
        int n = Integer.parseInt(input.nextLine());

        String[] id = new String[n];
        String[] nama = new String[n];
        int[] umur = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Data ke " + (i+1));
            System.out.println("ID:");
            id[i] = input.nextLine();
            System.out.println("Nama: ");
            nama[i] = input.nextLine();
            System.out.println("Umur:");
            umur[i] = Integer.parseInt(input.nextLine());
        }

        int muda = 0, produktif = 0, tua = 0;
        System.out.println("\nID    | Nama | Umur | Kategori Depkes | Kelompok BPS");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < n; i++){
            String kategoriDepkes = kategoriDepkes(umur[i]);
            String kategoriBps = kategoriBps(umur[i]);

            System.out.printf("%-6s| %-4s | %-4d | %-16s | %s%n", id[i], nama[i], umur[i], kategoriDepkes, kategoriBps);

            if (kategoriBps.equals("Belum Produktif")){
                muda++;
            } else if (kategoriBps.equals("Produktif")){
                produktif++;
            } else {
                tua++;
            }
        }
    }
}