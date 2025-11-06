import java.util.Scanner;
public class KafeDoWhile17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int coffee, tea, bread;
        String customerName;
        int coffeePrice = 12000;
        int teaPrice = 7000;
        int breadPrice = 20000;
        double totalPrice;

        do {
            System.out.print("Enter customer name (type 'cancel' to exit) :");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canseled.");
                break;
            }

            System.out.print("Enter number of coffee :");
            coffee = sc.nextInt();
            System.out.print("Enter number of tea :");
            tea = sc.nextInt();
            System.out.println("Enter number of bread :");
            bread = sc.nextInt();

            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);

            System.out.println("Total to be paid : " + totalPrice);
            sc.nextLine();
        } while (true);
        System.out.println("All transaction completed");
    }
}
