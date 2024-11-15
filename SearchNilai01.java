import java.util.Scanner;
public class SearchNilai01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int hasil = 0, jumlhnilai = 0, key = 0; 

        System.out.print("Masukan banyak nilai yang akan di input: ");
        jumlhnilai = sc.nextInt();

        int [] nilai = new int[jumlhnilai];

        for(int i = 0; i<jumlhnilai; i++ ){
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukan nilai yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < nilai.length; i++) {
            if (key == nilai[i]) {
                hasil = (i+1);
                System.out.println("Nilai " + key+ " Ketemu, merupakan nilai mahasiswa ke-" + hasil);
                break;
            }else {
                System.out.print("Nilai yang dicari tidak ditemukan");
                return; 
            }
        }
        System.out.println();
        System.out.println();
        
       
    }
}