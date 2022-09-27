package magar.atul.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	String standard;
	String book;
	boolean bookReturned;
	
	public Student() {
	}

	public Student(String name, String standard, String book, boolean bookReturned) {
		this.name = name;
		this.standard = standard;
		this.book = book;
		this.bookReturned = bookReturned;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public boolean isBookReturned() {
		return bookReturned;
	}

	public void setBookReturned(boolean bookReturned) {
		this.bookReturned = bookReturned;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + ", book=" + book + ", bookReturned="
				+ bookReturned + "]";
	}
	
	
	
}
