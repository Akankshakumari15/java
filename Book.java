import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int price;

    // Method to set book details
    public void setData(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
    }

    // Method to apply a discount
    public int applyDiscount(int percentage) {
        return price - (price * percentage / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        // Input book details
        System.out.println("Enter title of book: ");
        String title = sc.nextLine();

        System.out.println("Enter name of the author: ");
        String author = sc.nextLine();

        System.out.println("Price of the book: ");
        int price = sc.nextInt();

        sc.close();

        // Set book details
        book.setData(title, author, price);

        // Display book details
        book.display();

        // Apply discount and display final price
        int finalPrice = book.applyDiscount(10);
        System.out.println("Price after 10% discount: " + finalPrice);
    }
}
