import java.util.Scanner;
public class ManavTutarHesaplama {
    public static void main(String[] args) {
        double ArmutKg = 2.14 ,ElmaKg = 3.67 ,DomatesKg = 1.11 ,MuzKg = 0.95 ,PatlicanKg = 5.00, Armut ,Elma,Domates,Muz ,Patlican ,Total;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut Aldınız?: ");
        Armut = girdi.nextDouble();

        System.out.print("Kaç Kilo Elma Aldınız?: ");
        Elma = girdi.nextDouble();

        System.out.print("Kaç Kilo Domates Aldınız?: ");
        Domates = girdi.nextDouble();

        System.out.print("Kaç Kilo Muz Aldınız?: ");
        Muz = girdi.nextDouble();

        System.out.print("Kaç Kilo Patlıcan Aldınız?: ");
        Patlican = girdi.nextDouble();

        Total = ArmutKg * Armut + ElmaKg * Elma + DomatesKg * Domates + MuzKg * Muz + PatlicanKg * Patlican;
        System.out.println("Manav Alışverişiniz " + Total + " TL Tutmuştur.");

    }
}
