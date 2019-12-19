import java.util.Scanner;

public class HitungLuasBangunDatar {

    public static void main(String[] args) {
        try{
        Persegi Persegi = new Persegi();
        Persegi.hitungLuas();
        Persegi.hitungKeliling();
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        Segitiga segitiga = new Segitiga();
        segitiga.hitungLuas();
        segitiga.hitungKeliling();
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.hitungLuas();
        persegipanjang.hitungKeliling();
        } catch (Exception e){
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
