package com.example.android.delhitour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by SWEEKASH on 30-10-2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mcontext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mcontext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if(position==2)
            return new EntertainmentFragment();
        else
            return new ShoppingFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mcontext.getString(R.string.attraction);
        } else if (position == 1) {
            return mcontext.getString(R.string.restaurants);
        } else if(position==2){
            return mcontext.getString(R.string.entertainment);
        }
        else
            return mcontext.getString(R.string.shopping);
    }
}

