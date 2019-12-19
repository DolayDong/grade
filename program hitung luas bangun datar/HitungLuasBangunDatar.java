import java.util.Scanner;

public class HitungLuasBangunDatar {

    public static void main(String[] args) {

        boolean lagi = true;
        while (lagi) {
            try {
                Scanner userInput = new Scanner(System.in);
                System.out.println(" PROGRAM HITUNG LUAS BANGUN DATAR ");
                System.out.println("1. Persegi ");
                System.out.println("2. Lingkaran ");
                System.out.println("3. Segitiga ");
                System.out.println("4. Persegi Panjang ");
                System.out.println("5. exit ");
                System.out.print("Silahkan pilih bangun datar : ");

                int input = userInput.nextInt();

                switch (input) {
                case 1:
                    BangunDatar hasilHitungPersegi = new BangunDatar();
                    hasilHitungPersegi.hitungPersegi();
                    break;
                case 2:
                    BangunDatar hasilHitungLingkaran = new BangunDatar();
                    hasilHitungLingkaran.hitungLingkaran();
                    break;
                case 3:
                    BangunDatar hasilHitungSegitiga = new BangunDatar();
                    hasilHitungSegitiga.hitungSegitiga();
                    break;
                case 4:
                    BangunDatar hasilHitungPersegiPanjang = new BangunDatar();
                    hasilHitungPersegiPanjang.hitungPersegiPanjang();
                    break;
                case 5:
                    lagi = false;
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid, Harap perhatikan Nomer pilihan !!");
                    break;
                }
                if (input == 5) {
                    System.out.println("Akhir Program");
                } else {
                    System.out.print("Hitung Bangun lain? : [y/n]");
                    Scanner hitungLagi = new Scanner(System.in);
                    String hitung = hitungLagi.nextLine();
                    if (hitung.equalsIgnoreCase("y")) {
                        lagi = true;
                    } else if (hitung.equalsIgnoreCase("n")) {
                        lagi = false;
                        System.out.println("Terimakasih telah menggunakan Program Kami. .");
                    } else {

                        System.out.println("Harap masukkan string");
                        System.out.print("Hitung lagi? : [y/n]");
                        Scanner hitungLagi2 = new Scanner(System.in);
                        String hitung2 = hitungLagi.nextLine();

                    }
                    ;
                }
            } catch (Exception e) {
                System.out.println("Harap Masukkan Angka!! hanya angka!!");

            }
        }
    }
}

class BangunDatar {
    double sisi, r, luasLingkaran, Alas, Tinggi, luasSegitiga, panjang, lebar, luasPersegiPanjang;
    final double pi = 3.14;
    double luasLingkaran = pi * r * r;

    void hitungPersegi() {
        Scanner inputSisi = new Scanner(System.in);
        System.out.println("HITUNG LUAS PERSEGI");
        System.out.println();
        System.out.println("Rumus : sisi x sisi");
        System.out.print("Masukkan panjang sisi : ");
        sisi = inputSisi.nextDouble();
        System.out.println("Luas Persegi dengan sisi " + sisi + " = " + sisi * sisi);
        System.out.println();
    }

    void hitungLingkaran() {
        Scanner inputR = new Scanner(System.in);
        System.out.println("HITUNG LUAS LINGKARAN");
        System.out.println();
        System.out.println("Rumus : pi x r x r");
        System.out.print("Masukkan Jari-jari : ");
        r = inputR.nextDouble();
        pi = 3.14;
        luasLingkaran = pi * r * r;
        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah " + luasLingkaran);
        System.out.println();
    }

    void hitungSegitiga() {
        Scanner inputAlas = new Scanner(System.in);
        Scanner inputTinggi = new Scanner(System.in);

        System.out.println("HITUNG LUAS SEGITIGA");
        System.out.println();
        System.out.println("Rumus : Alas x Tinggi / 2");
        System.out.print("Masukkan Alas :");
        Alas = inputAlas.nextDouble();
        System.out.print("Masukkan Tinggi :");
        Tinggi = inputTinggi.nextDouble();
        luasSegitiga = Alas * Tinggi / 2;
        System.out.println("Luas Segitiga dengan Alas " + Alas + " dan tinggi " + Tinggi + " Adalah " + luasSegitiga);
        System.out.println();
    }

    void hitungPersegiPanjang() {
        Scanner inputLebar = new Scanner(System.in);
        Scanner inputPanjang = new Scanner(System.in);

        System.out.println("HITUNG LUAS PERSEGI PANJANG");
        System.out.println();
        System.out.println("Rumus : Panjang x lebar");
        System.out.print("Masukkan panjang Bangun : ");
        panjang = inputPanjang.nextDouble();
        System.out.print("Masukkan lebar Bangun : ");
        lebar = inputLebar.nextDouble();
        luasPersegiPanjang = lebar * panjang;
        System.out.println(
                "Luas persegi dengan Panjang " + panjang + " dan Lebar " + lebar + " Adalah " + luasPersegiPanjang);
        System.out.println();
    }

}