package com.oshi.libgenericsettings.data;


/**
 * Settings Title & Subtitle data. Being use in layout/view_type_title_subtitle.xml
 */
public class TitleSubtitleData extends BaseViewTypeData {

    protected String title;
    protected String subtitle;
    protected int titleColor;
    protected int subtitleColor;

    public TitleSubtitleData() {

    }

    public TitleSubtitleData(String title, String subtitle) {
        this();
        this.title = title;
        this.subtitle = subtitle;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SUBTITLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(int titleColor) {
        this.titleColor = titleColor;
    }

    public int getSubtitleColor() {
        return subtitleColor;
    }

    public void setSubtitleColor(int subtitleColor) {
        this.subtitleColor = subtitleColor;
    }
}
