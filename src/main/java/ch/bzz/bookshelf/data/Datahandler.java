package ch.bzz.bookshelf.data;

import ch.bzz.bookshelf.model.Book;
import ch.bzz.bookshelf.model.Publisher;
import ch.bzz.bookshelf.service.Config;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * reads and writes the JSON data
 */
public class Datahandler {
    /**
     * reads a book by its key
     * @param bookUUID  the key
     * @return Book-Object (null = not found)
     */
    public Book readBookByUUID(String bookUUID) {
        Book book = null;
        Book[] books = readBookJSON();
        for (Book object : books) {
            if (object.getBookUUID().equals(bookUUID)) {
                book = object;
            }
        }
        return book;
    }


    /**
     * reads all books as a list
     * @return  list of Books
     */
    public List<Book> readBookList() {
        List<Book> bookList = new ArrayList<>();
        Book[] books = readBookJSON();
        for (Book book : books) {
            bookList.add(book);
        }

        return bookList;
    }

    /**
     * reads a book by its key
     * @param publisherUUID  the key
     * @return Book-Object (null = not found)
     */
    public Publisher readPublisherByUUID(String publisherUUID) {
        Publisher publisher = null;

        return publisher;
    }


    /**
     * reads all publishers as a list
     * @return  list of Publishers
     */
    public List<Publisher> readPublisherList() {
        List<Publisher> publisherList = new ArrayList<>();
        Publisher[] publishers = readPublisherJSON();
        for (Publisher publisher : publishers) {
            publisherList.add(publisher);
        }

        return publisherList;
    }

    /**
     * reads the books from the JSON file
     * @return Array of Book
     */
    private static Book[] readBookJSON() {
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get(Config.getProperty("bookJSON")));
            ObjectMapper objectMapper = new ObjectMapper();
            Book[] books = objectMapper.readValue(jsonData, Book[].class);
            return books;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * reads the publishers from the JSON file
     * @return Array of Publisher
     */
    private static Publisher[] readPublisherJSON() {
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get(Config.getProperty("publisherJSON")));
            ObjectMapper objectMapper = new ObjectMapper();
            Publisher[] publishers = objectMapper.readValue(jsonData, Publisher[].class);
            return publishers;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
