package stack;

public class Main {

	public static void main(String[] args)
	{
		Stack bookStack = new Stack(5);
		
		bookStack.push(new Book("Book Title 1", "Author 1", "Fantasy"));
		bookStack.push(new Book("Book Title 2", "Author 2", "Horror"));
		bookStack.push(new Book("Book Title 3", "Author 3", "Romance"));
		bookStack.push(new Book("Book Title 4", "Author 4", "Sci-Fi"));
		bookStack.push(new Book("Book Title 5", "Author 5", "Thriller"));
		
		Book[] allBooks =  bookStack.getBooks();
		
		for (int i = 0; i < allBooks.length; i++)
		{
			System.out.println("Livro no topo do pilha: "+ bookStack.top().getTitle());

			Book removedBook = bookStack.pop();
			
			System.out.println("Livro removido do topo do pilha: "+ removedBook.getTitle());
		}
	}

}
