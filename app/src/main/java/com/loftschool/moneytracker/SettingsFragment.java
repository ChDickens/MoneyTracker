package com.loftschool.moneytracker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

/**
 * Created by Alexey on 10.12.2015.
 */
public class SettingsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.settings_fragment , container, false);

        ListView settingsListView = (ListView) mainView.findViewById(R.id.list_view);
        getActivity().setTitle(R.string.nav_drawer_settings);

        return mainView;
    }
}
