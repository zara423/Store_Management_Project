import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
//User input
    System.out.println("Print Name Here:");
    
    String name = input.nextLine();

    System.out.println("Hi " + name + "!" + "\nHere are your purchases: ");


    
Bread b1 = new Bread("Sourdough", 5.99, "Bread", false);
Pastry p1 = new Pastry("Chocolate Croissant", 3.99, "Pastry", true);
Muffin m1 = new Muffin("Blueberry Muffin", 1.99, "Muffin", false);

System.out.println("BREAD: ");
    System.out.println(b1);
       System.out.println();
    
System.out.println("PASTRY: ");
    System.out.println(p1);
       System.out.println();

System.out.println("MUFFIN: ");
    System.out.println(m1);
       System.out.println();

    System.out.println("Thank you for buying from us!");
    

    // Closes the Scanner object
    input.close();
    
  }
}