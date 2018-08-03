package com.datastructers.examples;

import java.util.Scanner;

public class MatrixAddition {

/*	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the no of rows");
		int rows=scanner.nextInt();
		System.out.println("enter the no of columns");
		int columns=scanner.nextInt();
		
		int[][] matrix1=new int[rows][columns];
		int[][] matrix2=new int[rows][columns];
		
		System.out.println("enter the elements of 1st matrix");
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				matrix1[i][j]=scanner.nextInt();
			}
		}

		System.out.println("enter the elements of secon matrix");
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				matrix2[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("display matrix 1");
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				System.out.println(matrix1[i][j]+ "");
			}
		}
		
		System.out.println("display matrix 2");
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				System.out.println(matrix2[i][j]+"");
			}
		}
		
		System.out.println("ADDITION");
		int[][] resultMatrix=new int[rows][columns];
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				resultMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		System.out.println("SUBSTRACTION");
		int[][] resultMatrix=new int[rows][columns];
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				resultMatrix[i][j]=matrix1[i][j]-matrix2[i][j];
			}
		}
		
		System.out.println("displya result");
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				System.out.println(resultMatrix[i][j]+ "");
			}
		}
	}

}
*/
	
	
	 public static void main(String...args) {
         
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number of rows/columns in matrix : ");    //rows and columns in matrix must be same.
         int rows = scanner.nextInt();
         int columns=rows;
         int[][] matrix = new int[rows][rows];
         
         System.out.println("Enter the elements in matrix :");
         for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                      matrix[i][j] = scanner.nextInt();
                }
         }

         //Logic to calculate sum of elements above diagonal.
         int sum=0;
         for (int j = 1; j < columns; j++) {
        	 System.out.println("j:"+j);
        	 System.out.println("colum:"+columns);
     
                for (int i=j-1 ; i>=0 ; i--) {
                	System.out.println("i:"+i);
                  	System.out.println("j:"+j);
        
                      sum= sum + matrix[i][j];
                      
                      System.out.println("i and j:" +matrix[i][j]);
                      System.out.println("sum:"+sum);
                }
                
         }

         System.out.println("\nMatrix is : ");
         for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                      System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
         }

         System.out.println("sum of elements above diagonal is: "+sum);

  }
}