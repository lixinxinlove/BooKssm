package com.lee.entity;

/**
 * Created by android on 2017/7/1.
 */
public class Book {

    private int id;
    private String isbn;
    private String path;
    private String title;
    private String subtitle;
    private String originalTitle;
    private String marketPrice;
    private String intro;
    private String binding;
    private String pages;
    private String author;
    private String publisher;
    private String catalog;
    private String supply;
    private int status;
    private int hot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }


    @Override
    public String toString() {
        return "LeeBook{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", path='" + path + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", marketPrice='" + marketPrice + '\'' +
                ", intro='" + intro + '\'' +
                ", binding='" + binding + '\'' +
                ", pages='" + pages + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", catalog='" + catalog + '\'' +
                ", supply='" + supply + '\'' +
                ", status=" + status +
                ", hot=" + hot +
                '}';
    }
}
