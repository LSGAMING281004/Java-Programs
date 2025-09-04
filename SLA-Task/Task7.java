package JavaTask;

//Create a class Book with three constructors:
//A default constructor
//A constructor with one parameter title
//A constructor with two parameters title and author
class Book{
	String intro;
	Book(){
		this.intro = "Default Constactor - Book";
	}
	Book(String title){
		this.intro = "Book title:"+title;
	}
	Book(String title,String author){
		this.intro = "Book title&author:"+title+" & "+author;
	}
	
	void display() {
		System.out.println(intro);
	}
}
public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("Become a dev","Steve");
		book.display();
		
	}

}
