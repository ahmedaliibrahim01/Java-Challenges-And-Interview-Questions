import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get input values for sellingPrice and costPrice
        System.out.print("Enter Selling Price : ");
        int sellingPrice = input.nextInt();
        System.out.print("Enter Cost Price : ");
        int costPrice = input.nextInt();

        // calculate the profit or loss amount and print it
        int profitLoss = sellingPrice - costPrice;
        System.out.println("Profit Loss : " + profitLoss);;

        input.close();
    }
}