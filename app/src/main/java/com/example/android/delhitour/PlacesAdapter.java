package com.example.android.delhitour;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SWEEKASH on 30-10-2018.
 */

public class PlacesAdapter extends ArrayAdapter<Places> {
    private int mColorResourceId;

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param places  A List of places objects to display in a list
     */
    public PlacesAdapter(Activity context, ArrayList<Places> places, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        // Get the object located at this position in the list
        final Places currentPlace = getItem(position);
        ImageView mImageView = (ImageView) listItemView.findViewById(R.id.call);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:9871504741"));
                view.getContext().startActivity(callIntent);

            }
        });
        // Find the TextView in the list_item.xml layout with the ID location
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location);
        // Get the location from the current Place object and
        // set this text on the name TextView
        nameTextView.setText(currentPlace.getLocation());

        // Find the TextView in the list_item.xml layout with the ID place.
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place);
        // set this text on the number TextView
        placeTextView.setText(currentPlace.getPlace());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentPlace.checkImage()) {
            imageView.setImageResource(currentPlace.getmResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
