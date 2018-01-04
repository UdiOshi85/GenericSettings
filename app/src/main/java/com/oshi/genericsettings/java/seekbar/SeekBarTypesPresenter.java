package com.oshi.genericsettings.java.seekbar;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.View;

import com.oshi.genericsettings.R;
import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.HeaderData;
import com.oshi.libgenericsettings.data.TitleIconSeekBarTextData;
import com.oshi.libgenericsettings.data.TitleSeekBarMinMaxData;
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter;

import java.util.ArrayList;
import java.util.List;


public class SeekBarTypesPresenter extends BaseSettingsPresenter {

    private static final int POSITION_HEADER = 0;
    private static final int POSITION_ICON_TITLE_SEEKBAR_VALUE = 1;
    private static final int POSITION_TITLE_SEEKBAR_MIN_MAX = 2;
    private static final int POSITION_COLORED_HEADER = 3;
    private static final int POSITION_COLORED_ICON_TITLE_SEEKBAR_VALUE = 4;
    private static final int POSITION_COLORED_TITLE_SEEKBAR_MIN_MAX = 5;


    private CoordinatorLayout coordinatorLayout;
    private OnSettingsChangedListener onSettingsChangedListener;

    public SeekBarTypesPresenter(CoordinatorLayout coordinatorLayout, OnSettingsChangedListener l) {
        this.coordinatorLayout = coordinatorLayout;
        this.onSettingsChangedListener = l;
    }

    @Override
    public List<BaseViewTypeData> getItems(Context context) {

        List<BaseViewTypeData> items = new ArrayList<>();

        HeaderData headerData = new HeaderData("SEEKBAR TYPES");
        items.add(POSITION_HEADER, headerData);

        TitleIconSeekBarTextData titleIconSeekBarTextData = new TitleIconSeekBarTextData(100, R.drawable.ic_android_black_24dp, "Icon, Title, SeekBar & Value text");
        items.add(POSITION_ICON_TITLE_SEEKBAR_VALUE, titleIconSeekBarTextData);

        TitleSeekBarMinMaxData titleSeekBarMinMaxData = new TitleSeekBarMinMaxData("Min & Max SeekBar", -80, -20, -50);
        items.add(POSITION_TITLE_SEEKBAR_MIN_MAX, titleSeekBarMinMaxData);

        HeaderData coloredHeaderData = new HeaderData("COLORED SEEKBAR TYPES");
        coloredHeaderData.setHeaderColor(R.color.red);
        items.add(POSITION_COLORED_HEADER, coloredHeaderData);

        TitleIconSeekBarTextData coloredTitleIconSeekBarTextData = new TitleIconSeekBarTextData(100, R.drawable.ic_android_black_24dp, "Colored Icon, Title, SeekBar & Value");
        coloredTitleIconSeekBarTextData.setSeekBarThumbColor(R.color.blue);
        coloredTitleIconSeekBarTextData.setSeekBarColor(R.color.cyan);
        coloredTitleIconSeekBarTextData.setProgressTextColor(R.color.blue);
        coloredTitleIconSeekBarTextData.setTitleColor(R.color.blue);
        items.add(POSITION_COLORED_ICON_TITLE_SEEKBAR_VALUE, coloredTitleIconSeekBarTextData);

        TitleSeekBarMinMaxData coloredTitleSeekBarMinMaxData = new TitleSeekBarMinMaxData("Colored Min & Max SeekBar", 20, 80, 50);
        coloredTitleSeekBarMinMaxData.setTitleColor(R.color.orange);
        coloredTitleSeekBarMinMaxData.setSeekBarColor(R.color.lights_orange);
        coloredTitleSeekBarMinMaxData.setSeekBarThumbColor(R.color.orange);
        coloredTitleSeekBarMinMaxData.setMinMaxColor(R.color.red);
        items.add(POSITION_COLORED_TITLE_SEEKBAR_MIN_MAX, coloredTitleSeekBarMinMaxData);

        return items;
    }

    @Override
    public void onTitleSeekBarMinMaxChanged(View view, TitleSeekBarMinMaxData data, int position) {
        Snackbar.make(coordinatorLayout, "Progress changed: " + data.getRealProgress(), Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void onTitleIconSeekBarTextChanged(View view, TitleIconSeekBarTextData data, int position) {
        Snackbar.make(coordinatorLayout, "Progress changed: " + data.getSeekBarCurrentProgress(), Snackbar.LENGTH_SHORT).show();
    }
}
