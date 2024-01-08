package Q2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog470a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat= new int[6][5];
            for(int row = 0; row < mat.length-1; row++)
                for (int col = 0; col < mat[0].length; col++)  // mat[row].length-1
                    mat[row][col] = input.nextInt();
                    // Read in a 5x5 matrix

            for(int row = 0; row < mat.length-1; row++){
                for(int col = 0; col < mat[0].length; col++){
                    mat[5][col] += mat[row][col]; //Sum of col
                }
            }
            for(int[] row : mat){
                for(int n : row)
                    System.out.print(n + "\t");
                System.out.println();
        }}
        catch (IOException e) {
            System.out.println("Can't find Data File!");}
}}
