package snackbar;


public class Main {
  public static void main(String[] args) {
    startProject();
  }
  private static void startProject() {
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("office");

    Snack chips = new Snack("Chips", 36, 1.75, 1);
    Snack chocolate_bar = new Snack("Chocolate bar", 36, 1.00, 1);
    Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);
    Snack soda = new Snack("Soda", 24, 2.50, 2);
    Snack water = new Snack("Water", 20, 2.75, 2);

    buySnack(jane, 3, soda);
    buySnack(jane, 1, pretzel);
    buySnack(bob, 2, soda);
    jane.addCashOnHand(10.00);
    System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
    buySnack(jane, 1, chocolate_bar);
    pretzel.addQuantity(12);
    System.out.println("Quantity of pretzel is "+ pretzel.getQuantity());
    buySnack(bob, 3, pretzel);
  };

  public static void buySnack(Customer cx, int purchaseQty, Snack snack) {
    snack.buySnack(purchaseQty);
    cx.buySnacks(snack.getTotal(purchaseQty));
    printSnackUpdate(cx, snack);
  };

  public static void printSnackUpdate(Customer cx, Snack snack) {
    System.out.println(cx.getName() + "\'s cash on hand is " + cx.getCashOnHand());
    System.out.println("Quantity of " + snack.getName() + " is " + snack.getQuantity());
  };
};