package com.oshi.genericsettings;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;

import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.DividerData;
import com.oshi.libgenericsettings.data.HeaderData;
import com.oshi.libgenericsettings.data.IconTitleData;
import com.oshi.libgenericsettings.data.TitleData;
import com.oshi.libgenericsettings.data.TitleSecondaryTitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleCheckbox;
import com.oshi.libgenericsettings.data.TitleSubtitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleSwitchData;
import com.oshi.libgenericsettings.data.TitleSwitchData;
import com.oshi.libgenericsettings.presenter.BaseSettingsPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainPresenter extends BaseSettingsPresenter {

    @Override
    public List<BaseViewTypeData> getItems(Context context) {

        List<BaseViewTypeData> dataList = new ArrayList<>();

        // Simple header
        HeaderData firstHeader = new HeaderData("Simple header");
        dataList.add(firstHeader);

        // Title only
        TitleData titleData = new TitleData("Title only");
        dataList.add(titleData);

        dataList.add(DividerData.create());

        // Title & Subtitle, Subtitle is red!
        TitleSubtitleData titleSubtitleData = new TitleSubtitleData("Title & Subtitle", "Subtitle is red!");
        titleSubtitleData.setSubtitleColor(R.color.red);
        dataList.add(titleSubtitleData);

        dataList.add(DividerData.create());

        // Icon & title
        IconTitleData iconTitleData = new IconTitleData("Icon & title");
        iconTitleData.setIconResId(R.drawable.ic_android_black_24dp);
        dataList.add(iconTitleData);

        // Colored header
        HeaderData coloredHeader = new HeaderData("Colored header", R.color.red);
        dataList.add(coloredHeader);

        // Title & Switch
        TitleSwitchData titleSwitchData = new TitleSwitchData("Title & Switch", false);
        dataList.add(titleSwitchData);

        dataList.add(DividerData.create());

        // Title, Subtitle & Switch
        TitleSubtitleSwitchData titleSubtitleSwitchData = new TitleSubtitleSwitchData("Title, Subtitle & Switch", "Subtitle is here", false);
        dataList.add(titleSubtitleSwitchData);

        dataList.add(DividerData.create());

        // Title, Subtitle & Checkbox
        TitleSubtitleCheckbox titleSubtitleCheckbox = new TitleSubtitleCheckbox("Title, Subtitle & Checkbox", "Subtitle is here", false);
        dataList.add(titleSubtitleCheckbox);

        dataList.add(DividerData.create());

        // Title & Secondary title
        TitleSecondaryTitleData titleSecondaryTitleData = new TitleSecondaryTitleData("Title & Secondary title", "8");
        dataList.add(titleSecondaryTitleData);


        return dataList;
    }
}
