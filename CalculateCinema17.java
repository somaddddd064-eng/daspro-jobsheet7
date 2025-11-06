import java.util.Scanner;
public class CalculateCinema17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ticketPrice = 50000;

        System.out.print("Enter total tickets sold today: ");
        int tickets = input.nextInt();

        double discount = 0;

        if (tickets > 10) {
            discount = 0.15;
        } else if (tickets >= 5) {
            discount = 0.10;
        }

        double total = tickets * ticketPrice;
        double discountAmount = total * discount;
        double totalPay = total - discountAmount;

        System.out.println("Total Tickets: " + tickets);
        System.out.println("Total Before Discount: Rp " + total);
        System.out.println("Discount: Rp " + discountAmount);
        System.out.println("Total Payment: Rp " + totalPay);
    }
}

