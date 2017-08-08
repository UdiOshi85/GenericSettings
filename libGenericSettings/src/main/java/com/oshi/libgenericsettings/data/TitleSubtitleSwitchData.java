package com.oshi.libgenericsettings.data;

/**
 * Title, Subtitle & Switch. Being use in layout/view_type_title_subtitle_switch.xml
 */
public class TitleSubtitleSwitchData extends TitleSubtitleData {

    public boolean isSwitchOn;

    public TitleSubtitleSwitchData() {
    }

    public TitleSubtitleSwitchData(String title, String subtitle, boolean isSwitchOn) {
        super(title, subtitle);
        this.isSwitchOn = isSwitchOn;
    }

    public boolean isSwitchOn() {
        return isSwitchOn;
    }

    public void setSwitchOn(boolean switchOn) {
        isSwitchOn = switchOn;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH;
    }
}
