package com.udioshi85.libgenericsettings.presenter;

import android.view.View;

import com.udioshi85.libgenericsettings.data.BaseViewTypeData;
import com.udioshi85.libgenericsettings.data.CheckboxTitleSubtitleData;
import com.udioshi85.libgenericsettings.data.TitleSubtitleData;
import com.udioshi85.libgenericsettings.data.TitleSubtitleSwitchData;
import com.udioshi85.libgenericsettings.data.TitleSwitchData;

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
    public void onCheckboxTitleSubtitleClick(View view, CheckboxTitleSubtitleData data, int position) {

    }

    @Override
    public List<BaseViewTypeData> getItems() {
        return null;
    }
}
