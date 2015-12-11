package com.loftschool.moneytracker;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alexey on 10.12.2015.
 */
public class Category {
    public String title;


    public Category(String title){
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
