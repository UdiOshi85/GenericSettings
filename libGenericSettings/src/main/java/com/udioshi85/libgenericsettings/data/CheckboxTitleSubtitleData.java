package com.udioshi85.libgenericsettings.data;

/**
 * Checkbox, Title & Subtitle. Being use in layout/view_type_checkbox_title_subtitle.xml
 */

public class CheckboxTitleSubtitleData extends TitleSubtitleData {

    boolean isEnabled;

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
