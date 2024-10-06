package samples;

// Main class to test the Book class
public class Main {
    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book("The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy", "978-0-261-10221-7", 4.8);

        // Display book details
        myBook.displayDetails();

        // Check if the book is a bestseller
        if (myBook.isBestseller()) {
            System.out.println(myBook.getTitle() + " is a bestseller!");
        } else {
            System.out.println(myBook.getTitle() + " is not a bestseller.");
        }

        // Change the book's rating
        myBook.setRating(4.0);
        System.out.println("Updated Rating: " + myBook.getRating());

        // Attempt to set an invalid rating
        myBook.setRating(6.0); // This should trigger a validation message
    }
}
