package com.udioshi85.libgenericsettings.presenter;

import android.view.View;

import com.udioshi85.libgenericsettings.data.BaseViewTypeData;
import com.udioshi85.libgenericsettings.data.CheckboxTitleSubtitleData;
import com.udioshi85.libgenericsettings.data.TitleSubtitleData;
import com.udioshi85.libgenericsettings.data.TitleSubtitleSwitchData;
import com.udioshi85.libgenericsettings.data.TitleSwitchData;

import java.util.List;


public interface ISettingsPresenter {

    interface OnSettingsChangedListener {
        void notifyItemChanged(int position);
    }

    void onTitleSubtitleSwitchClick(View view, TitleSubtitleSwitchData data, int position);

    void onTitleSubtitleClick(View view, TitleSubtitleData data, int position);

    void onTitleSwitchClick(View view, TitleSwitchData data, int position);

    void onCheckboxTitleSubtitleClick(View view, CheckboxTitleSubtitleData data, int position);

    List<BaseViewTypeData> getItems();

}
