package Q1.Prog52aCL;

public class Cl52a {// rectangle (Helper Class)
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    // input section(Constructor/Setters)
    public Cl52a(int len, int wid){
        // Set up private data
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;

    }

    // Calculations Section(Mutators)
    public void calc(){
        myArea = myLen*myWid;
        myPerim = myArea*2 + myLen*2;
    }
    // Output Section (Accessors/Getters)
    public int getArea(){return myArea;}
    public int getPerim(){return myPerim;}
}
