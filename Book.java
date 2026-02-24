public class Book {
    private String name;
    private Author author;  
    private double price;
    private int qty;

    // Constructor
    public Book(String name, Author author, double price) {
        this(name, author, price, 0);
    }

    // Constructor with quantity
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
//creating getter and setter methods
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Methods
    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ", " + author.toString() +
                ", price=" + price + ", qty=" + qty + "]";
    }
}
