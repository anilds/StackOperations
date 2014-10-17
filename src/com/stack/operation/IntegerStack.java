package com.stack.operation;

import java.util.Scanner;

class Stack {

    private int top;
    private int item[];
 

    Stack(int size) {
        top = -1;
        item = new int[size];
    }

    void pushItem(int data) {
        if (top == item.length - 1) {
            System.out.println("Stack is Overflow");
        } else {
            item[++top] = data;
            System.out.println("Pushed Item :" + item[top]);
           
            
        }
        
       
    }

    void showElements() {
		// TODO Auto-generated method stub
    	
    	if (top >= 0) {  
    		   System.out.println("Elements in stack :");  
    		   for (int i = 0; i <= top; i++) {  
    		    System.out.println(item[i]);  
    		   }  
    	}  
		
	}

	int popItem() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            System.out.println("Pop Item : " + item[top]);
            return item[top--];
        }
    }
    
   
    public void peek()
    {
    	 System.out.println("Peek Element :" + item[top]);
        
    }
    
    public int size( )
    {
    	System.out.println("Size Element :" + top);
    	return top;
    }

	public void search() {
		int i,search;
		Scanner in=new Scanner(System.in);
		 System.out.println("Enter value to find");
		    search = in.nextInt();
		 
		    for (i = 0; i < 6; i++)
		    {
		      if (item[i] == search)     /* Searching element is present */
		      {
		         System.out.println(search + " is present at location " + (i) + ".");
		          break;
		      }
		   }
		   if (i == 6)  /* Searching element is absent */
		      System.out.println(search + " is not present in array.");
		  }
		
    }  
		


