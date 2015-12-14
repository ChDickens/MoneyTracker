package com.loftschool.moneytracker;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
        final View mainView = inflater.inflate(R.layout.expenses_fragment, container, false);

        RecyclerView expensesRecyclerView = (RecyclerView) mainView.findViewById(R.id.context_recycler_view);
        List<Expense> AdapterData = getDataList();
        expensesAdapter = new ExpensesAdapter(AdapterData);
        expensesRecyclerView.setAdapter(expensesAdapter);

        // GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        // gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        // expensesRecyclerView.setLayoutManager(gridLayoutManager);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager((getActivity()));
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        expensesRecyclerView.setLayoutManager(linearLayoutManager);

        FloatingActionButton floatingActionButton = (FloatingActionButton) mainView.findViewById(R.id.fab);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(mainView, "Nice", Snackbar.LENGTH_SHORT).show();
            }
        });


        getActivity().setTitle(R.string.nav_drawer_expenses);

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
