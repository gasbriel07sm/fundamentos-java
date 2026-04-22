package reforco_poo.desafio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Loan {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final double LATE_FEE = 2.50;

    private Book book;
    private String readerName;
    private LocalDate loanDate;

    public Loan(Book book, String readerName, LocalDate loanDate) {
        this.book = book;
        this.readerName = readerName;
        this.loanDate = loanDate;
        this.book.setAvailable(false);
    }

    public Book getBook() {
        return book;
    }

    public String getReaderName() {
        return readerName;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public double lateFee(int daysLate) {
        if (daysLate > 0) {
            return daysLate * LATE_FEE;
        }
        return 0;
    }

    public void returnBook(int daysLate) {
        this.book.setAvailable(true);
    }


}
