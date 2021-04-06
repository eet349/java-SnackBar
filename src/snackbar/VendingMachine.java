package snackbar;

public class VendingMachine {
  private static int maxId = 1;
  private int id;
  private String name;

  public VendingMachine(String name) {
    id = maxId;
    maxId++;
    this.name = name;
  }

  public int getId(){
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }
}
