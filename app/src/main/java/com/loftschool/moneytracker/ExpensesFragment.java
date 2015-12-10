package com.loftschool.moneytracker;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Alexey on 09.12.2015.
 */
public class ExpensesFragment extends Fragment {
    private ExpensesAdapter expensesAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.expenses_fragment, container, false);

        ListView expensesListView = (ListView) mainView.findViewById(R.id.list_view);
        List<Expense> AdapterData = getDataList();
        expensesAdapter = new ExpensesAdapter(getActivity(), AdapterData);
        expensesListView.setAdapter(expensesAdapter);
        getActivity().setTitle("Траты");

        return mainView;
    }
    private List<Expense> getDataList(){
        List<Expense> data = new ArrayList<>();
        long time = Calendar.getInstance().getTimeInMillis();
        data.add(new Expense("Telephone", 1000, new Date(time)));
        data.add(new Expense("Clothes", 2000, new Date(time)));
        data.add(new Expense("Flat", 500, new Date(time)));
        data.add(new Expense("PC", 750, new Date(time)));


        return data;


    }
}
