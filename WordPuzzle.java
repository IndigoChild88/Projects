 /**  * CS 111 Section .003
  * Lab Assignment 2
  *  Albert Nunez  **/  


import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;
public class WordPuzzle {

	
	public static Scanner sc;
	public static int row=0;
	public static int col=0;
	public static void main(String[] args){
		char[][] Puzzle=null;
		char[][] temp = fill(Puzzle);
		Puzzle=temp;
		printPuzzle(Puzzle);
		System.out.println("");
		System.out.println("Please enter a word to be search");
		
		sc=new Scanner(System.in);
		String Word=sc.nextLine();
		System.out.println("");
		play(Word,Puzzle);

		
	}
	/////////////////////////////////////////////////////////////////////////
	/// Fill method used to add charaters from a fill and place them into an array
	public static char[][] fill(char[][] puzzle){
		System.out.println("Please enter a file PATH name below");
		System.out.println("");
		sc=new Scanner(System.in);
		String file =sc.nextLine();
		//String file="puzzleFile.txt";
		//String file="/Downloads/puzzleFile.txt";
		try {//Downloads
			sc=new Scanner(new File(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		row=sc.nextInt(); col=sc.nextInt();
		puzzle=new char[row][col];
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				puzzle[i][j]=sc.next().charAt(0);
			}
		}



		return puzzle;
		
	}
	////////////////////////////////////////////////////////////////////////
	///  PRINTS OUT THE CHAR ARRAY 
	public static void printPuzzle(char[][] puzzle){
		String[][] str=new String[puzzle.length][puzzle[0].length];
		for(int i=0; i<row; i++)
		{	
			for(int j=0; j<col; j++){	
				System.out.print(puzzle[i][j]+" ");	
			}
			System.out.println("");
		}	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	////  THE PLAY METHOD SEARCH A WORD IN THE PUZZLE
	public static void play(String word, char[][] puzzle){
		boolean check=false; boolean conti=true;
		int r=0; int c=0;
		char temp=word.charAt(0);
		for(int i=0; i<row; i++)
		{	
			for(int j=0; j<col; j++){	
			if (puzzle[i][j]==temp && conti==true) {	
			if ((checkDown(puzzle,word,i,j)||(checkRight(puzzle,word,i,j)))){
				check=true;
				conti=false;
				}else{check=false;
			
				}
				
		}	
	}}
		if (check==false) {
			System.out.println("The word "+word +" isn't in the puzzle");
			}else{System.out.println("The word "+word+" IS in the puzzle");
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	/// LOOKS DOWN A ROW TO SEE IF THE WORD IS IN THE PUZZLE
	public static boolean checkDown(char[][] puzzle, String word, int row, int col){
		boolean check=false; boolean cont=true;
		int temp=word.length();   int z=0;
		for (int i=row; i<puzzle.length;i++){
			if(cont==true){
			
			if(puzzle[i][col]==word.charAt(z)){
				cont=true;
				check=true;
				//System.out.println(puzzle[i][col]+"   matches this  " +word.charAt(z));
			}else { cont=false; check=false;
			}
			if(z==word.length()-1){
				cont=false;
			}
			
			}	z++;
		}	//System.out.println("This "+word+" is:: "+check);
		return check;
		
	}//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/// LOOKS TO THE RIGHT OF A ROW TO CHECK IF THE WORD IS IN A PUZZLE
	public static boolean checkRight(char[][] puzzle, String word, int row, int col){
		
		boolean check=false; boolean cont=true;
		int temp=word.length();   int z=0;
		for (int i=col; i<puzzle[0].length;i++){
			if (cont==true){
			
			if(puzzle[row][i]==word.charAt(z)){
				cont=true;
				check=true;
		//System.out.println(puzzle[row][i]+"   matches this  " +word.charAt(z));
			}else { cont=false; check=false;
			}
			if(z==word.length()-1){
				cont=false;
			}
			}z++;
			
		}
		//System.out.println("This "+word+" is:: "+check);
		return check;

	}
}
