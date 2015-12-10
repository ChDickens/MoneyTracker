package com.loftschool.moneytracker;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

/**
 * Created by Alexey on 10.12.2015.
 */
public class CategoriesAdapter extends ArrayAdapter {

    List<Category> categories;
    public CategoriesAdapter(Context context, List<Category> categories)  {
        super(context, 0, categories);
        this.categories = categories;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Category category = (Category)getItem(position);
        Random rnd = new Random();
        int bgColor;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        RelativeLayout field = (RelativeLayout) convertView.findViewById(R.id.field_item);

        bgColor = Color.argb(60, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        field.setBackgroundColor(bgColor);

        TextView name = (TextView) convertView.findViewById(R.id.name_text);

        name.setText(category.getTitle());

        return convertView;
    }
}