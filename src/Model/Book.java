package Model;

import javafx.scene.image.Image;

public class Book {
    private String ISBN;
    private String title;
    private String category;
    private Double sellingPrice;
    private String author;
    private int stock;
    private Image coverImage;

    public Book(String ISBN, String title, String category, double sellingPrice, String author, int stock, Image coverImage) {
        this.ISBN = ISBN;
        this.title = title;
        this.category = category;
        this.sellingPrice = sellingPrice;
        this.author = author;
        this.stock = stock;
        this.coverImage = coverImage;
    }

    public Book(String title, int quantity, double bookTotalPrice) {
        this.title = title;
        this.stock = quantity;
        this.sellingPrice = bookTotalPrice;
    }

    // Getters and setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Image getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(Image coverImage) {
        this.coverImage = coverImage;
    }
}
