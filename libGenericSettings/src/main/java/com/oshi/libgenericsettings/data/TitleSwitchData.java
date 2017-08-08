package com.oshi.libgenericsettings.data;

import com.oshi.libgenericsettings.R;

/**
 * Title & Switch. Being use in layout/view_type_title_switch.xml
 */
public class TitleSwitchData extends TitleData {

    private int titleColor;
    private boolean isSwitchOn;

    public TitleSwitchData(String title, boolean isSwitchOn) {
        super(title);
        this.title = title;
        this.isSwitchOn = isSwitchOn;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SWITCH;
    }

    public boolean isSwitchOn() {
        return isSwitchOn;
    }

    public void setSwitchOn(boolean switchOn) {
        isSwitchOn = switchOn;
    }
}
