// BookManager.aidl
package com.ipc.wg.aidldemo;
import com.ipc.wg.aidldemo.Book;

interface BookManager {

    List<Book> getBooks();
    void addBook(inout Book book);
}
