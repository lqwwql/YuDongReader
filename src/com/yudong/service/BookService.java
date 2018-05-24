package com.yudong.service;

import java.util.List;

import com.yudong.entity.Books;

public interface BookService {

	public boolean saveBook(Books book);//保存图书
	public List<Books> getBooks();//获取今日下载排行前七图书
	public List<Books> getClassificationBooks(Integer classificationId);//根据图书分类名称获取图书
	public List<Books> getAllBooks();
	public List<Books> getBooksByAuthor(String author);
	public List<Books> getMyBooks(String uploadPerson);
	public List<Books> getMyDeleteBooks(String uploadPerson);
	public boolean updateBookState(Books book);
	public Books findBookById(int bookId);//根据ID查找图书
	public Books findBookByName(String bookName);//根据图书名称来查找图书
	public List<Books> searchBooks(String searchBookName);
	
}
