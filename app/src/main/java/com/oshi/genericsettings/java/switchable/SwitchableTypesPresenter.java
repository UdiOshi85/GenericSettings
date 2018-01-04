package com.oshi.genericsettings.java.switchable;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.SwitchCompat;
import android.view.View;

import com.oshi.genericsettings.R;
import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.HeaderData;
import com.oshi.libgenericsettings.data.TitleSubtitleExtraSwitchData;
import com.oshi.libgenericsettings.data.TitleSubtitleSwitchData;
import com.oshi.libgenericsettings.data.TitleSwitchData;
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

import java.util.ArrayList;
import java.util.List;


public class SwitchableTypesPresenter extends BaseSettingsPresenter {

    private static final int POSITION_HEADER = 0;
    private static final int POSITION_TITLE_SWITCH = 1;
    private static final int POSITION_TITLE_SUBTITLE_SWITCH = 2;
    private static final int POSITION_TITLE_SUBTITLE_EXTRA_SWITCH = 3;
    private static final int POSITION_COLORED_HEADER = 4;
    private static final int POSITION_COLORED_TITLE_SWITCH = 5;
    private static final int POSITION_COLORED_TITLE_SUBTITLE_SWITCH = 6;
    private static final int POSITION_COLORED_TITLE_SUBTITLE_EXTRA_SWITCH = 7;



    private CoordinatorLayout coordinatorLayout;
    private ISettingsPresenter.OnSettingsChangedListener onSettingsChangedListener;

    public SwitchableTypesPresenter(CoordinatorLayout coordinatorLayout, ISettingsPresenter.OnSettingsChangedListener l) {
        this.coordinatorLayout = coordinatorLayout;
        this.onSettingsChangedListener = l;
    }

    @Override
    public List<BaseViewTypeData> getItems(Context context) {
        List<BaseViewTypeData> items = new ArrayList<>();

        HeaderData headerData = new HeaderData("SWITCHABLE TYPES");
        items.add(POSITION_HEADER, headerData);

        TitleSwitchData titleSwitchData = new TitleSwitchData("Single title with switch");
        items.add(POSITION_TITLE_SWITCH, titleSwitchData);

        TitleSubtitleSwitchData titleSubtitleSwitchData = new TitleSubtitleSwitchData("Two rows with a switch", "An extra subtitle row");
        items.add(POSITION_TITLE_SUBTITLE_SWITCH , titleSubtitleSwitchData);

        TitleSubtitleExtraSwitchData titleSubtitleExtraSwitchData = new TitleSubtitleExtraSwitchData("Third rows example", "Subtitle is here", "An extra text");
        items.add(POSITION_TITLE_SUBTITLE_EXTRA_SWITCH, titleSubtitleExtraSwitchData);

        HeaderData coloredHeaderData = new HeaderData("COLORING SWITCHABLE TYPES");
        coloredHeaderData.setHeaderColor(R.color.purple);
        items.add(POSITION_COLORED_HEADER, coloredHeaderData);

        TitleSwitchData coloredTitleSwitchData = new TitleSwitchData("Colored title & switch");
        coloredTitleSwitchData.setTitleColor(R.color.orange);
        coloredTitleSwitchData.setSwitchThumbUncheckedColor(R.color.grey);
        coloredTitleSwitchData.setSwitchThumbCheckedColor(R.color.orange);
        coloredTitleSwitchData.setSwitchTrackUncheckedColor(R.color.green);
        coloredTitleSwitchData.setSwitchTrackCheckedColor(R.color.orange);
        items.add(POSITION_COLORED_TITLE_SWITCH, coloredTitleSwitchData);

        TitleSubtitleSwitchData coloredTitleSubtitleSwitchData = new TitleSubtitleSwitchData("Coloring with subtitle", "All is green");
        coloredTitleSubtitleSwitchData.setTitleColor(R.color.green_dark);
        coloredTitleSubtitleSwitchData.setSubtitleColor(R.color.green_dark);
        coloredTitleSubtitleSwitchData.setSwitchThumbUncheckedColor(R.color.grey);
        coloredTitleSubtitleSwitchData.setSwitchTrackUncheckedColor(R.color.red);
        coloredTitleSubtitleSwitchData.setSwitchTrackCheckedColor(R.color.green);
        coloredTitleSubtitleSwitchData.setSwitchThumbCheckedColor(R.color.green);
        items.add(POSITION_COLORED_TITLE_SUBTITLE_SWITCH, coloredTitleSubtitleSwitchData);


        TitleSubtitleExtraSwitchData coloredTitleSubtitleExtraSwitchData = new TitleSubtitleExtraSwitchData("Coloring Three rows", "All is red", "toggle switch colors");
        coloredTitleSubtitleExtraSwitchData.setTitleColor(R.color.red_text);
        coloredTitleSubtitleExtraSwitchData.setSubtitleColor(R.color.red_text);
        coloredTitleSubtitleExtraSwitchData.setExtraColor(R.color.red_text);
        coloredTitleSubtitleExtraSwitchData.setSwitchTrackUncheckedColor(R.color.red_disabled);
        coloredTitleSubtitleExtraSwitchData.setSwitchThumbUncheckedColor(R.color.red_disabled);
        coloredTitleSubtitleExtraSwitchData.setSwitchThumbCheckedColor(R.color.red);
        coloredTitleSubtitleExtraSwitchData.setSwitchTrackCheckedColor(R.color.green);
        items.add(POSITION_COLORED_TITLE_SUBTITLE_EXTRA_SWITCH, coloredTitleSubtitleExtraSwitchData);

        return items;
    }

    @Override
    public void onTitleSubtitleExtraSwitchClick(View view, TitleSubtitleExtraSwitchData data, int position) {

        boolean oldValue = data.isSwitchOn();
        boolean newValue = !oldValue;

        SwitchCompat switchCompat = view.findViewById(R.id.switchView);
        switchCompat.setChecked(newValue);
        data.setSwitchOn(newValue);
    }

    @Override
    public void onTitleSwitchClick(View view, TitleSwitchData data, int position) {
        boolean oldValue = data.isSwitchOn();
        boolean newValue = !oldValue;

        SwitchCompat switchCompat = view.findViewById(R.id.switchView);
        switchCompat.setChecked(newValue);
        data.setSwitchOn(newValue);

    }

    @Override
    public void onTitleSubtitleSwitchClick(View view, final TitleSubtitleSwitchData data, final int position) {
        boolean oldValue = data.isSwitchOn();
        final boolean newValue = !oldValue;

        SwitchCompat switchCompat = view.findViewById(R.id.switchView);
        data.setSwitchOn(newValue);
        switchCompat.setChecked(newValue);

    }
}
