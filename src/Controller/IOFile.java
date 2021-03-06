package Controller;

import Model.Book;
import Model.Borrower;

import java.io.*;
import java.util.ArrayList;

public class IOFile {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeBookToFile(String path, Book book) {
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            if (!file.exists()) {
                System.out.println("File not exists");
                file.createNewFile();
            }
            fileWriter = new FileWriter(file, true);
            fileWriter.append(book.getBookId()+"");
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(book.getBookName());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(book.getAuthor());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(book.getCategory());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(book.getPublisher());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(book.getPublishYear()+"");
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(book.getQuantity()+"");
            fileWriter.append(NEW_LINE_SEPARATOR);
            fileWriter.flush();

        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    System.out.println("Write success!");
                    fileWriter.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void updateBookToFile(String path, ArrayList<Book> book) {
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            if (!file.exists()) {
                System.out.println("File not exits");
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);

            for (int i = 0; i < book.size(); i++) {
                fileWriter.append(book.get(i).getBookId()+"");
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.get(i).getBookName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.get(i).getAuthor());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.get(i).getCategory());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.get(i).getPublisher());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.get(i).getPublishYear()+"");
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(book.get(i).getQuantity()+"");
                fileWriter.append(NEW_LINE_SEPARATOR);
                fileWriter.flush();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    System.out.println("Write success!");
                    fileWriter.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static ArrayList<Book> readBookFromFile() {
        ArrayList<Book> listBooks = new ArrayList<>();
        String fileIn = "Book.csv";
        String line = null;
        FileReader fileReader = null;

        if (fileIn == null) {
            return null;
        } else {
            try {
                fileReader = new FileReader(fileIn);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (true) {
                try {
                    if (!((line = bufferedReader.readLine()) != null)) break;
                } catch (IOException exception) {
                    System.out.println(exception);
                }
                String[] p = line.split(COMMA_DELIMITER);
                int bookId = Integer.parseInt(p[0]);
                String bookName = p[1];
                String author = p[2];
                String category = p[3];
                String publisher = p[4];
                int publishYear = Integer.parseInt(p[5]);
                int quantity = Integer.parseInt(p[6]);
                listBooks.add(new Book(bookId,bookName,author,category,publisher,publishYear,quantity));
            }
            try {
                bufferedReader.close();
            }
            catch (IOException exception) {
                exception.printStackTrace();
            }
            return listBooks;
        }
    }



    public static void writeBorrowerToFile(String path, Borrower borrower) {
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            if (!file.exists()) {
                System.out.println("File not exists");
                file.createNewFile();
            }
            fileWriter = new FileWriter(file, true);
            fileWriter.append(borrower.getBorrowerId()+"");
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(borrower.getBorrowerName());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(borrower.getBorrowerAddress());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(borrower.getBorrowerPhone());
            fileWriter.append(NEW_LINE_SEPARATOR);
            fileWriter.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    System.out.println("Write success!");
                    fileWriter.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static ArrayList<Borrower> readBorrowerFromFile() {
        ArrayList<Borrower> listBorrowers = new ArrayList<>();
        String fileIn = "Borrower.csv";
        String line = null;
        FileReader fileReader = null;

        if (fileIn == null) {
            return null;
        } else {
            try {
                fileReader = new FileReader(fileIn);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (true) {
                try {
                    if (!((line = bufferedReader.readLine()) != null)) break;
                } catch (IOException exception) {
                    System.out.println(exception);
                }
                String[] p = line.split(COMMA_DELIMITER);
                int borrowerId = Integer.parseInt(p[0]);
                String borrowerName = p[1];
                String borrowerAddress = p[2];
                String borrowerPhone = p[3];
                listBorrowers.add(new Borrower(borrowerId,borrowerName,borrowerAddress,borrowerPhone));
            }
            try {
                bufferedReader.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            return listBorrowers;
        }
    }



//    public static void writeManageToFile(String path, Manage manage) {
//        File file = new File(path);
//        FileWriter fileWriter = null;
//        try {
//            if (!file.exists()) {
//                System.out.println("File not exists");
//                file.createNewFile();
//            }
//            fileWriter = new FileWriter(file, true);
//            fileWriter.append(manage.getBorrower().getBorrowerId()+"");
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(manage.getBook().getBookId()+"");
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(manage.getNumOfBorrow()+"");
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(manage.getState());
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(manage.getTotal()+"");
//            fileWriter.append(NEW_LINE_SEPARATOR);
//            fileWriter.flush();
//
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        } finally {
//            if (fileWriter != null) {
//                try {
//                    System.out.println("Write success!");
//                    fileWriter.close();
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            }
//        }
//    }



//    public static ArrayList<Manage> readManageFromFile() {
//        Manage manage = new Manage();
//        ArrayList<Manage> listManages = new ArrayList<>();
//        String fileIn = "Manage.csv";
//        String line = null;
//        FileReader fileReader = null;
//
//        if (fileIn == null) {
//            return null;
//        } else {
//            try {
//                fileReader = new FileReader(fileIn);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            while (true) {
//                try {
//                    if (!((line = bufferedReader.readLine()) != null)) break;
//                } catch (IOException exception) {
//                    System.out.println(exception);
//                }
//                String[] p = line.split(COMMA_DELIMITER);
//
//                manage.setBorrower(new Borrower(Integer.parseInt(p[0])));
//                manage.setBook(new Book(Integer.parseInt(p[1])));
//                int quantity = Integer.parseInt(p[2]);
//                String state = p[3];
//                int total = Integer.parseInt(p[4]);
//                listManages.add(,quantity,state,total));
//            }
//            try {
//                bufferedReader.close();
//            } catch (IOException exception) {
//                exception.printStackTrace();
//            }
//            return listManages;
//        }
//    }


}
