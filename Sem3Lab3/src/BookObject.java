public class BookObject {

    private String title;
    private String ISBN;
    private double price;
    private int pages;

    public BookObject()
    {
        title = "Not Available";
        ISBN = "Not Available";
        price = 0.0;
        pages = 0;
    }
    public BookObject(String title, String ISBN, double price, int pages)
    {
        /*this.title = title;
        this.ISBN = ISBN;
        this.price = price;
        this.pages = pages;*/

        setTitle(title);
        setISBN(ISBN);
        setPrice(price);
        setPages(pages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null || title.equals(""))
            this.title = "No valid title supplied !!!";
        else
            this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if(ISBN == null || ISBN.equals(""))
            this.ISBN = "No valid ISBN supplied !!!";
        else
            this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>=0 && price <= 50000)
           this.price = price;
        else
            this.price = 0;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages >= 0 && pages <= 4000)
            this.pages = pages;
        else
            this.pages = 0;
    }

    public String toString()
    {
        return " Title :" + " " + getTitle() + " " + " ISBN :" + getISBN() + " " + " Price :" + getPrice() + " " + " Pages :" + getPages();
    }

}
