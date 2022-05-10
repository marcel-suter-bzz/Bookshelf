package ch.bzz.bookshelf.model;

import java.util.List;

/**
 * the publisher of one or more Books
 */
public class Publisher {
    private String publisherUUID;
    private String publisher;
    private List<Book> bookList;

    /**
     * gets publisherUUID
     *
     * @return value of publisherUUID
     */

    public String getPublisherUUID() {
        return publisherUUID;
    }

    /**
     * sets publisherUUID
     *
     * @param publisherUUID the value to set
     */

    public void setPublisherUUID(String publisherUUID) {
        this.publisherUUID = publisherUUID;
    }

    /**
     * gets publisher
     *
     * @return value of publisher
     */

    public String getPublisher() {
        return publisher;
    }

    /**
     * sets publisher
     *
     * @param publisher the value to set
     */

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * gets bookList
     *
     * @return value of bookList
     */

    public List<Book> getBookList() {
        return bookList;
    }

    /**
     * sets bookList
     *
     * @param bookList the value to set
     */

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
