package Q2.ArrayList;

public class IntArrayList {

    private int[] myArray;
    private int mySize;
    private int myCapacity;
    private final int DEFAULT_SIZE = 16;

    public IntArrayList(){
        myArray = new int[DEFAULT_SIZE];
        mySize=0;
        myCapacity=DEFAULT_SIZE;
    }
    private void doubleCapacity(){
        myCapacity *=2;
        int [] temp = new int[myCapacity];
        for(int lcv = 0; lcv<mySize; lcv++){
            temp[lcv] = myArray[lcv];
        }
        myArray=temp;
    }
    private void half_cap(){
        myCapacity /= 2;
        int [] temp = new int[myCapacity];
        for(int lcv = 0; lcv<mySize; lcv++){
            temp[lcv] = myArray[lcv];
        }
        myArray=temp;
    }
    public void add(int num){
        if (mySize + 1 == myCapacity) doubleCapacity();
        myArray[mySize] = num;
        mySize++;
    }
    public void remove(int index){
        for (int lcv = 1; lcv<mySize; lcv++ ){
            myArray[lcv - 1] = myArray[lcv];
        }
        mySize--;
        if (mySize <= (myCapacity * 0.25))half_cap();
    }

    public int get(int index) {
        return myArray[index];
    }
    public void set(int index, int num){
         myArray[index] = num;
    }
    public int size(){
        return mySize;
    }
    public int[] toArray(){
        return myArray;
    }
    public int indexOf(int num){
        int setter = -1;
        for(int lcv = 0; lcv<mySize; lcv++){
            if (num==myArray[lcv]){
                setter = lcv;
            }
        } return setter;
    }
}
