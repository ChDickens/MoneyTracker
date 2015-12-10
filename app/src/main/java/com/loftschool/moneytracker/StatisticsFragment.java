package com.loftschool.moneytracker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Alexey on 10.12.2015.
 */
public class StatisticsFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.categories_fragment , container, false);

        ListView statisticsListView = (ListView) mainView.findViewById(R.id.list_view);
        getActivity().setTitle(R.string.nav_drawer_statistics);

        return mainView;
    }
}
