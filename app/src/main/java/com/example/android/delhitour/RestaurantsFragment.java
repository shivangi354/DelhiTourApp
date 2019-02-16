package com.example.android.delhitour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by SWEEKASH on 30-10-2018.
 */

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
        //Empty Constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.rest1, R.string.loc6, R.drawable.coffee));
        places.add(new Places(R.string.rest2, R.string.loc7, R.drawable.food));
        places.add(new Places(R.string.rest3, R.string.loc2, R.drawable.pizza));
        PlacesAdapter Adapter = new PlacesAdapter(getActivity(), places, R.color.colorAccent);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(Adapter);
        return rootView;
    }
}
