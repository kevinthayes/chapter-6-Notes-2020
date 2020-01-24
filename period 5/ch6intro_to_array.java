/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;


public class ch6intro_to_array

{
	final static int MAX = 20;

public static void main (String[] args)
{

/**/
		mathy useful = new mathy();
		int x = 50;
		
		int [] values; // define my array
		
		values = useful.poprandomArray(MAX, 10);
		
		int [] odds = new int[values.length];
		
		int oddsSize = getOddsArray(values, odds);
		
		for(int s: odds)
		{
		    System.out.println(s);
		}
		
		oddsSize = useful.removeElement(odds, (int)oddsSize/2, oddsSize);
		//oddSize--;
		for(int s: odds)
		{
		    System.out.println(s);
		}
		
		
		/*
		 * use an enhanced for loop to print ALL item in the array
		 * do not use i, this denotes an index
		 * why is this loop different from the treditional for(int i; i<size;i++)
		 * s is a copy of the value in the array
		 * s = values[0], s = values[1] . . . . [n]
		 * advantage: will not give an out of bounds error
		 * limitations:
		 *    can not change the values int the array (values)
		 */
		/*
		for(int s: values)
		{
		    System.out.println(s);
		    s = 0;
		    
		}
		System.out.println(values[0]+"----");
		
		
/*

		System.out.println(Searches.linearSearch(num,look)  );
		Sorts.selectionSort(num);
		System.out.println(Searches.binarySearch(num,look)  );



		//for each loop
/*

		useful.getOdd(num,oddnum);




		//System.out.println("----------SORTING-----------"  );






/*
		System.out.println("Enter a number");
		int find = Keyboard.readInt();

		System.out.println(Searches. binarySearch(num,find));

   /*







 /*
 	   //make a two dementional array
 	   int [][] table = new int [5][10];

 	   // Load the table with values
 	   for (int row=0; row < table.length; row++)
 	      for (int col=0; col < table[row].length; col++)
             table[row][col] = row * 10 + col;

 	   //print the table
 	    for (int row=0; row < table.length; row++)
 	    {
 			for (int col=0; col < table[row].length; col++)
 	         	System.out.print (table[row][col] + "\t");

 	   		System.out.println();
       	}


	// make a 2d array with an iniitalizer list.
	//print the length of row and col
/*
	int [][] scores = { {1,2,3},//6
						{2,2,3},//7
						{3,2,3},//8
						{4,2,3}    };//9

	//how many columns
	System.out.println(scores[0].length+"col");
	//how many rows
	System.out.println(scores.length+"row");

	//sum entire 2D array
	System.out.print("The sum of this array is" );

	//sum a row of 2D array
	System.out.print("The sum of row "));







/**/
}// end of main

/**
 * Will take nums full of random numbers and fill the odds array with only odd values
 * @param - nums array of random values
 * @param - odds empty array
 * @return - current size (companion variable, how many values are populated in array
 */
public static int getOddsArray(int [] nums, int [] odds)
{
    int currentSize = 0;
    for(int i = 0; i<nums.length; i++)
    {
        if (nums[i] % 2 == 1)
        {
            odds[currentSize] = nums[i];
            currentSize++;
        }
    }
    
    return currentSize;
    
}

   public static int[] doubleSize(int[] array)
   {


		return array;


   }

//passing int by value
   public static void foo(int x)
   {

	   x = 100;
   }


//arrays are passed by reference
    public static void foo(int [] num)
      {

		  num[0] = 100;

      }

	/*


   public static void odd()
   {

	   int count =0;


   }// end of odd

	/*  */
}// end of class











