public class Lab5_AuthorBookComposition {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("  Lab 5: Author and Book (Composition)");
        System.out.println("=============================================\n");

        // Testing
        System.out.println("--- Section 1: Creating Authors ---");
        Author author1 = new Author("Ali Sultan", "ali.sultan@suza.ac.tz", 'm');
        Author author2 = new Author("Mwanaisha Bakari", "mwanaisha.b@suza.ac.tz", 'f');
        Author author3 = new Author("Hamad Khamis", "hamad.k@gmail.com", 'm');

        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);


        System.out.println("\n--- Section 2: Creating Books ---");
        Book book1 = new Book("Introduction to Java", author1, 35000, 50);
        Book book2 = new Book("Data Structures in Java", author2, 42000, 30);

        System.out.println(book1);
        System.out.println(book2);

        
        System.out.println("\n--- Section 3: Accessing Through Composition ---");
        System.out.println("Book: " + book1.getName());
        System.out.println("Author name: " + book1.getAuthorName());
        System.out.println("Author email: " + book1.getAuthorEmail());
        Author bookAuthor = book1.getAuthor();
        System.out.println("Author object: " + bookAuthor);

        
        System.out.println("\n--- Section 4: Shared Author References ---");
        Book book3 = new Book("Advanced Java Programming", author1, 55000, 20);
        System.out.println("Book 1 author: " + book1.getAuthorName());
        System.out.println("Book 3 author: " + book3.getAuthorName());
        System.out.println("Same author? " + (book1.getAuthor() == book3.getAuthor()));

        
        author1.setEmail("ali.sultan.new@suza.ac.tz");
        System.out.println("\nAfter changing author1's email:");
        System.out.println("Book 1 author email: " + book1.getAuthorEmail());
        System.out.println("Book 3 author email: " + book3.getAuthorEmail());
        System.out.println("Both changed! Because they share the same Author object.");

        
        System.out.println("\n--- Section 5: Creating Book with Anonymous Author ---");
        Book book4 = new Book(
            "Python for Beginners",
            new Author("Salma Haji", "salma.h@suza.ac.tz", 'f'),
            28000,
            100
        );
        System.out.println(book4);
        System.out.println("Author: " + book4.getAuthorName());

        
        System.out.println("\n--- Section 6: Book Inventory ---");
        Book[] inventory = {book1, book2, book3, book4};

        System.out.println("SUZA Bookshop Inventory:");
        System.out.println(String.format("%-30s %-25s %10s %5s",
            "Title", "Author", "Price(TZS)", "Qty"));
        System.out.println("-".repeat(75));

        double totalValue = 0;
        for (Book book : inventory) {
            System.out.println(String.format("%-30s %-25s %,10.0f %5d",
                book.getName(), book.getAuthorName(),
                book.getPrice(), book.getQty()));
            totalValue += book.getPrice() * book.getQty();
        }
        System.out.println("-".repeat(75));
        System.out.println(String.format("Total inventory value: TZS %,.0f", totalValue));

        System.out.println("\n=============================================");
        System.out.println("  End of Lab 5");
        System.out.println("=============================================");
    }
}
