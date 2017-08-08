package com.oshi.libgenericsettings.presenter;

import android.content.Context;
import android.view.View;

import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.TitleSecondaryTitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleCheckbox;
import com.oshi.libgenericsettings.data.IconTitleData;
import com.oshi.libgenericsettings.data.TitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleSwitchData;
import com.oshi.libgenericsettings.data.TitleSwitchData;

import java.util.List;

/**
 * A custom base settings provider which overrides all available types.
 * You should extend this class and override your specific methods.
 */
public class BaseSettingsPresenter implements ISettingsPresenter {

    @Override
    public void onTitleSubtitleSwitchClick(View view, TitleSubtitleSwitchData data, int position) {

    }

    @Override
    public void onTitleSubtitleClick(View view, TitleSubtitleData data, int position) {

    }

    @Override
    public void onTitleSwitchClick(View view, TitleSwitchData data, int position) {

    }

    @Override
    public void onCheckboxTitleSubtitleClick(View view, TitleSubtitleCheckbox data, int position) {

    }

    @Override
    public void onTitleClick(View view, TitleData data, int position) {

    }

    @Override
    public void onIconTitleClick(View view, IconTitleData data, int position) {

    }

    @Override
    public void onTitleSecondaryTitleClick(View view, TitleSecondaryTitleData data, int position) {

    }

    @Override
    public List<BaseViewTypeData> getItems(Context context) {
        return null;
    }


}
