import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km = 0;
        double perKm = 2.20, total=10;

        System.out.print("Gidilecek kilometre miktarını giriniz : ");
        km = input.nextInt();

        total += (perKm * km);

        total = (total < 20) ? 20 : total;

        System.out.println("Tutarınız : " + total);
    }
}