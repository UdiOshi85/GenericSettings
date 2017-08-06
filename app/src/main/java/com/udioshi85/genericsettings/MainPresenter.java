package com.udioshi85.genericsettings;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;

import com.udioshi85.libgenericsettings.data.BaseViewTypeData;
import com.udioshi85.libgenericsettings.data.DividerData;
import com.udioshi85.libgenericsettings.data.HeaderData;
import com.udioshi85.libgenericsettings.data.TitleSubtitleData;
import com.udioshi85.libgenericsettings.data.TitleSwitchData;
import com.udioshi85.libgenericsettings.presenter.BaseSettingsPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by udioshi on 8/6/2017.
 */

public class MainPresenter extends BaseSettingsPresenter {

    private static final int POSITION_EXAMPLE_TITLE_SWITCH = 1;


    @Override
    public List<BaseViewTypeData> getItems() {
        List<BaseViewTypeData> dataList = new ArrayList<>();

        // Header
        HeaderData firstHeader = new HeaderData("TEST HEADER", ContextCompat.getColor(context, R.color.colorPrimaryDark));
        dataList.add(firstHeader);

        // Title with switch
        TitleSwitchData titleSwitchData = new TitleSwitchData("Title with switch on", false);
        dataList.add(POSITION_EXAMPLE_TITLE_SWITCH, titleSwitchData);

        // Divider
        dataList.add(DividerData.create());

        // Title & subtitle
        TitleSubtitleData titleSubtitleData = new TitleSubtitleData("A Title example", "subtitle is red!");
        titleSubtitleData.subtitleColor = Color.RED;
        dataList.add(titleSubtitleData);

        return dataList;
    }
}
