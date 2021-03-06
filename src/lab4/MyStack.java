package lab4;

import java.util.Arrays;

/** 
 * @author g Adam Buckley (20062910)
 * @version 1.0
 * @Date - Start Date: 09/02/2016
 * @Date - End Date: 16/02/2016
 */

public class MyStack {

	private String[] myStackArray;

	private int stackSize;

	private int theTopOfStack = 0;

	public MyStack(int sizeOfStack)
	{
		stackSize = sizeOfStack;

		myStackArray = new String[sizeOfStack];

		Arrays.fill(myStackArray, "0");
	}

	public void push (String input)
	{
		if(theTopOfStack + 1 < stackSize)
		{
			// the following increment happens after current the theTopOfStack variable has been used.
			myStackArray[theTopOfStack++] = input;
		}
		else
		{
			System.out.println("Stack is full, cannot add this on");

			System.out.println(input + " was added to the stack.");
		}
	}

	public String pop()
	{
		if (theTopOfStack >= 0)
		{
			System.out.println(myStackArray[theTopOfStack-1] + " was removed from the stack");

			//myStackArray[theTopOfStack-1] = "0";

			// The following decrement happens before the theTopOfTheSTack variable is used to get the position
			// in the myStackArray to return.
			return myStackArray[--theTopOfStack];
		}
		else
		{
			System.out.println("the stack is empty");
			return null;
		}
	}

	public String peek()
	{
		if (theTopOfStack > 0)
		{
			System.out.println("peek: " + myStackArray[theTopOfStack-1] + " is at the top of the stack");
			return myStackArray[theTopOfStack-1];
		}
		else
		{
			return null;
		}
	}

	public boolean isEmpty()
	{
		if (theTopOfStack == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}