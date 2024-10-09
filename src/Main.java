import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double rate = 24000;
        double vnd, usd;

        System.out.print("Nhập vào số tiền USD: ");
        usd = scanner.nextDouble();

        vnd = usd * rate;

        System.out.printf("Số tiền VND tương đương: %10.2f", vnd);
    }
}