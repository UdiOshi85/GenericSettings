package com.udioshi85.libgenericsettings.data;

import com.udioshi85.libgenericsettings.R;

/**
 * Created by udios on 21/06/2017.
 */

public class DividerData extends BaseViewTypeData {

    public static DividerData create(int dividerColor) {
        return new DividerData(dividerColor);
    }

    public static DividerData create() {
        return new DividerData();
    }


    private int dividerColor;

    public DividerData() {
        dividerColor = R.color.divider;
    }

    public DividerData(int dividerColor) {
        this();
        this.dividerColor = dividerColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_DIVIDER;
    }

    public int getDividerColor() {
        return dividerColor;
    }

    public void setDividerColor(int dividerColor) {
        this.dividerColor = dividerColor;
    }
}
