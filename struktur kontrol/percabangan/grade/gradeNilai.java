public class gradeNilai {

    public static void main(String[] args) {

        try {
            int hasil = Integer.parseInt(args[0]);
            String grade;

            if (hasil >= 85 && hasil <= 100) {
                grade = "A";
                System.out.println("Grade dari nilai " + hasil + " Adalah " + grade);
            } else if (hasil >= 70 && hasil <= 84) {
                grade = "B";
                System.out.println("Grade dari Nilai " + hasil + " Adalah " + grade);
            } else if (hasil >= 45 && hasil <= 69) {
                grade = "C";
                System.out.println("Grade dari Nilai " + hasil + " Adalah " + grade);
            } else if (hasil >= 0 && hasil <= 44) {
                grade = "D";
                System.out.println("Grade dari Nilai " + hasil + " Adalah " + grade);
                System.out.println("Auto ngulang lu Cok !!!");
            } else {
                System.out.println("Nilai yang anda masukkan tidak valid!!");
            }
        } catch (Exception error) {
            System.out.println("Harap masukkan Angka !!");

        }
    }
}