package Q2;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.print.attribute.standard.MediaSize.Other;
public class Prog470b {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat= new int[6][5];
            for(int row = 0; row < mat.length-1; row++)
                for (int col = 0; col < mat[0].length; col++)  // mat[row].length-1
                    mat[row][col] = input.nextInt();
                    // Read in a 5x5 matrix
            System.out.println(mat);
            int count=0;
            int count2=0;
            for (int i = 0; i < 5; i++) {
            count += mat[i][i];
                    }
            for (int i = 0; i < 5; i++) {
                count2 += mat[i][4 - i];
            }
        
            System.out.println("Main Diagonal Sum ");
            System.out.println(count); 
            System.out.println("Other Diagonal Sum ");
            System.out.println(count2);
        }
        catch (IOException e) {
            System.out.println("Can't find Data File!");
    
}}}
