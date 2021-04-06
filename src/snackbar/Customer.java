package snackbar;

public class Customer {
  private static int maxId = 1;
  private int id;
  private String name;
  private double cashOnHand;

  public Customer(String name, double cashOnHand) {
    id = maxId;
    maxId++;
    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public void addCashOnHand(double deposit) {
    cashOnHand += deposit;
  }

  public double getCashOnHand() {
    return cashOnHand;
  }

  public void buySnacks(double purchaseTotal) {
    cashOnHand -= purchaseTotal;
  }
}
