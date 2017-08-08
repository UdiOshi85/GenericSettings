package com.oshi.libgenericsettings.data;

import com.oshi.libgenericsettings.R;

/**
 * Divider line. Being use in layout/view_type_divider.xml
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
