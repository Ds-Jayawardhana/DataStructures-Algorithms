/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * 5SENG003W Algorithms
 * Week 7
 * Tutorial Exercises: Stacks
 */


package stack ;  // Change this to your own package ID

import java.util.EmptyStackException;

/**
 *
 * @author klaus (edited by Paul 10/11/21)
 */
public class ArrayStack 
{
    
    public static final int INITIAL_CAPACITY = 15;
    
    private int[] items;
    
    private int size;
    
    public ArrayStack()
    {
        items = new int[ INITIAL_CAPACITY ] ;
        size  = 0 ;
    }
    
    public void push(int newItem)
    {
        // TODO complete code
    }
    
    public int pop()
    {
        // TODO complete code
    }

    public void clear()
    {
        // TODO complete code
    }

    public String toString()
    {
        // TODO complete code
    }

    public int top()
    {
        if ( isEmpty() )
        {
            throw new EmptyStackException() ;
        }
	else
        {
            return items[ size - 1 ] ;
	}
    }
    
    public int size()
    {
        // TODO complete code
    }

    public boolean isEmpty()
    {
        // TODO complete code
    }
    
    public boolean isFull()
    {
        // TODO complete code
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
