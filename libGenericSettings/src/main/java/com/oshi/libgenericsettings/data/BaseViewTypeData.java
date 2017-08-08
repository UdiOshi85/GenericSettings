package com.oshi.libgenericsettings.data;

/**
 * Created by udios on 20/06/2017.
 */
public abstract class BaseViewTypeData {

    public static final int VIEW_TYPE_SETTINGS_HEADER = 1;
    public static final int VIEW_TYPE_SETTINGS_TITLE_SUBTITLE = 2;
    public static final int VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH = 3;
    public static final int VIEW_TYPE_SETTINGS_DIVIDER = 4;
    public static final int VIEW_TYPE_SETTINGS_TITLE_SWITCH = 5;
    public static final int VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE = 7;
    public static final int VIEW_TYPE_SETTINGS_TITLE = 8;
    public static final int VIEW_TYPE_SETTINGS_ICON_TITLE = 9;
    public static final int VIEW_TYPE_SETTINGS_TITLE_SECONDARY_TITLE = 10;


    public abstract int getViewType();

}
