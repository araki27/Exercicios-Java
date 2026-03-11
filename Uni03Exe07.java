import java.util.Scanner;

public class Uni03Exe07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Latas 350 mL: ");
        float lata1 = s.nextFloat();

        System.out.print("Latas 600 mL: ");
        float lata2 = s.nextFloat();

        System.out.print("Garrafas: ");
        float garrafa = s.nextFloat();

        float litros = (lata1 * 0.35f) + (lata2 * 0.6f) + (garrafa * 2);
        System.out.println("Litros comprados: " + litros + "litros");

        s.close();
    }
}
