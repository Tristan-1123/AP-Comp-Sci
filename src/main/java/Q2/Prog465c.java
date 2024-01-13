package Q2;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog465c {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("Langdat/prog465c.txt"));
            int nummer= input.nextInt();
            int num=input.nextInt();
            int[][] mat = new int[nummer][num];

            for (int i = 0; i < nummer; i++) {
                for (int j = 0; j < num; j++) {
                    mat[i][j] = input.nextInt();
                }
            }
            int Rows = mat.length;
            int Cols = mat[0].length;
            int edge = 0;
            for (int j = 0; j < Cols; j++) {
                edge += mat[0][j];
                edge += mat[Rows - 1][j];
            }
            for (int i = 1; i < Rows - 1; i++) {
                edge += mat[i][0];
                edge += mat[i][Cols - 1];
            }
            System.out.println(edge);


        }
        catch (IOException e) {
            System.out.println("Can't find Data File!");
    
}}}
