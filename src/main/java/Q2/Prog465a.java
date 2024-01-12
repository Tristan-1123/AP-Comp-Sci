package Q2;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog465a {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog465a.dat"));
            int[][] mat= new int[4][4];
            for(int row = 0; row < mat.length; row++)
                for (int col = 0; col < mat[0].length; col++)  // mat[row].length-1
                    mat[row][col] = input.nextInt();
            int[][] mat2= new int[4][4];
            for(int row = 0; row < mat.length; row++)
                for (int col = 0; col < mat2[0].length; col++)  // mat[row].length-1
                    mat2[row][col] = input.nextInt();
            
            int[][] Endo = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    Endo[i][j] = Math.max(mat[i][j], mat2[i][j]);
                    }
                 }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(" " + Endo[i][j]);
                } 
            System.out.println();}}

        catch (IOException e) {
            System.out.println("Can't find Data File!");
    
}   

    }}