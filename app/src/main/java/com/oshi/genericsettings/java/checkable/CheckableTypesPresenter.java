package com.oshi.genericsettings.java.checkable;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.View;

import com.oshi.genericsettings.R;
import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.HeaderData;
import com.oshi.libgenericsettings.data.TitleCheckboxData;
import com.oshi.libgenericsettings.data.TitleSubtitleCheckboxData;
import com.oshi.libgenericsettings.data.TitleSubtitleExtraCheckboxData;
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter;

import java.util.ArrayList;
import java.util.List;


public class CheckableTypesPresenter extends BaseSettingsPresenter {

    private static final int POSITION_HEADER = 0;
    private static final int POSITION_TITLE_CHECKBOX = 1;
    private static final int POSITION_TITLE_SUBTITLE_CHECKBOX = 2;
    private static final int POSITION_TITLE_SUBTITLE_EXTRA_CHECKBOX = 3;
    private static final int POSITION_COLOR_SECTION_HEADER = 4;
    private static final int POSITION_COLOR_TITLE_CHECKBOX = 5;
    private static final int POSITION_COLOR_TITLE_SUBTITLE_CHECKBOX = 6;
    private static final int POSITION_COLOR_TITLE_SUBTITLE_EXTRA_CHECKBOX = 7;


    private CoordinatorLayout coordinatorLayout;
    private OnSettingsChangedListener onSettingsChangedListener;

    public CheckableTypesPresenter(CoordinatorLayout coordinatorLayout, OnSettingsChangedListener l) {
        this.coordinatorLayout = coordinatorLayout;
        this.onSettingsChangedListener = l;
    }

    @Override
    public List<BaseViewTypeData> getItems(Context context) {

        List<BaseViewTypeData> items = new ArrayList<>();

        HeaderData headerData = new HeaderData("CHECKABLE TYPES");
        items.add(POSITION_HEADER, headerData);

        TitleCheckboxData titleCheckboxData = new TitleCheckboxData("Checkable Single text");
        items.add(POSITION_TITLE_CHECKBOX, titleCheckboxData);

        TitleSubtitleCheckboxData titleSubtitleCheckboxData = new TitleSubtitleCheckboxData("Checkable title & subtitle", "An extra text if needed");
        items.add(POSITION_TITLE_SUBTITLE_CHECKBOX, titleSubtitleCheckboxData);

        TitleSubtitleExtraCheckboxData titleSubtitleExtraCheckboxData = new TitleSubtitleExtraCheckboxData("Three rows item", "Subtitle placeholder", "An extra text");
        items.add(POSITION_TITLE_SUBTITLE_EXTRA_CHECKBOX, titleSubtitleExtraCheckboxData);

        HeaderData colorSectionHeaderData = new HeaderData("COLORING CHECKABLE TYPES");
        items.add(POSITION_COLOR_SECTION_HEADER, colorSectionHeaderData);

        TitleCheckboxData coloredTitleCheckboxData = new TitleCheckboxData("Colored Checkable Single text");
        coloredTitleCheckboxData.setCheckboxColor(R.color.red);
        items.add(POSITION_COLOR_TITLE_CHECKBOX, coloredTitleCheckboxData);

        TitleSubtitleCheckboxData coloredTitleSubtitleCheckboxData = new TitleSubtitleCheckboxData("Colored Checkable title & subtitle", "An extra text if needed");
        coloredTitleSubtitleCheckboxData.setTitleColor(R.color.blue);
        coloredTitleSubtitleCheckboxData.setSubtitleColor(R.color.blue);
        coloredTitleSubtitleCheckboxData.setCheckboxColor(R.color.blue);
        items.add(POSITION_COLOR_TITLE_SUBTITLE_CHECKBOX, coloredTitleSubtitleCheckboxData);

        TitleSubtitleExtraCheckboxData coloredTitleSubtitleExtraCheckbox = new TitleSubtitleExtraCheckboxData("Colored Three rows item", "Subtitle placeholder", "An extra text");
        coloredTitleSubtitleExtraCheckbox.setTitleColor(R.color.colorAccent);
        coloredTitleSubtitleExtraCheckbox.setSubtitleColor(R.color.colorAccent);
        coloredTitleSubtitleExtraCheckbox.setExtraColor(R.color.colorAccent);
        coloredTitleSubtitleExtraCheckbox.setCheckboxColor(R.color.colorAccent);
        items.add(POSITION_COLOR_TITLE_SUBTITLE_EXTRA_CHECKBOX, coloredTitleSubtitleExtraCheckbox);

        return items;
    }

    @Override
    public void onTitleCheckboxClick(View view, TitleCheckboxData data, int position) {

        boolean oldValue = data.isEnabled();
        boolean newValue = !oldValue;

        data.setEnabled(newValue);

        AppCompatCheckBox checkBox = view.findViewById(R.id.checkbox);
        checkBox.setChecked(newValue);

        Snackbar.make(coordinatorLayout, "Toggled position: " + position, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckboxTitleSubtitleClick(View view, TitleSubtitleCheckboxData data, int position) {
        boolean oldValue = data.isEnabled();
        boolean newValue = !oldValue;

        data.setEnabled(newValue);

        AppCompatCheckBox checkBox = view.findViewById(R.id.checkbox);
        checkBox.setChecked(newValue);

        Snackbar.make(coordinatorLayout, "Toggled position: " + position, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void onTitleSubtitleExtraCheckboxClick(View view, TitleSubtitleExtraCheckboxData data, int position) {
        boolean oldValue = data.isEnabled();
        boolean newValue = !oldValue;

        data.setEnabled(newValue);

        AppCompatCheckBox checkBox = view.findViewById(R.id.checkbox);
        checkBox.setChecked(newValue);

        Snackbar.make(coordinatorLayout, "Toggled position: " + position, Snackbar.LENGTH_SHORT).show();
    }



}
