import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t1Title = sc.nextLine();
        int t1Words = sc.nextInt();
        sc.nextLine();
        String p1Title = sc.nextLine();
        int p1Pages = sc.nextInt();
        sc.nextLine();

        String t2Title = sc.nextLine();
        int t2Words = sc.nextInt();
        sc.nextLine();
        String p2Title = sc.nextLine();
        int p2Pages = sc.nextInt();

        TextDocument t1 = new TextDocument(t1Title, t1Words);
        PDFDocument p1 = new PDFDocument(p1Title, p1Pages);
        TextDocument t2 = new TextDocument(t2Title, t2Words);
        PDFDocument p2 = new PDFDocument(p2Title, p2Pages);

        Document[] docs = { t1, p1, t2, p2 };

        int totalPages = 0;
        for (Document d : docs) {
            if (d instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) d;
                totalPages += pdf.pageCount;
            }
        }

        for (Document d : docs) {
            d.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);

        sc.close();
    }
}