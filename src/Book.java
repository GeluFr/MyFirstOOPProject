public class Book {
    //price,title,author
    private double price;
    private String title;
    private String author;

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {

        price=100;
        author="Unknown";
        title="Unknown";
    }

    public Book(double price, String title) {
        this.price = price;
        this.title = title;
    }

    public Book(double price, String title, String author) {
        this.price = price;
        this.title = title;
        this.author = author;
    }

    public double getPrice(){
        return price;
    }
    public String afiseaza(){
        return "Cartea "+title+" are ca autor "+author;
    }
}
