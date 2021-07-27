package latihansoal3;

public class LatihanSoal3 {

    public static void main(String[] args) {
        
        System.out.println("====== Latihan Soal 3 ======");
        
        System.out.println("\n");
        
        int beda, awal, sukuSaatIni, jumlahDeret; //Inisialisasi variabel dengan tipe data integer
        
        beda = 5; //mengisi nilai variabel beda dengan nilai 5 yang sebagai selisih/beda antara suku-suku
        awal = 10;//mengisi nilai variabel awal dengan nilai 10 yang sebagai nilai dari suku awal derat aritmatika
        sukuSaatIni = awal; //suku saat ini sama dengan awal, maka perhitungan deret aritmatika dimulai dari suku pertama atau awal
        jumlahDeret = 0; //jumlah deret merupakan variabel yang akan digunakan untuk menghitung jumlah seluruhderet bilangan
        
        for(int i = 1; i<=3; i++){ //Perulangan untuk membuat baris, i = 1 maka baris matriks akan dimulai dari 1
                                            //i<=3, maka akan melakukan perulangan jika i kurang dari sama dengan 3, maka akan berhenti di baris ke-3
                                            //i++, maka pada perulangannya akan terjadi penambahan nilai i yaitu i+1
                                            
            for(int k = 1; k<=5; k++){ //Perulangan kedua yaitu untuk membuat kolom, k=1, maka kolom akan dimulai dari kolom 1
                                                   //k<=5, dimana akan melakukan perulangan jika k kurang dari sama dengan 5, maka perulangan akan berhenti pada kolom ke-5
                                                   //k++, maka pada perulangannya akan terjadi penambahan nilai k yaitu k+1
                                                   
                System.out.print(sukuSaatIni + "     ");//Mencetak sukuSaatIni
                
                jumlahDeret+= sukuSaatIni;//Menghitung jumlahDeret dengan menambahkan jumlahDeret dengan sukuSaatIni
                
                sukuSaatIni+=beda; //Menghitung nilai sukuSaatIni dimana nilai sukuSaatIni akan berubah di setiap perulangannya dengan bertambah sesuai dengan selisih
            }
                System.out.println("");
        }
      
        System.out.println("Jumlah Deret Aritmatika : " + jumlahDeret); //Mencetak jumlahDeret
    }
       
        }
    

