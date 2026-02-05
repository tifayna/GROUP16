
/**
 * Write a description of class ProductInventory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductInventory
{
   //Attributes
   private String productCode;
   private String productName;
   private String category;
   private double unitPrice;
   private int quantityInStock;
   private int reorderLevel;
   
   //Constructors
   public ProductInventory(String productCode,String productName,String category,double unitPrice,int quantityInStock,int reorderLevel){
      this.productCode=productCode;
      this.productName=productName;
      this.category=category;
      this.reorderLevel=10;
      setunitPrice(unitPrice);
      setquantityInStock(quantityInStock);
    }
    
   //Getters 
   public String getproductCode(){return productCode;}
   public String getproductName(){return productName;}
   public String getcategory(){return category;}
   public double getunitPrice(){return unitPrice;}
   public int getquantityInStock(){return quantityInStock;}
   public int getreorderLevel(){return reorderLevel;}
   
//Setters with validation
   public void setunitPrice(double unitPrice){
      if (unitPrice > 0){
          this.unitPrice=unitPrice;
    }
}

   public void setquantityInStock(int quantityInStock){
    if(quantityInStock >= 0){
        this.unitPrice = unitPrice;
    }
}

   public void setreorderLevel(int reorderLevel ){
    if(reorderLevel > 0){
        this.reorderLevel = reorderLevel;
    }
}

//Behaviour methods
//AddStock
public void addStock(int amount) {
        if (amount > 0) {
            quantityInStock += amount;
            System.out.println(amount + " units added to " + productName);
        } else {
            System.out.println("Error: Cannot add non-positive quantity");
        }
}

//Select Product
public boolean sellProduct(int amount) {
        if (amount <= 0) {
            System.out.println("Error: Sale quantity must be positive");
            return false;
        }
        
        if (amount <= quantityInStock) {
            quantityInStock -= amount;
            System.out.println(amount + " units of " + productName + " sold");
            return true;
        } else {
            System.out.println("Insufficient stock for " + productName);
            return false;
        }
    }
 
 //Calcutate stock value   
public double calculateStockValue() {
        return unitPrice * quantityInStock;
    }

//Check reaorder status
public boolean needsReorder() {
        return quantityInStock <= reorderLevel;
    }

//Apply discount
public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            double discountFactor = (100 - percent) / 100.0;
            unitPrice *= discountFactor;
            System.out.printf("Applied %.1f%% discount to %s%n", percent, productName);
        } else {
            System.out.println("Invalid discount percentage");
        }
    }
 
//Display product information
public void displayProductInfo() {
        System.out.println("\n--- Product Information ---");
        System.out.println("Product Code: " + productCode);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.printf("Unit Price: $%.2f%n", unitPrice);
        System.out.println("Quantity in Stock: " + quantityInStock);
        System.out.println("Reorder Level: " + reorderLevel);
        System.out.printf("Total Stock Value: $%.2f%n", calculateStockValue());
        System.out.println("Needs Reorder: " + (needsReorder() ? "YES" : "NO"));
    }
//Main method for testing    
public static void main(String[] args) {
        System.out.println("=== Product Inventory ===\n");
        
        ProductInventory product1 = new ProductInventory("PRD001", "Laptop", "Electronics", 1500000, 25);
        ProductInventory product2 = new ProductInventory("PRD002", "Office Chair", "Furniture", 350000, 8);
        ProductInventory product3 = new ProductInventory("PRD003", "Notebook", "Stationery", 5000, 100);
        
        //Display all products
        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();
        
        // Sell 20 laptops
        product1.sellProduct(20);

        // Check reorder for product2
        System.out.println("Product2 needs reorder: " + product2.needsReorder());

        // Add 50 units to product2
        product2.addStock(50);

        // Apply 15% discount to product3
        product3.applyDiscount(15);

        // Display final stock values
        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();

        System.out.println("\n=== Exercise Complete ===");
    }
}


    