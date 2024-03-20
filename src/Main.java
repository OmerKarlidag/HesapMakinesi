import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int select, n1, n2;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();
        System.out.print("İşlem Seçiniz :\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n->");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuç : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuç : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuç : " + (n1 * n2));
                break;
            case 4:
                if ((n1 == 0) || (n2 == 0)) {
                    System.out.println("Bir Sayı 0'a Bölünemez !");
                } else {
                    System.out.println("Sonuç : " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız. Tekrar Deneyiniz !");
        }
    }
}
