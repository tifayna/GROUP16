
/**
 * Write a description of class ProductInventory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductInventory
{
   private String productCode;
   private String productName;
   private String category;
   private double unitPrice;
   private int quantityInStock;
   private int reorderLevel;
   
public ProductInventory(String productCode,String productName,String category,double unitPrice,int quantityInStock,int reorderLevel){
    this.productCode=productCode;
    this.productName=productName;
    this.category=category;
    this.reorderLevel=10;
    setunitPrice(unitPrice);
    setquantityInStock(quantityInStock);}
    
public String getproductCode(){return productCode;}
public String getproductName(){return productName;}
public String getcategory(){return category;}
public double getunitPrice(){return unitPrice;}
public int getquantityInStock(){return quantityInStock;}
public int getreorderLevel(){return reorderLevel;}

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

public void addStock(int amount) {
        if (amount > 0) {
            quantityInStock += amount;
            System.out.println(amount + " units added to " + productName);
        } else {
            System.out.println("Error: Cannot add non-positive quantity");
        }
}

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
    
public double calculateStockValue() {
        return unitPrice * quantityInStock;
    }
    
public boolean needsReorder() {
        return quantityInStock <= reorderLevel;
    }
    
public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            double discountFactor = (100 - percent) / 100.0;
            unitPrice *= discountFactor;
            System.out.printf("Applied %.1f%% discount to %s%n", percent, productName);
        } else {
            System.out.println("Invalid discount percentage");
        }
    }
    
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
    
public static void main(String[] args) {
        System.out.println("=== Product Inventory ===\n");
        
        ProductInventory product1 = new ProductInventory("PRD001", "Laptop", "Electronics", 1500000, 25);
        ProductInventory product2 = new ProductInventory("PRD002", "Office Chair", "Furniture", 350000, 8);
        ProductInventory product3 = new ProductInventory("PRD003", "Notebook", "Stationery", 5000, 100);
        
        System.out.println("Initial Product Details:");
        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();
        
        System.out.println("\n--- Sales Operations ---");
        product1.sellProduct(20); 
        
        System.out.println("\n--- Reorder Check ---");
        if (product2.needsReorder()) {
            System.out.println(product2.getproductName() + " needs reordering!");
        }
        
        System.out.println("\n--- Stock Addition ---");
        product2.addStock(50);
        
        System.out.println("\n--- Discount Application ---");
        product3.applyDiscount(15);
        
        System.out.println("\n--- Final Stock Values ---");
        System.out.printf("Total value of %s stock: $%.2f%n", 
            product1.getproductName(), product1.calculateStockValue());
        System.out.printf("Total value of %s stock: $%.2f%n", 
            product2.getproductName(), product2.calculateStockValue());
        System.out.printf("Total value of %s stock: $%.2f%n", 
            product3.getproductName(), product3.calculateStockValue());
        
        System.out.println("\n--- Final Product Status ---");
        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();
        
        System.out.println("\n=== Exercise Complete ===");
    }
}



  

    