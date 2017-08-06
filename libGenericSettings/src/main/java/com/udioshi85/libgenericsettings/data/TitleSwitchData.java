package com.udioshi85.libgenericsettings.data;

import com.udioshi85.libgenericsettings.R;

/**
 * Title & Switch. Being use in layout/view_type_title_switch.xml
 */
public class TitleSwitchData extends BaseViewTypeData {

    private String title;
    private int titleColor;
    private boolean isSwitchOn;

    public TitleSwitchData() {
        titleColor = R.color.black;
    }

    public TitleSwitchData(String title, boolean isSwitchOn) {
        this();
        this.title = title;
        this.isSwitchOn = isSwitchOn;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SWITCH;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSwitchOn() {
        return isSwitchOn;
    }

    public void setSwitchOn(boolean switchOn) {
        isSwitchOn = switchOn;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(int titleColor) {
        this.titleColor = titleColor;
    }
}
