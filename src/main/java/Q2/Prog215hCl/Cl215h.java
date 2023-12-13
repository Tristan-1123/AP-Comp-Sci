package Q2.Prog215hCl;

public class Cl215h {
    private double[] con;

    private int high_lcv;
    private int low_lcv;

    private double av_score;

    public  Cl215h(double[] contestant){
        con = contestant;
    }
    public void calc(){
        high_lcv=0;
        low_lcv=0;
        for(int lcv = 0; lcv< con.length; lcv++){
            for(int lcv2 = 0; lcv2<con.length-1; lcv2++){
                if (con[lcv2] > con[lcv2+1]){
                    double temp = con[lcv2];
                    con[lcv2]=con[lcv2+1];
                    con[lcv2+1] = temp;
                }
            }
        }
//        bubble sort from 435g
//        for (int lcv=0; lcv<count; lcv++){
//            for(int lcv2 = 0; lcv2<count-1; lcv2++){
//                if (scores[lcv2] > scores[lcv2+1]){
//                    int temp = scores[lcv2];
//                    scores[lcv2]= scores[lcv2+1];
//                    scores[lcv2+1] = temp;
//                }
//            }}
    }
    public double[] getcon(){return con;}
}
