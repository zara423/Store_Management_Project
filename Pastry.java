public class Pastry extends Bakery {

private boolean isSweet;   // boolean deciding whether the pastry bought is sweet or not

//Write no argument and parameterized constructors
public Pastry(){
  isSweet = true;
}

public Pastry(String name, double price, String category, boolean isSweet){
super(name,price,category);
this.isSweet = isSweet;
}

public boolean getIsSweet(){
  return isSweet;
}

  public void setIsSweet(boolean isSweet){
    this.isSweet=isSweet;
  }
// write to string methods
public String toString(){
  return super.toString() + "\nIs This Sweet?: " + isSweet;
}




}