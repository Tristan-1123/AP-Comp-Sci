package Q2.Prog214bCl;

import Q2.Prog402aCl.Cl402a;

public class Cl214b {
    private int em_num;
    private double y_t_d;
    private double b_p_r;
    private double s_c;
    private double hours;

    private double gross;
    private double with;
    private double soc_tax;
    private double net_pay;

    public Cl214b(int employee_number, double year_to_date_pay,double base_pay_rate,double shift_code, double hours_worked){
          em_num=employee_number;
          y_t_d=year_to_date_pay;
          b_p_r=base_pay_rate;
          s_c=shift_code;
          hours=hours_worked;
    }
    public void calc(){
        gross = hours*(b_p_r*s_c);
        if (gross <100)with = 0;
        else if (gross <149.99 && gross >100)with = 0.08;
        else if (gross <199 && gross >150) with = 0.12;
        else if (gross < 200 && gross>299.99)with = 0.15;
        else with = 0.17;
        with *= gross;
        if (y_t_d>17300)soc_tax = 0;
        else if (y_t_d<=17300 && (y_t_d+gross)>17300) soc_tax = ((y_t_d+gross)-17300)*0.0605;
        else soc_tax = gross*0.0605;
        net_pay = (gross - with) - soc_tax;

    }
    public String toString(){
        return "Employee Numner: "+ em_num+ "\n"+ "Hours: "+ hours+ "\t"+ "rate: " + b_p_r+ "\t"+ "Shift Factor: " + s_c
                + " \n"+ "Gross Pay: " +"\t"+ gross+"\t" + "YTD: " +y_t_d+"\n" + "Witholding : " + with+"\n"+ "FICA: " +soc_tax+
                "\n" + "net pay: "+ net_pay;
    }
}
