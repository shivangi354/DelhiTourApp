package com.example.android.delhitour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by SWEEKASH on 01-11-2018.
 */

public class ShoppingFragment extends Fragment {
    public ShoppingFragment()
    {
        //empty constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.shop1,R.string.loc10));
        places.add(new Places(R.string.shop2, R.string.loc1));
        PlacesAdapter Adapter = new PlacesAdapter(getActivity(), places, R.color.colorAccent);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(Adapter);
        return rootView;
    }
}
