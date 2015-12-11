package com.loftschool.moneytracker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alexey on 09.12.2015.
 */
public class Expense {
    public String title;
    public int sum;
    public Date date;

    public Expense(String title, int sum, Date date){
        this.title = title;
        this.sum = sum;
        this.date = date;
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

    public Date getDate() {
        return date;
    }
    public String getDateStr (){
        SimpleDateFormat dateFormat =  new SimpleDateFormat("dd.MM.yy");
        return dateFormat.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
