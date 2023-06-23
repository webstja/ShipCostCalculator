public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of the item: $");
        double itemPrice = scanner.nextDouble();
        double shipping = 0.02;
        double shippingCost = itemPrice * shipping;
        double totalPrice = (itemPrice * shippingCost) + itemPrice;
        if (itemPrice >= 100) {
            System.out.println("Your shipping cost is $0. Your total price is $" + itemPrice + ".");
        } else {
            System.out.println("Your shipping cost is $" + shippingCost + ". " + "The total price is $" + totalPrice + ".");
    }
    }
}
