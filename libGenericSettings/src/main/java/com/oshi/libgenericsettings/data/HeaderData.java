package com.oshi.libgenericsettings.data;

/**
 * Settings Header data object. Being use in layout/view_type_header.xml
 */
public class HeaderData extends BaseViewTypeData {

    private String headerName;
    private int headerColor;

    public HeaderData() {

    }

    public HeaderData(String headerName, int headerColor) {
        this.headerName = headerName;
        this.headerColor = headerColor;
    }

    public HeaderData(String headerName) {
        this.headerName = headerName;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public int getHeaderColor() {
        return headerColor;
    }

    public void setHeaderColor(int headerColor) {
        this.headerColor = headerColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_HEADER;
    }
}
