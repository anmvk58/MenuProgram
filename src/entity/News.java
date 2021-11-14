package entity;

public class News implements INews{
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rates;

    public News(String title, String publishDate, String author, String content, int[] rates) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.rates = rates;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    //Method Display() sẽ in ra Title, PublishDate, Author,
    //Content và AverageRate của tin tức ra console.
    @Override
    public void Display() {
        System.out.println("=========================================");
        System.out.println("Title: " + this.title);
        System.out.println("PublishDate: " + this.publishDate);
        System.out.println("Author: " + this.author);
        System.out.println("Content: " + this.content);
        System.out.println("AverageRate: " + this.averageRate);
        System.out.println("=========================================");
    }

    @Override
    public float Calculate() {
        this.averageRate = (float) (this.rates[0] + this.rates[1] + this.rates[2])/3;
        return this.averageRate;
    }
}
