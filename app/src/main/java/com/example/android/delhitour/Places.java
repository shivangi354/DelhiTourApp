package com.example.android.delhitour;

/**
 * Created by SWEEKASH on 30-10-2018.
 */

public class Places {
    private int mplace;
    private int mlocation;
    private int mResourceId =no_image;
    private static final int no_image = -1;
    public Places(int place, int location, int ImageId) {
        mplace = place;
        mlocation = location;
        mResourceId = ImageId;
    }
    public Places(int place, int location) {
        mplace = place;
        mlocation = location;
    }

    public int getPlace() {
        return mplace;
    }

    public int getLocation() {
        return mlocation;
    }

    public int getmResourceId() {
        return mResourceId;
    }

    public boolean checkImage(){
        return mResourceId!=no_image;
    }
}
