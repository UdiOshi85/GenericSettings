package com.oshi.libgenericsettings.data;

/**
 * Checkbox, Title & Subtitle. Being use in layout/view_type_checkbox_title_subtitle.xml
 */

public class TitleSubtitleCheckbox extends TitleSubtitleData {

    boolean isEnabled;

    public TitleSubtitleCheckbox(String title, String subtitle) {
        super(title, subtitle);
    }

    public TitleSubtitleCheckbox(String title, String subtitle, boolean isEnabled) {
        super(title, subtitle);
        this.isEnabled = isEnabled;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE;
    }
}
