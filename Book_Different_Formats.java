public class Book_Different_Formats {
    private String title;
    private String author;
    private int year;

    // Constructor to initialize book details
    public Book_Different_Formats (String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display book details in plain text
    public void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

    // Overloaded method to display book details in HTML format
    public void display(String format) {
        if ("HTML".equalsIgnoreCase(format)) {
            System.out.println("<html>");
            System.out.println("<body>");
            System.out.println("<h1>" + title + "</h1>");
            System.out.println("<p><strong>Author:</strong> " + author + "</p>");
            System.out.println("<p><strong>Year:</strong> " + year + "</p>");
            System.out.println("</body>");
            System.out.println("</html>");
        } else {
            display(); // Default to plain text if format is unrecognized
        }
    }

    // Overloaded method to display book details in JSON format
    public void display(String format, boolean isJson) {
        if (isJson) {
            System.out.println("{");
            System.out.println("  \"title\": \"" + title + "\",");
            System.out.println("  \"author\": \"" + author + "\",");
            System.out.println("  \"year\": " + year);
            System.out.println("}");
        } else {
            display(format); // Delegate to the other overloaded method
        }
    }

    public static void main(String[] args) {
        Book_Different_Formats  book = new Book_Different_Formats ("1984", "George Orwell", 1949);

        // Display book details in plain text
        book.display();

        // Display book details in HTML format
        book.display("HTML");

        // Display book details in JSON format
        book.display("JSON", true);
    }
}

    

