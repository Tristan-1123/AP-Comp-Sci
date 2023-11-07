package Q2;

public class ArrayTest {
    public static void main(String[] args) {
        int [] nums = new int [100];
        for (int lcv = 0; lcv<100; lcv++){
            nums[lcv] = lcv +1;
        }
        for (int lcv = 0; lcv<100; lcv++){
            System.out.println(nums[lcv] + " ");
        }System.out.println();
        char [] hello = "Hello, World1".toCharArray();
        //for-each loop
        //for (var x in array){}
        for (char x : hello)System.out.print(x);
        System.out.println();

        String [] words ={"Hello", "World", "Wow", "Cool", "Wowsers", "Cool Beans"};
        // for
        for (int lcv=0; lcv<words.length; lcv++)System.out.print(words[lcv]);

}}
