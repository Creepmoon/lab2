package org.example.SecondLab;

public class BookBox implements Box{

    Book book = new Book();

    @Override
    public Book open() {
        return book;
    }

    @Override
    public void put(Object item) {

        if(item.getClass().equals(Book.class))
            this.book = (Book) item;

    }

    @Override
    public Book removeFromBox() {
        Book bookBuffer = book;
        book =null;
        return bookBuffer;
    }
}
