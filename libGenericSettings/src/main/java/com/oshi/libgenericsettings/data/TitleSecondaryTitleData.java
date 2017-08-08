package com.oshi.libgenericsettings.data;

public class TitleSecondaryTitleData extends TitleData {

    private String secondaryTitle;
    private int secondaryTitleColor;


    public TitleSecondaryTitleData(String title, String secondaryTitle) {
        super(title);
        this.secondaryTitle = secondaryTitle;
    }

    public TitleSecondaryTitleData(String title, int titleColor, String secondaryTitle, int secondaryTitleColor) {
        super(title, titleColor);
        this.secondaryTitle = secondaryTitle;
        this.secondaryTitleColor = secondaryTitleColor;
    }

    public String getSecondaryTitle() {
        return secondaryTitle;
    }

    public void setSecondaryTitle(String secondaryTitle) {
        this.secondaryTitle = secondaryTitle;
    }

    public int getSecondaryTitleColor() {
        return secondaryTitleColor;
    }

    public void setSecondaryTitleColor(int secondaryTitleColor) {
        this.secondaryTitleColor = secondaryTitleColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SECONDARY_TITLE;
    }
}
