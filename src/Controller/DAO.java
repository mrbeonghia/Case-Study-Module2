package Controller;

import Model.Book;
import Model.Borrower;

import java.io.*;
import java.util.ArrayList;

public class DAO {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void writeBookToFile(String path, Book book) {
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            if (!file.exists()) {
                System.out.println("File not exits");
                file.createNewFile();
            }
            fileWriter = new FileWriter(file, true);
            fileWriter.append(book.getBookID()+"");
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

    public static void writeBookUpdate(String path, ArrayList<Book> books) {
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            if (!file.exists()) {
                System.out.println("File not exits");
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);

            for (int i = 0; i < books.size(); i++) {
                fileWriter.write(books.get(i).getBookID()+"");
                fileWriter.write(COMMA_DELIMITER);
                fileWriter.write(books.get(i).getBookName());
                fileWriter.write(COMMA_DELIMITER);
                fileWriter.write(books.get(i).getAuthor());
                fileWriter.write(COMMA_DELIMITER);
                fileWriter.write(books.get(i).getCategory());
                fileWriter.write(COMMA_DELIMITER);
                fileWriter.write(books.get(i).getPublisher());
                fileWriter.write(COMMA_DELIMITER);
                fileWriter.write(books.get(i).getPublishYear()+"");
                fileWriter.write(COMMA_DELIMITER);
                fileWriter.write(books.get(i).getQuantity()+"");
                fileWriter.write(NEW_LINE_SEPARATOR);
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
    public static void readBookFromFile(String path) {
        File file = new File(path);
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            if (!file.exists()) {
                System.out.println("File not exits!");
                return;
            }
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                String[] p = line.split(COMMA_DELIMITER);
                System.out.println("Book id = " + p[0] + " , Book name = " + p[1] + " , Author = " + p[2] + " , Category = " + p[3] + " , Publisher = " + p[4] + " , Publish year = " + p[5] + " , Quantity = " + p[6]);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException exception) {
                    System.err.println(exception);
                }
            }
        }
    }



    public static void writeBorrowerToFile(String path, Borrower borrower) {
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            if (!file.exists()) {
                System.out.println("File not exits");
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


    public static void readBorrowerFromFile(String path) {
        File file = new File(path);
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            if (!file.exists()) {
                System.out.println("File not exits!");
                return;
            }
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                String[] p = line.split(COMMA_DELIMITER);
                System.out.println("Borrower id = " + p[0] + " , Borrower name = " + p[1] + " , Borrower address = " + p[2] + " , Borrower phone = " + p[3] );
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException exception) {
                    System.err.println(exception);
                }
            }
        }
    }
}
