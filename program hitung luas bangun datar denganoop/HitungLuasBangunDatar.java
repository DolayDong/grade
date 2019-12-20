import java.util.Scanner;

public class HitungLuasBangunDatar {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        Scanner ulangProgram = new Scanner(System.in);
        String lagi;
        boolean ulang = true;

        try {
            do {
                System.out.println("PROGRAM HITUNG LUAS DAN KELILING BANGUN DATAR");
                System.out.println("1. Persegi");
                System.out.println("2. Lingkaran");
                System.out.println("3. Segitiga");
                System.out.println("4. Persegi Panjang");
                System.out.println("5. Exit");
                System.out.print("Pilih bangun ");
                int pilihan = inputUser.nextInt();

                switch (pilihan) {
                case 1:
                    Persegi Persegi = new Persegi();
                    Persegi.hitungLuas();
                    Persegi.hitungKeliling();
                    System.out.print("Hitung lagi? [y/n] : ");
                    lagi = ulangProgram.nextLine();
                    if (lagi.equalsIgnoreCase("y")) {
                        ulang = true;
                    } else if (lagi.equalsIgnoreCase("n")) {
                        System.out.println("Terimakasih sudah mampir");
                        ulang = false;
                    } else {
                        System.out.println("Harap masukkan huruf!");
                    }
                    break;
                case 2:
                    Lingkaran lingkaran = new Lingkaran();
                    lingkaran.hitungLuas();
                    lingkaran.hitungKeliling();
                    System.out.print("Hitung lagi? [y/n] : ");
                    lagi = ulangProgram.nextLine();
                    if (lagi.equalsIgnoreCase("y")) {
                        ulang = true;
                    } else if (lagi.equalsIgnoreCase("n")) {
                        System.out.println("Terimakasih sudah mampir");
                        ulang = false;
                    } else {
                        System.out.println("Harap masukkan huruf!");
                    }
                    break;
                case 3:
                    Segitiga segitiga = new Segitiga();
                    segitiga.hitungLuas();
                    segitiga.hitungKeliling();
                    System.out.print("Hitung lagi?[y/n] : ");
                    lagi = ulangProgram.nextLine();
                    if (lagi.equalsIgnoreCase("y")) {
                        ulang = true;
                    } else if (lagi.equalsIgnoreCase("n")) {
                        System.out.println("Terimakasih sudah mampir");
                        ulang = false;
                    } else {
                        System.out.println("Harap masukkan huruf!");
                    }
                    break;
                case 4:
                    PersegiPanjang persegipanjang = new PersegiPanjang();
                    persegipanjang.hitungLuas();
                    persegipanjang.hitungKeliling();
                    System.out.print("Hitung lagi? [y/n] : ");
                    lagi = ulangProgram.nextLine();
                    if (lagi.equalsIgnoreCase("y")) {
                        ulang = true;
                    } else if (lagi.equalsIgnoreCase("n")) {
                        System.out.println("Terimakasih sudah mampir");
                        ulang = false;
                    } else {
                        System.out.println("Harap masukkan huruf!");
                    }
                    break;
                case 5:
                    System.out.println("Terimakasih sudah mampir");
                    ulang = false;

                }
            } while (ulang);
        } catch (Exception e) {
            System.out.println("Yang anda masukkan bukan angka !!");

        }

    }
}

class BangunDatar {
    Scanner inputLebar = new Scanner(System.in);
    Scanner inputPanjang = new Scanner(System.in);
    Scanner inputSisi1 = new Scanner(System.in);
    Scanner inputSisi2 = new Scanner(System.in);
    Scanner inputAlas = new Scanner(System.in);
    Scanner inputTinggi = new Scanner(System.in);
    Scanner inputSisi = new Scanner(System.in);
    Scanner inputR = new Scanner(System.in);
    double keliling;
    double luas;
    final double pi = 3.14;

    void hitungLuas() {
        System.out.println("luas..");

    }

    void hitungKeliling() {
        System.out.println("keliling..");

    }

}

class Persegi extends BangunDatar {
    double sisi;

    @Override
    void hitungLuas() {

        System.out.println("Luas Persegi ");
        System.out.print("Masukkan panjang sisi : ");
        sisi = inputSisi.nextDouble();
        System.out.println(this.luas = sisi * sisi);

    }

    @Override
    void hitungKeliling() {
        System.out.println("Keliling Persegi ");
        System.out.print("Masukkan sisi : ");
        sisi = inputSisi.nextDouble();
        System.out.println("Keliling Persegi dengan sisi " + sisi + " adalah " + sisi * 4);

    }

}

class Lingkaran extends BangunDatar {
    double r;
    double luasLingkaran;

    @Override
    void hitungLuas() {
        System.out.println("HITUNG LUAS LINGKARAN");
        System.out.print("Masukkan Jari-jari : ");
        r = inputR.nextDouble();
        luasLingkaran = this.pi * r * r;
        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah " + luasLingkaran);
    }

    @Override
    void hitungKeliling() {
        System.out.println("Hitung keliling Lingkaran");
        System.out.print("Masukkan jari-jari ");
        r = inputR.nextDouble();
        System.out.println("keliling = " + 2 * this.pi * r);

    }

}

class Segitiga extends BangunDatar {
    double Alas;
    double Tinggi;
    double sisi1;
    double sisi2;

    @Override
    void hitungLuas() {

        System.out.println("HITUNG LUAS SEGITIGA");
        System.out.print("Masukkan Alas :");
        Alas = inputAlas.nextDouble();
        System.out.print("Masukkan Tinggi :");
        Tinggi = inputTinggi.nextDouble();
        System.out.println("Luas Segitiga : " + Alas * Tinggi / 2);
    }

    @Override
    void hitungKeliling() {
        System.out.println("Hitung keliling segitiga");
        System.out.print("Masukkan sisi pertama : ");
        sisi1 = inputSisi1.nextDouble();
        System.out.print("Masukkan Sisi kedua : ");
        sisi2 = inputSisi2.nextDouble();
        System.out.print("Masukkan sisi ketiga :");
        Alas = inputAlas.nextDouble();
        System.out.println("Keliling segitiga = " + (sisi1 + sisi2 + Alas));

    }

}

class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    void hitungLuas() {
        System.out.println("HITUNG LUAS PERSEGI PANJANG");
        System.out.print("Masukkan panjang Bangun : ");
        panjang = inputPanjang.nextDouble();
        System.out.print("Masukkan lebar Bangun : ");
        lebar = inputLebar.nextDouble();
        System.out.println("Luas : " + (lebar * panjang));
    }

    void hitungKeliling() {
        System.out.println("Hitung keliling persegi Panjang ");
        System.out.println("Masukkan Panjang :");
        panjang = inputPanjang.nextDouble();
        System.out.println("Masukkan Lebar ");
        lebar = inputLebar.nextDouble();
        System.out.println("Keliling persegi panjang = " + (panjang + lebar) * 2);
    }
}
