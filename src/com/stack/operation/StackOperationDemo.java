package com.stack.operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * @author Anil
 *Description:Write a java program to implement stack using array,
  you may define your own push (), pop () methods
  if required, various stack operation should be part of
  the program.
 */

public class StackOperationDemo {



	    public static void main(String[] args) throws IOException {
	        Stack stk = new Stack(6);
	     
	        boolean yes=true;
	        int choice;
	        try{
	        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
	        
	        do{
	            System.out.println("1) Push\n2) Pop\n3) Peek\n4)Size\n5)Show Elements\n6)Search \n7) Exit\n\nEnter Choice");
	            choice = Integer.parseInt(is.readLine());
	            
	            switch(choice)
	            {
	                case 1: System.out.println("Enter Push Item: ");
	                        stk.pushItem(Integer.parseInt(is.readLine()));
	                        break;
	                case 2: stk.popItem();break;
	                case 3: stk.peek();break;
	                
	                case 4: stk.size();break;
	               
	                case 5:stk.showElements();break;
	                case 6: stk.search();break;
	                case 7: yes = false;break;
	                default: System.out.println("Invalid Choice");
	            }
	        }while(yes==true);
	        
	    }catch(Exception e){
	    	System.out.println("This is not number");
			  
		  }
	  }
}
	