//Program membuat kartu pelajar
package tugas.pkg1;

//Mengimport Scanner
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        //deklarasi variabel
        String nama, alamat, Tempatlahir, bulanlahir, agama;
        int NIS, tanggallahir, tahunlahir;

        // buat scanner 
        Scanner input = new Scanner(System.in);

        // cetak judul
        System.out.println("--------KARTU PELAJAR SISWA SMP-------");
        System.out.println("Jl. Jalan-jalan No. 21 Telp. 1234 - 123456 Malang");
        System.out.println("--------------------------------------");
        
        //memanggil output
        System.out.print("Nama Siswa: ");
        //Menggunakan scanner
        nama = input.nextLine();

        System.out.print("Alamat: ");
        alamat = input.nextLine();

        System.out.print("NIS/NISN: ");
        NIS = input.nextInt();
        
        System.out.print("Agama : ");
        agama = input.next();
        
        System.out.print("Tempat Lahir: ");
        Tempatlahir = input.next();

        System.out.print("[Tanggal Lahir]: ");
        tanggallahir = input.nextInt();
        
        System.out.print("[Bulan Lahir]  : ");
        bulanlahir = input.next();
        
        System.out.print("[Tahun Lahir]  : ");
        tahunlahir = input.nextInt();


        // Menampilkan apa yang sudah simpan di variabel (mencetak data)
        System.out.println("---------------------------");
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("NIS/NISN: "+NIS);
        System.out.println("Agama: "+agama);
        System.out.println("Tempat Lahir: " + Tempatlahir);
        System.out.println("Tanggal Lahir: "+tanggallahir+"/"+bulanlahir+"/"+tahunlahir);

    }

}

// 1. START
// 2. Mengimpor Scanner ke program
// 3. Mendeklarasikan variabel variabel yang ada
// 4. Membuat scanner baru
// 5. Tampilkan output ke user
// 6. Menggunakan scanner
// 7. Menyimpan apa yang diketik oleh user
// 8. Ulangi "menampilkan output&menggunakan scanner"
// 9. Menampilkan variabel dari user yang sudah disimpan
// 10. END

    
    

