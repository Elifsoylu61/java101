import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double product1, kdvOran;
        boolean kdvbelirleme;

        Scanner inp = new Scanner(System.in);

        System.out.print("Urun Fiyati: ");
        product1 = inp.nextDouble();

        kdvbelirleme = (0<product1) && (product1<1000);
        kdvOran = kdvbelirleme ? 0.18 : 0.08;

        double kdv = product1 * kdvOran;
        double kdvsizTutar = product1 + kdv;


        System.out.println("KDV tutarı: " + kdv);
        System.out.println("KDV'siz tutar: " + kdvsizTutar);


    }

}