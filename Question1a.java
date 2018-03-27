package Exemple.WeSrudy;


import java.io.File;
import java.util.*;

import org.junit.Test;


public class Question1a {
	private Scanner x ; 


	public static void main(String[] args) {
		
		 
		File file = new File ("/Users/stanislavzinchenko/Desktop/Dictionary.txt");
		
		if(file.exists()) 
			
			System.out.println("File exist ");
			
		else 
			
			System.out.println("This file does not exist ");
		
		    final Formatter x;
		    
		try {
			x = new Formatter("words.txt");
			
			System.out.println("file created ");
		
		}
		catch (Exception  e) {
			
			System.out.println("You got an error ");
			
		}
	 
				 
			 }
		
			 
		 }
			 
		
	


	

	


