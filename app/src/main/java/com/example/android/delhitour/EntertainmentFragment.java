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

public class EntertainmentFragment extends Fragment {
    public EntertainmentFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.ent1, R.string.loc8, R.drawable.paintball));
        places.add(new Places(R.string.ent2, R.string.loc1, R.drawable.movie));
        places.add(new Places(R.string.ent3, R.string.loc9, R.drawable.mystery));
        places.add(new Places(R.string.ent4, R.string.loc10, R.drawable.comedy));
        PlacesAdapter Adapter = new PlacesAdapter(getActivity(), places, R.color.colorAccent);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(Adapter);
        return rootView;
    }
}
