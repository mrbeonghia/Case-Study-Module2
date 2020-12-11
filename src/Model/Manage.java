package Model;



public class Manage {
    private Borrower borrower;
    private Book book;
    private int numOfBorrow; // số lượng sách mượn(mỗi đầu sách tối đa 2)
    private String state; // tình trạng sách khi mượn
    private int total; // tổng số sách đã mượn,mỗi người tối đa 10

    public Manage(Borrower borrower, Book book, int numOfBorrow, String state, int total) {
        this.borrower = borrower;
        this.book = book;
        this.numOfBorrow = numOfBorrow;
        this.state = state;
        this.total = total;
    }

    public Manage(int borrowerID, String borrowerName, String bookName, String quantity, String state, int total) {
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getNumOfBorrow() {
        return numOfBorrow;
    }

    public void setNumOfBorrow(int numOfBorrow) {
        this.numOfBorrow = numOfBorrow;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
