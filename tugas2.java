import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String golongan = "";
        int jamLembur;
        double gajiPokok = 0;
        double persenLembur = 0;
        double gajiLembur;
        double totalPenghasilan;

        System.out.println("===============Sistem Hitung Penghasilan Karyawan===============");
        System.out.println("Gaji Lembur = persen lembur x gaji pokok");
        System.out.println("Total penghasilan = gaji lembur + gaji pokok");

        System.out.println("Masukkan jenis golongan : ");
        golongan = input.next().toUpperCase();
        System.out.println("Masukkan jam lembur : ");
        jamLembur = input.nextInt();

        // Golongan karyawan
        switch (golongan) {
            case "A":
                gajiPokok = 5000000;
                break;
            case "B":
                gajiPokok = 6500000;
                break;
            case "C":
                gajiPokok = 9500000;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                return;
        }

        // Persentase lembur
        if (jamLembur == 1) {
            persenLembur = 0.3;
        } else if (jamLembur == 2) {
            persenLembur = 0.32;
        } else if (jamLembur == 3) {
            persenLembur = 0.34;
        } else if (jamLembur == 4) {
            persenLembur = 0.36;
        } else if (jamLembur >= 5) {
            persenLembur = 0.38;
        } else {
            persenLembur = 0;
        }

        // Gaji Lembur
        gajiLembur = persenLembur * gajiPokok;
        totalPenghasilan = gajiPokok + gajiLembur;

        System.out.println("===============Menghitung Total Penghasilan Karyawan===============");
        System.out.println("Golongan : " + golongan);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Gaji Lembur : " + gajiLembur);
        System.out.printf("Total Penghasilan : %,.0f", totalPenghasilan);
        input.close();
    }
}