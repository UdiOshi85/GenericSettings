package com.oshi.libgenericsettings;

import android.databinding.BindingAdapter;
import android.support.v7.widget.AppCompatImageView;

/**
 * Created by udioshi on 8/7/2017.
 */

public class BindingAdapterHelper {

    @BindingAdapter({"app:srcCompat"})
    public static void setImageViewResource(AppCompatImageView imageView, int resId) {
        imageView.setImageResource(resId);
    }
}
