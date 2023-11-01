import java.util.Scanner;

public class Modif2DoWhileCuti14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Jatah Cuti");
        jatahCuti = sc.nextInt();

        while (true) {
            System.out.println("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.println("Jumlah hari : ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            } else {
                System.out.println("Pilihan tidak valid, silahkan masukkan 'y' atau 't'");
            }
        }
    }

}
