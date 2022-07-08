import java.util.Scanner;

public class Bet {

    public static void main(String[] args) {
        Bet bet = new Bet();
    }

    public Bet() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть вашу ставку");
        double stavka = scan.nextDouble();
        System.out.println("Введіть ваш ризик");
        double risk = scan.nextDouble();
        System.out.println("Ваша ставка " + stavka + " грн" + "\nРизик програшу " + risk + " %");
        System.out.println();
    }
}
