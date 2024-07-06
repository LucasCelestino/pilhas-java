package stack;

import java.util.EmptyStackException;

public class Stack
{
	private Book[] books;
	private int top;
	
	public Stack(int stackSize)
	{
		books = new Book[stackSize];
		top = -1;
	}
	
	public void push(Book newItem)
	{
		if(isFull())
		{
			throw new StackOverflowError("A pilha está cheia!");
		}
		
		top++;
		
		books[top] = newItem;
	}
	
	public Book pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		
		Book removedElement = books[top];
		
		top--;
		
		return removedElement;
	}
	
	public int size()
	{
		return books.length;
	}
	
	public Book top()
	{
		return books[top];
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == (books.length - 1);
	}

	public Book[] getBooks()
	{
		return books;
	}
}