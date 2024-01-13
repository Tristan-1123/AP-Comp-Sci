package Q2;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog465b {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog465b.dat"));

            int[][] mat= new int[3][4];
            for(int row = 0; row < mat.length; row++)
                for (int col = 0; col < mat[0].length; col++)  // mat[row].length-1
                    mat[row][col] = input.nextInt();
            int[][] FinArray = new int[3][2];
            int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (mat[i][j] < 100) {
                    FinArray[count][0] = i + 1; // Adjusting for 1-based index
                    FinArray[count][1] = j + 1; // Adjusting for 1-based index
                    count++;
                }
            }
        }
        System.out.println("Row\tColumn");
        for (int i = 0; i < FinArray.length; i++) {
            System.out.println(+ FinArray[i][0] + "\t\t" + FinArray[i][1]);   
        }}
        catch (IOException e) {
            System.out.println("Can't find Data File!");
    
}}}
