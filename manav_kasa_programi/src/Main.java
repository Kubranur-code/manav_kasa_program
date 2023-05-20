import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double akg, ekg, dkg, mkg, pkg;
        double a = 2.14, e = 3.67, d = 1.11, m = 0.95, p = 5.0;
        double total;

        System.out.print("Armut kaç kilo?: ");
        akg = inp.nextInt();

        System.out.print("Elma kaç kilo?: ");
        ekg = inp.nextInt();

        System.out.print("Domates kaç kilo?: ");
        dkg = inp.nextInt();

        System.out.print("Muz kaç kilo?: ");
        mkg = inp.nextInt();

        System.out.print("Patlıcan kaç kilo?: ");
        pkg = inp.nextInt();

        total = (akg * a) + (ekg * e) + (dkg * d) +
                (mkg * m) + (pkg * p);

        System.out.println("Toplam fiyat =  " + String.format("%.2f",total));


    }
}