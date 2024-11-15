import java.util.Scanner;
public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        double total =  0, nilailulus = 0, nilaitdklulus = 0, ratalulus = 0;
        int jumlhsiswa = 0, lulus = 0, tdklulus = 0;
        System.out.print("Masukan jumlah mahasiswa: ");
        jumlhsiswa = sc.nextInt();

        int [] nilaiMhs = new int[jumlhsiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i]>70) {
                nilailulus += nilaiMhs[i];
                lulus++;
            }else{
                nilaitdklulus += nilaiMhs[i];
                tdklulus++;
            }
        }
            if (nilailulus > 0) {
                double rata2lulus = (double)nilailulus/lulus;
                System.out.println("Rata-rata nilai lulus = " + rata2lulus);
            }else {

            }if (nilaitdklulus > 0) {
                double rata2tdklulus = (double)nilaitdklulus/tdklulus;
                System.out.println("Rata-rata nilai tidak lulus = " + rata2tdklulus);
            }else {

            }
    }
}
