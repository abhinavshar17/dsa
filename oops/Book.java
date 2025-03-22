abstract class Publication {
    protected String title;
    protected int price;

    public Publication(String t, int p) {
        title = t;
        price = p;
    }

    public abstract void putdata();
}

class Book extends Publication {
    private int pages;
    private String author;

    public Book(String t, int p, int pg, String a) {
        super(t, p);
        pages = pg;
        author = a;
    }

    @Override
    public void putdata() {
        System.out.printf("Book: \"%s\" by \"%s\" | %d pages | %d rupees%n", title, author, pages, price);
    }
}

class CD extends Publication {
    private int length;

    public CD(String t, int p, int len) {
        super(t, p);
        length = len;
    }

    @Override
    public void putdata() {
        System.out.printf("CD: \"%s\" | %d minutes | %d rupees%n", title, length, price);
    }
}
