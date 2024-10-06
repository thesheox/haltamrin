package samples;

// Define the Book class
class Book {
    // Private attributes
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private String isbn; // International Standard Book Number
    private double rating; // Book rating from 0.0 to 5.0

    // Constructor to initialize the attributes
    public Book(String title, String author, int publicationYear, String genre, String isbn, double rating) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.isbn = isbn;
        setRating(rating); // Use setter for validation
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("ISBN: " + isbn);
        System.out.println("Rating: " + rating);
    }

    // Getter for the book's title
    public String getTitle() {
        return title;
    }

    // Getter for the book's author
    public String getAuthor() {
        return author;
    }

    // Getter for the publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    // Getter for the genre
    public String getGenre() {
        return genre;
    }

    // Getter for the ISBN
    public String getIsbn() {
        return isbn;
    }

    // Getter for the rating
    public double getRating() {
        return rating;
    }

    // Setter for the book's title
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter for the publication year
    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    // Setter for the rating with validation
    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating! Rating must be between 0.0 and 5.0.");
        }
    }

    // Method to check if the book is a bestseller
    public boolean isBestseller() {
        return rating >= 4.5; // Considered a bestseller if rating is 4.5 or higher
    }
}

