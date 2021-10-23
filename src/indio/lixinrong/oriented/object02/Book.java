package indio.lixinrong.oriented.object02;

public class Book {
    private String name;
    private String author;
    private String press;
    private double price;
    public Book(){

    }
    public Book(String name,String author,String press,double price){
        this.author=author;
        this.name=name;
        this.press=press;
        this.price=price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", name=" + name + ", press=" + press + ", price=" + price + "]";
    }
    
}