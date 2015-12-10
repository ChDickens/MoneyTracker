package com.loftschool.moneytracker;

/**
 * Created by Alexey on 09.12.2015.
 */
public class Expense {
    public String title;
    public int sum;

    public Expense(String title, int sum){
        this.title = title;
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }
    public String getSumStr(){
        return Integer.toString(sum);
    }
    public void setSum(int sum){
        this.sum = sum;

    }
}
