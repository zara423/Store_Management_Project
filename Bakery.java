public class Bakery {
  private String name;
  private double price;
  private String category;

//  write a no argument constructor //
  public Bakery(){
    name = "none";
    price = 0.0;
    category = "Bread";
  }

// write a regular constructor //
  public Bakery(String name, double price,String category){
    this.name = name;
    this.price = price;
    this.category = category;
  }

public String getName(){
  return name;
}
  
public String getCategory(){
  return category;
}
public double getPrice(){
  return price;
}

// write mutator method

public void setName(String name){
  this.name = name;
}

public void setPrice(double price){
  this.price = price;
}
  
public void setCategory(String category){
  this.category = category;
}

  // write to string

public String toString(){
  return "Name : " + name + "\nPrice : " + price + "\nThis item is a: " + category; 
}



  
}