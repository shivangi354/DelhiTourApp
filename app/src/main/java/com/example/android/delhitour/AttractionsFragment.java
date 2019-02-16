package com.example.android.delhitour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {
    public AttractionsFragment() {
        //Empty Constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.attraction1,R.string.loc1, R.drawable.india));
        places.add(new Places(R.string.attraction2, R.string.loc2, R.drawable.lotus));
        places.add(new Places(R.string.attraction3, R.string.loc3, R.drawable.humayun));
        places.add(new Places(R.string.attraction4, R.string.loc4, R.drawable.fort));
        places.add(new Places(R.string.attraction5, R.string.loc5, R.drawable.qutub));
        PlacesAdapter Adapter = new PlacesAdapter(getActivity(), places, R.color.colorAccent);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(Adapter);
        return rootView;
    }
}


