package com.udioshi85.libgenericsettings.data;

import com.udioshi85.libgenericsettings.R;

/**
 * Settings Header data object. Being use in layout/view_type_header.xml
 */
public class HeaderData extends BaseViewTypeData {

    private String headerName;
    private int headerColor;

    public HeaderData() {
        // Default color is black
        headerColor = R.color.black;
    }

    public HeaderData(String headerName, int headerColor) {
        this();
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
