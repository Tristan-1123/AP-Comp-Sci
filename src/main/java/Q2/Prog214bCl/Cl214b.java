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

    }
}
