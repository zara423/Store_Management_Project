public class Muffin extends Bakery {

private boolean hasChocolateChips;    // boolean deciding whether the pastry bought is sweet or not

  //write no argument and parameterized constructors
public Muffin() {
hasChocolateChips = false;
}

public Muffin(String name, double price, String category, boolean hasChocolateChips) {
super(name, price,category);
this.hasChocolateChips = hasChocolateChips;
}

public boolean getHasChocolateChips() {
return hasChocolateChips;
}
  
public void setHasChocolateChips(boolean hasChocolateChips) {
this.hasChocolateChips = hasChocolateChips;
}
  //write to string method
public String toString() {
return super.toString() + "\nHas Chocolate Chips: " + hasChocolateChips;
}


}