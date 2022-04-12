package lord.dev.librarymanagementsystem.service;


import lord.dev.librarymanagementsystem.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {

	public List<Book> findAllBooks();
	
	public List<Book> searchBooks(String keyword);

	public Book findBookById(Long id);

	public void createBook(Book book);

	public void updateBook(Book book);

	public void deleteBook(Long id);

}
