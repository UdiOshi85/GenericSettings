package com.oshi.libgenericsettings.data;

/**
 * Created by udioshi on 8/7/2017.
 */
public class IconTitleData extends TitleData {

    private int iconResId;


    public IconTitleData(String title) {
        super(title);
    }

    public IconTitleData(String title, int titleColor) {
        super(title, titleColor);
    }

    public IconTitleData(int iconResId, String title, int titleColor) {
        super(title, titleColor);
        this.iconResId = iconResId;
    }

    public int getIconResId() {
        return iconResId;
    }

    public void setIconResId(int iconResId) {
        this.iconResId = iconResId;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_ICON_TITLE;
    }
}
