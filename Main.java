import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MONTHS_IN_A_YEAR = 12;
        final int PERCENT = 100;

        int principal;
        double annualInterestRate;
        int period;
        double mortgage;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_A_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        period = scanner.nextInt();
        int numberOfPayments = period * MONTHS_IN_A_YEAR;

        mortgage = principal *
                (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments)) /
                (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);

// cara lain yang lebih terkini dengan menggunakan printf
//        System.out.printf("Mortgage: $%,.2f\n", mortgage);

        String mortgageFormated = NumberFormat
                .getCurrencyInstance().format(mortgage);
        System.out.println("Mortage: " + mortgageFormated);

        scanner.close();

    }
}
