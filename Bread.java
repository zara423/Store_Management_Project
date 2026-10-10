public class Bread extends Bakery {

private boolean hasSeed;   // boolean deciding whether the bread bought is seeded or not

// write no argument and parameterized constructors
public Bread(){
hasSeed = false;
}

public Bread(String name, double price, String category, boolean hasSeed){
  super(name,price,category);
  this.hasSeed = hasSeed;
}

public boolean getHasSeed(){
  return hasSeed;
}
public void setHasSeed(boolean hasSeed){
  this.hasSeed = hasSeed;
}
  // write to string
public String toString(){
  return super.toString() + "\nContains Seeds: " + hasSeed;
}



  
}