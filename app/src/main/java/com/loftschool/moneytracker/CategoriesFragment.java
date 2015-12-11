package com.loftschool.moneytracker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Alexey on 10.12.2015.
 */
public class CategoriesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.categories_fragment , container, false);

        ListView categoriesListView = (ListView) mainView.findViewById(R.id.list_view);
        List<Category> adapterList = getDataList();
        CategoriesAdapter categoriesAdapter = new CategoriesAdapter(getActivity(), adapterList);
        categoriesListView.setAdapter(categoriesAdapter);
        getActivity().setTitle(R.string.nav_drawer_categories);

        return mainView;
    }
    private List<Category> getDataList(){
        List<Category> data = new ArrayList<>();
        data.add(new Category("Electronics"));
        data.add(new Category("Food"));
        data.add(new Category("Clothes"));
        data.add(new Category("Books"));


        return data;


    }
}
