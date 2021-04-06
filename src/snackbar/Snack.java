package snackbar;

public class Snack {
  private static int maxId = 1;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack(
    String name,
    int quantity,
    double cost,
    int vendingMachineId
  ) {
    id = maxId;
    maxId++;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  public int id() {
    return id;
  }

  public String getName(){
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double newCost) {
    cost = newCost;
  }

  public int getVendingMachineId() {
    return vendingMachineId;
  }

  public void setVendingMachineId(int newVendingMachineId) {
    vendingMachineId = newVendingMachineId;
  }

  public int getQuantity() {
    return quantity;
  }

  public void addQuantity(int restockQty) {
    quantity += restockQty;
  }

  public void buySnack(int purchaseQty) {
    quantity -= purchaseQty;
  }

  public double getTotal(int totalQty) {
    return totalQty * cost;
  }
}
